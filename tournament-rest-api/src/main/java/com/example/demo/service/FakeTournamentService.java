package com.example.demo.service;

import com.example.demo.DTO.PlayerDTO;
import com.example.demo.DTO.ScheduleDTO;
import com.example.demo.DTO.TournamentDTO;
import com.example.demo.model.Participant;
import com.github.javafaker.Faker;
import jakarta.servlet.http.Part;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.TimeUnit;

@Service
public class FakeTournamentService implements TournamentService{
    private Faker faker;

    public FakeTournamentService() {
        faker = new Faker();
    }
    @Override
    public List<TournamentDTO> getAll() {

        List<TournamentDTO> tournaments = new ArrayList<>();
        int id = 0;
        List<ScheduleDTO> schedule = scheduleDTOS();
        List<Participant> participants = participants(schedule, "PLAYER");
        for(int i=0; i<100; i++) {

            String name = faker.esports().event();
            String discipline = faker.esports().game();

            TournamentDTO tournament = new TournamentDTO(id, name, discipline, "PLAYER", participants, schedule);

            tournaments.add(tournament);
            id++;
        }
        return tournaments;
    }
    private List<ScheduleDTO> scheduleDTOS() {
        List<ScheduleDTO> scheduleDTOS = new ArrayList<>();
        for(int i=0; i<16; i++) {
            ScheduleDTO schedule = new ScheduleDTO(1, faker.date().future(12, TimeUnit.DAYS),
                    faker.esports().team(), faker.esports().team(),
                    null, null, null, null);
            scheduleDTOS.add(schedule);
        }
        return scheduleDTOS;
    }
    private List<Participant> participants(List<ScheduleDTO> schedule, String type) {
        Map<String ,Participant> participants = new HashMap<>();
        for(ScheduleDTO item : schedule) {
            if(type.equals("PLAYER")) {
                participants.put(item.getParticipant1Name(), new PlayerDTO(item.getParticipant1Name()));
                participants.put(item.getParticipant2Name(), new PlayerDTO(item.getParticipant2Name()));
            }

        }
        return new ArrayList<>(participants.values());
    }

}

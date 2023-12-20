package com.example.demo.service;

import com.example.demo.DTO.*;
import com.github.javafaker.Faker;
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
        List<ParticipantDTO> participants = participants(schedule, "PLAYER");
        List<ParticipantDTO> participants2 = participants(schedule, "TEAM");
        for(int i=0; i<5; i++) {

            String name = faker.esports().event();
            String discipline = faker.esports().game();

            TournamentDTO tournament = new TournamentDTO(id, name, discipline, "PLAYER", participants, schedule, new UserDTO("test1234"));

            tournaments.add(tournament);
            id++;
        }

        for(int i=0; i<5; i++) {

            String name = faker.esports().event();
            String discipline = faker.esports().game();

            TournamentDTO tournament = new TournamentDTO(id, name, discipline, "TEAM", participants2, schedule, new UserDTO("test1234"));

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
    private List<ParticipantDTO> participants(List<ScheduleDTO> schedule, String type) {
        Map<String , ParticipantDTO> participants = new HashMap<>();

        List<PlayerDTO> players = new ArrayList<>();
        players.add(new PlayerDTO("player 1"));
        players.add(new PlayerDTO("player 2"));
        players.add(new PlayerDTO("player 3"));

        for(ScheduleDTO item : schedule) {
            if(type.equals("PLAYER")) {
                participants.put(item.getParticipant1Name(), new PlayerDTO(item.getParticipant1Name()));
                participants.put(item.getParticipant2Name(), new PlayerDTO(item.getParticipant2Name()));
            }
            if(type.equals("TEAM")) {
                participants.put(item.getParticipant1Name(), new TeamDTO(item.getParticipant1Name(), players));
                participants.put(item.getParticipant2Name(), new TeamDTO(item.getParticipant2Name(), players));
            }

        }
        return new ArrayList<>(participants.values());
    }

}

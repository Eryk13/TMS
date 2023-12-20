package com.example.demo.DTO;

import java.util.List;

public class TournamentDTO {

    private int id;
    private String name;
    private String discipline;
    private String participantType;
    private UserDTO user;
    private List<ParticipantDTO> participants;
    private List<ScheduleDTO> schedules;

    public TournamentDTO() {
    }

    public TournamentDTO(int id, String name, String discipline, String participantType, List<ParticipantDTO> participants, List<ScheduleDTO> schedules, UserDTO user) {
        this.id = id;
        this.name = name;
        this.discipline = discipline;
        this.participantType = participantType;
        this.participants = participants;
        this.schedules = schedules;
        this.user = user;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getParticipantType() {
        return participantType;
    }

    public void setParticipantType(String participantType) {
        this.participantType = participantType;
    }

    public List<ParticipantDTO> getParticipants() {
        return participants;
    }

    public void setParticipants(List<ParticipantDTO> participants) {
        this.participants = participants;
    }

    public List<ScheduleDTO> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<ScheduleDTO> schedules) {
        this.schedules = schedules;
    }
}

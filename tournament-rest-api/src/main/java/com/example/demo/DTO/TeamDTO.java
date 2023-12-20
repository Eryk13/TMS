package com.example.demo.DTO;

import java.util.List;

public class TeamDTO extends ParticipantDTO {
    private List<PlayerDTO> players;

    public TeamDTO(String name, List<PlayerDTO> players) {
        super(name);
        this.players = players;
    }

    public List<PlayerDTO> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerDTO> players) {
        this.players = players;
    }
}

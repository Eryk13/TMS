package com.example.demo.DTO;

import com.example.demo.model.Participant;

import java.util.List;

public class TeamDTO extends Participant {
    private List<PlayerDTO> players;

    public TeamDTO(List<PlayerDTO> players, String name) {
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

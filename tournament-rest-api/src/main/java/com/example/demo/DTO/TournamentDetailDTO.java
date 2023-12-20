package com.example.demo.DTO;

import java.util.List;

public class TournamentDetailDTO {
    private TournamentDTO tournament;
    private List<StageDTO> stages;

    public TournamentDetailDTO(TournamentDTO tournament, List<StageDTO> stages) {
        this.tournament = tournament;
        this.stages = stages;
    }

    public TournamentDTO getTournament() {
        return tournament;
    }

    public void setTournament(TournamentDTO tournament) {
        this.tournament = tournament;
    }

    public List<StageDTO> getStages() {
        return stages;
    }

    public void setStages(List<StageDTO> stages) {
        this.stages = stages;
    }
}

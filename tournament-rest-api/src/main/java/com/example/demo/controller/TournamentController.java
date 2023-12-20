package com.example.demo.controller;

import com.example.demo.DTO.StageDTO;
import com.example.demo.DTO.TournamentDTO;

import com.example.demo.DTO.TournamentDetailDTO;
import com.example.demo.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("tournament")
@CrossOrigin("*")
public class TournamentController {

    private final TournamentService tournamentService;
    public TournamentController(@Autowired TournamentService tournamentService) {
        this.tournamentService = tournamentService;
    }
    @GetMapping()
    public List<TournamentDTO> tournaments() {
        return tournamentService.getAll();
    }

    @GetMapping("/{id}")
    public TournamentDetailDTO details(@PathVariable() int id) {
        TournamentDTO tournamentDTO = this.tournamentService.getById(id);
        StageDTO stage = new StageDTO("round 16", tournamentDTO.getSchedules());
        List<StageDTO> stages = new ArrayList<>();
        stages.add(stage);
        return new TournamentDetailDTO(tournamentDTO, stages);
    }
}

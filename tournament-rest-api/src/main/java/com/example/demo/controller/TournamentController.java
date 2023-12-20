package com.example.demo.controller;

import com.example.demo.DTO.TournamentDTO;

import com.example.demo.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("{id}")
    public TournamentDTO details(@PathVariable int id) {
        return this.tournamentService.getById(id);
    }
}

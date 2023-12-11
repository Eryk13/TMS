package com.example.demo.service;

import com.example.demo.DTO.TournamentDTO;

import java.util.ArrayList;
import java.util.List;

public class FakeTournamentService implements TournamentService{
    @Override
    public List<TournamentDTO> getAll() {

        List<TournamentDTO> tournaments = new ArrayList<>();
        for(int i=0; i<100; i++) {


            TournamentDTO tournament = new TournamentDTO();

            tournaments.add(tournament);
        }
        return tournaments;
    }
}

import { Component, OnInit } from '@angular/core';
import { Tournament } from '../../models/tournament';
import { TournamentListItemComponent } from '../tournament-list-item/tournament-list-item.component';
import { RouterModule } from '@angular/router';
import { Observable } from 'rxjs';
import { TournamentService } from '../../services/tournament.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-tournament-list',
  standalone: true,
  imports: [TournamentListItemComponent, RouterModule, CommonModule],
  templateUrl: './tournament-list.component.html',
  styleUrl: './tournament-list.component.css'
})
export class TournamentListComponent implements OnInit {
  
  $tournaments = new Observable<any>;

  constructor(private tournamentService: TournamentService) {}

  ngOnInit(): void {
    this.loadData();
  }

  loadData() {
    this.$tournaments = this.tournamentService.getAll();
  }
}

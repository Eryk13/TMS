import { Component, OnInit } from '@angular/core';
import { Tournament } from '../../../tournament/models/tournament';
import { ScheduleComponent } from '../schedule/schedule.component';
import { TournamentDetail } from '../../models/tournament-detail';
import { TournamentService } from '../../../tournament/services/tournament.service';
import { Observable } from 'rxjs';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-detail-page',
  standalone: true,
  imports: [ScheduleComponent, CommonModule],
  templateUrl: './detail-page.component.html',
  styleUrl: './detail-page.component.css'
})
export class DetailPageComponent implements OnInit {
  
  tournamentDetail: TournamentDetail | undefined;

  constructor(private tournamentServcie: TournamentService) {}

  ngOnInit(): void {
    this.loadData(1);
  }

  
  loadData(id: number) {
    this.tournamentServcie.getDetail(id).subscribe({
      next: (res) => {
        this.tournamentDetail = res;
        console.log(res)
      }
    });
  }
}

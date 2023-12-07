import { Component } from '@angular/core';
import { Tournament } from '../../../tournament/models/tournament';
import { ScheduleComponent } from '../schedule/schedule.component';
import { TournamentDetail } from '../../models/tournament-detail';

@Component({
  selector: 'app-detail-page',
  standalone: true,
  imports: [ScheduleComponent],
  templateUrl: './detail-page.component.html',
  styleUrl: './detail-page.component.css'
})
export class DetailPageComponent {
  tournamentDetail: TournamentDetail | undefined = {tournament: {id: 1, name: 'premier league', discipline: "e-sport", participants: ['newcastle united', 'everton'], participantsType: 'TEAM', userId: 1, user: {id: 1, username: 'test-user'}, startDate: new Date()},
    schedule: [{name: 'round16', schedule: [{id: 0, date: new Date(), participant1: 'test', participant2: 'test22222222222', score1: 1, score2: 1, extraScore1: 2, extraScore2: 3}]}]}
  ;
}

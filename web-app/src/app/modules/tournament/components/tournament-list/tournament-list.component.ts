import { Component } from '@angular/core';
import { Tournament } from '../../models/tournament';
import { TournamentListItemComponent } from '../tournament-list-item/tournament-list-item.component';

@Component({
  selector: 'app-tournament-list',
  standalone: true,
  imports: [TournamentListItemComponent],
  templateUrl: './tournament-list.component.html',
  styleUrl: './tournament-list.component.css'
})
export class TournamentListComponent {
  tournaments: Tournament[] = [{id: 1, name: 'premier league', participants: ['newcastle united', 'everton'], participants_type: 'TEAM'}]
}

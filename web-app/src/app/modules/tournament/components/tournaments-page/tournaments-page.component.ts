import { Component } from '@angular/core';
import { TournamentListComponent } from '../tournament-list/tournament-list.component';

@Component({
  selector: 'app-tournaments-page',
  standalone: true,
  imports: [TournamentListComponent],
  templateUrl: './tournaments-page.component.html',
  styleUrl: './tournaments-page.component.css'
})
export class TournamentsPageComponent {

}

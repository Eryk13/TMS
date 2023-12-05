import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-tournament-list-item',
  standalone: true,
  imports: [],
  templateUrl: './tournament-list-item.component.html',
  styleUrl: './tournament-list-item.component.css'
})
export class TournamentListItemComponent {
  @Input() name: string | undefined;
  @Input() participants_type: string | undefined;
  @Input() participants: string[] | undefined;
}

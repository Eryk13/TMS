import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-tournament-list-item',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './tournament-list-item.component.html',
  styleUrl: './tournament-list-item.component.css'
})
export class TournamentListItemComponent {
  @Input() name: string | undefined;
  @Input() author: string | undefined;
  @Input() discipline: string | undefined;
  @Input() startDate: Date | undefined;

}

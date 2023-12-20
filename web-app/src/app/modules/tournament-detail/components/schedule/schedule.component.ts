import { Component, Input, OnChanges, OnInit } from '@angular/core';
import { TournamentStage } from '../../models/tournament-stage';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-schedule',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './schedule.component.html',
  styleUrl: './schedule.component.css'
})
export class ScheduleComponent implements OnChanges{

    @Input() schedule: TournamentStage[] | undefined;

    ngOnChanges() {
      console.log(this.schedule)

    }
}

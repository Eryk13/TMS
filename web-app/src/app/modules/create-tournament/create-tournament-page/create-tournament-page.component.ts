import { Component } from '@angular/core';
import { CreateTournamentFormComponent } from '../create-tournament-form/create-tournament-form.component';

@Component({
  selector: 'app-create-tournament-page',
  standalone: true,
  imports: [CreateTournamentFormComponent],
  templateUrl: './create-tournament-page.component.html',
  styleUrl: './create-tournament-page.component.css'
})
export class CreateTournamentPageComponent {

}

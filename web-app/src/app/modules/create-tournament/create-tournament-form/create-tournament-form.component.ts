import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormsModule, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-create-tournament-form',
  standalone: true,
  imports: [ReactiveFormsModule, FormsModule],
  templateUrl: './create-tournament-form.component.html',
  styleUrl: './create-tournament-form.component.css'
})
export class CreateTournamentFormComponent implements OnInit {

  form = this.fb.group({
    name: [''],
    type: ['Type'],
    discipline: ['Discipline', ],
    participantType: [''],
  })

  constructor(private fb: FormBuilder) {}

  ngOnInit(): void {

  }

  onSubmit(): void {
    console.log(this.form.value);
  }

}

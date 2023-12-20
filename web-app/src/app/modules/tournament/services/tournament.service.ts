import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Tournament } from '../models/tournament';
import { TournamentDetail } from '../../tournament-detail/models/tournament-detail';

@Injectable({
  providedIn: 'root'
})
export class TournamentService {

  constructor(private http: HttpClient) { }

  getAll() {
    return this.http.get<Tournament[]>("http://localhost:8080/tournament");
  }
  getDetail(id: number) {
    return this.http.get<TournamentDetail>("http://localhost:8080/tournament/" + id);
  }
}

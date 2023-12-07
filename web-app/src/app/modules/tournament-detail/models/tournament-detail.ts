import { Tournament } from "../../tournament/models/tournament";
import { TournamentStage } from "./tournament-stage";

export interface TournamentDetail {
    tournament: Tournament;
    schedule: TournamentStage[];
}
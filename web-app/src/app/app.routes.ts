import { Routes } from '@angular/router';
import { TournamentsPageComponent } from './modules/tournament/components/tournaments-page/tournaments-page.component';
import { DetailPageComponent } from './modules/tournament-detail/components/detail-page/detail-page.component';

export const routes: Routes = [
    {path: "", component: TournamentsPageComponent},
    {path: "tournament/:id", component: DetailPageComponent}
];

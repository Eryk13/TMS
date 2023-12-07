import { User } from "../../user/models/user";

export interface Tournament {
  id: number;
  name: string;
  discipline: string;
  participants: string[];
  participantsType: string; //TEAM or PLAYER
  user: User;
  userId: number;
  startDate: Date; 
}
export interface Schedule {
    id: number;
    date: Date;
    participant1: string;
    participant2: string;
    score1: number | null;
    score2: number | null;
    extraScore1: number | null;
    extraScore2: number | null;
}
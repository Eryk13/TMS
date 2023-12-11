package com.example.demo.DTO;

import java.util.Date;

public class ScheduleDTO {
    private int id;
    private Date date;
    private String participant1Name;
    private String participant2Name;
    private Integer score1;
    private Integer score2;
    private Integer extraScore1;
    private Integer getExtraScore2;

    public ScheduleDTO(int id, Date date, String participant1Name, String participant2Name, Integer score1, Integer score2, Integer extraScore1, Integer getExtraScore2) {
        this.id = id;
        this.date = date;
        this.participant1Name = participant1Name;
        this.participant2Name = participant2Name;
        this.score1 = score1;
        this.score2 = score2;
        this.extraScore1 = extraScore1;
        this.getExtraScore2 = getExtraScore2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getParticipant1Name() {
        return participant1Name;
    }

    public void setParticipant1Name(String participant1Name) {
        this.participant1Name = participant1Name;
    }

    public String getParticipant2Name() {
        return participant2Name;
    }

    public void setParticipant2Name(String participant2Name) {
        this.participant2Name = participant2Name;
    }

    public Integer getScore1() {
        return score1;
    }

    public void setScore1(Integer score1) {
        this.score1 = score1;
    }

    public Integer getScore2() {
        return score2;
    }

    public void setScore2(Integer score2) {
        this.score2 = score2;
    }

    public Integer getExtraScore1() {
        return extraScore1;
    }

    public void setExtraScore1(Integer extraScore1) {
        this.extraScore1 = extraScore1;
    }

    public Integer getGetExtraScore2() {
        return getExtraScore2;
    }

    public void setGetExtraScore2(Integer getExtraScore2) {
        this.getExtraScore2 = getExtraScore2;
    }
}

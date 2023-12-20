package com.example.demo.DTO;

import java.util.List;

public class StageDTO {
    private String name;
    private List<ScheduleDTO> schedule;

    public StageDTO(String name, List<ScheduleDTO> schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ScheduleDTO> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<ScheduleDTO> schedule) {
        this.schedule = schedule;
    }
}

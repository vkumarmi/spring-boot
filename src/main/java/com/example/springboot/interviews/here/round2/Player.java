package com.example.springboot.interviews.here.round2;

import java.util.Objects;

public class Player {
    private long id;
    private String name;
    private String teamName;
    private double grossIncome;

    public Player(String name, String teamName, double grossIncome) {
        this.name = name;
        this.teamName = teamName;
        this.grossIncome = grossIncome;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && Objects.equals(name, player.name) && Objects.equals(teamName, player.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, teamName);
    }
}

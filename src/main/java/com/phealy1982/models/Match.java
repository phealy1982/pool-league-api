package com.phealy1982.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Created by peterhealy on 02/07/2017.
 */
@Document(collection = "matches")
public class Match {
    @Id
    public String id;

    private String playerOne;
    private String playerOneScore;
    private String playerTwo;
    private String playerTwoScore;
    private String league;
    private String week;
    private String division;
    private String season;
    private String time;
    private String table;

    public Match(String playerOne, String playerOneScore, String playerTwo, String playerTwoScore, String league, String week, String division, String season, String time, String table) {
        this.playerOne = playerOne;
        this.playerOneScore = playerOneScore;
        this.playerTwo = playerTwo;
        this.playerTwoScore = playerTwoScore;
        this.league = league;
        this.week = week;
        this.division = division;
        this.season = season;
        this.time = time;
        this.table = table;
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(String playerOne) {
        this.playerOne = playerOne;
    }

    public String getPlayerOneScore() {
        return playerOneScore;
    }

    public void setPlayerOneScore(String playerOneScore) {
        this.playerOneScore = playerOneScore;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(String playerTwo) {
        this.playerTwo = playerTwo;
    }

    public String getPlayerTwoScore() {
        return playerTwoScore;
    }

    public void setPlayerTwoScore(String playerTwoScore) {
        this.playerTwoScore = playerTwoScore;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }
}

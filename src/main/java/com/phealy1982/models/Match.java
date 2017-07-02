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

    public Match(String playerOne, String playerOneScore, String playerTwo, String playerTwoScore, String league, String week) {
        this.playerOne = playerOne;
        this.playerOneScore = playerOneScore;
        this.playerTwo = playerTwo;
        this.playerTwoScore = playerTwoScore;
        this.league = league;
        this.week = week;
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
}

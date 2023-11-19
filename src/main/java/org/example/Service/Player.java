package org.example.Service;

import org.example.modol.challenge.Challenge;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private Long id;
    private String name;
    private List<Challenge> challengeList;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(Long id, String name, List<Challenge> challengeList) {
        this.id = id;
        this.name = name;
        this.challengeList = challengeList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Challenge> getChallengeList() {
        return challengeList;
    }

    public void setChallengeList(List<Challenge> challengeList) {
        this.challengeList = challengeList;
    }

    public void addList(Challenge challenge){
        challengeList.add(challenge);
    }
}


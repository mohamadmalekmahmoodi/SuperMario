package org.example.Service;

import org.example.Exception.WrongChallengeException;
import org.example.modol.challenge.Challenge;
import org.example.modol.challenge.Challenge1;
import org.example.modol.challenge.Challenge3;
import org.example.modol.level.Easy;
import org.example.modol.level.Level;
import org.example.modol.level.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PlayStation {
    private static PlayStation playStation;
    private PlayStation(){

    }
    public static PlayStation getInstance(){
        if (playStation == null){
            playStation = new PlayStation();
        }
        return playStation;
    }
    public void startGame(Challenge challenge, Level level, Player player ) throws WrongChallengeException {
        if (challenge == null || level == null || player == null) {
            throw new WrongChallengeException("parameters can not be null");
        }
        List<Challenge> steps = Optional.ofNullable(player.getChallengeList()).orElse(new ArrayList<>());

        if (challenge instanceof Medium){
            steps.stream().filter(s-> s instanceof Challenge1)
                    .findFirst()
                    .orElseThrow(() -> new WrongChallengeException("I didnt find challenge1"));
        }

        
        if (challenge instanceof Challenge3 && level instanceof Easy) {
            throw new WrongChallengeException("u cant play this challenge with easy mood");
        }

        challenge.step();
        level.perform();
        steps.add(challenge);
        player.setChallengeList(steps);
    }
    public static void printSteps(Player player) {
        System.out.println(player);
    }

    }


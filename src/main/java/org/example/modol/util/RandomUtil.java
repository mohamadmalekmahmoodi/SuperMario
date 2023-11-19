package org.example.modol.util;

import org.example.modol.challenge.Challenge;
import org.example.modol.challenge.Challenge1;
import org.example.modol.challenge.Challenge2;
import org.example.modol.challenge.Challenge3;
import org.example.modol.level.Easy;
import org.example.modol.level.Hard;
import org.example.modol.level.Level;
import org.example.modol.level.Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;

public class RandomUtil {

    private static Random rnd = new Random();
    private static Map<Integer, Level> LEVEL_MAP = new HashMap<>();
    private static Map<Integer, Challenge> CHALLENGE_MAP = new HashMap<>();


    static {
        LEVEL_MAP.put(1, Easy.getInstance());
        LEVEL_MAP.put(2, Medium.getInstance());
        LEVEL_MAP.put(3, Hard.getInstance());

        CHALLENGE_MAP.put(1,Challenge1.getInstance());
        CHALLENGE_MAP.put(2,Challenge2.getInstance());
        CHALLENGE_MAP.put(3,Challenge3.getInstance());
    }

    public static Level getRandomLevel(){
        int rndInt = rnd.nextInt();
        return LEVEL_MAP.getOrDefault(rndInt,Easy.getInstance());
    }

    public static Challenge getRandomChallenge(){
        int rndInt = rnd.nextInt();
        return CHALLENGE_MAP.getOrDefault(rndInt,Challenge1.getInstance());
    }
}

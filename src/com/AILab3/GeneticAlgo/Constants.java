package com.AILab3.GeneticAlgo;

import java.util.Random;

public class Constants

{

    //#region Constants and static members
    public static final int GA_MAXITER = 1000;
    public static final int GA_POPSIZE = 2048;
    public static final float GA_ELITRATE = 0.10f;
    public static final float GA_MUTATIONRATE = 0.25f;
    public static final int RAND_MAX = GA_POPSIZE * 4;
    public static final float GA_MUTATION = RAND_MAX * GA_MUTATIONRATE;
    public static final String GA_TARGET = "Hello world!";
    public static Random r = new Random();
}

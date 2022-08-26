package Homework01.Task01;

import Homework01.Task01.Animals.*;

public class Task01_exec {

    public static void main(String[] args) {
        Pegasus pegasus = new Pegasus();
        Kraken kraken = new Kraken();
        Cerberus cerberus = new Cerberus();
        Bat bat = new Bat();
        Penguin penguin = new Penguin();
        Cat cat = new Cat();

        Zoo<Pegasus, Kraken, Cerberus> zooMythical = new Zoo<>(pegasus, kraken, cerberus);
            zooMythical.feedFlyable();
            zooMythical.feedSwimable();
            zooMythical.feedBiteable();

        Zoo<Bat, Penguin, Cat> zooBoring = new Zoo<>(bat, penguin, cat);
        zooBoring.feedFlyable();
        zooBoring.feedSwimable();
        zooBoring.feedBiteable();

    }
}

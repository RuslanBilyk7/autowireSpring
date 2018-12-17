package com.byNameByType;
public class Saxophone implements Instrument {
    public Saxophone() {
    }

    @Override
    public void play() {
        System.out.println("Tu Tu Tu");
    }
}
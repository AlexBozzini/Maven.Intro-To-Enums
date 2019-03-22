package com.zipcodewilmington.preassessment2;

public enum AliceBobEnum {
    ALICE,
    BOB;

    public String getName(){
        if (this == ALICE){
            return "ALICE";
        } else {
            return "BOB";
        }
    }

    public String getCatchPhrase(){
        if (this == ALICE){
            return "Hey, my name is ALICE!";
        } else {
            return "Hey, my name is BOB!";
        }
    }

    public Boolean isAlice(){
        return this == ALICE;
    }

    public Boolean isBob(){
        return this == BOB;
    }
}

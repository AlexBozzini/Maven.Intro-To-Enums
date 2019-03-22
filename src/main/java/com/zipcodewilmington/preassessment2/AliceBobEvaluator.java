package com.zipcodewilmington.preassessment2;

public class AliceBobEvaluator {
    private String input;

    public AliceBobEvaluator(String input){
        this.input = input;
    }
    public Boolean isAlice(){
        if (this.input.equalsIgnoreCase("ALICE")){
            return true;
        }
        return false;
    }

    public Boolean isBob(){
        if (this.input.equalsIgnoreCase("BOB")){
            return true;
        }
        return false;
    }
}

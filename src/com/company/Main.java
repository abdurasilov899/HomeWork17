package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal[] animals = {new Shark(),
                            new Turtle(),
                            new Eagle()};
        for (Animal animal : animals) {
            if (animal instanceof Shark){
               ((Shark) animal).attack();
            }
            if (animal.getClass().getName().equals("com.company.Shark")){
                ((Shark) animal).alike();
            }
            if ( animal instanceof Turtle){
                ((Turtle) animal).swim();
            }
            if (animal.getClass().getName().equals("com.company.Turtle")){
                animal.alike();
            }
            if (animal instanceof Eagle){
                ((Eagle) animal).fly();
            }
            if (animal.getClass().getName().equals("com.company.Eagle")){
                animal.alike();
            }

       }
    }
}

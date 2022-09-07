package com.thirdTask.secondSubtask;

import com.thirdTask.InitializationException;
import com.thirdTask.MyInput;

public class HumanTest {

    public static void main(String[] args) {

        Human human = new Human();

        while (true) {
            Integer navigationVar = MyInput.inputInteger("""
               Navigation menu:
               Enter 1 to control a head.
               Enter 2 to control a hand.
               Enter 3 to control a leg.
               Enter any other digit to stop the program.""", Integer::valueOf);

            switch (navigationVar) {
                case 1: {
                    Integer subnavigationVar = MyInput.inputInteger("""
                            Navigation menu:
                            Enter 1 to think.
                            Enter 2 to imagine.
                            Enter any other digit to return.""", Integer::valueOf);
                    switch (subnavigationVar) {
                        case 1:
                            human.getHead().think();
                            break;
                        case 2:
                            human.getHead().imagine();
                            break;
                        default:
                            System.out.println("Returning to the main menu...");
                            break;
                    }
                    break;
                }
                case 2: {
                    Integer subnavigationVar = MyInput.inputInteger("""
                            Navigation menu:
                            Enter 1 to wave.
                            Enter 2 to take.
                            Enter any other digit to return.""", Integer::valueOf);
                    switch (subnavigationVar) {
                        case 1:
                            human.getHand().wave();
                            break;
                        case 2:
                            human.getHand().take();
                            break;
                        default:
                            System.out.println("Returning to the main menu...");
                            break;
                    }
                    break;
                }
                case 3: {
                    Integer subnavigationVar = MyInput.inputInteger("""
                            Navigation menu:
                            Enter 1 to walk.
                            Enter 2 to run.
                            Enter 3 to stop.
                            Enter any other digit to return.""", Integer::valueOf);
                    switch (subnavigationVar) {
                        case 1:
                            human.getLeg().walk();
                            break;
                        case 2:
                            human.getLeg().run();
                            break;
                        case 3:
                            human.getLeg().stop();
                            break;
                        default:
                            System.out.println("Returning to the main menu...");
                            break;
                    }
                    break;
                }
                default:
                    System.out.println("Executing the program...");
                    System.exit(1);
                    break;
            }
        }
    }
}

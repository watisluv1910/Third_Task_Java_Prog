package com.thirdTask.firstSubtask;

import com.thirdTask.InitializationException;
import com.thirdTask.MyInput;

public class CircleTest {

    public static void main(String[] args) {

        Circle circle = new Circle();

        while (true) {
            Integer navigationVar = MyInput.inputInteger("""
               Enter 1 to add a new circle.
               Enter 2 to calculate circle properties.
               Enter 3 to view the information about current circle.
               Enter any other digit to stop the program.""", Integer::valueOf);

            switch (navigationVar) {
                case 1:
                    circle.Clear();
                    circle.setRadius(MyInput.inputInteger("Enter the circle radius: ", Integer::valueOf));
                    break;
                case 2:
                    try {
                        circle.CalcParameters();
                    } catch (InitializationException ex) {
                        System.err.println(ex.getMessage());
                    }
                    break;
                case 3:
                    System.out.println(circle);
                    break;
                default:
                    System.out.println("Executing the program...");
                    System.exit(1);
                    break;
            }
        }
    }
}

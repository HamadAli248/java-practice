package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        // Creating an instance
        Codenation jacob = new Codenation(" Jacob "," Senior Instructor ",876," Java ");

        Encapsulation dummy = new Encapsulation();
        System.out.println(dummy.getDummyString());

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your name");

        String firstName = userInput.nextLine();

        System.out.println("Your name is "+firstName);




        // case sensitive
        // Class names - begins with an UpperCase...
        // pascal casing. ThisIsPascalCasing
        // camelCasing
        // methods- they begin with lowercase If you have several words .. camel case
        //  class name is important
        // Programs name NEEDS / MUST / (DO IT) match the class name ...

        System.out.println("Hello,"+firstName);

        // Object, classes, Methods and variables (instances)

        // polymorphism
        // inheritance
        // encapsulations - hiding data ------ sensitive data
        // essential things for Encapsulations
        // private class attributes
        // public getters & setters -- access and ability to update values of private variables


        // classes
        // message passing
        // abstract




    }
}


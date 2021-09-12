/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tim Phung
 */
package org.example;
import java.util.Scanner;

public class App 
{

    static final double FT_TO_M = 0.09290304;

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        double length=0;
        double width=0;

        //Prompt user input
        System.out.println("What is the length of the room in feet?" );
        String num1 = scan.nextLine();
        System.out.println("What is the width of the room in feet?" );
        String num2 = scan.nextLine();

        //Convert strings
        length = Double.parseDouble(num1);
        width = Double.parseDouble(num2);
        double f2 = length * width;
        double m2 = f2 * FT_TO_M;

        //Print output
        System.out.println("You entered dimensions of " +num1+ " feet by " +num2+ " feet." );
        System.out.println("The area is" );
        System.out.println( f2+ " square feet");
        System.out.println( m2+ " square meters");



    }
}

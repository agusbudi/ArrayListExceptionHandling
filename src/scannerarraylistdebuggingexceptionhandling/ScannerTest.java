/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scannerarraylistdebuggingexceptionhandling;

import java.util.Scanner;

/**
 *
 * @author agus budi
 * reference: https://www.programiz.com/java-programming/scanner
 */
public class ScannerTest {
    public ScannerTest(){   //constructor
        // creates an object of Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");

        // takes input from the keyboard
        String name = input.next();
        // prints the name
        System.out.println("My name is " + name);
//        int usia1 = input.nextInt();
//        int usia2 = input.nextInt();
//        System.out.println(usia1 + " " + usia2);

        // closes the scanner
        input.close();
    }
}

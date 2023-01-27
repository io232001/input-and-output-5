package it.develhope.io;

import java.util.Scanner;

public class PrintYourAgeFromInput
{
    public static void main(String arg[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age=input.nextInt();
        input.close();
        System.out.printf("Your age is %d",age);
    }
}

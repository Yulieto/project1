package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner inputData = new Scanner(System.in);
        int number,result,hundreds,units,ten;
        System.out.println("Input number: ");
        number=inputData.nextInt();
        result=number/10;
        hundreds=number%10;
        units=result/10;
        ten=result%10;
        System.out.println("The inverded number is: "),hundreds +ten +units;
    }
}

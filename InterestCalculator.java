package org.example;
import java.util.Scanner;
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Principal Amount: ");
        int principalAmount=input.nextInt();
        System.out.print("Yearly Interest Rate: ");
        double interestRate=input.nextFloat();
        System.out.print("Time: ");
        input.nextLine();
        String strTime=input.nextLine();
        double time=Double.parseDouble(strTime.substring(0,strTime.length()-1));
        double year;
        if(strTime.charAt(strTime.length()-1) == 'm'){
           year=time/12.0;
        }
        else{
           year=time;
        }
       double interest = ((principalAmount*interestRate*year)/100);
        System.out.println("Total interest: "+interest);


    }
}
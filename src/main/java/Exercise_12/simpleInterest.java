/*
UCF cop 3330 summer 2021 assignment 1 solution
copyright 2021 Matthew McKee
*/

package Exercise_12;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principle:");
        String principleStr = input.next();
        double principle = Double.parseDouble(principleStr);

        System.out.print("Enter the rate:");
        String rateStr = input.next();
        double rate= Double.parseDouble(rateStr)/100;

        System.out.print("Enter the number of years:");
        String yearsStr = input.next();
        double years = Double.parseDouble(yearsStr);

        double newAmount = Math.round((principle*(1+rate*years))*100.0)/100.0;

        if (principle*(1+rate*years)>newAmount){
            newAmount=newAmount+0.01;
        }
        System.out.print("After "+years+ " years at "+rateStr+"%, " +
                "The investment will be worth: $"+ newAmount);

    }
}

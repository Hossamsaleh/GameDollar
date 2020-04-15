package Ch3;

import java.util.Scanner;

public class ChangeforPound {

    /* design aplay Game change for A dollar Game Create a programm to ask the User to Enter the quantities for the
    coins then calculate them all if they are 1 Euro then he will will if not he will lose
     */
    public static void main(String[]args){
        double Penny = 0.1;
        double Nickel = 0.05;
        double Dime = 0.10;
        double Quarter = 0.25 ;
        int Dollar = 1 ;

        System.out.println("Welcome to change for Dollar" + " Your goal is to enter enough Change to make it Ex 1 § ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number of Penny");
        int NumOfPenny = scanner.nextInt();

        System.out.println("Enter your number of nickel");
        int NumofNickel = scanner.nextInt();

        System.out.println("Enter your number of Dime");
        int NumofDime = scanner.nextInt();

        System.out.println("Enter your number of Quarter");
        int NumofQuarter = scanner.nextInt();
        scanner.close();

        double Total = NumofDime * Dime + NumofNickel * Nickel + NumOfPenny * Penny + NumofQuarter * Quarter ;
         double amountshort = Dollar - Total ;

        if (Total < Dollar){
            System.out.println("Sorry you lose ! , You were short" + String.format("%2f",amountshort) + "Cents");
        }
        else if(Total > Dollar){
            double amountover = Total - Dollar ;
            System.out.println("you lose , you were short" + String.format("%2f",amountover) + "Cents");
        }
        else
            System.out.print("Congrats you Win");





    }

}

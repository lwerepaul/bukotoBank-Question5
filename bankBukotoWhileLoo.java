
package vu.balex;

import java.util.Scanner;

public class bankBukotoWhileLoo {
    public static void main(String[] args) {
        Scanner save = new Scanner(System.in);

        System.out.print("Enter the number of members: ");
        int numMembers = save.nextInt();

        double[] principalAmounts = new double[numMembers];
        double[] interestRates = new double[numMembers];
        int[] periods = new int[numMembers];

        int i = 0;
        while (i < numMembers) {
            System.out.println("Enter details for member " + (i + 1));
            System.out.print("Principal amount: ");
            principalAmounts[i] = save.nextDouble();
            System.out.print("Interest rate (in %): ");
            interestRates[i] = save.nextDouble();
            System.out.print("Time period (in years): ");
            periods[i] = save.nextInt();
            i++;
        }

        System.out.println("\nValue of investments after the time frame:");
        i = 0;
        while (i < numMembers) {
            double finalAmount = principalAmounts[i] * Math.pow(1 + (interestRates[i] / 100), periods[i]);
            System.out.printf("Member %d: %.2f\n", i + 1, finalAmount);
            i++;
        }

        
    }
}


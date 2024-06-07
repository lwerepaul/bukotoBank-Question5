
package vu.balex;

import java.util.Scanner;
public class bankBukoto {
    Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
        Scanner save = new Scanner(System.in);

        System.out.print("Enter the number of members: ");
        int numMembers = save.nextInt();

        double[] principalAmounts = new double[numMembers];
        double[] interestRates = new double[numMembers];
        int[] periods = new int[numMembers];

        for (int i = 0; i < numMembers; i++) {
            System.out.println("Enter details for member " + (i + 1));
            System.out.print("Principal amount: ");
            principalAmounts[i] = save.nextDouble();
            System.out.print("Interest rate (in %): ");
            interestRates[i] = save.nextDouble();
            System.out.print("Time period (in years): ");
            periods[i] = save.nextInt();
        }

        System.out.println("\nValue of investments after the time frame:");
        for (int i = 0; i < numMembers; i++) {
            double finalAmount = principalAmounts[i] * Math.pow(1 + (interestRates[i] / 100), periods[i]);
            System.out.printf("Member %d: %.2f\n", i + 1, finalAmount);
        }

    }
}


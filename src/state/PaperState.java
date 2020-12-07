/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import java.util.Scanner;

/**
 *
 * @author Djordje Janjic
 */
public interface PaperState {

    default void writePaper() {
        System.out.println("Writing the paper...");
    }

    default void reviewPaper() {
        try (Scanner input = new Scanner(System.in)) {
            int choise;
            int subchoice;
            
            do {
                System.out.println("1.Get current state");
                System.out.println("2.Review the paper");
                System.out.println("3.Exit application");
                System.out.println("Your choise is:");
                choise = input.nextInt();
                
                switch (choise) {
                    case 1:
                        writePaper();
                        reviewPaper();
                        break;
                    case 2:
                        
                        subchoice = paperReviewed();
                        if(subchoice == 1 || subchoice == 2) return;
                        break;
                    case 3:
                }
            } while (choise != 3);
        }
    }

    default void rejectPaper() {
        System.out.println("Paper rejected!");
    }

    default void acceptPaper() {
        System.out.println("Paper accepted!");
    }

    default public int paperReviewed() {

        Scanner input = new Scanner(System.in);
        int choise;

        System.out.println("1.Accept paper");
        System.out.println("2.Reject paper");
        System.out.println("3.Current state");
        System.out.println("4. Go back");

        System.out.println("Your choise is:");
        choise = input.nextInt();

        switch (choise) {
            case 1:
                acceptPaper();

                break;
            case 2:
                rejectPaper();

                break;
            case 3:
                System.out.println("Reviewing the paper...");
                paperReviewed();
            default:
                
        }
        return choise;
    }
}

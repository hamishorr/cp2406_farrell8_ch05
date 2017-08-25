/**
 * Created by jc325134 on 25/08/17.
 */
import javax.swing.*;
public class CondoSales2 {

    public static void main(String args[]) {

        int lowPrice = 150000;
        int medPrice = 170000;
        int highPrice = 210000;
        int garagePrice = 5000;
        int condoCost;
        int parkCost;
        int userChoice = 0;
        String userChoiceString = JOptionPane.showInputDialog(null,
                "Which view would you prefer? \n1 - Park View\n " +
                        "2 - Golf Course View \n3 - Lake View");
        userChoice = Integer.parseInt(userChoiceString);

        while (userChoice != 1 && userChoice != 2 && userChoice != 3) {

            condoCost = 0;
            userChoiceString = JOptionPane.showInputDialog(null,
                    "Input Error! Please enter one of the following: \n1 - Park View\n " +
                            "2 - Golf Course View \n3 - Lake View");
            userChoice = Integer.parseInt(userChoiceString);
        }

        if (userChoice == 1) {
            condoCost = lowPrice;
        } else if (userChoice == 2) {
            condoCost = medPrice;
        } else {
            condoCost = highPrice;
        }

        userChoiceString = JOptionPane.showInputDialog(null,
                "Car Park type? \n1 - Garage\n 2 - Parking Space");
        userChoice = Integer.parseInt(userChoiceString);

        while (userChoice != 1 && userChoice != 2) {

            parkCost = 0;
            userChoiceString = JOptionPane.showInputDialog(null,
                    "Input Error! Please enter one of the following: \n1 - Garage\n2 - Parking Space");
            userChoice = Integer.parseInt(userChoiceString);
        }

        if (userChoice == 1) {
            parkCost = garagePrice;
        } else {
            parkCost = 0;

        }
    }
}


    }
}

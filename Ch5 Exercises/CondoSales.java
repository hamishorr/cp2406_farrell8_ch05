/**
 * Created by jc325134 on 25/08/17.
 */
import javax.swing.*;
public class CondoSales {

    public static void main(String args[]) {

        int lowPrice = 150000;
        int medPrice = 170000;
        int highPrice = 210000;
        int cost;
        int userChoice = 0;
        String userChoiceString = JOptionPane.showInputDialog(null,
                "Which view would you prefer? \n1 - Park View\n " +
                        "2 - Golf Course View \n3 - Lake View");
        userChoice = Integer.parseInt(userChoiceString);

        while (userChoice != 1 && userChoice != 2 && userChoice != 3) {

                cost = 0;
                userChoiceString = JOptionPane.showInputDialog(null,
                        "Input Error! Please enter one of the following: \n1 - Park View\n " +
                                "2 - Golf Course View \n3 - Lake View");
                userChoice = Integer.parseInt(userChoiceString);
        }

        if (userChoice == 1){
                cost = lowPrice;}
        else if (userChoice == 2){
                cost = medPrice;}
        else {
            cost = highPrice;}
    }
}

/**
 * Created by jc325134 on 25/08/17.
 */

import javax.swing.*;
public class CellPhoneService {

    public static void main(String[] args) {

        String minutesUsage;
        String smsUsage;
        String dataUsage;
        String planA = "$49";
        String planB = "$55";
        String planC = "$61";
        String planD = "$70";
        String planE = "$79";
        String planF = "$87";

        JTextField minutesField = new JTextField(5);
        JTextField smsField = new JTextField(5);
        JTextField dataField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Talk Minutes:"));
        myPanel.add(minutesField);
        myPanel.add(Box.createHorizontalStrut(15));
        myPanel.add(new JLabel("SMS Messages:"));
        myPanel.add(smsField);
        myPanel.add(new JLabel("Data Allowance (GB):"));
        myPanel.add(dataField);


        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Please enter usage requirements:", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            if (Integer.parseInt(minutesField.getText()) < 500 &&
                    Integer.parseInt(dataField.getText()) == 0){

            }

        }
    }
}







if (talk < 500 && text == 0 && data == 0)
        System.out.println("You should try data Plan A for $49 a month?");
        else if (talk < 500 && text > 0 && data == 0)
        System.out.println("You should try data Plan B for $55 a month?");
        else if (talk >= 500 && text < 100 && data == 0)
        System.out.println("You should try data Plan C for $61 a month?");
        else if (talk < 500 && text > 100 && data == 0)
        System.out.println("You should try data Plan D for $70 a month?");
        else if (data < 2)
        System.out.println("You should try data Plan E for $79 a month?");
        else if (data >= 2)
        System.out.println("You should try data Plan F for $87 a month?");
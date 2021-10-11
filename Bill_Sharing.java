import javax.swing.JOptionPane;

public class Bill_Sharing{
    public static void main (String[] args){

        /* Write a program to read the value of a bill and how many people will pay the bill, the system will display
how much each person will pay.*/

    String billValue;
    int amount;
    String numberOfPeople;
    int numberOfPayers;
    float amountPerPerson;

billValue = JOptionPane.showInputDialog (null, "Enter Bill Value:");
amount =Integer.parseInt (billValue);


numberOfPeople = JOptionPane.showInputDialog (null, "Enter number of payers:");
numberOfPayers =Integer.parseInt (numberOfPeople);

amountPerPerson = amount / numberOfPayers;

JOptionPane.showMessageDialog(null, "Amount For Each Payer: R"+ amountPerPerson);




    }

}
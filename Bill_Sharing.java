import javax.swing.JOptionPane;

public class Bill_Sharing{
    public static void main (String[] args){

        /* Write a program to read the value of a bill and how many people will pay the bill, the system will display
how much each person will pay.*/


    String billValue = JOptionPane.showInputDialog (null, "Enter Bill Value:");    
    Float amount =Float.parseFloat(billValue);


    String numberOfPeople = JOptionPane.showInputDialog (null, "Enter number of payers:");
    int numberOfPayers =Integer.parseInt (numberOfPeople);

    Float amountPerPerson = amount / numberOfPayers;

    JOptionPane.showMessageDialog(null, "Number of Payers " + numberOfPayers + "\n Amount For Each Payer: R " + amountPerPerson);

    }

}
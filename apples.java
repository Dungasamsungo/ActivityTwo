import javax.swing.JOptionPane;

public class apples {
    public static void main(String[] args) {

        /*Write a program that reads the number of apples purchased, calculates and writes the total 
        purchase amount.
they cost R$0.30 each if less than a dozen are purchased, and R$0.25 if at least twelve are purchased.)*/

    String inpute;
    int numberOfApp;
    double totalPurchaseAmount1;
    double totalPurchaseAmount2;

    inpute = JOptionPane.showInputDialog(null, "Enter Number Purchased");
    numberOfApp = Integer.parseInt(inpute);

    totalPurchaseAmount1 = numberOfApp * 0.25;
    totalPurchaseAmount2 = numberOfApp * 0.30;

       if (numberOfApp >= 12){
        JOptionPane.showMessageDialog(null,"Total Purchase Amount = R"+ totalPurchaseAmount1);
             } 
       else{
        JOptionPane.showMessageDialog(null, "Total Purchase Amount = R"+ totalPurchaseAmount2);
             }   
    }
    
    
}

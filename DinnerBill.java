
import javax.swing.JOptionPane;

public class DinnerBill {
   private static Object Bill;

public static void main(String[] args) {
/*Write a program to read the value of a dinner, the system will display the 10% waiter fee and also the value
final total = (meal value) + 10%.*/

    String
    
        dinnerValue = JOptionPane.showInputDialog(null,"Enter Meal Cost:");
        int mealCost =  Integer.parseInt(dinnerValue);

        double Tip = 0.1;
        Double waiterFee = Tip * mealCost;
        Double totalCost = mealCost + waiterFee;

        JOptionPane.showMessageDialog
        (null, "10% Waiter Fee =  R"  + waiterFee);

        JOptionPane.showMessageDialog
        (null, "Total Cost:  R"  + totalCost);
        
        





    }
        
    
    
}

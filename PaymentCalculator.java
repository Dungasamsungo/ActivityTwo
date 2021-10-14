import javax.swing.JOptionPane;

public class PaymentCalculator{
    public static void main(String[] args) {
        
        /*Write a program to read the value of a product, the system will
         present 2 options for payment, the value to
        view with 10% discount, or the value in 3 installments without interest.*/ 

        String productValue;
        int paymentOption;
        double discount ;
        double instantPaymentPrice;
        double installmentPaymentPrice;

        productValue = JOptionPane.showInputDialog(null, "Inpute Product Price");
        int input = Integer.parseInt(productValue);


        discount = input* 0.1;
        instantPaymentPrice = input - discount;
        installmentPaymentPrice = input / 3;
        
       
        Object[] payOptions = {"Instant", "Inatalment Payment"};
        paymentOption = JOptionPane.showOptionDialog(null,
         "Choose a payment Option", "Payment Options",
         JOptionPane.DEFAULT_OPTION,
         JOptionPane.QUESTION_MESSAGE, null, payOptions, payOptions[1]);

        if (paymentOption==0){
            JOptionPane.showMessageDialog(null,"Total Payment " + installmentPaymentPrice,
             "Instant Payment Price", JOptionPane.PLAIN_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null,"Total Payment " + installmentPaymentPrice,
             "Three Instalment Payment Price", JOptionPane.PLAIN_MESSAGE);  
        }
    }

    

}
import javax.swing.JOptionPane;

public class AnterioPostriorNo {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog("Type in a number");
        int no= Integer.parseInt(input);

        JOptionPane.showMessageDialog(null,(no -1) + " - " +(no + 1));


    }
}

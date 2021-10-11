import javax.swing.JOptionPane;

public class Grades {

    public static void main(String[] args) {

        String inpute1;
        String inpute2;
        Float mathGrade;
        Float engGrade;
        Float totalGrade;

        inpute1 = JOptionPane.showInputDialog(null, "Enter Math Garde:");
        mathGrade= Float.parseFloat(inpute1);

        inpute2 = JOptionPane.showInputDialog(null, "Enter English Garde:");
        engGrade= Float.parseFloat(inpute2);

        totalGrade = engGrade + mathGrade;

        JOptionPane.showMessageDialog(null, "Total Grade " +  totalGrade);


        
    }
}

import javax.swing.JOptionPane;

public class Voters {
    public static void main(String[] args) {

        String Name;
        int Age;
        String ageImpute;


         Name = JOptionPane.showInputDialog ("Enter Your Name:");

          ageImpute= JOptionPane.showInputDialog ("Enter Birth Year:");
         Age = Integer.parseInt(ageImpute);
         
         if (Age < 2003){
                JOptionPane.showMessageDialog(null, Name +" " +"You are Eligiable to vote!!!", "Eligibility", 2);
            }
          else{
            JOptionPane.showMessageDialog(null, Name + " " + "You are Not Eligiable to vote!!!", "Eligibility", 2); 
          }  
    }
    
}

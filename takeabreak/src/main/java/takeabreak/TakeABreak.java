package takeabreak;
import java.util.Scanner;


public class TakeABreak {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Do you want to take a break?");
            
   
 
 
    }

    public static String getBreakResponse(String yesOrNo){

        String response;
        
        
        String input = "yes";
        

        if (input.equals("yes")){
            response =  "Okay. Let's keep going!";  
                
            } else{ 
                response = "Okay. Lets take a break! Come back in 15 minutes!";
                
            
            }         
            
            return response;
        }

        
}

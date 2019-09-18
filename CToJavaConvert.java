package c_to_java_convert;
import javax.swing.*;



public class CToJavaConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*pset1 Mario pyramid
*author: periperi peter.richter.62@gmail.com
*
*i: variable to handle the outher-loop, for each row
*j: variable to handle the first inner-loop, fill with empty spaces
*k: variable to handle the second inner-loop, fill with #####
*n: variable to handle input, how many roows
*empty_spaces: break-condition in the inner-loop
*number_of_rows: break-condition in the outer-loop
*
*/

 

   int i, j, empty_spaces, number_of_rows = 0;
   boolean go = true;
     
   while(go){  
   String input = JOptionPane.showInputDialog("How many rows of ##### do you want?\n");
   number_of_rows = Integer.parseInt(input);
   
   if(number_of_rows == 23){
       JOptionPane.showInputDialog("How many rows of ##### do you want?\n");
       go = true;
       }
       
       if(number_of_rows > 0 && number_of_rows <= 23){
           go = false;
           }
   }
     
   empty_spaces = number_of_rows;
   System.out.println("Height" + number_of_rows);
   
   // for each rows
   for ( i = 2 ; i <= number_of_rows+1 ; i++ ) {
   
       // fill empty spaces,
       for ( j = 1 ; j < empty_spaces ; j++ )
           System.out.println(" ");
 
       // decrease empty spaces
       empty_spaces--;
 
       // fill #####
       for( j = 1 ; j <= i ; j++ )
           System.out.println("#");
 
       // new row after outer-loop
       System.out.println("\n");
   }
   
}
    }
    
//haha oliver big homo

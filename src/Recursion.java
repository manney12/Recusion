/*Recursion 
 * project 5, this is my work. i abided by the school policy 
 * Owoicho Ogah 
 */

//java imports util files 
 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author O.Emmanuel.OGAH
 */
public class Recursion {
    public static void main(String arg[]) throws FileNotFoundException{
        // main method for the testing 
        
         // create the file location 
        File Read = new File("read.in");
    // use scanner to read file
        Scanner reader = new Scanner(Read);
    // string to the file and find 
        
         String reading;
           
         reading = reader.nextLine();
         
         System.out.println(reading);
    // test method
    }
    
    
    // s1 
    public boolean isS1(String str){
        boolean isS1 = false ;
        // it has to start with A or B in the java we will be  using 
        // and because it has to be both true for A then B 
        
        
    // less than 3 
    if(str.length()<3){
           return false; 
        }
    // if first character is A or B
    //Third character to be C  or more Cs is followed by either a S1 or a 'D'
    // S1 or 'D'that follows the C's ends ther S1
    // end of method 
       
        
        return isS1;
    }
    
    

    //s2 
    // has a  stopper to 
    // if first character is 'x' return true
    
    // if  two character  s2 the second and last character should be W
    // if it is not a two character S2 then it is in one of these two forms:
    //- either 'X' followed by 'Y' followed by a S2, followed by a'Z' consider for loop
    // - either 'X' followed by S1 followed by Z
    // end of method 
    
    
    //s3 boolean  that consist of S1 and then S2 
    // if the character string that consists of S@ followed by a S1
    
}

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
public class Proj5 {
//MAIN  method that calls in the other method and calls them in 
    public static void main(String arg[]) throws FileNotFoundException {
        // main method for the testing 

        // create the file location 
        
        // use scanner to read file
        Scanner stdin = new Scanner(new File("p.in"));



        int number = Integer.parseInt(stdin.nextLine());

        //  System.out.println(reader);
        // test method
        // using a for loop read the scanner and then read what the files has inside of it
        System.out.println("S3S OUTPUT");
     
        
     //   System.out.println(number);
        for (int y = 1; y < number; y++) {
            // create string to read the 
           String list = stdin.nextLine();
            if(isS3(list.toUpperCase())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        System.out.println("END OF OUTPUT");
    }

    // s1 
    public static boolean isS1(String str) {
        // First sector of the method are stopper that are  called stopper
        // because they need to be true to go on to the next steps unless  it 
        // can bring in errors 

        // it has to start with A or B in the java we will be  using 
        // and because it has to be both true for A then B 
        if (str.charAt(0) != 'A' && str.charAt(0) != 'B') {
            return false;
        }

        // less than 3 
        if (str.length() < 3) {
            return false;
        }

        //Third character to be C  or more Cs is followed by either a S1 or a 'D'
        // S1 or 'D'that follows the C's ends ther S1
        int i;
        for (i = 2; i < str.length() && str.charAt(i) == 'C'; i++) {
            if (i == str.length()) {
                return false;
            }
            if (i == str.length() - 1 && str.charAt(i) == 'D') {
                return true;
            } else {
                return isS1(str.substring(i));
                // end of method 
            }

        }

        return isS1(str.substring(i));


    }

    //s2 
    public  static boolean isS2(String str) {
        // First sector of the method are stopper that are  called stopper
        // because they need to be true to go on to the next steps unless  it 
        // can bring in errors 


        // it has to start with 'X'in the java we will be  using 
        // and because it has to be both true for A then B 
        if (str.charAt(0) != 'X') {
            return false;
        }

        // less than 2  or 
        if (str.length() < 2 || str.length() < 5) {
            return false;
        }


        // int variable is used to  be put outside to  be recognized 

        // if the str is  either X  and Y  then it can return true but otherwise go to the other  if else statement 
        if (str.charAt(0) == 'X' && str.charAt(1) == 'Y' || str.equals("XY")) {
            return true;
// if it is not a two character S2 then it is in one of these two forms:
            //- either 'X' followed by 'Y' followed by a S2, followed by a'Z' consider for loop
            // - either 'X' followed by S1 followed by Z
            // end of method 

        } else if (str.charAt(0) == 'X' && isS1(str.substring(2, -1)) && str.endsWith("Z")) {// if  the string is   starts with an X and returns S1 class   and ends with a "Z" 
            return true;
        } else {
            return str.charAt(0) == 'X' && str.charAt(1) == 'Y' && isS2(str.substring(2, -1)) && str.endsWith("Z");// if  the string is   starts with an X and returns S2 class   and ends with a "Z" 
        }
    }// end of the method 

//s3 boolean  that consist of S1 and then S2 
// if the character string that consists of S2 followed by a S1 then return tre
    public static boolean isS3(String str) {
        // declare the int for  W and  Z to be used in the  if  and else statement
        int LastW = str.lastIndexOf("W");
        int LastZ = str.lastIndexOf("Z");
        // if and else statement to see if the string ends with  a 'W' or 'Z'
        if (LastW > LastZ) {
            if (isS1(str.substring(0, LastW + 1))) {
                if (isS2(str.substring(LastW + 1, str.length()))) {
                    return true;
                }   
            } 
        }else {
                if (LastZ > LastW) {
                    if (isS2(str.substring(0, LastZ + 1))) {
                        if (isS1(str.substring(LastZ + 1, str.length()))) {
                            return true;
                        }
                    }
                }
            }
        return false;
            // if it a Z then it will return a 
        }
        
    }


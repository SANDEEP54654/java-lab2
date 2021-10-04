/*--------Name: sandeep kaur    student id- a00245516---------------
--------  name:rhythm kad           student id a00245057---------------

*/



package program2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    // scanner is used to get user input
	    int array_size;

	    // *********** CAESAR CYPHER ************
	    System.out.print("\n*********** Code for Caesar cypher method ************ \n\n");
	    
	    // ******** Calling caesar cypher method ********
	    stringEncryption(sc);

	    // ******** ARRAY AVERAGE ********
	    System.out.print("\n\n*********** Array Average ************ \n\n");
	    // taking size of the array dynamically, user will enter how many entries he want to enter into the array
	    System.out.print("Enter total number of entries to enter into the array: ");
	    array_size = sc.nextInt();
	    
	    // size of the array should be greater than 1, so that there must be atleast two values
	    // to find average,for searching and for reversing of array.
	    if(array_size > 1){ 
	        int[] values = new int[array_size]; // here we are initializing the array
	        
	        // ******** calling array average method ********
	        // calling arrayAverage method that returns an array to use it further
	        values = arrayAverage(values,sc); //saving the returned array in array named 'values'
	        
	        // ******** calling searching in Array method********
	        arraySearching(values, sc);
	        
	        // ******** calling reverse array method ********
	        arrayReverse(values);
	    }
	    else{
	        System.out.print("****** Error ******\n");
	        System.out.print("\nEntries should be greater than 1");
	    } 
	}

	// *********** Code for Caesar cypher method ************
	public static void stringEncryption(Scanner sc) {
	    
	    String string_to_encrypt, // string entered by the user for encryption
	            encrypted_string="", // to store string after encryption
	            decrypted_string = ""; // to store string after decryption
	    int encrypt_value;
	    
	    System.out.print("Enter a String to encrypt: ");
	    string_to_encrypt = sc.next();
	    System.out.print("Enter a value to encrypt with: ");
	    encrypt_value = sc.nextInt();
	    
	    // here we have set string limit that should not be greater than 20
	    if (string_to_encrypt.length() <= 20) { 
	        if (encrypt_value > 0) {
	            char c;
	            //using loop statement to read individual character of the string for conversion
	            // ------ encrypting the string --------
	            System.out.println("Encrypted String is: " + encrypted_string);
	            for (int i = 0; i < string_to_encrypt.length(); i++) {
	                // charAt() returns a character at a specific index position in a string; 
	                //here it returns character at index 'i'
	                c = string_to_encrypt.charAt(i);
	                encrypted_string = encrypted_string + Character.toString((char) (c + encrypt_value)); // storing String after conversion
	            }

	            // ------ Decrypting the string -----
	            System.out.print("Decrytping " + encrypted_string + " with -" + encrypt_value + "....\n");

	            for (int i = 0; i < encrypted_string.length(); i++) {
	                c = encrypted_string.charAt(i);
	                decrypted_string = decrypted_string + Character.toString((char) (c - encrypt_value));
	            }
	            System.out.println("Decrypted String is: " + decrypted_string);
	        } else {
	            System.out.print("****** Error while encrypting ******\n");
	            // if value is entered by the user is not greater than 0, it will show error.
	            System.out.print("Value should be greater than 0 for encryption"); 
	        }
	    } else {
	        System.out.print("Please enter less than 20 characters for encryption");
	    }
	}

	// ******** Average array method ********
	public static int[] arrayAverage(int[] array,Scanner s) {
	   
	    //used for limiting the double output to 2 decimal places
	    DecimalFormat df = new DecimalFormat("0.00");
	    double average_value = 0;
	    System.out.println("Enter Values: ");

	    // this loop is to get the values from user
	    for (int i = 0; i < array.length; i++) {
	        array[i] = s.nextInt();
	        // here we are doing addition of all the values that are entered by the user and 
	        //saving it in a double variable named 'average_value'.
	        average_value = average_value + array[i];
	    }

	    // printing the array
	    System.out.print("Testing methods with:\n");
	    for (int i = 0; i < array.length; i++) {
	        System.out.print("[" + array[i] + "] ");
	    }
	    //printing the average value of the array
	    System.out.print("\nThe Average is: " + df.format(average_value / array.length));

	    return array; // returning array
	}

	// ******** Searching in Array method ********
	public static void arraySearching(int[] array, Scanner s) {
	    System.out.print("\n\n****** Searching in Array ******\n");

	    System.out.print("Enter a value to search for: ");
	    int search_value = s.nextInt();
	    for (int i = 0; i < array.length; i++) {
	        // checking if the required search value contained by array or not
	        if (array[i] == search_value) {
	            System.out.print("\nThe array contains: " + search_value);
	            break;
	        } else if (i == array.length - 1) {
	            System.out.print("\nArray does not contains: " + search_value);
	            break;
	        }
	    }
	}

	// ******** Reverse array method ********
	public static void arrayReverse(int[] array) {
	    // ******* Array in reverse ********
	    System.out.print("\n\n****** Array in reverse order ******\n");

	    System.out.print("\n Array in reverse is: ");
	    // running loop in reverse order to print the array in reverse
	    for (int i = array.length - 1; i >= 0; i--) {
	        System.out.print("[ " + array[i] + " ]");
	    }
	}

}

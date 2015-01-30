package model;


/**
 * This will be used as an example to show that work can be done after a recursive call.
 * The recursive call doesn't have to be the last process of a method.
 * Algorithms here are made up and may need to be changed
 * 
 * @author Christopher Baillie
 * @version 1.0
 * @since 1.0
 */

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkAfter implements IWorkAfter {
	
	//TODO Deal with ensuring the limit on n is n>= 1 and n<= 10
	
	//TODO decide how appropriate the algorithms are and which to really use
	
	/**
	 * A basic method which takes in an integer parameter
	 * A new array is initialised of length n
	 * The array is then filled with the value n from index 0 to the size of the array(n)
	 * Recursively this method is called until the array is size 1 and only holds the value 1
	 * Once this happens the if statement is met and 5 is added to every element in the array
	 * There is only one element so the sum will be 1+5
	 * Finally we just print the value of x which will be 6
	 * 
	 * @param n Any integer greater than 1 and less than 10.
	 * @return There is no return value. Simply a print statement of the value of x after the recursion is finished.
	 * @since 1.0
	 */
	public void workAfter(int n){
		int x = 0;
		
		int[] numbers = new int[n];
		
		//Fills the numbers array from 0 to n and fills each space with the value n
		Arrays.fill(numbers, 0, n, n);
		
		//Recursive call
		if(n > 1)
		workAfter(n-1);
		
		//Base case
		if(n == 1){
		for(int num : numbers)
			x = num + 5;
		
		System.out.println("Value of x is " + x);
		
		
		}
		
	}
	
	/**
	 * Similar to the above method.
	 * The difference in this one is that the number is added to an arraylist once the addition has taken place.
	 * The arraylist is then printed
	 * 
	 * @param n Any integer greater than 1 and less than 10.
	 * @return There is no return value. Simply a print statement of the value of x after the recursion is finished.
	 * @since 1.0
	 */
	
	public void workAfter2(int n){
		int x = 0;
		
		int[] numbers = new int[n];
		List<Integer> numList = new ArrayList<Integer>();
		
		//Fills the numbers array from positon 0 to n with the value of n
		Arrays.fill(numbers, 0, n, n);
		
		//Recursive call
		if(n > 1)
		workAfter2(n-1);
		

		for(int num : numbers)
			x = num + 5;
			//Adds the result to the arraylist numList
		    numList.add(x);
		
		    //Prints out the arraylist
		    for(int i = 0; i < numList.size(); i++) {   
		        System.out.print(numList.get(i)+ ", ");
		    }  

		
	}
	
	/**
	 * This will get a list of all files in a directory and list them.
	 * If one of the files is a folder then this will recursively call in order to open the folder
	 * and then list all the files in that folder. This repeated every time a folder is found until all
	 * folders are expanded and all files are found. 
	 * It only looks for files that are .java or .class files
	 * 
	 * 
	 * @param directory A file path of a directory
	 * @throws IOException
	 * @since 1.0
	 */
	
	public void getAllFiles(File directory) throws IOException {
    	
    	//Gets a list of all files and stores them in an array
        File[] files = directory.listFiles();
        
        //For each loop to go through each file found from the array
        for(File file : files){
        	//If any found file is a directory then expand it to search for any more .java/.class files
        	if(file.isDirectory()){
            	getAllFiles(file);
            }
        	if(file.toString().contains(".java") || file.toString().contains(".class") ){

        	   //getting the file path and printing it to console
               String filePath = file.getCanonicalPath();
	           System.out.println("File name: " + filePath);
	           
	           //Using substring to get the class name from the file path
	           System.out.println("Class name: " + filePath.substring( filePath.lastIndexOf('\\')+1, filePath.length() ));
	           
        	}
        }

    }

	/**
	 * Some tests. Will remove later.
	 * 
	 * @param args
	 * @throws IOException
	 */
	
	public static void main(String[] args) throws IOException{
		
		WorkAfter wa = new WorkAfter();
		
		wa.workAfter(10);
		
		System.out.println();
		System.out.println("New method below");
		System.out.println();
		
		wa.workAfter2(5);
		
//		File fi = new File("C:/Users/Chris/Desktop/Uni/4th year/CS408 Individual Project");
//		
//		wa.getAllFiles(fi);
		
	}

}

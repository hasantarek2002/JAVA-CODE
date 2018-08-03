package processBuilder;

import java.io.File;
import java.io.IOException;

public class Dirctory {

	
	 public static void main(String[] args) {

	      // create a new list of arguments for our process
	      String[] list = {"test.txt"};

	   /*// prints the name of the system property
	      System.out.println(System.getProperty("user.dir"));

	      // prints the name of the Operating System
	      System.out.println(System.getProperty("os.name"));

	      // prints Java Runtime Version
	      System.out.println(System.getProperty("java.runtime.version" ));*/
	      
	      // create the process builder
	      ProcessBuilder pb = new ProcessBuilder(list);

	      // set the working directory of the process
	      
	      pb.directory(new File(System.getProperty("user.dir")));
	      
	      System.out.println("" + pb.directory());
	     
	   }
	 
	 
	 /*public static void main(String[] args) {

	      // create a new list of arguments for our process
	      String[] list = {"notepad.exe", "test.txt"};

	      // create the process builder
	      ProcessBuilder pb = new ProcessBuilder(list);

	      // get the working directory of the process
	      System.out.println("" + pb.directory());
	   }*/

}

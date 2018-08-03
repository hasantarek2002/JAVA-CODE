package processBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Command {
	
	public static void main(String[] args) {

	      // create a new list of arguments for our process
	      String[] list = {"notepad.exe", "test.txt"};

	      // create the process builder
	      ProcessBuilder pb = new ProcessBuilder(list);

	      // set the command list
	      pb.command(list);

	      // print the new command list
	      System.out.println("" + pb.command());
	   }
	
	
	/*public static void main(String[] args) {

	      // create a new list of arguments for our process
	      List<String> list = new ArrayList<String>();
	      list.add("notepad.exe");

	      // create a new list that contains a file to open with notepad
	      List<String> list2 = new ArrayList<String>();
	      list.add("text.txt");

	      // create the process builder
	      ProcessBuilder pb = new ProcessBuilder(list);

	      // set the command list
	      pb.command(list);
	      
	      // print the new command list
	      System.out.println("" + pb.command());
	   }
	*/
	

	/*public static void main(String[] args) {

	      // create a new list of arguments for our process
	      List<String> list = new ArrayList<String>();
	      list.add("notepad.exe");
	      //list.add("C:\\\\Program Files (x86)\\\\Notepad++\\\\notepad++.exe");
	      
	      // create the process builder
	      ProcessBuilder pb = new ProcessBuilder(list);
	      
	      // get the command list
	      System.out.println(""+pb.command());
	      
	   }*/

}

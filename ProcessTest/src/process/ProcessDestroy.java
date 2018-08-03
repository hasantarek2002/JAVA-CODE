package process;

import java.io.InputStream;
import java.io.OutputStream;

public class ProcessDestroy {
	
	
	public static void main(String[] args) {
	      try {
	         // create a new process
	         System.out.println("Creating Process...");
	         Process p = Runtime.getRuntime().exec("notepad.exe");

	         // cause this process to stop until process p is terminated
	         
	         p.waitFor();

	         // when you manually close notepad.exe program will continue here
	         System.out.println("Waiting over.");
	      } catch (Exception ex) {
	         ex.printStackTrace();
	      }
	   }
	
	/*public static void main(String[] args) {
	      try {
	         // create a new process
	         System.out.println("Creating Process...");
	         Process p = Runtime.getRuntime().exec("notepad.exe");

	         // get the output stream
	         OutputStream out = p.getOutputStream();

	         // close the output stream
	         System.out.println("Closing the output stream...");
	         out.close();
	      } catch (Exception ex) {
	         ex.printStackTrace();
	      }
	}*/

	/*
	public static void main(String[] args) {
	      try {
	         // create a new process
	         System.out.println("Creating Process...");
	         Process p = Runtime.getRuntime().exec("notepad.exe");

	         // get the error stream of the process and print it
	         InputStream error = p.getErrorStream();
	         for (int i = 0; i < error.available(); i++) {
	            System.out.println("" + error.read());
	         }

	         // wait for 10 seconds and then destroy the process
	         Thread.sleep(10000);
	         p.destroy();

	      } catch (Exception ex) {
	         ex.printStackTrace();
	      }
	   }
	*/
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	         // create a new process
	         System.out.println("Creating Process...");
	         Process p = Runtime.getRuntime().exec("C:\\Program Files (x86)\\Notepad++\\notepad++.exe");

	         // wait 10 seconds
	         System.out.println("Waiting...");
	         Thread.sleep(10000);

	         // kill the process
	         p.destroy();
	         System.out.println("Process destroyed.");
	         // get the exit value of the new process
	         System.out.println("" + p.exitValue());

	      } catch (Exception ex) {
	         ex.printStackTrace();
	      }

	}*/

}

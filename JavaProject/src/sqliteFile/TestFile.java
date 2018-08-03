package sqliteFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestFile {
	private static String OUTPUT_FILENAME = "textfolder//test.txt";
	private static String INPUT_FILENAME = "textfolder//in.txt";
	
	public void readFromFile_BufferReader() {

		BufferedReader br = null;
		FileReader fr = null;
		int count=0;

		try {

			fr = new FileReader(INPUT_FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;

			// br = new BufferedReader(new FileReader(FILENAME));

			while ((sCurrentLine = br.readLine()) != null) {
				writeToFile_BufferWriter(sCurrentLine+"\n"+count+"\n");
				System.out.println(count);
				count++;
				
			}
			
			System.out.println("Write Done");
			if (br != null)
				br.close();

			if (fr != null)
				fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void  writeToFile_BufferWriter(String content) {
		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			//String content = JOptionPane.showInputDialog("Write about BSSE08");

			//open filewriter as write mode
			//fw = new FileWriter(OUTPUT_FILENAME);
			
			//open filewriter as append mode
			fw = new FileWriter(OUTPUT_FILENAME, true);
			
			bw = new BufferedWriter(fw);
			bw.write(content);

			//System.out.println("Write Done" + content);
			
			if (bw != null)
				bw.close();

			if (fw != null)
				fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}

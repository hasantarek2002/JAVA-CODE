package main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		NextDayCalculator nextDay = new NextDayCalculator();
		ReadFileContent rf = new ReadFileContent();
		ArrayList<String> lines = rf.readFromFile();
		System.out.println("TestID\t"+"day\t"+"Month\t"+"Year\t"+"Expected Result\t"+"Actual Result");
		
		for(int i=0 ; i<lines.size(); i++) {
			
			int day, month, year;
			String line=lines.get(i);
			String []givenLine=line.split(",");
			String givenDate=givenLine[0];
			String actualOutputDate=givenLine[1];
			
			String []date=givenDate.split("-");
			day=Integer.parseInt(date[0]);
			month=Integer.parseInt(date[1]);
			year=Integer.parseInt(date[2]);
			System.out.print((i+1)+"\t"+day+"\t"+month+"\t"+year+"\t");
			nextDay.calculateNextDay(day, month, year);
			System.out.println("\t"+actualOutputDate);
			//System.out.print((i+1)+". ");
			//nextDay.calculateNextDay(day, month, year);
			//System.out.println(date[0]+" "+date[1]+ " "+date[2]);
			//System.out.println((i+1) +". "+lines.get(i));
		}
		
		
		//nextDay.calculateNextDay(30, 12, 2025);
	}

}

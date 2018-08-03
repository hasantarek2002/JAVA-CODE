package regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line="hasan2002tarek2o";
		String pattern="[a-z]+";
		
		Pattern p= Pattern.compile(pattern);
		Matcher m=p.matcher(line);
		int c=0;
		 while(m.find()){
			 c++;
			 System.out.println(c +"    "+m.start()+"       "+(m.end()));
		 }

	}

}

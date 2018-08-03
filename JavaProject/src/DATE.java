import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class DATE {

	public String getAge(int day, int month, int year) {

		// String s="JANUARY";
		// LocalDate today = LocalDate.now();
		// LocalDate birthday = LocalDate.of(2000, 1, 1);
		// //LocalDate birthday = LocalDate.of(2000, Month.JANUARY, 1);
		//
		// Period p = Period.between(birthday, today);
		//
		// //Now access the values as below
		//
		// System.out.println(p.getDays());
		// System.out.println(p.getMonths());
		// System.out.println(p.getYears());

		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(year, month, day);
		Period p = Period.between(birthday, today);
		int d = p.getDays();
		int m = p.getMonths();
		int y = p.getYears();
		String dayString = Integer.toString(d);
		String monthString = Integer.toString(m);
		String yearString = Integer.toString(y);
		String res = dayString + "/" + monthString + "/" + yearString;
		return res;

	}

}

import java.time.LocalDate;
import java.time.Period;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// getting current date and time using Date class
		// DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		// Date dateobj = new Date();
		//
		// //System.out.println(df.format(dateobj));
		//
		// int date=dateobj.getDate();
		// int month=dateobj.getMonth()+1;
		// int year=dateobj.getYear()+1900;
		//
		// System.out.println(date);
		// System.out.println(month);
		// System.out.println(year);
		//
		//
		// //string to integer conversion
		// String number = "10";
		// int result = Integer.parseInt(number);
		// System.out.println(result);
		// int a=result-1;
		// System.out.println(a);
		// ///////integer to string///////////////////
		// String numberAsString = Integer.toString(a);
		// numberAsString=numberAsString+"hasan";
		// System.out.println(numberAsString+"sdf");

		String s = "JANUARY";
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(2000, 1, 1);
		// LocalDate birthday = LocalDate.of(2000, Month.JANUARY, 1);

		Period p = Period.between(birthday, today);

		// Now access the values as below
		System.out.println(p.getDays());
		System.out.println(p.getMonths());
		System.out.println(p.getYears()-7);

		/*
		 * getting current date time using calendar class An Alternative of
		 * above
		 */

	}

	

}

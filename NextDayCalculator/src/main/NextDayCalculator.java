package main;

public class NextDayCalculator {
	public void calculateNextDay(int day, int month, int year) {
		if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1900 || year > 2025) {
			System.out.print("Invalid Input");
			return;

		} else if ((day == 29 && month == 2 && (year % 4 != 0)) || (month == 2 && (day == 30 || day == 31))) {
			System.out.print("Invalid Input");
			return;
		} else if (day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
			System.out.print("Invalid Input");
			return;

		} else if (month == 2) {
			if (year % 4 == 0) {
				if (day == 29) {
					day = 1;
					month += 1;
				} else {
					day += 1;
				}
			} else {
				if (day == 28) {
					day = 1;
					month += 1;
				} else {
					day += 1;
				}
			}

		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day == 30) {
				day = 1;
				month += 1;
			} else {
				day += 1;
			}

		} else {
			// month= 1 3 5 7 8 10 12
			if (day == 31) {
				if (month == 12) {
					day = 1;
					month = 1;
					year += 1;
				} else {
					day = 1;
					month += 1;
				}
			} else {
				day += 1;
			}
		}
		
		System.out.print(day+"-"+month+"-"+year);
	}

}

package ProgramLogic;

import java.time.LocalDate;

public class MethodsCalendar {
	public static void main(String[] args) {
		printCalendar(2025, 6);
	}

	private static void printCalendar(int year, int month) {
		String[] months = {"Tammikuu", "Helmikuu", "Maaliskuu", "Huhtikuu", "Toukokuu",
				 "Kesäkuu", "Heinäkuu", "Elokuu", "Syyskuu", "Lokakuu", "Marraskuu", "Joulukuu"};
		String[] dateOfWeek = {"Ma", "Ti", "Ke", "To", "Pe", "La", "Su" }; // 1, 2, 3, 4, 5, 6, 7 
			
		String userMonth = months[month - 1];
			
		LocalDate date = LocalDate.of(year, month, 1);
		// get number of days in that month
		int daysInMonth = date.lengthOfMonth();

		
		// first line: > (month value from step 2) (year from input) <
		System.out.println("> " + userMonth + " " + year + " <");
		// second line: create a loop then print from Ma to Su (Monday to Sunday)
		for (int i = 0; i < dateOfWeek.length; i++) {
			System.out.print(dateOfWeek[i] + " ");
		}
		System.out.println("\n");
		
		String txtCalendar = ""; 
		for (int i = 1; i <= daysInMonth; i++) {
			// Step 1: init data object with year and month with specific date (i)
			LocalDate tmpDate = LocalDate.of(year, month, i);
			int tmpDayOfWeek = tmpDate.getDayOfWeek().getValue();
			
			// first date of month handling
			if (i == 1 ) {
				for (int num = 0; num < tmpDayOfWeek; num++) {	
					if (num == tmpDayOfWeek - 1) {
						txtCalendar += i;
						if (tmpDayOfWeek == 7) {
							txtCalendar += "\n";
						}
					} else {
						txtCalendar += "   ";
					}
				}
			} else {
				// rest of date 
				if (tmpDayOfWeek == 7) {
					txtCalendar += i + "\n";
				} else {
					txtCalendar += i + " ";
				}
			} 
		}
		System.out.println(txtCalendar);
	}
}

import java.util.Calendar;

public class DisplayCalendars {
	public static void main(String[] args) {
		PrintCalendar myCalendar = new PrintCalendar();
		
		int year = 0;
		int month = 0;
		int l = args.length;
		
		if ( l == 2 ) {//When user types in the month and the year
			year = Integer.parseInt(args[1]);
			month = Integer.parseInt(args[0]);
		}
		else if ( l == 1 ) {//When user only types the month
			year = Calendar.getInstance().get(Calendar.YEAR);
			month = Integer.parseInt(args[0]);
		}
		else if ( l > 2 ) {//When user types more than two values
			System.out.println("Too many values!");
			System.out.println("Enter two values: month and year");
			System.exit(1);
		}
		else {//When user types nothing
			year = Calendar.getInstance().get(Calendar.YEAR);
			month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		}
	
		myCalendar.printMonth(year, month);
	}
}

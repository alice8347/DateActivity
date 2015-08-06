import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Random;

public class Detail {
	
	public void getDateofWeek(GregorianCalendar date) {
		int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
		String answer;
		switch (dayOfWeek) {
		case 1:
			answer = "That was a Sunday. ";
			System.out.print(answer);
			break;
		case 2:
			answer = "That was a Monday. ";
			System.out.print(answer);
			break;
		case 3:
			answer = "That was a Tuesday. ";
			System.out.print(answer);
			break;
		case 4:
			answer = "That was a Wednesday. ";
			System.out.print(answer);
			break;
		case 5:
			answer = "That was a Thursday. ";
			System.out.print(answer);
			break;
		case 6:
			answer = "That was a Friday. ";
			System.out.print(answer);
			break;
		case 7:
			answer = "That was a Saturday. ";
			System.out.print(answer);
			break;
		}
	}
	
	public int getDayDifference(GregorianCalendar date) {
		Date input = date.getTime();
		Date now = new Date();
		long inputMS = input.getTime();
		long nowMS = now.getTime();
		long elapsedMS = nowMS - inputMS;
		long elapsedDays = elapsedMS / (24 * 60 * 60 * 1000);
		return (int) elapsedDays;
	}
	
	public String getDescription(GregorianCalendar inputDate) {
		String weatherHistory;
		Random r = new Random(getDayDifference(inputDate));
		
		int weather = 1 + r.nextInt(5);
		
		if (weather == 1) {
			weatherHistory = "It was a sunny day and the temperature averaged 78 degrees. ";
			return weatherHistory;
		} else if (weather == 2) {
			weatherHistory = "It was a cloudy day and the temperature averaged 60 degrees. ";
			return weatherHistory;
		} else if (weather == 3) {
			weatherHistory = "It was a windy day and the temperature averaged 45 degrees. ";
			return weatherHistory;
		} else if (weather == 4) {
			weatherHistory = "It was a rainy day and the temperature averaged 55 degrees. ";
			return weatherHistory;
		} else {
			weatherHistory = "It was a snowy day and the temperature avearged 29 degrees. ";
			return weatherHistory;
		}
		
	}
}

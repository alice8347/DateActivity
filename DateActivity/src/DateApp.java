import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class DateApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputYear, inputMonth, inputDay;
		String answer = "";
		ArrayList<WeatherInfo> history = new ArrayList<WeatherInfo>();
		
		System.out.print("What is the year that you are asking about?   :  ");
		inputYear = sc.nextInt();
		
		while (inputYear != 0) {
			System.out.print("What is the month that you are asking about?  :  ");
			inputMonth = sc.nextInt();
			System.out.print("What is the day that you are asking about?    :  ");
			inputDay = sc.nextInt();
			GregorianCalendar inputDate = new GregorianCalendar();
			inputDate.set(inputYear, inputMonth - 1, inputDay);
			
			Detail getDetail = new Detail();
			WeatherInfo weatherInfo = new WeatherInfo();
			weatherInfo.setDate(inputDate);
			history.add(weatherInfo);
			getDetail.getDateofWeek(inputDate);
			
			for (int i = 0; i < history.size(); i++) {
				if (inputDate == history.get(i).getDate()) {	//Find date
					System.out.print(history.get(i).getWeatherInfo());
					break;
				} else {
					weatherInfo.setDate(inputDate);	//Store new date
				}
			}
			String weather = getDetail.getDescription(inputDate);
			System.out.print(weather);
			weatherInfo.setWeatherInfo(weather);
			answer += weather;
			System.out.print("It was " + getDetail.getDayDifference(inputDate) + " days ago.");
			answer += "It was " + getDetail.getDayDifference(inputDate) + " days ago.";
			weatherInfo.setWeatherInfo(answer);
			//history.add(weatherInfo);
			System.out.println();
			System.out.print("What is the year that you are asking about?   :  ");
			inputYear = sc.nextInt();
		}
	}

}
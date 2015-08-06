import java.util.GregorianCalendar;

public class WeatherInfo {
	private GregorianCalendar date;
	private String weatherInfo;
	
	public WeatherInfo() {
		date = new GregorianCalendar();
		weatherInfo = "";
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar inputDate) {
		date = inputDate;
	}

	public String getWeatherInfo() {
		return weatherInfo;
	}

	public void setWeatherInfo(String weatherHistory) {
		weatherInfo = weatherHistory;
	}
	
}

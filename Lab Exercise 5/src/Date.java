
public class Date {
	private int year;
	private int month;
	private int day;
	
	Date() {
		
	}
	
	Date (int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public boolean dayIsValid(int day) {
		if ((day > 28 && month == 2) && (year % 4 != 0 || year % 100 != 0)) {
			return false;
		} else if (day < 1 || day > 31) {
			return false;
		} else if ((day == 31) && (month == 2 || month == 4 || month == 6 || month == 9 || month == 11)) {
			return false;
		}
		return true;
	}
	
	public int getYear() {
		return year;	
	}
	
	public void setYear(int year) {
		if (year < 1000 || year > 9000) {
			throw new IllegalArgumentException("Year is not allowed!");
		} else {
			this.year = year;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			throw new IllegalArgumentException("Month is not allowed!");
		} else {
			this.month = month;
		}
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		if (!dayIsValid(day)) {
			throw new IllegalArgumentException("Day is not allowed!");
		} else {
			this.day = day;
		}
	}
	
	public void setDate(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public String toString() {
		return String.format("%02d/%02d/%d", month, day, year);
	}
}

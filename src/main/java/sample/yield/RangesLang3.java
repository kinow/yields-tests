package sample.yield;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.Range;


public class RangesLang3 {

	public static void main(String[] args) {
		Calendar thisMonthCalendar = Calendar.getInstance();
		thisMonthCalendar.set(Calendar.DAY_OF_MONTH, 1);
		thisMonthCalendar.set(Calendar.MONTH, Calendar.FEBRUARY);
		thisMonthCalendar.set(Calendar.YEAR, 2012);
		thisMonthCalendar.set(Calendar.DAY_OF_MONTH, 1);
		Date thisMonth = thisMonthCalendar.getTime();
		
		Calendar nextMonthCalendar = Calendar.getInstance();
		nextMonthCalendar.set(Calendar.DAY_OF_MONTH, 1);
		nextMonthCalendar.set(Calendar.MONTH, Calendar.MARCH);
		nextMonthCalendar.set(Calendar.YEAR, 2012);
		nextMonthCalendar.set(Calendar.DAY_OF_MONTH, 31);
		Date nextMonth = nextMonthCalendar.getTime();
		
		Range<Date> dateRange = Range.between(thisMonth, nextMonth);
		
		System.out.println(dateRange.contains(nextMonth)); // true
	}
	
}

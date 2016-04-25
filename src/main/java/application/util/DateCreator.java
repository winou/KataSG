package application.util;
import cucumber.deps.com.thoughtworks.xstream.converters.basic.DateConverter;

import java.util.Date;

public class DateCreator {
	
	public static Date date(String dateString) {
		DateConverter dateConverter = new DateConverter();
		//TODO:a changer
		Date date = new Date(dateString);
		return date;
	}

}

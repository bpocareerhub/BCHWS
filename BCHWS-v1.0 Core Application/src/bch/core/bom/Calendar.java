package bch.core.bom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calendar {
	
	private static SimpleDateFormat globalDateTimeFormat;
	
	static {
		globalDateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	}
	
	public static Date getMySQLDateTime() {		
		try {
			return getGlobalDateTimeFormat().parse(getGlobalDateTimeFormat().format(new Date()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	private static SimpleDateFormat getGlobalDateTimeFormat() {
		return globalDateTimeFormat;		
	}
}
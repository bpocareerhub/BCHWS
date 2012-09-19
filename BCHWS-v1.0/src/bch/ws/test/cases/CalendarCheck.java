package bch.ws.test.cases;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import bch.core.bom.Calendar;

public class CalendarCheck {

	@Test
	public void test() {
		assertTrue(Calendar.getMySQLDateTime() instanceof Date);
	}

}

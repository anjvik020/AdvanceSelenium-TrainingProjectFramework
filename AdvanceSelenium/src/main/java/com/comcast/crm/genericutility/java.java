package com.comcast.crm.genericutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class java {
	public int getrandomno()
	{
		Random ran=new Random();
		int rn = ran.nextInt(1000);
		return rn;
	}
	public String getCurrentdate()
	{
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
		String ccdate = s.format(d);
		return ccdate;
		
	}
	public String togetreqdate(int days)
	{
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
		String ccdate = s.format(d);
		Calendar cal = s.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String datereq = s.format(cal.getTime());
		return datereq;
		
	}
	public long getTenDigit()
	{
		Random RAN=new Random();
		long no=1000000000L +(long)(RAN.nextDouble()* 9999999999L);
		return no;
	}
}

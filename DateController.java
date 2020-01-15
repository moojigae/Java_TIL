package com.kh.example.chap03_Date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateController {
	public void method1() {
		Date today = new Date();
		System.out.println(today); // Wed Jan 15 19:46:14 KST 2020
		
		System.out.println(today.getTime()); // 1578917288986
//		getTime() 메소드 1970/1/1 0시0분0초 이후로 흐른 시간을 가져 올 때
		
		Date time = new Date(1578917288986L);
		System.out.println(time); // Mon Jan 13 21:08:08 KST 2020
		
		Date origin = new Date(0);
		System.out.println(origin); // Thu Jan 01 09:00:00 KST 1970
		
//		Date date = new Date(2020,1,13);
//		The constructor Date(int, int, int) is deprecated
//		deprecated는 언제 기능이 사라질지 모르기 때문에 사용하지 않는 것이 좋음
	}
	
	public void method2() {
//		Calendar c = new Calender();
//		추상클래스라 객체생성 안되기 때문에 getInstance()메소드 사용해야 함 
		Calendar c = Calendar.getInstance();
		System.out.println(c);
//		java.util.GregorianCalendar[time=1578917669529,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=22,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=13,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=9,HOUR_OF_DAY=21,MINUTE=14,SECOND=29,MILLISECOND=529,ZONE_OFFSET=32400000,DST_OFFSET=0]
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year); // 2020
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println(month); // 제로기반이라 + 1 해줘야 함
		
		int date = c.get(Calendar.DATE);
		System.out.println(date); // 13
		
		int amPm = c.get(Calendar.AM_PM);
		System.out.println(amPm); // 오전은 0, 오후는 1
		
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour); // 9
		
		hour = c.get(Calendar.HOUR_OF_DAY); // 24시 기준
		System.out.println(hour); // 21
		
		int min = c.get(Calendar.MINUTE);
		System.out.println(min); // 22
		
		int sec = c.get(Calendar.SECOND);
		System.out.println(sec); // 23
	}
	
	public void method3() {
//		GregorianCalender는 특정 날짜 값을 입력해서 객체 생성하는 기능 제공
//		2020.6.17
		int year = 2020;
		int month = 5; // 0인덱스 기반
		int date = 17;
		int hour = 22;
		int min = 0;
		int sec = 0;
		
		GregorianCalendar gc = new GregorianCalendar(year, month, date, hour, min, sec);
		long time = gc.getTimeInMillis();
		Date endDay = new Date(time);
		System.out.println(endDay);	// Wed Jun 17 00:00:00 KST 2020
		System.out.println(gc.get(Calendar.YEAR)); // 2020
		System.out.println(gc.get(Calendar.MONTH) + 1); // 6
		System.out.println(gc.get(Calendar.DATE)); // 17
		
//		2020-06-17 수요일 오후 22시 00 분 00초
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일 a HH시 mm분 ss초");
		String fmt = sdf.format(endDay);
//		sdf포맷을 endDay에 적용해서 fmt로 넘김
		System.out.println(fmt); // 2020-06-17 수요일 오후 22시 00분 00초
	} 
}

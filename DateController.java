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
//		getTime() �޼ҵ� 1970/1/1 0��0��0�� ���ķ� �帥 �ð��� ���� �� ��
		
		Date time = new Date(1578917288986L);
		System.out.println(time); // Mon Jan 13 21:08:08 KST 2020
		
		Date origin = new Date(0);
		System.out.println(origin); // Thu Jan 01 09:00:00 KST 1970
		
//		Date date = new Date(2020,1,13);
//		The constructor Date(int, int, int) is deprecated
//		deprecated�� ���� ����� ������� �𸣱� ������ ������� �ʴ� ���� ����
	}
	
	public void method2() {
//		Calendar c = new Calender();
//		�߻�Ŭ������ ��ü���� �ȵǱ� ������ getInstance()�޼ҵ� ����ؾ� �� 
		Calendar c = Calendar.getInstance();
		System.out.println(c);
//		java.util.GregorianCalendar[time=1578917669529,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=22,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2020,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=13,DAY_OF_YEAR=13,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=9,HOUR_OF_DAY=21,MINUTE=14,SECOND=29,MILLISECOND=529,ZONE_OFFSET=32400000,DST_OFFSET=0]
		
		int year = c.get(Calendar.YEAR);
		System.out.println(year); // 2020
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println(month); // ���α���̶� + 1 ����� ��
		
		int date = c.get(Calendar.DATE);
		System.out.println(date); // 13
		
		int amPm = c.get(Calendar.AM_PM);
		System.out.println(amPm); // ������ 0, ���Ĵ� 1
		
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour); // 9
		
		hour = c.get(Calendar.HOUR_OF_DAY); // 24�� ����
		System.out.println(hour); // 21
		
		int min = c.get(Calendar.MINUTE);
		System.out.println(min); // 22
		
		int sec = c.get(Calendar.SECOND);
		System.out.println(sec); // 23
	}
	
	public void method3() {
//		GregorianCalender�� Ư�� ��¥ ���� �Է��ؼ� ��ü �����ϴ� ��� ����
//		2020.6.17
		int year = 2020;
		int month = 5; // 0�ε��� ���
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
		
//		2020-06-17 ������ ���� 22�� 00 �� 00��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E���� a HH�� mm�� ss��");
		String fmt = sdf.format(endDay);
//		sdf������ endDay�� �����ؼ� fmt�� �ѱ�
		System.out.println(fmt); // 2020-06-17 ������ ���� 22�� 00�� 00��
	} 
}

package application;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class FormatDate {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Trazer a hora baseado no formato GMT
		
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Calendar cal = Calendar.getInstance();
		
		//Trazer data atual
		
		Date x1 = new Date();
		
		// Traz o Dia da semana, Dia do mes, e o Ano 
		DateFormat week = DateFormat.getDateInstance(DateFormat.FULL);
		
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(1000L * 60L * 60L * 5);
		
		Date y1 = sdf1.parse("29/04/2021");
		Date y2 = sdf2.parse("29/04/2021 20:11:40");
		
		String day3 = (weekDay(cal));
		
		//DateFormat day = DateFormat.getDateInstance(DateFormat.DAY_OF_WEEK_IN_MONTH_FIELD);
		//System.out.println(day);
		//System.out.println("XX: " + cal.get(Calendar.DAY_OF_WEEK));
		
		System.out.println();
		System.out.println("Day of the Week: " + day3);
		
		System.out.println();
		System.out.println("------------------------");
		System.out.println(y1);
		System.out.println(y2);
		
		System.out.println();
		System.out.println("X1: " + x1);
		System.out.println("X1: " + x1);
		
		System.out.println();
		System.out.println("X2: " + x2);
		System.out.println("X2: " + x2);
		
		System.out.println();
		System.out.println("X3: " + x3);
		System.out.println("X3: " + x3);
	
		System.out.println();
		System.out.println("Y1: " + y1);
		System.out.println("Y2: " + y2);
		
		System.out.println("------------------------");
		System.out.println(y1);
		System.out.println(y2);
		
		System.out.println();
		System.out.println("X1: " + sdf1.format(x1) + " " + day3);
		System.out.println("X1: " + sdf2.format(x1));
		
		System.out.println();
		System.out.println("X2: " + sdf1.format(x2));
		System.out.println("X2: " + sdf2.format(x2));
		
		System.out.println();
		System.out.println("X3: " + sdf1.format(x3));
		System.out.println("X3: " + sdf2.format(x3));
		
		System.out.println();
		System.out.println("Y1: " + sdf1.format(y1) + " " + week.format(y1));
		System.out.println("Y2: " + sdf2.format(y2));
		
		System.out.println();
		System.out.println("------------------------");
		System.out.println();
		System.out.println(y1 + " " + week.format(y1));
		System.out.println(y2);
		
		System.out.println();
		System.out.println("X1: " + sdf3.format(x1));
		System.out.println("X1: " + sdf3.format(x1));
		
		System.out.println();
		System.out.println("X2: " + sdf3.format(x2));
		System.out.println("X2: " + sdf3.format(x2));
		
		System.out.println();
		System.out.println("X3: " + sdf3.format(x3));
		System.out.println("X3: " + sdf3.format(x3));
		System.out.println("X3: " + sdf3.format(x3) + " " + week.format(x3));
		
		System.out.println();
		System.out.println("Y1: " + sdf3.format(y1));
		System.out.println("Y2: " + sdf3.format(y2));

	}

	public static String weekDay(Calendar cal) {
		return new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)];
	}
}

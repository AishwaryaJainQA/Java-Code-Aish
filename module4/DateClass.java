package module4;

import java.util.Date;

public class DateClass
{
	
	public static void main(String[]args)
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		
		String format1=d2.toString();
		String format2=format1.replace(":", " ");
		System.out.println(format2);
	}
}

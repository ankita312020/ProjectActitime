package Dummy;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class dummyExe {
	public static void main(String[] args) {
		System.out.println(new Timestamp(System.currentTimeMillis()));
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
		System.out.println(timeStamp);
	}
}

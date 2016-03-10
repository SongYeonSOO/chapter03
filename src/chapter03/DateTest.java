package chapter03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    @SuppressWarnings("deprecation")
	public static void main(String[] args)  {
        Date now = new Date();
        
        System.out.println( now);
        System.out.println( now.getYear()+1900);

         System.out.println( now.toString()  );
         System.out.println( now.toLocaleString()  );    // Deprecated !!
         
         
         SimpleDateFormat sdf =new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss"); // Use the format 'yyyy MM dd hh mm ss';
         System.out.println(sdf.format(now)); // print year
         
      }
}

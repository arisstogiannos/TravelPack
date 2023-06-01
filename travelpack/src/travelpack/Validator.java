package travelpack;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class Validator{
   public static boolean validateJavaDate(String strDate)
   {
	/* Check if date is 'null' */
	if (strDate.trim().equals(""))
	{
	    return true;
	}
	/* Date is not 'null' */
	else
	{
	    /*
	     * Set preferred date format,
	     * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
	    sdfrmt.setLenient(false);
	    /* Create Date object
	     * parse the string into date 
             */
	    try
	    {
	        Date javaDate = sdfrmt.parse(strDate); 
	        String s[]=strDate.split("/",3);
	        if(!s[2].trim().equals("2023"))
	        	return false;
	    }
	    /* Date format is invalid */
	    catch (ParseException e)
	    {
	        return false;
	    }
	    /* Return true if date format is valid */
	    return true;
	}
   }
  
}
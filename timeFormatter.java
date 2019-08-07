//Human readable duration format

import java.util.ArrayList; 
public class TimeFormatter {

    //return unit of time in singular or plural 
    public static String dateTime(int value, String str){
        
        if (value == 1){
            return value + " " + str + ", ";
        }
        else
        return value +  " " + str  + "s, "; 
    }

    public static String formatDuration(int seconds) {
	//string constants for units of time
        final String SECOND = "second";
        final String MINUTE = "minute";
        final String HOUR = "hour";
        final String DAY = "day";
        final String YEAR = "year";
      
      ArrayList<String> date = new ArrayList<String>(); 
      int second, minute, hour, day, year;
      String result = "";
      String lastElement = "";
      String previousElement = "";

      //calculating units of time and store it in ArrayList
      if(seconds > 0){
        
    	    year = seconds / (365 * 24 * 60 * 60);
    	    if(year > 0)
            date.add(dateTime(year,YEAR));
             day = (seconds / (24 * 60 * 60 )) % 365;
    	    if(day > 0)
            date.add(dateTime(day,DAY));
            hour = (seconds / (60 * 60)) % 24;
    	    if(hour > 0)
            date.add(dateTime(hour,HOUR));
             minute = (seconds / 60) % 60;
    	    if(minute > 0)
            date.add(dateTime(minute,MINUTE));
            second = seconds % 60;
            if(second > 0)
            date.add(dateTime(second,SECOND));
           
	   //if size of an ArrayList is 1, remove all whitespaces and last character of string (comma) 
           if(date.size() == 1){
                lastElement = date.get(date.size()-1).trim();
                lastElement = lastElement.substring(0,lastElement.length()-1);
                date.set(date.size()-1, lastElement);
            }

            //get two last elements of ArrayList, remove all whitespaces and commas and add word "and" between 
            else{
            lastElement = date.get(date.size()-1).trim();
            previousElement = date.get(date.size()-2).trim();
            previousElement = previousElement.substring(0,previousElement.length()-1);
            lastElement = lastElement.substring(0, lastElement.length()-1);
            
            date.set(date.size()-2,previousElement);
            date.set(date.size()-1, " and " + lastElement);
            }
            
            for(String element : date){
            result = result + element;
            }
            return result;
      }
      else
            return "now";

    }
}
package com.trsining.ap.main;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import  java.text.ParseException;
import com.trsining.ap.bean.Airline;
import javax.xml.crypto.Data;

public class AirlinMain {
	

	public static void main(String[] args) throws ParseException {
		
		List<Airline> airlines;		
		airlines = new ArrayList<Airline>();
		
		
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get("input.txt"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		for (int i = 0; i < lines.size(); i++) {
			
			airlines.add(new Airline());
	        String[] arrOfStr = lines.get(i).split(";");
	        airlines.get(i).setDestination(arrOfStr[0]);
	        airlines.get(i).setNumberFlight(arrOfStr[1]);
	       	airlines.get(i).setTypeAircraft(arrOfStr[2]);
	       	
	       	Time  time  = null;       	
	       	time  =  Time.valueOf(arrOfStr[3]); 
	       	airlines.get(i).setTimeDeparture(time);
	        
	       	List<String> week = new ArrayList<String>();
	       
				for (int j = 4; j < arrOfStr.length; j++) {
					week.add(arrOfStr[j]);	
				}
	       	airlines.get(i).setWeekDays(week);
	        }
	     
		
	    for (Airline ar : airlines)
	    {
	         System.out.println(ar.toString());
	            
	    }	

}
}

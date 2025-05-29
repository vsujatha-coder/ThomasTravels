package com;

import java.util.Arrays;

public class Travel {
	
	//Driver driver = new Driver();
	
	public Driver[] RetriveMaximumDistanceTravelledDriver (Driver[] driver) {
		double maxDistanceTravelled=0.0;
		Driver[] driverobj = new Driver[1];
		for(int i = 0;i<driver.length;i++) {
			if(maxDistanceTravelled<driver[i].getTotalDistance()) {
				maxDistanceTravelled=driver[i].getTotalDistance();
			}
		}
		for(int i = 0;i<driver.length;i++) {
			if(maxDistanceTravelled==driver[i].getTotalDistance()) {
				driverobj[0]=new Driver(driver[i].getCategory(),driver[i].getDriverId(),driver[i].getDriverName(),driver[i].getTotalDistance());
			}
		}
		return(driverobj);
		
	}
	
	public Driver[] retriveDriver (Driver[] driver,String category,int size) {
		Driver[] driverobj = new Driver[size];
		for(int i =0;i<driver.length;i++) {
			if(driver[i].getCategory().equals(category)) {
				driverobj[i]=new Driver(driver[i].getCategory(),driver[i].getDriverId(),driver[i].getDriverName(),driver[i].getTotalDistance());
			}
		}
		return (driverobj);
	}
	
	
	
	public int RetriveCountOfDriver (Driver[] driver,String category){
		int count=0;
		for(int i =0;i<driver.length;i++) {
			if(driver[i].getCategory().equals(category)) {
				count++;
			}
		}
		return count;
		
	}
	
	public String retriveByDriverId (Driver[] driver,int driverID) {
		String resultString=null;
		for(int i = 0;i<driver.length;i++) {
			if(driver[i].getDriverId()==driverID) {
				resultString="Driver name is "+ driver[i].getDriverName()+" belonging to the category "+driver[i].getCategory()+" traveled "+driver[i].getTotalDistance()+" KM so far."; 
			}
		}
		return resultString;
	}
	
	public boolean isCarDriver(Driver driver) {
		boolean result=false;
			if(driver.getCategory().equals("Car")) {
				result=true;
			}
			else {
				result=false;
			}
		
		
		return result;
	}
	
	

}

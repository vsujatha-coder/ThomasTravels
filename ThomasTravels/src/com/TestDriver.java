package com;

import java.util.Arrays;
import java.util.Scanner;

public class TestDriver {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of drivers of Thomas Travels : ");
		int sizeOfDriverArray = sc.nextInt();
		sc.nextLine();
		
		Driver[] driver = new Driver[sizeOfDriverArray];
		Travel travel = new Travel();
		
		for(int i= 0;i<sizeOfDriverArray;i++) {
			System.out.println("enter details for driver"+(i+1)+" :");
			System.out.println("------------------------------");
			System.out.println("Enter Category of driver"+(i+1)+ " :");
			String driverCategory = sc.nextLine();
			System.out.println("Enter ID of driver"+(i+1)+ " :");
			int driverID = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name of driver"+(i+1)+ " :");
			String driverName = sc.nextLine();
			
			System.out.println("Enter distanced travelled by driver"+(i+1)+ " :");
			double driverDistanceTravelled = sc.nextDouble();
			sc.nextLine();
			
			driver[i]=new Driver(driverCategory,driverID,driverName,driverDistanceTravelled);
		}
		
		
	  
		for(int i=0;i<sizeOfDriverArray;i++) {
			System.out.println(driver[i].getCategory());
			System.out.println("Driver"+driver[i].getDriverId() + " belongs to Car : " +travel.isCarDriver(driver[i]));
		}
		
		
		String resultStringByDriverId=travel.retriveByDriverId(driver,1);
		System.out.println(resultStringByDriverId);
		
		
		int CountOfDriver=travel.RetriveCountOfDriver (driver,"Car");
		System.out.println("Car drivers count is : "+CountOfDriver);
		
		
		Driver[] retriveDriver=travel.retriveDriver (driver,"Car",sizeOfDriverArray);
		System.out.println("Drivers details who drives cars : ");
		System.out.println(Arrays.toString(retriveDriver));
		
		Driver[] MaximumDistanceTravelledDriver=travel.RetriveMaximumDistanceTravelledDriver(driver);
		System.out.println("Driver details having maximum driving distance : \n"+Arrays.toString(MaximumDistanceTravelledDriver));
		
		
	}

	

}

package com.Telstra.pack2;

import com.Telstra.pack1.Car;

public class LongDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car(1116,"X7",60,"SUV",200);
		
		System.out.println(car.start());
		
		int speed =car.incSpeed(90);
		System.out.println(speed !=-1 ? "Speed is Increased, Enjoy!!, your speed is:" + speed : "Overspeeding, Can't Process");
         
		System.out.println(car.stop());
	}

}

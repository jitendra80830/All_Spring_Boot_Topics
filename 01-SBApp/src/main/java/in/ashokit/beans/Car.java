package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	private Engine eng;
	
	public Car() {
		System.out.println("Car .... Constructor executed");
	}
	public void right() {
		int start = eng.start();
		if(start>=1) {
			System.out.println("Car is starting.....");
		}
	}

}

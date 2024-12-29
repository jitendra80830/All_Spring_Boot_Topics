package in.ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	public Engine() {
		System.out.println("Engine - Constructor Executed");
	}
	public int start() {
		System.out.println("Engine started...");
		return 1;
	}

}

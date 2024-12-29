package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import in.ashokit.beans.Car;
import in.ashokit.beans.Engine;

@SpringBootApplication
//@ComponentScan(basePackages = {"in.ashokit","com.ashokit"})
public class Application {

	public static void main(String[] args) {
		
		System.out.println("Main Method is started ......");
		
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
//		Engine engine = ctx.getBean(Engine.class);
//		engine.start();
		
		Car car = ctx.getBean(Car.class);
		car.right();
		
		
		System.out.println("Main Method is Completed ......");
	}

}

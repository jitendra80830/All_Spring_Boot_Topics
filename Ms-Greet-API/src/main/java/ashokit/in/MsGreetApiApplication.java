package ashokit.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class MsGreetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsGreetApiApplication.class, args);
	}

}

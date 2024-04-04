package guru.sfg.brewery.eureka.msscbreweryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import reactor.core.publisher.Hooks;

@EnableEurekaServer
@SpringBootApplication
public class MsscBreweryEurekaApplication {

	public static void main(String[] args) {
		Hooks.enableAutomaticContextPropagation();
		SpringApplication.run(MsscBreweryEurekaApplication.class, args);
	}

}

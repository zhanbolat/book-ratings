package kz.iitu.jd3.bookratings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookRatingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookRatingsApplication.class, args);
	}

}

package co.com.aztask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:conexion_db.properties")
public class AzTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzTaskApplication.class, args);
	}

}

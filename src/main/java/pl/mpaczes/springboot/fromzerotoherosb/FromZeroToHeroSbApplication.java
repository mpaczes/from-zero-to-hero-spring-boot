package pl.mpaczes.springboot.fromzerotoherosb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableConfigurationProperties(GithubProperties.class)
@EnableCaching

@SpringBootApplication
public class FromZeroToHeroSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(FromZeroToHeroSbApplication.class, args);
	}
}

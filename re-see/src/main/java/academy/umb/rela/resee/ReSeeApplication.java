package academy.umb.rela.resee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ReSeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReSeeApplication.class, args);
    }

}

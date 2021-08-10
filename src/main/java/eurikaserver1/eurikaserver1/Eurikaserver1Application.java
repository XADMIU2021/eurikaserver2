package eurikaserver1.eurikaserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurikaserver1Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurikaserver1Application.class, args);
    }

}

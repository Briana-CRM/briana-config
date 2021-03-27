package by.ttre16.briana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BrianaConfig {
    public static void main(String[] args) {
        SpringApplication.run(BrianaConfig.class, args);
    }
}

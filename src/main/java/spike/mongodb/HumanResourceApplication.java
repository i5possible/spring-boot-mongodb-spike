package spike.mongodb;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class HumanResourceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HumanResourceApplication.class)
                .run(args);
    }
}
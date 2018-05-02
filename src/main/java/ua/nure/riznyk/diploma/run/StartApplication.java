package ua.nure.riznyk.diploma.run;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableJSONDoc
@RestController
public class StartApplication {

    @RequestMapping("/")
    List<ZonedDateTime> home() {
        return Arrays.asList(ZonedDateTime.now());
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}

package uk.co.poggs.example.demoapplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@SpringBootApplication
public class DemoApplication implements ApplicationListener<ContextRefreshedEvent> {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Logger logger = LoggerFactory.getLogger(DemoApplication.class);
        logger.info("DemoComponentApplication loaded");

        // In IntelliJ IDEA, this gets highlighted with 'component' in red
        uk.co.poggs.example.component.FirstDemoComponentA componentA = new uk.co.poggs.example.component.FirstDemoComponentA();

    }

}

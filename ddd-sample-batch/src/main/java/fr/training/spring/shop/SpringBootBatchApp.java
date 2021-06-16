package fr.training.spring.shop;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "fr.training.spring.shop" }, lazyInit = true)
@EntityScan(basePackages = { "fr.training.spring.shop.domain" })
public class SpringBootBatchApp implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(SpringBootBatchApp.class);

    /**
     * Entry point for spring-boot based app
     *
     * @param args
     *            - arguments
     */
    public static void main(final String[] args) {

        SpringApplication.run(SpringBootBatchApp.class, args);
    }

    @Override
    public void run(final ApplicationArguments args) throws Exception {
        logger.info("Application started with command-line arguments: {}", Arrays.toString(args.getSourceArgs()));
        logger.info("NonOptionArgs: {}", args.getNonOptionArgs());
        logger.info("OptionNames: {}", args.getOptionNames());

    }
}

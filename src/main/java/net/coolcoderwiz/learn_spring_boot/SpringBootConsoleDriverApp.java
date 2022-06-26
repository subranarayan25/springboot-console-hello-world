package net.coolcoderwiz.learn_spring_boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class SpringBootConsoleDriverApp implements CommandLineRunner {
	
	@Value("${helloWorld.message}")
	private String message;
	
	private static Logger log = LoggerFactory.getLogger(SpringBootConsoleDriverApp.class);
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringBootConsoleDriverApp.class)
				.web(WebApplicationType.NONE)
				.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(this.message);
	}
}

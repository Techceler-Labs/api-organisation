package com.techceler.api.organisation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Starter class for Organisation API
 * @author hamakhaa
 */
@SpringBootApplication
public class OrganisationApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(OrganisationApiApplication.class, args);
	}

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(OrganisationApiApplication.class);
    }

}

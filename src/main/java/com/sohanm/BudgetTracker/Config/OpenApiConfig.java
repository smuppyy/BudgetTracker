package com.sohanm.BudgetTracker.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

/*
 * Configures the OpenAPI (formerly Swagger) documentation for a Spring Boot application, 
 */
@Configuration
public class OpenApiConfig {
  @Bean
    public OpenAPI usersMicroserviceOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Budget Tracker API`")
                                 .description("Budget Tracker API")
                                 .version("1.0"));
    }
}

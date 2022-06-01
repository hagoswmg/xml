package com.hagos.xml.configs;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI wmgnrapiOpenApi() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("WMG New Release API")
                                .description("WMG New Release API Documentations")
                                .version("1.0.0")
                                .license(new License()
                                        .name("WMG License")
                                        .url("https://www.wmg.com")))
                .externalDocs(
                        new ExternalDocumentation()
                                .description("New Release Schedule Documentation")
                                .url("https://confluence.wmg.com/display/DMD/New+Release+Schedule+Documentation")
                );
    }
}

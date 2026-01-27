package com.example.Book_My_Show;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "BookMyShow API",
                description = "Movie Booking Backend API",
                version = "1.0.0",
                contact = @Contact(
                        name = "Dhrax",
                        email = "dhrax21bc@gmail.com",
                        url = "https://github.com/dhrax21"
                )
        )
)
public class OpenApiConfig {
}

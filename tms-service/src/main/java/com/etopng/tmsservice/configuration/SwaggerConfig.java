package com.etopng.tmsservice.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "ETOP",
                        email = "admin@etop.com",
                        url = "https://etop.com"
                ),
                description = "OpenApi documentation for ETOP TMS Application",
                title= "OpenApi spec",
                version = "1.0",
                license = @License(
                        name = "Swagger OpenApi",
                        url = "https://etop.com"
                ),
                termsOfService = "Terms"
        ),
        servers = {
                @Server(
                        description = "Local Env",
                        url="http://localhost:9081"
                ),
                @Server(
                        description = "Prod Env",
                        url="https://etop.com"
                )
        }
        ,
        security = {
                @SecurityRequirement(name = "bearerAuth")
        }
)

@SecurityScheme(
        name = "bearerAuth",
        description = "JWT auth description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class SwaggerConfig {
}

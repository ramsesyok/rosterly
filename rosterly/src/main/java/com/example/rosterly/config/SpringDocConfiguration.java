package com.example.rosterly.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.example.rosterly.config.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Rosterly Member API")
                                .description("B社が提供する「作業者リスト（Member）」操作用 WebAPI。 - JSONフィールド名：キャメルケース   - URLエンドポイント：ケバブケース ")
                                .version("1.0.0")
                )
        ;
    }
}
package com.mshis.medicalSystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * description: Swagger2Config
 * author: 沫凌
 * create: 2019-07-15 18:57
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.mshis.medicalSystem.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
<<<<<<< HEAD
                .title("医院HIS系统api文档")
                .description("本后端采用Spring Boot敏捷开发，提供简单优雅的restfun风格的API接口")
               // .termsOfServiceUrl("http://blog.csdn.net/saytime")
                .version("1.0.0")
=======
                .title("springboot利用swagger构建api文档")
                .description("简单优雅的restfun风格")
               // .termsOfServiceUrl("http://blog.csdn.net/saytime")
                .version("1.0")
>>>>>>> 5dc050056d62c08b3ce0a94bf0f1317628298a7d
                .build();
    }
}

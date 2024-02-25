package com.example.todos.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
  
  @Value("${ALLOWED_ORIGINS}")
  private String allowedOrigins;

  @Override
  public void addCorsMappings(CorsRegistry registry) {

    registry.addMapping("/api/**")
      .allowedOrigins(allowedOrigins.split(","))
      .allowedMethods("GET", "POST", "PUT","DELETE","PATCH")
      .allowedHeaders("*")
      .allowCredentials(true);

  }
}
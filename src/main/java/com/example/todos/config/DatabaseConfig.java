package com.example.todos.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {
  
  @Value("${DATABASE_URL}")
  private String databaseUrl;

  public String getDatabaseUrl() {
      return databaseUrl;
  }
}

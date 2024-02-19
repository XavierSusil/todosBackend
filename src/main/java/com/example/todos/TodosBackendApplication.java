package com.example.todos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.todos.service.JwtService;

@SpringBootApplication
public class TodosBackendApplication {

  public static void main(String[] args) {
    SpringApplication.run(TodosBackendApplication.class, args);
    
  }
  
}

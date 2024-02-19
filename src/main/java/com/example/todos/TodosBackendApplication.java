package com.example.todos;

import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosBackendApplication {

  public static void main(String[] args) {
    SpringApplication.run(TodosBackendApplication.class, args);
    printEnvironmentVariables();
  }
  
  public static void printEnvironmentVariables() {
    Map<String,String> env = System.getenv();
    
    for (String key : env.keySet()) {
      String value = env.get(key);
      System.out.println(key + " = " + value);
    }
  }
}

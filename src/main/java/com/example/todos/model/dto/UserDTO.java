package com.example.todos.model.dto;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
  
  private Integer id;
  
  private String username;
  
  private String email;
  
  private String firstName;
  
  private String lastName;
  
  private Set<TodoResponse> todos;
}

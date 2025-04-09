package com.cafu.blog.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserDTO {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email is invalid")
    private String email;

    @NotBlank(message = "Password is required")
    private String password;

    public record loginDTO(String email, String password){}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email=email;}

    public String getPassword(){return password;}
    public void setPassword(String password){this.password=password;}
}

package com.Zakaria.auberge.Entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "utilisateurs")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long ID;
    @NotNull
    @Size(min=2,message = "Username trop court")
    @NotEmpty(message = "Username cannot be empty")
    private String username;
    @NotNull
    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Email invalide", regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
    private String email;
    @NotNull
    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Email invalide", regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
    private String confirmEmail;
    @NotNull
    @NotEmpty(message = "Phone number cannot be empty")
    @Size(min = 10,message = "Numero de téléphone invalide")
    @Pattern(regexp = "^\\s?((\\+[1-9]{1,4}[ \\-]*)|(\\([0-9]{2,3}\\)[ \\-]*)|([0-9]{2,4})[ \\-]*)*?[0-9]{3,4}?[ \\-]*[0-9]{3,4}?\\s?",message = "Invalid phone number")
    private String phone;

    public String getConfirmEmail() {
        return confirmEmail;
    }

    @NotEmpty(message = "Password cannot be empty")
    @NotNull
    @Size(min=5,message = "Password trop court")
    private String password;
    @NotEmpty(message = "Password confirmation cannot be empty")
    @NotNull
    @Size(min=5,message = "Password trop court")
    private String confirmation;
    @NotEmpty(message = "Roles cannot be empty")
    @NotNull
    private String roles;
    @NotEmpty(message = "Image cannot be empty")
    @NotNull
    private String img;

    public String getImg() {
        return img;
    }

    public String getUsername() {
        return username;
    }

    public String getPhone() {
        return phone;
    }

    public String getConfirmation() {
        return confirmation;
    }

    public Long getID() {
        return ID;
    }

    public String getRoles() {
        return roles;
    }

    @Override
    public String toString() {
        return "Users [ID=" + ID + ", confirmation=" + confirmation + ", email=" + email + ", phone=" + phone
                + ", roles=" + roles + ", username=" + username + "]";
    }

    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }

}

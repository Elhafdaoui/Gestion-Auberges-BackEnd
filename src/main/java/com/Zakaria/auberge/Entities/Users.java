package com.Zakaria.auberge.Entities;

import lombok.*;

import javax.persistence.*;

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
    private String username;
    private String email;
    private String phone;
    private String password;
    private String confirmation;
    private String roles;
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

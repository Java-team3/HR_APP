package by.team34.dto;

import by.team34.entity.Role;

import java.util.Set;

public class UserDto {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private Set<RoleDto> role;

    public UserDto(Long id, String name, String surname,
                   String email, String password, Set<RoleDto> role) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<RoleDto> getRole() {
        return role;
    }

    public void setRole(Set<RoleDto> role) {
        this.role = role;
    }

}

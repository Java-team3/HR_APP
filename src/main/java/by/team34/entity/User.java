package by.team34.entity;


import by.team34.entity.validation.Email;
import by.team34.entity.validation.Password;

import javax.persistence.Enumerated;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;


import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Email
    @Column(name = "EMAIL")
    private String email;

    @Password
    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "USER_STATE")
    @Enumerated(EnumType.STRING)
    private UserState userState;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<CandidateFeedback> candidateFeedbacks;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Vacancy> vacancies;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
    private Set<Role> roles;


    public final int getId() {
        return id;
    }

    public final void setId(final int id) {
        this.id = id;
    }

    public final String getEmail() {
        return email;
    }

    public final void setEmail(final String email) {
        this.email = email;
    }

    public final String getPassword() {
        return password;
    }

    public final void setPassword(final String password) {
        this.password = password;
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final String getSurname() {
        return surname;
    }

    public final void setSurname(final String surname) {
        this.surname = surname;
    }

    public final UserState getUserState() {
        return userState;
    }

    public final void setUserState(final UserState userState) {
        this.userState = userState;
    }

    public final Set<CandidateFeedback> getCandidateFeedbacks() {
        if (this.candidateFeedbacks == null) {
            this.candidateFeedbacks = new HashSet<CandidateFeedback>();
        }
        return candidateFeedbacks;
    }

    public final void setCandidateFeedbacks(final Set<CandidateFeedback> candidateFeedbacks) {
        this.candidateFeedbacks = candidateFeedbacks;
    }

    public final Set<Vacancy> getVacancies() {
        if (this.vacancies == null) {
            this.vacancies = new HashSet<Vacancy>();
        }
        return vacancies;
    }

    public final void setVacancies(final Set<Vacancy> vacancies) {
        this.vacancies = vacancies;
    }

    public final Set<Role> getRoles() {
        if (this.roles == null) {
            this.roles = new HashSet<Role>();
        }
        return roles;
    }

    public final void setRoles(final Set<Role> roles) {
        this.roles = roles;
    }
}

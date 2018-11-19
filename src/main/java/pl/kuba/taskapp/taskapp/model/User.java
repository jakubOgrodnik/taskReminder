package pl.kuba.taskapp.taskapp.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;


@Entity
@Table(name="users", schema = "public")
@Data
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(name = "user_name")
    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String passwordConfirm;
    @NotNull
    private String email;
    @ManyToMany
    @JoinColumn(name = "user_id")
    private Set<Role> roles;
}

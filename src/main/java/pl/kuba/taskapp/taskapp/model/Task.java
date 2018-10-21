package pl.kuba.taskapp.taskapp.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
public class Task {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @NotNull
    private String title;
    @NotNull
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private boolean isDone;

    private Date dateOfCompletion;
}

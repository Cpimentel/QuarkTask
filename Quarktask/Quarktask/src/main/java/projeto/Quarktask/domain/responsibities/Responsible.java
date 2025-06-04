package projeto.Quarktask.domain.responsibities;

import jakarta.persistence.*;
import projeto.Quarktask.domain.task.Task;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "responsible")
public class Responsible {
    public Responsible(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @OneToMany(mappedBy = "responsible")
    private List<Task> tasks = new ArrayList<>();

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

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {

        this.tasks=tasks;

    }
}

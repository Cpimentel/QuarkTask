package projeto.Quarktask.domain.task;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import projeto.Quarktask.DTO.TaskRequestDTO;
import projeto.Quarktask.domain.responsibities.Responsible;
import java.time.LocalDate;

@Entity
@Table(name = "task")
@AllArgsConstructor
public class Task {

    public Task() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    @ManyToOne
    @JoinColumn(name = "responsible_id")
    private Responsible responsible;

    private String priority;
    private LocalDate deadline;
    private boolean concluded = false;

    public Task(TaskRequestDTO data, Responsible responsible) {
        this.title = data.title();
        this.description = data.description();
        this.responsible = responsible;
        this.priority = data.priority();
        this.deadline = data.deadline();
        this.concluded = data.concluded();
    }

    public Task(Task getTask) {
        this.title = getTask.getTitle();
        this.description = getTask.getDescription();
        this.responsible = responsible;
        this.priority = getTask.getPriority();
        this.deadline = getTask.getDeadline();
        this.concluded = getTask.getConcluded();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Responsible getResponsible() {
        return responsible;
    }

    public void setResponsible(Responsible responsible) {
        this.responsible = responsible;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public void setConcluded(boolean concluded) {this.concluded = concluded;}

    public Boolean getConcluded() {return concluded;    }
}

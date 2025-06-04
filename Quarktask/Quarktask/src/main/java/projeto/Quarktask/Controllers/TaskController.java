package projeto.Quarktask.Controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import projeto.Quarktask.DTO.TaskRequestDTO;
import projeto.Quarktask.DTO.TaskResponseDTO;
import projeto.Quarktask.domain.responsibities.Responsible;
import projeto.Quarktask.domain.task.Task;
import projeto.Quarktask.repositories.ResponsibleRepository;
import projeto.Quarktask.services.TaskService;

import java.util.List;

@RestController
@RequestMapping("/api/v2/task")
@RequiredArgsConstructor
public class TaskController {
    @Autowired
    TaskService taskService;

    @Autowired
    ResponsibleRepository responsibleRepository;

    @GetMapping
    public List<TaskResponseDTO> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody @Valid TaskRequestDTO data) {
        Task createdTask = taskService.createTask(data);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTask);
    }
    @GetMapping("/{id}")
    public ResponseEntity<TaskResponseDTO> findById(@PathVariable Long id) {
        TaskResponseDTO task = taskService.findById(id);
        return ResponseEntity.ok(task);
    }
    @PutMapping("/{id}")
    public ResponseEntity<TaskResponseDTO> update(@PathVariable Long id, @RequestBody TaskRequestDTO data) {
        TaskResponseDTO updated = taskService.updateTask(id, data);
        return ResponseEntity.ok(updated);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        taskService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}/concluir")
    public ResponseEntity<TaskResponseDTO> concludeTask(@PathVariable Long id) {
        TaskResponseDTO concluded = taskService.concludedTask(id);
        return ResponseEntity.ok(concluded);
    }




}

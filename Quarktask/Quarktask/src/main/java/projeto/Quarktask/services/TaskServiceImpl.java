// Implementação
package projeto.Quarktask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import projeto.Quarktask.DTO.TaskRequestDTO;
import projeto.Quarktask.DTO.TaskResponseDTO;
import projeto.Quarktask.domain.responsibities.Responsible;
import projeto.Quarktask.domain.task.Task;
import projeto.Quarktask.repositories.ResponsibleRepository;
import projeto.Quarktask.repositories.TaskRepository;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private ResponsibleRepository responsibleRepository;

    @Override
    public List<TaskResponseDTO> getAllTasks() {
        return taskRepository.findAll()
                .stream()
                .map(task -> new TaskResponseDTO(
                        task.getId(),
                        task.getTitle(),
                        task.getDescription(),
                        task.getResponsible().getName(), // ou outro campo
                        task.getPriority(),
                        task.getDeadline(),
                        task.getConcluded()
                ))
                .toList();
    }

    public Task createTask(TaskRequestDTO data) {
        Responsible responsible = responsibleRepository.findById(data.responsibleId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Responsável não encontrado"));

        Task task = new Task(data, responsible);
        return taskRepository.save(task);
    }

    @Override
    public TaskResponseDTO findById(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Tarefa não encontrada"));

        return new TaskResponseDTO(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getResponsible().getName(),
                task.getPriority(),
                task.getDeadline(),
                task.getConcluded()
        );
    }

    @Override
    public TaskResponseDTO updateTask(Long id, TaskRequestDTO data) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Tarefa não encontrada"));

        Responsible responsible = responsibleRepository.findById(data.responsibleId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Responsável não encontrado"));

        task.setTitle(data.title());
        task.setDescription(data.description());
        task.setResponsible(responsible);
        task.setPriority(data.priority());
        task.setDeadline(data.deadline());
        task.setConcluded(data.concluded());

        taskRepository.save(task);

        return new TaskResponseDTO(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getResponsible().getName(),
                task.getPriority(),
                task.getDeadline(),
                task.getConcluded()
        );
    }

    @Override
    public void deleteById(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Tarefa não encontrada"));

        taskRepository.delete(task);
    }

    @Override
    public TaskResponseDTO concludedTask(Long id) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Tarefa não encontrada"));

        task.setConcluded(true);
        taskRepository.save(task);

        return new TaskResponseDTO(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getResponsible().getName(),
                task.getPriority(),
                task.getDeadline(),
                task.getConcluded()
        );
    }




}

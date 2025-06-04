package projeto.Quarktask.services;

import projeto.Quarktask.DTO.TaskRequestDTO;
import projeto.Quarktask.DTO.TaskResponseDTO;
import projeto.Quarktask.domain.task.Task;

import java.util.List;

public interface TaskService {
    List<TaskResponseDTO> getAllTasks();
    Task createTask(TaskRequestDTO data);
    TaskResponseDTO findById(Long id);
    TaskResponseDTO updateTask(Long id, TaskRequestDTO data);
    void deleteById(Long id);
    TaskResponseDTO concludedTask(Long id);

}

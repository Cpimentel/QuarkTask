package projeto.Quarktask.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projeto.Quarktask.DTO.ResponsibleRequestDTO;
import projeto.Quarktask.DTO.ResponsibleResponseDTO;
import projeto.Quarktask.DTO.TaskResponseDTO;
import projeto.Quarktask.services.ResponsibleService;
import projeto.Quarktask.services.TaskService;

import java.util.List;

@RestController
@RequestMapping("/responsible")
public class ResponsibleController {

    @Autowired
    ResponsibleService responsibleService;

    @GetMapping
    public List<ResponsibleResponseDTO> getAllResponsible() {
        return responsibleService.getAllResponsible();
    }

    @PostMapping
    public ResponsibleResponseDTO create(@RequestBody ResponsibleRequestDTO data) {
        return responsibleService.createResponsible(data);
    }
}

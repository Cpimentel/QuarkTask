package projeto.Quarktask.services;

import projeto.Quarktask.DTO.ResponsibleRequestDTO;
import projeto.Quarktask.DTO.ResponsibleResponseDTO;

import java.util.List;

public interface ResponsibleService {


    List<ResponsibleResponseDTO> getAllResponsible();
    ResponsibleResponseDTO createResponsible(ResponsibleRequestDTO data);
}

package projeto.Quarktask.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto.Quarktask.DTO.ResponsibleRequestDTO;
import projeto.Quarktask.DTO.ResponsibleResponseDTO;
import projeto.Quarktask.domain.responsibities.Responsible;
import projeto.Quarktask.repositories.ResponsibleRepository;

import java.util.List;

@Service
public class ResponsibleServiceImpl implements ResponsibleService {
    @Autowired
    ResponsibleRepository responsibleRepository;

    @Override
    public List<ResponsibleResponseDTO> getAllResponsible() {
        return responsibleRepository.findAll()
                .stream()
                .map(responsible -> new ResponsibleResponseDTO(
                        responsible.getId(),
                        responsible.getName()
                ))
                .toList();
    }

    @Override
    public ResponsibleResponseDTO createResponsible(ResponsibleRequestDTO data) {
        Responsible responsible = new Responsible();
        responsible.setName(data.name());

        responsible = responsibleRepository.save(responsible);

        return new ResponsibleResponseDTO(responsible.getId(), responsible.getName());
    }
}

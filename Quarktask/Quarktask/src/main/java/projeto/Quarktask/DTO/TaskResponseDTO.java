package projeto.Quarktask.DTO;
import java.time.LocalDate;

public record TaskResponseDTO(
        Long id,
        String title,
        String description,
        String responsibleName,
        String priority,
        LocalDate deadline,
        Boolean concluded
){}

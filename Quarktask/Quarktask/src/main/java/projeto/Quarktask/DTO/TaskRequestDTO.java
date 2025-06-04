package projeto.Quarktask.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public record TaskRequestDTO (String id,                    // Pode ser null na criação
                              String title,
                              String description,
                              @JsonProperty("responsible_id") Long responsibleId,// Passa apenas o ID do responsável
                              String priority,
                              LocalDate deadline,
                              Boolean concluded){

}

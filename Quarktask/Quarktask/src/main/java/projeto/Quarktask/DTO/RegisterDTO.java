package projeto.Quarktask.DTO;

import projeto.Quarktask.domain.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}


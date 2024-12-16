package br.com.jj.nervosia.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUser(
        @NotBlank
        String username,
        @NotBlank
        String password
) {
}

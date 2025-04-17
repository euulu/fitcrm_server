package org.eulu.fit_crm.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record TrainerDto(
        @NotNull
        @Positive
        Long id,
        @NotBlank
        String name,
        String biography,
        byte[] picture
) {
}

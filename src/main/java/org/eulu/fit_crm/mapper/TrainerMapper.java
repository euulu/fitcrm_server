package org.eulu.fit_crm.mapper;

import org.eulu.fit_crm.dto.TrainerDto;
import org.eulu.fit_crm.model.Trainer;
import org.springframework.stereotype.Component;

@Component
public class TrainerMapper {
    public TrainerDto toDto(Trainer trainer) {
        if (trainer == null) {
            return null;
        }
        return new TrainerDto(
                trainer.getId(),
                trainer.getName(),
                trainer.getBiography(),
                trainer.getPicture()
        );
    }
}

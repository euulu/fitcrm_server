package org.eulu.fit_crm.mapper;

import org.eulu.fit_crm.dto.TrainerDto;
import org.eulu.fit_crm.model.TrainerEntity;
import org.springframework.stereotype.Component;

@Component
public class TrainerMapper {
    public TrainerDto toDto(TrainerEntity trainerEntity) {
        if (trainerEntity == null) {
            return null;
        }
        return new TrainerDto(
                trainerEntity.getId(),
                trainerEntity.getName(),
                trainerEntity.getBiography(),
                trainerEntity.getPicture()
        );
    }
}

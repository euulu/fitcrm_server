package org.eulu.fit_crm.service.impl;

import lombok.RequiredArgsConstructor;
import org.eulu.fit_crm.dto.TrainerDto;
import org.eulu.fit_crm.mapper.TrainerMapper;
import org.eulu.fit_crm.repository.TrainerRepository;
import org.eulu.fit_crm.service.TrainerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TrainerServiceImpl implements TrainerService {
    private final TrainerRepository trainerRepository;
    private final TrainerMapper trainerMapper;

    @Override
    public Page<TrainerDto> findAll(Pageable pageable) {
        return trainerRepository.findAll(pageable)
                .map(trainerMapper::toDto);
    }
}

package org.eulu.fit_crm.service.impl;

import lombok.RequiredArgsConstructor;
import org.eulu.fit_crm.dto.TrainerDto;
import org.eulu.fit_crm.mapper.TrainerMapper;
import org.eulu.fit_crm.repository.TrainerRepository;
import org.eulu.fit_crm.service.TrainerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrainerServiceImpl implements TrainerService {
    private final TrainerRepository trainerRepository;
    private final TrainerMapper trainerMapper;

    @Override
    public List<TrainerDto> findAll() {
        return trainerRepository.findAll().stream()
                .map(trainerMapper::toDto)
                .toList();
    }
}

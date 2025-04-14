package org.eulu.fit_crm.service;

import org.eulu.fit_crm.dto.TrainerDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TrainerService {
    Page<TrainerDto> findAll(Pageable pageable);
}

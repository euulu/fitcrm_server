package org.eulu.fit_crm.service;

import org.eulu.fit_crm.dto.TrainerDto;

import java.util.List;

public interface TrainerService {
    List<TrainerDto> findAll();
}

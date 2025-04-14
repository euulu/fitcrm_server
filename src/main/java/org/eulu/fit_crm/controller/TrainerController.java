package org.eulu.fit_crm.controller;

import lombok.RequiredArgsConstructor;
import org.eulu.fit_crm.dto.TrainerDto;
import org.eulu.fit_crm.service.TrainerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trainers")
@RequiredArgsConstructor
public class TrainerController {
    private final TrainerService trainerService;

    @GetMapping
    public ResponseEntity<Page<TrainerDto>> getAllTrainers(Pageable pageable) {
        Page<TrainerDto> trainers = trainerService.findAll(pageable);
        return ResponseEntity.ok(trainers);
    }
}

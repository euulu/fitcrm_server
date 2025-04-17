package org.eulu.fit_crm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "trainers")
public class TrainerEntity {
    @Id
    private Long id;
    @Column(nullable = false)
    private String name;
    private String biography;
    @Lob
    private byte[] picture;
}

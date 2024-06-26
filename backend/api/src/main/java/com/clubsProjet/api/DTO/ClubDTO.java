package com.clubsProjet.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClubDTO {
    private int id;

    private String nom;
    private String description;
    private String image;
}

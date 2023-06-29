package com.example.spring.boot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CarResponseDTO {
    private Long id;
    private String brand;
    private String model;
    private String vin;
    private String registrationNumber;
}

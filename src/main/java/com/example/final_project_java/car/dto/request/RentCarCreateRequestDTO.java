package com.example.final_project_java.car.dto.request;

import com.example.final_project_java.car.entity.RentCar;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.sql.Time;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class RentCarCreateRequestDTO {

    @NotBlank
    private int reservationNo;

    @NotBlank
    private String userId;

    private String userName;

//    @NotBlank
    private int carNo;

    private String carName;

    private LocalDateTime rentDate;

    private Time rentTime;

    private LocalDateTime turninDate;

    private Time turninTime;

    private int rentCarPrice;

    private String phoneNumber;

    private String extra;

    // DTO -> Entity
    public RentCar toEntity() {
        return RentCar.builder()
                .reservationNo(reservationNo)
                .userName(userName)
                .userId(userId)
                .carName(carName)
                .carNo(carNo)
                .rentDate(rentDate)
                .rentTime(rentTime)
                .turninDate(turninDate)
                .turninTime(turninTime)
                .rentCarPrice(rentCarPrice)
                .phoneNumber(phoneNumber)
                .extra(extra)
                .build();
    }

}

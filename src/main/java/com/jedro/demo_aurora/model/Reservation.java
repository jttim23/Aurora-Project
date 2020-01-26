package com.jedro.demo_aurora.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String checkIn;
    @NonNull
    private String checkOut;
    @NonNull
    @Min(1)
    private int adults;
    @NonNull
    @Min(0)
    private int children;
    @NonNull
    private String email;
    @NonNull
   @Size(max = 9, min = 9)
    private String phoneNr;
}

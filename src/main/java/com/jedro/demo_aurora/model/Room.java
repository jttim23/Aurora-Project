package com.jedro.demo_aurora.model;

import lombok.Data;

@Data
public class Room {
    private int roomNumber;
    private int bedQuantity;
    private boolean available;

}

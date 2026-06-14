package com.suvam.mobilestore.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {

    int id;
    String brand;
    String name;
    int price;
}

package com.example.exercises.testsForMockito;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private NdsResolver ndsResolver;

    public double withNds(double price) {
        return ndsResolver.getNds() * price + price;
    }
}

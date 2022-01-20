package com.example.exercises.executionQueue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonTO {
    private String name;
    private int age;
    private int sizeOfGroup;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonTO personTO = (PersonTO) o;
        return age == personTO.age && sizeOfGroup == personTO.sizeOfGroup && Objects.equals(name, personTO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sizeOfGroup);
    }
}

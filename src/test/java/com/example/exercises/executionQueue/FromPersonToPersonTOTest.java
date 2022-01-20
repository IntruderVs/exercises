package com.example.exercises.executionQueue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest
class FromPersonToPersonTOTest {

    @Autowired
    FromPersonToPersonTO fromPersonToPersonTO;

    @Test
    void getPersonTo() {
        Person person = new Person("Nick", 2, "Kindergarten");

        PersonTO personTO = new PersonTO("Nick", 2, 1);
        List<PersonTO> expected = Collections.singletonList(personTO);

        assertThat(expected, is(fromPersonToPersonTO.getPersonTo(Collections.singletonList(person))));
    }
}
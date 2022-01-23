package com.example.exercises.testsForMockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResultTest {

    private NdsResolver mock;

    @BeforeEach
    void beforeAll() {
        mock = Mockito.mock(NdsResolver.class);
        Mockito
                .when(mock.getNds())
                .thenReturn(0.18);
    }

    @Test
    void withNds() {
        Result result = new Result();

        try {
            Field ndsResolver = result.getClass().getDeclaredField("ndsResolver");
            ndsResolver.setAccessible(true);
            ndsResolver.set(result, mock);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        assertEquals(118, result.withNds(100));
    }

    @Test
    void withNdsWithAllConstructor() {
        Result result = new Result(mock);
        assertEquals(118, result.withNds(100));
    }
}
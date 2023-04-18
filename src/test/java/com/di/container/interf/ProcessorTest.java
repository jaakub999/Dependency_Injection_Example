package com.di.container.interf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ProcessorTest {

    @Mock
    private Processor service;

    @InjectMocks
    private Computer computer;

    @Test
    public void calculateTest() {
        when(service.calculate(5, 3)).thenReturn(8);
        int result = service.calculate(5, 3);
        assertEquals(result, 8);
        verify(service).calculate(5, 3);
    }
}
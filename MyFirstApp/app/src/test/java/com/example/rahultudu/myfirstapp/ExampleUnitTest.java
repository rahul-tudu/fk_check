package com.example.rahultudu.myfirstapp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void test1() throws Exception  {
        //  create mock
        MyActivity test;
        test = mock(MyActivity.class);

        // define return value for method check
        when(test.check()).thenReturn(10);

        // use mock in test....
        assertEquals(test.check(), 10);
    }

}
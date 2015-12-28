package com.mockito.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.verify;

/**
 * Created by vgandsa on 12/21/15.
 * First test
 */
@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {
    @Mock
    List<String> mockedList;
    @Test
   public void firstTest(){

        //using mock object
        mockedList.add("oone");
        mockedList.clear();
        verify(mockedList).add("oone");
        verify(mockedList).clear();



        //verification

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asimakis
 */
public class ListOperationsTest {

    private ListOperations listOperations;
    
    public ListOperationsTest() {
    }

    @Before
    public void setUp() {
        listOperations = new ListOperations();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAddNameToList() {
        boolean changed = listOperations.addNameToList("Andy");
        assertTrue(changed);
    }
    
    @Test
    public void testAddNameToListCheckSize() {
        listOperations.addNameToList("Andy");
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(2, sizeOfList);
    }
    
    @Test
    public void testAddNameToListCheckName() {
        String name = "Andy";
        listOperations.addNameToList(name);
        int sizeOfList = listOperations.getSizeOfList();
        String actualName = listOperations.getNames().get(sizeOfList-1);
        assertEquals("Andy", actualName);
       
    }

    @Test
    public void testRemoveNameFromList() {
        String name = "Andy";
        listOperations.addNameToList(name);
        listOperations.removeNameFromList(name);
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(0, sizeOfList);
    }

    @Test
    public void testGetSizeOfList() {
        listOperations.addNameToList("Andy");
        int sizeOfList = listOperations.getSizeOfList();
        assertEquals(1, sizeOfList);
    }

}

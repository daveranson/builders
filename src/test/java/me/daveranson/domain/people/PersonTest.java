/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.daveranson.domain.people;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author daver
 */
public class PersonTest {
    
    @Test
    public void testPersonBuilder() {
        Person person = new Person.Builder().firstname("Dave").surname("Ranson").build();
        assertNotNull (person);
    }
    
}

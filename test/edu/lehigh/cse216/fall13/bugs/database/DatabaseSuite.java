/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lehigh.cse216.fall13.bugs.database;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author hansen
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({})
public class DatabaseSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void searchTest() {
        fail("search is not implemented");
    }
}

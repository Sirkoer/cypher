/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vigenere_cipher;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arek
 */
public class CypherClassTest {
    
    public CypherClassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setMessageEncode method, of class CypherClass.
     */
    @Test
    public void testSetMessageEncode() {
        System.out.println("setMessageEncode");
        String message = "";
        CypherClass instance = new CypherClass();
        instance.setMessageEncode(message);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getMessageEncode method, of class CypherClass.
     */
    @Test
    public void testGetMessageEncode() {
        System.out.println("getMessageEncode");
        CypherClass instance = new CypherClass();
        String expResult = "fgdfdafdgd";
        instance.setMessageEncode(expResult);
        String result = instance.getMessageEncode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }//

    /**
     * Test of setMessageDecode method, of class CypherClass.
     */
    @Test
    public void testSetMessageDecode() {
        System.out.println("setMessageDecode");
        String message = "";
        CypherClass instance = new CypherClass();
        instance.setMessageDecode(message);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getMessageDecode method, of class CypherClass.
     */
    @Test
    public void testGetMessageDecode() {
        System.out.println("getMessageDecode");
        CypherClass instance = new CypherClass();
        String expResult = "ssds";
        instance.setMessageDecode(expResult);
        String result = instance.getMessageDecode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setKeyword method, of class CypherClass.
     */
    @Test
    public void testSetKeyword() {
        System.out.println("setKeyword");
        String keyword = "";
        CypherClass instance = new CypherClass();
        instance.setKeyword(keyword);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getKeyword method, of class CypherClass.
     */
    @Test
    public void testGetKeyword() {
        System.out.println("getKeyword");
        CypherClass instance = new CypherClass();
        String expResult = "keyowrd";
        instance.setKeyword(expResult);
        String result = instance.getKeyword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEncoded method, of class CypherClass.
     */
    @Test
    public void testGetEncoded() {
        System.out.println("getEncoded");
        CypherClass instance = new CypherClass();
        String expResult = "diqdqccwyqi";
        String message = "testmessage";
        String testkey = "key";
        instance.setMessageEncode(message);
        instance.setKeyword(testkey);
        String result = instance.getEncoded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDecoded method, of class CypherClass.
     */
    @Test
    public void testGetDecoded() {
        System.out.println("getEncoded");
        CypherClass instance = new CypherClass();
        String expResult = "testmessage";
        String message = "diqdqccwyqi";
        String testkey = "key";
        instance.setMessageDecode(message);
        instance.setKeyword(testkey);
        String result = instance.getDecoded();
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cypher method, of class CypherClass.
     */
//    @Test
//    public void testCypher() {
//        System.out.println("cypher");
//        CypherClass instance = new CypherClass();
//        instance.cypher();
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of decypher method, of class CypherClass.
//     */
//    @Test
//    public void testDecypher() {
//        System.out.println("decypher");
//        CypherClass instance = new CypherClass();
//        instance.decypher();
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
    
}

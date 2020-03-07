/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vigenere_cipher;

/**
 *
 * @author arek
 * @version 1.0
 */
public class Lab123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CypherClassControllerGenerator generator = new CypherClassControllerGenerator();
        try{
        CypherClassController controller = generator.getNewCypherClassController();
        controller.updateViewEncoded();        
                }
        catch(Exception e){
            
        }
    }
    
}

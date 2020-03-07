/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vigenere_cipher;

import java.util.Scanner;
import java.lang.Exception;
/**
 *
 * @author arek
 */
public class CypherClassControllerGenerator {
    
    public CypherClassController getNewCypherClassController()throws ControllerCreationError{
       try{
            CypherClass model= new CypherClass();
            CypherClassView view = new CypherClassView(); 
            CypherClassController controller = new CypherClassController(model,view);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Creating new controller...");
            System.out.println("Input message to decode/encode: ");
            String message = scanner.next();
            System.out.println("Input keyword to use for  decoding/encoding: ");
            String keyword = scanner.next();
            if(keyword.length()> message.length()){
                throw new Exception();
            }
            scanner.close();
            controller.setCypherClassKeyword(keyword);
            controller.setCypherClassMessageDecode(message);
            controller.setCypherClassMessageEncode(message);
            return controller;
       }catch(Exception e){
           throw new ControllerCreationError("Couldnt create controller");
       }

     
    }
    
    
}

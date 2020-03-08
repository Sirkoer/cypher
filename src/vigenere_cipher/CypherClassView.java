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
public class CypherClassView {
    private int messageLenght = 0;
    public void printStateEncoded(String messageEncode, String keyword, String encoded){
        System.out.println("Current state of cypher class: ");
        System.out.println("Message to encode: " + messageEncode);
        ///System.out.println("Message to decode: " + messageDecode);
        System.out.println("Message's keyord: "+ keyword);
        System.out.println("Message after encoding: "+ encoded);
    }
    public void printStateDecoded( String messageDecode,String keyword, String decoded){
        System.out.println("Current state of cypher class: ");
        //System.out.println("Message to encode: " + messageEncode);
        System.out.println("Message to decode: " + messageDecode);
        System.out.println("Message's keyord: "+ keyword);
        System.out.println("Message after decoding: " + decoded);
    }
    public String getDataToEncodeDecode() throws ControllerCreationError {
        try{
        System.out.println("Creating new controller...");
        System.out.println("Input message to decode/encode: ");
        Scanner scanner = new Scanner(System.in);
        String returnable =  scanner.next();
        this.messageLenght = returnable.length();
        scanner.close();
        return returnable;
        }
        catch(Exception e){
           throw new ControllerCreationError("Couldnt create controller");
       }
    }
    public String getKeywordString() throws ControllerCreationError {
        try{
        System.out.println("Input keyword to use for  decoding/encoding: ");
        Scanner scanner = new Scanner(System.in);
        String returnable = scanner.next();
        scanner.close();
        if(returnable.length() > this.messageLenght){
            throw new Exception();
        }
        return returnable;}
        catch(Exception e){
           throw new ControllerCreationError("Couldnt create controller");
       }
    }
}

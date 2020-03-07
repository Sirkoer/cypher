/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vigenere_cipher;

/**
 *
 * @author arek
 */
public class CypherClassView {
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
}

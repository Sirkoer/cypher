/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vigenere_cipher;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author arek
 */
public class CypherClass {
    
    private String messageEncode;
    private String keyword;
    private String messageDecode;
    private String encoded;
    private String decoded;
    
    public void setMessageEncode(String message){
        this.messageEncode = message;
    }
    public String getMessageEncode(){
        return this.messageEncode;
    }
    public void setMessageDecode(String message){
        this.messageDecode = message;
    }
    public String getMessageDecode(){
        return this.messageDecode;
    }
    public void setKeyword(String keyword){
        this.keyword = keyword;
    }
    public String getKeyword(){
        return this.keyword;
    }
    public String getEncoded(){
        this.cypher();
        return this.encoded;
    }
    public String getDecoded(){
        this.decypher();
        return this.decoded;
    }
    
    
    public void cypher(){
        //String key = "";
        String messageFin = this.messageEncode.toLowerCase();
        keyword = keyword.toLowerCase();
        Map<Integer, Character> encode = new HashMap<>();
        for(int i =0; i<messageFin.length();i++){
            encode.put(i,keyword.charAt(i%keyword.length()));
        }

        encode.forEach((index,value)->{
            encode.put(index, (char)(((((value - 97) + (messageFin.charAt(index) - 97))%26)+97)));
        });
        String returnable = "";
        for (int key : encode.keySet()) {  
            returnable += encode.get(key);
           }  
       
        this.encoded = returnable;
        }
    public void decypher(){

        String messageFin = this.messageDecode.toLowerCase();

        keyword = this.keyword.toLowerCase();
        Map<Integer, Character> decode = new HashMap<>();
        for(int i =0; i<messageFin.length();i++){
            decode.put(i,keyword.charAt(i%keyword.length()));
        }
        decode.forEach((index,value)->{
            decode.put(index, (char)(((((messageFin.charAt(index) - 97+26)-(value - 97) )%26)+97)));            
        });
        String returnable = "";
        for (int key : decode.keySet()) {  
            returnable += decode.get(key);
           }  
        
        this.decoded =  returnable;

    }
    
    
}

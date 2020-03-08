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
public class CypherClassController {
    private CypherClass model;
    private CypherClassView view;
    public CypherClassController(CypherClass model, CypherClassView view){
        this.model = model;
        this.view = view;
    }
    public String getCypherClassMessageEncode(){
        return this.model.getMessageEncode();
    }
    public String getCypherClassMessageDecode(){
        return this.model.getMessageDecode();
    }
    public String getCypherClassEncoded(){
        return this.model.getEncoded();
    }
    public String getCypherClassDecoded(){
        return this.model.getDecoded();
    }
    public String getCypherClassKeyword(){
        return this.model.getKeyword();
    }
    ///////////////////////////////////////////////////////////////////////////
    public void setCypherClassMessageEncode(String encode){
        this.model.setMessageEncode(encode);
    }
    public void setCypherClassMessageDecode(String decode){
         this.model.setMessageDecode(decode);
    }
    
    public void setCypherClassKeyword(String keyword){
         this.model.setKeyword(keyword);
    }

    
    public void updateViewEncoded(){
        view.printStateEncoded(this.model.getMessageEncode(), this.model.getKeyword(), this.model.getEncoded());
    }
    public void updateViewDecoded(){
        view.printStateEncoded(this.model.getMessageDecode(), this.model.getKeyword(), this.model.getDecoded());
    }
    public void createDataForSetup(){
        try{
        String message = this.view.getDataToEncodeDecode();
        String keyword =this.view.getKeywordString();
        this.model.setKeyword(keyword);
        this.model.setMessageEncode(message);
        this.model.setMessageDecode(message);
        }catch(Exception e){

        }

    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vigenere_cipher;
import java.lang.Exception;

/**
 *
 * @author arek
 */
public class ControllerCreationError extends Exception  {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public ControllerCreationError(String message) {
        super(message);
    }
}

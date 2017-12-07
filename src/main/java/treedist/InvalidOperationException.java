/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treedist;

/**
 *
 * @author lpmayos
 */
public class InvalidOperationException extends Exception {
      // Parameterless Constructor
      public InvalidOperationException() {}

      // Constructor that accepts a message
      public InvalidOperationException(String message) {
         super(message);
      }
 }
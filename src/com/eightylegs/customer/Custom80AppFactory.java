package com.eightylegs.customer;

import java.lang.InstantiationException;
import java.lang.IllegalAccessException;
import java.lang.ClassNotFoundException;

/**
 * Class Custom80AppFactory.
 * 
 * You must implement this class in your custom jar create your own object type 
 */
public class Custom80AppFactory {
  /**
   * Create and return your custom code object that implements the I80App interface
   * 
   * @return your custom code object that implements the I80App interface
   */
  public static I80App get80App() {
    return new ClojureAdapterApp();
  }
}
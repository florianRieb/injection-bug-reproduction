package de.fri;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyService {
  
  
  public void demo(final TO to) {
    System.out.println("Do some stuff.");
  }

}

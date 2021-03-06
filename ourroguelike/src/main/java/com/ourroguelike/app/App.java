package com.ourroguelike.app;
import com.ourroguelike.mvc.*;
import com.ourroguelike.world.*;
import com.ourroguelike.world.generator.*;
import com.googlecode.lanterna.*;
import com.googlecode.lanterna.graphics.*;
import com.googlecode.lanterna.input.*;
import com.googlecode.lanterna.screen.*;
import com.googlecode.lanterna.terminal.*;

import java.io.IOException;
/**
 * Hello world!
 *
 */
public class App {
    
  public static void main( String[] args ) {
    try {
      TerminalScreen screen = new DefaultTerminalFactory().createScreen();
        
      Model model = new RoguelikeModel(new RandomGenerator());
      View view = new LanternaView(screen, model);

      view.start();
        
      while(true) {
        view.redraw();
        screen.readInput();
      }
    } catch (Exception exn) {
      System.out.println(exn);
    }
  }
} 

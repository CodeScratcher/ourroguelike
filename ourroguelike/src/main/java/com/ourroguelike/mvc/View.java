package com.ourroguelike.mvc;
import java.io.IOException;
import com.googlecode.lanterna.TextCharacter;

public interface View {
  void placeChar(int x, int y, TextCharacter representation);
  void start() throws IOException;
  void redraw();
}
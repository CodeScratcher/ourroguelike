package com.ourroguelike.mvc;

import java.io.IOException;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.TextCharacter;

public class LanternaView implements View {  
  private final TerminalScreen screen;
  private final Model worldModel;

  public LanternaView(TerminalScreen screen_, Model worldModel_) {
    screen = screen_;
    worldModel = worldModel_;
  }

  public void redraw() {
    try {
      screen.clear();
      worldModel.drawView(this, 0, 0, screen.getTerminalSize().getColumns(), screen.getTerminalSize().getRows());
      screen.refresh();
    } catch (Exception exn) {
      System.out.println(exn);
    }
  }

  public void placeChar(int x, int y, TextCharacter ch) {
    screen.setCharacter(x, y, ch);
  }

  public void start() throws IOException {
    screen.startScreen();
    screen.clear();
    screen.refresh();
  }
}

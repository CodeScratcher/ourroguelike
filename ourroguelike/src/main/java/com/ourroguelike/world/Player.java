package com.ourroguelike.world;
import com.googlecode.lanterna.TextCharacter;
public class Player implements Entity {
  int x;
  int y;
  public Player(int x_, int y_) {
    x = x_;
    y = y_;
  }
  char getCharacter() {
    return '@';
  }
  void move(int xAmount, int yAmount) {
    x += xAmount;
    y += yAmount;
  }
}
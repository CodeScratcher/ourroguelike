package com.ourroguelike.world;

import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;

public class SingleRepresentationTile implements Tile {
  final TextCharacter representation;
  
  public SingleRepresentationTile(char ch, TextColor fgColor, TextColor bgColor) {
    representation = TextCharacter.fromCharacter(ch, fgColor, bgColor)[0];
  }

  public TextCharacter getRepresentation() {
    return representation;
  }

  public static final Tile GRASS = new SingleRepresentationTile(' ', TextColor.ANSI.WHITE, TextColor.ANSI.GREEN_BRIGHT);
  public static final Tile WATER = new SingleRepresentationTile('~',TextColor.ANSI.BLUE_BRIGHT, TextColor.ANSI.BLUE);

}
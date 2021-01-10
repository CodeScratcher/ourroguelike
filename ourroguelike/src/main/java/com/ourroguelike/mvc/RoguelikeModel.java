package com.ourroguelike.mvc;
import java.util.Vector;
import com.ourroguelike.world.Player;
import com.ourroguelike.world.Tile;
import com.ourroguelike.world.generator.MapGenerator;
import java.util.Random;

public class RoguelikeModel implements Model {
  private Vector<Vector<Tile>> map;
  private Player player;

  public RoguelikeModel(MapGenerator generator) {
    map = generator.generate(1024, 1024);
  }

  public void drawView(View v, int startX, int startY, int width, int height) {
    int effectiveHeight = startY + height > map.size() ? map.size() - startY : height;
    int effectiveWidth = startX + width > map.get(0).size() ? map.get(0).size() - startX : width;

    for (int i = 0; i < effectiveHeight; i++) {
      for (int j = 0; j < effectiveWidth; j++) {
        v.placeChar(j, i,  map.get(i + startY).get(j + startX).getRepresentation());
      }
    }
  }
}
package com.ourroguelike.mvc;
import java.util.Vector;
import com.ourroguelike.world.Tile;
import com.ourroguelike.world.SingleRepresentationTile;

public class RoguelikeModel implements Model {
  private Vector<Vector<Tile>> map;

  public RoguelikeModel() {
    map = new Vector();
    map.add(new Vector());
    map.add(new Vector());
    map.get(0).add(SingleRepresentationTile.GRASS);
    map.get(0).add(SingleRepresentationTile.WATER);
    map.get(0).add(SingleRepresentationTile.GRASS);
    map.get(0).add(SingleRepresentationTile.WATER);
  }

  public void drawView(View v, int startX, int startY, int width, int height) {
    int effectiveHeight = startY + height > map.size() ? map.size() - height : height;
    int effectiveWidth = startX + width > map.get(0).size() ? map.get(0).size() - width : width;

    for (int i = 0; i < effectiveHeight; i++) {
      for (int j = 0; j < effectiveWidth; j++) {
        v.placeChar(j, i,  map.get(i + startY).get(j + startX).getRepresentation());
      }
    }
  }
}
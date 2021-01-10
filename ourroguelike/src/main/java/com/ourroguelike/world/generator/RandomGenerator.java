package com.ourroguelike.world.generator;

import java.util.Random;

class RandomGenerator implements MapGenerator {
  private final Random rng = new Random(System.currentTimeMillis());

  Vector<Vector<Tile>> generate(int x, int y) {
    Vector<Vector<Tile>> map = new Vector();
    for (int i = 0; i < y; i++) {
      map.add(new Vector());
      for (int j = 0; j < x; j++) {
        map.get(i).add(rng.nextBoolean() ? SingleRepresentationTile.WATER : SingleRepresentationTile.GRASS);
      }
    }
  }
}
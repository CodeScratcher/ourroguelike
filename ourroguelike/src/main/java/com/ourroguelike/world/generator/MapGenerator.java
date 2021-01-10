package com.ourroguelike.world.generator;

interface MapGenerator {
  Vector<Vector<Tile>> generate(int x, int y);
}
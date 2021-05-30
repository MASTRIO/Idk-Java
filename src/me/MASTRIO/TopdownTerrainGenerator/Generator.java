package me.MASTRIO.TopdownTerrainGenerator;

import java.util.HashMap;

public class Generator {

  // Variables
  static int maxXgeneration = 30;

  // Make row method
  public static void generateRow(HashMap<Integer, Tile> chunk) {

    Main.columID = 1;
    System.out.print("|  ");

    for (int r1 = maxXgeneration; r1 >= 1; r1--) {

      if (Main.columID <= maxXgeneration) {

        Main.randomNumber = (int) ((Math.random() * ((3 - 1) + 1)) + 1);

        // Grass
        if (Main.randomNumber == 1 || Main.randomNumber == 2) {

          chunk.put(Main.columID, Tile.GRASS);

        }
        // Dirt
        if (Main.randomNumber == 3) {

          chunk.put(Main.columID, Tile.DIRT);

        }

        System.out.print(chunk.get(Main.columID).getBlock());
        Main.columID++;

      } else {

        Main.columID = 1;

      }

    }

    // New Line
    System.out.print("  |");
    System.out.println(" ");

  }

}

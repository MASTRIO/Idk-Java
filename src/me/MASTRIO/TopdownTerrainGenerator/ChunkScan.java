package me.MASTRIO.TopdownTerrainGenerator;

import java.util.HashMap;

public class ChunkScan {

  // Variables
  static int chunkCoord = 1;
  static Tile chunkData;

  // Scan Chunk Method
  public static void plants(HashMap<Integer, Tile> chunk) {

    chunkCoord = 1;
    System.out.print("|  ");
    chunkData = chunk.get(chunkCoord);

    for (int pWidth = chunk.size(); pWidth >= 1; pWidth--) {

      if (chunkData == Tile.GRASS) {

        Main.randomNumber = (int) ((Math.random() * ((3 - 1) + 1)) + 1);

        // Grass Patch
        if (Main.randomNumber == 1) {

          chunk.remove(chunkCoord);
          chunk.put(chunkCoord, Tile.GRASS_PATCH);

          // Trees
          Main.randomNumber = (int) ((Math.random() * ((4 - 1) + 1)) + 1);
          if (Main.randomNumber == 1) {

            chunk.remove(chunkCoord);
            chunk.put(chunkCoord, Tile.TREE);

          }

        }

      }

      System.out.print(chunk.get(chunkCoord).getBlock());

      chunkCoord++;

    }

    System.out.print("  |");
    System.out.println();

  }

  public static void stone(HashMap<Integer, Tile> chunk) {

    chunkCoord = 1;
    System.out.print("|  ");

    for (int sWidth = chunk.size(); sWidth >= 1; sWidth--) {

      chunkData = chunk.get(chunkCoord);

      if (chunkData == Tile.DIRT) {

        // Stone Spawner
        Main.randomNumber = (int) ((Math.random() * ((15 - 1) + 1)) + 1);

        chunk.remove(chunkCoord);

        if (Main.randomNumber == 1) {

          chunk.put(chunkCoord, Tile.STONE);

          Main.randomNumber = (int) ((Math.random() * ((4 - 1) + 1)) + 1);
          if (Main.randomNumber == 1) {

            chunk.put(chunkCoord + 1, Tile.TALL_STONE);
            chunk.put(chunkCoord + 2, Tile.STONE);

          } else {

            chunk.put(chunkCoord + 1, Tile.STONE);

          }

        } else {

          chunk.put(chunkCoord, Tile.DIRT);

        }

      }

      System.out.print(chunk.get(chunkCoord).getBlock());
      chunkCoord++;

    }

    System.out.print("  |");
    System.out.println();

  }

}

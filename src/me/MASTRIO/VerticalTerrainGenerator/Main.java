package me.MASTRIO.VerticalTerrainGenerator;

import java.util.HashMap;

public class Main {

  // Variables
  static HashMap<Integer, String> terrain = new HashMap<>();
  static int terrainLevel = 0;
  static int yLevel = 5;
  static int worldWidth;
  static String upORdown;
  static int randomNumber;
  static int stoneLevel = 6;
  static String RESET = "\u001B[0m";
  // Generator stuff
  static int[] yLevelRandomiser;
  static int[] seaFloor;
  static int[] upndown;
  static int[] yLevelDiff;
  static int[] yNoise;
  static String leBiome = "plain";

  // Main method
  public static void main(String[] args) {


    // Generator Settings
    worldWidth = 1000;
    GeneratorType.set("default");
    leBiome = "plain";


    // Set default y level
    yLevel = (int) ((Math.random() * (yLevelRandomiser[0] - yLevelRandomiser[1]) + 1) + yLevelRandomiser[1]);

    // Generate terrain
    for (int i = worldWidth; i >= 0; i--) {

      // Make sure the y doesn't go too low
      if (yLevel <= seaFloor[0]) {

        randomNumber = (int) ((Math.random() * ((2 - 1) + 1)) + 1);

        if (randomNumber == 2) {

          yLevel = (seaFloor[0] + 1);

        } else {

          yLevel = (int) ((Math.random() * ((seaFloor[1] - seaFloor[2]) + 1)) + seaFloor[2]);

        }

      }

      // Up or down
      randomNumber = (int) ((Math.random() * (((upndown[0] + 2) - upndown[1]) + 1)) + upndown[1]);
      if (randomNumber == 1) {

        upORdown = "up";

      } else if (randomNumber == 2) {

        upORdown = "down";

      } else {

        upORdown = "flat";

      }

      // Change y level
      randomNumber = (int) ((Math.random() * ((yLevelDiff[0] - yLevelDiff[1]) + 1)) + yLevelDiff[1]);
      if (upORdown.equals("up")) {

        randomNumber = (int) ((Math.random() * ((yNoise[0] - randomNumber) + 1)) + randomNumber);
        yLevel = yLevel + randomNumber;

      } else if (upORdown.equals("down")) {

        randomNumber = (int) ((Math.random() * ((yNoise[1] - randomNumber) + 1)) + randomNumber);
        yLevel = yLevel - randomNumber;

      }

      if (yLevel <= 0) {

        terrain.put(terrainLevel, TerrainObjects.STONE.getObject());

      }

      // Set Stone Level
      stoneLevel = (int) ((Math.random() * ((8 - 6) + 1)) + 6);

      // Output Terrain
      for (int y = yLevel; y >= 0; y--) {

        // Create Terrain Objects
        // Plant Layer
        if (y == 0 && yLevel != 0) {

          randomNumber = (int) ((Math.random() * ((3 - 1) + 1)) + 1);

          if (randomNumber == 1) {

            if (leBiome.equals("snow")) {

              terrain.put(terrainLevel, TerrainObjects.SNOW.getPlant(Icons.SNOW_BALL));

            } else if (leBiome.equals("beach")) {

              terrain.put(terrainLevel, TerrainObjects.SAND.getPlant(Icons.SAND_MOUND));

            } else {

              terrain.put(terrainLevel, TerrainObjects.GRASS.getPlant(Icons.GRASS_PATCH));

            }

          } else {

            terrain.put(terrainLevel, " ");

          }

        // Top Layer
        } else if (y <= 1) {

          if (leBiome.equals("snow")) {

            terrain.put(terrainLevel, TerrainObjects.SNOW.getObject());

          } else if (leBiome.equals("beach")) {

            terrain.put(terrainLevel, TerrainObjects.SAND.getObject());

          } else {

            terrain.put(terrainLevel, TerrainObjects.GRASS.getObject());

          }

        // Bottom Layer
        } else if (y >= stoneLevel) {

          if (leBiome.equals("snow")) {

            terrain.put(terrainLevel, TerrainObjects.STONE.getObject());

          } else if (leBiome.equals("beach")) {

            terrain.put(terrainLevel, TerrainObjects.SANDSTONE.getObject());

          } else {

            terrain.put(terrainLevel, TerrainObjects.STONE.getObject());

          }

        // Middle Layer
        } else {

          if (leBiome.equals("snow")) {

            terrain.put(terrainLevel, TerrainObjects.DIRT.getObject());

          } else if (leBiome.equals("beach")) {

            terrain.put(terrainLevel, TerrainObjects.SAND.getObject());

          } else {

            terrain.put(terrainLevel, TerrainObjects.DIRT.getObject());

          }

        }

        System.out.print(terrain.get(terrainLevel));

      }

      if (yLevel <= -1) {

        System.out.print(TerrainObjects.WATER.getLiquid());

      }

      // Next Chunk
      terrainLevel++;
      System.out.println();

    }

  }

}

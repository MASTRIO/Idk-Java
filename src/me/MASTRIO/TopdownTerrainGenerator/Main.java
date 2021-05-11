package me.MASTRIO.TopdownTerrainGenerator;

import java.util.HashMap;

public class Main {

  // Variables
  static String RESET = "\u001B[0m";
  static int columID = 1;
  static int randomNumber;
  static String worldRoof = "/\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\\";
  static String worldFloor = "\\__________________________________/";
  // Rows
  static HashMap<Integer, String> row1 = new HashMap<>();
  static HashMap<Integer, String> row2 = new HashMap<>();
  static HashMap<Integer, String> row3 = new HashMap<>();
  static HashMap<Integer, String> row4 = new HashMap<>();
  static HashMap<Integer, String> row5 = new HashMap<>();
  static HashMap<Integer, String> row6 = new HashMap<>();
  static HashMap<Integer, String> row7 = new HashMap<>();
  static HashMap<Integer, String> row8 = new HashMap<>();
  static HashMap<Integer, String> row9 = new HashMap<>();
  static HashMap<Integer, String> row10 = new HashMap<>();

  // Main method
  public static void main(String[] args) {

    System.out.println(" \n" + worldRoof);

    // Generate Rows
    generateRow(row1);
    generateRow(row2);
    generateRow(row3);
    generateRow(row4);
    generateRow(row5);
    generateRow(row6);
    generateRow(row7);
    generateRow(row8);
    generateRow(row9);
    generateRow(row10);

    System.out.print(worldFloor + "\n");

  }

  // Make row method
  public static void generateRow(HashMap<Integer, String> row) {

    columID = 1;
    System.out.print("|  ");

    for (int r1 = 10; r1 >= 1; r1--) {

      if (columID <= 10) {

        randomNumber = (int) ((Math.random() * ((4 - 1) + 1)) + 1);

        // Grass
        if (randomNumber == 1 || randomNumber == 2) {

          row.put(columID, Tile.GRASS.getBlock());

        }
        // Grass Patch
        if (randomNumber == 3) {

          row.put(columID, Tile.GRASS_PATCH.getBlock());

        }
        // Dirt
        if (randomNumber == 4) {

          row.put(columID, Tile.DIRT.getBlock());

        }

        System.out.print(row.get(columID));
        columID++;

      } else {

        columID = 1;

      }

    }

    // New Line
    System.out.print("  |");
    System.out.println(" ");

  }

}

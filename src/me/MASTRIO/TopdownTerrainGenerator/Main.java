package me.MASTRIO.TopdownTerrainGenerator;

import java.io.IOException;
import java.util.HashMap;

public class Main {

  // Variables
  static String RESET = "\u001B[0m";
  static int columID = 1;
  static int randomNumber;
  static String worldRoof = "/\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\u00AF\\";
  static String worldFloor = "\\__________________________________/";
  static int iteration = 1;
  static String genType;
  // Rows
  static HashMap<Integer, Tile> chunk1 = new HashMap<>();
  static HashMap<Integer, Tile> chunk2 = new HashMap<>();
  static HashMap<Integer, Tile> chunk3 = new HashMap<>();
  static HashMap<Integer, Tile> chunk4 = new HashMap<>();
  static HashMap<Integer, Tile> chunk5 = new HashMap<>();
  static HashMap<Integer, Tile> chunk6 = new HashMap<>();
  static HashMap<Integer, Tile> chunk7 = new HashMap<>();
  static HashMap<Integer, Tile> chunk8 = new HashMap<>();
  static HashMap<Integer, Tile> chunk9 = new HashMap<>();
  static HashMap<Integer, Tile> chunk10 = new HashMap<>();

  // Main method
  public static void main(String[] args) throws IOException {

    genType = "Base Terrain";
    System.out.println(" \n" + worldRoof);

    // Generate Rows
    Generator.generateRow(chunk1);
    Generator.generateRow(chunk2);
    Generator.generateRow(chunk3);
    Generator.generateRow(chunk4);
    Generator.generateRow(chunk5);
    Generator.generateRow(chunk6);
    Generator.generateRow(chunk7);
    Generator.generateRow(chunk8);
    Generator.generateRow(chunk9);
    Generator.generateRow(chunk10);

    System.out.print(worldFloor + "\n");
    System.out.println("[GEN]Gen Iteration: " + iteration + " | " + genType);

    // Generate terrain features
    scanList("plants");
    scanList("stone");

    completeGeneration();

  }

  public static void scanList(String scanType) {

    iteration++;
    System.out.println(" \n" + worldRoof);

    // Scan Chunks
    if (scanType.equals("plants")) {

      genType = "Plant detailing";

      ChunkScan.plants(chunk1);
      ChunkScan.plants(chunk2);
      ChunkScan.plants(chunk3);
      ChunkScan.plants(chunk4);
      ChunkScan.plants(chunk5);
      ChunkScan.plants(chunk6);
      ChunkScan.plants(chunk7);
      ChunkScan.plants(chunk8);
      ChunkScan.plants(chunk9);
      ChunkScan.plants(chunk10);

    // Stone
    } else if (scanType.equals("stone")) {

      genType = "Forming Stone";

      ChunkScan.stone(chunk1);
      ChunkScan.stone(chunk2);
      ChunkScan.stone(chunk3);
      ChunkScan.stone(chunk4);
      ChunkScan.stone(chunk5);
      ChunkScan.stone(chunk6);
      ChunkScan.stone(chunk7);
      ChunkScan.stone(chunk8);
      ChunkScan.stone(chunk9);
      ChunkScan.stone(chunk10);

    }

    System.out.print(worldFloor + "\n");
    System.out.println("[GEN] Iteration: " + iteration + " | " + genType);

  }

  public static void completeGeneration() {

    System.out.println("-------");
    System.out.println("[TASK] Terrain generation completed");

  }

}

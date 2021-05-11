package me.MASTRIO.VerticalTerrainGenerator;

public class GeneratorType {

  // Set method
  static void set(String generatorType) {

    // Default
    if (generatorType == "default") {

      Main.yLevelRandomiser = new int[] {
        20,
        0
      };
      Main.seaFloor = new int[] {
        -3,
        1,
        0
      };
      Main.upndown = new int[] {
        4,
        1
      };
      Main.yLevelDiff = new int[] {
        2,
        0
      };
      Main.yNoise = new int[] {
        1,
        1
      };

    }

    // Islands
    if (generatorType == "islands") {

      Main.yLevelRandomiser = new int[] {
        1,
        -5
      };
      Main.seaFloor = new int[] {
        -5,
        2,
        -3
      };
      Main.upndown = new int[] {
        3,
        1
      };
      Main.yLevelDiff = new int[] {
        1,
        0
      };
      Main.yNoise = new int[] {
        0,
        2
      };

    }

    // Rocky Landscape
    if (generatorType == "rocky") {

      Main.yLevelRandomiser = new int[] {
        10,
        7
      };
      Main.seaFloor = new int[] {
        30,
        15,
        10
      };
      Main.upndown = new int[] {
        0,
        1
      };
      Main.yLevelDiff = new int[] {
        3,
        1
      };
      Main.yNoise = new int[] {
        3,
        4
      };

    }

    // Smooth
    if (generatorType == "smooth") {

      Main.yLevelRandomiser = new int[] {
        15,
        5
      };
      Main.seaFloor = new int[] {
        4,
        6,
        5
      };
      Main.upndown = new int[] {
        8,
        0
      };
      Main.yLevelDiff = new int[] {
        1,
        0
      };
      Main.yNoise = new int[] {
        0,
        0
      };

    }

    // Chaos
    if (generatorType == "chaos") {

      Main.yLevelRandomiser = new int[] {
        40,
        -10
      };
      Main.seaFloor = new int[] {
        -10,
        20,
        -5
      };
      Main.upndown = new int[] {
        0,
        1
      };
      Main.yLevelDiff = new int[] {
        10,
        5
      };
      Main.yNoise = new int[] {
        10,
        10
      };

    }

  }

}

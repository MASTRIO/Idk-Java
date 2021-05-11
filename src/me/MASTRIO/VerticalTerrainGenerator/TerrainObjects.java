package me.MASTRIO.VerticalTerrainGenerator;

public enum TerrainObjects {

  // Terrain Objects
  GRASS("grass", "\u001B[32m"),
  DIRT("dirt", "\033[38;2;179;89;0m"),
  STONE("stone", "\033[38;2;166;166;166m"),
  WATER("water", "\033[38;2;51;133;255m"),
  SAND("sand", "\033[38;2;255;255;100m"),
  SANDSTONE("sandstone", "\033[38;2;255;175;20m"),
  SNOW("snow", "\033[38;2;240;240;240m");

  // Variables
  private String object;
  private String objectName;

  // Constructor
  TerrainObjects(String tObject, String colour) {

    this.object = colour;
    this.objectName = tObject;

  }

  // Methods
  public String getObject() {

    // Is biome snow
    if (Main.leBiome.equals("snow")) {

      // Is object water
      if (objectName.equals("dirt")) {

        object = "\033[38;2;179;189;200m";

      }

      // Is object stone
      if (objectName.equals("stone")) {

        object = "\033[38;2;166;166;200m";

      }

    }

    return object + Icons.OBJECT.getIcon() + Main.RESET;

  }

  public String getLiquid() {

    // Is biome beach
    if (Main.leBiome.equals("beach")) {

      // Is object water
      if (objectName.equals("water")) {

        object = "\033[38;2;100;200;255m";

      }

    }

    // Is biome snow
    if (Main.leBiome.equals("snow")) {

      // Is object water
      if (objectName.equals("water")) {

        object = "\033[38;2;225;245;255m";

      }

    }

    return object + Icons.LIQUID.getIcon() + Main.RESET;

  }

  public String getPlant(Icons icon) {

    return object + icon.getIcon() + Main.RESET;

  }

}

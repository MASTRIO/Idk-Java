package me.MASTRIO.TopdownTerrainGenerator;

public enum Tile {

  // Enum
  GRASS("#", "\u001B[32m"),
  DIRT("#", "\033[38;2;179;89;0m"),
  GRASS_PATCH("^", "\u001B[32m");

  // Variables
  private final String[] iconBorders = {
    "[",
    "]"
  };
  private String tIcon;
  private String tColour;

  // Constructor
  Tile(String icon, String colour) {

    this.tIcon = icon;
    this.tColour = colour;

  }

  // Methods
  public String getBlock() {

    return tColour + iconBorders[0] + tIcon + iconBorders[1] + Main.RESET;

  }

}

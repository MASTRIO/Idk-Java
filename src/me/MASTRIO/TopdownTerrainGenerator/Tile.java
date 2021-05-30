package me.MASTRIO.TopdownTerrainGenerator;

public enum Tile {

  // Enum
  GRASS("#", "\u001B[38;2;0;160;0m"),
  DIRT("#", "\033[38;2;179;89;0m"),
  GRASS_PATCH("^", "\u001B[38;2;0;220;0m"),
  TREE("&", "\u001B[38;2;165;143;0m"),
  STONE("s", "\u001B[38;2;191;191;191m"),
  TALL_STONE("S", "\u001B[38;2;171;171;171m"),
  PIG("p", "\u001B[38;2;171;;0m");

  // Variables
  private final String[] iconBorders = {
    "",
    ""
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

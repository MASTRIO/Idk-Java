package me.MASTRIO.VerticalTerrainGenerator;

public enum Icons {

  // Enums
  OBJECT("\u2588"),
  LIQUID("\u2591"),
  GRASS_PATCH("\u2577"),
  SAND_MOUND("\u25D7"),
  SNOW_BALL("\u25CF");

  // Variables
  private String epicIcon;

  // Constructor
  Icons(String icon) {

    this.epicIcon = icon;

  }

  // Methods
  public String getIcon() {

    return epicIcon;

  }

}

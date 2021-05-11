package me.MASTRIO.VerticalTerrainGenerator;

public enum Colours {

  RED("\u001B[31m"),
  GREEN("\u001B[32m"),
  YELLOW("\u001B[33m"),
  BLUE("\u001B[34m"),
  PURPLE("\u001B[35m"),
  CYAN("\u001B[36m");

  private String colour;

  Colours(String s) {

    this.colour = s;

  }

  public String getColour() {
    return colour;
  }

}

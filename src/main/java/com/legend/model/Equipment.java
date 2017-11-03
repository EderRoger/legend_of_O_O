package com.legend.model;

public class Equipment {

  private String name;
  private String type;
  private int point;

  public Equipment(final String name, final int point, final String type) {
    this.name = name;
    this.point = point;
    this.type = type;
  }

  public int getPoint() {
    return point;
  }

  public String getType(){
    return type;
  }
}

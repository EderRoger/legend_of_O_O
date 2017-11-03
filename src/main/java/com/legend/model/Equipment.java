package com.legend.model;

public class Equipment {

  private String name;
  private int point;

  public Equipment(final String name, final int point) {
    this.name = name;
    this.point = point;
  }

  public int getPoint() {
    return point;
  }

  public void setPoint(int point) {
    this.point = point;
  }
}

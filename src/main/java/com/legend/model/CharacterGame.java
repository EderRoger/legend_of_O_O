package com.legend.model;

import java.util.ArrayList;
import java.util.List;

public class CharacterGame {

  private String name;
  private List<Item> items;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public List<Item> getItems() {
    if (items == null) {
      items = new ArrayList<Item>();
    }

    return items;
  }

  public void addItem(Item item) {
    getItems().add(item);
  }
}

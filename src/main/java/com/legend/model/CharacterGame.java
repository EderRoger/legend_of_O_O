package com.legend.model;

import java.util.ArrayList;
import java.util.List;

public class CharacterGame {

  private String name;
  private String type;
  private int attack;
  private int defense;
  private int energy;
  private List<Item> items;
  private List<Equipment> equipments;

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

  public List<Equipment> getEquipments() {
    if (equipments == null) {
      equipments = new ArrayList<Equipment>();
    }

    return equipments;
  }

  public void addItem(Item item) {
    getItems().add(item);
  }

  public void addEquipment(Equipment equipment) {
    getEquipments().add(equipment);
  }

  public int getAttack() {
    return getEquipments().stream().mapToInt(equipment ->  equipment.getPoint()).sum() ;
  }


  public int getEnergy() {
    return energy;
  }

  public void setEnergy(int energy) {
    this.energy = energy;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getDefense() {
    return getEquipments().stream().mapToInt(equipment ->  equipment.getPoint()).sum() ;
  }
}

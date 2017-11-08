package com.legend.model;

import java.util.ArrayList;
import java.util.List;

public class Scenario {

  private String name;
  private List<CharacterGame> enemies;
  private CharacterGame hero;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<CharacterGame> getEnemies() {
    if (enemies == null) {
      enemies = new ArrayList();
    }
    return enemies;
  }

  public void addEnemy(CharacterGame enemy) {
    getEnemies().add(enemy);
  }

  public CharacterGame getHero() {
    return hero;
  }

  public void setHero(CharacterGame hero) {
    this.hero = hero;
  }
}

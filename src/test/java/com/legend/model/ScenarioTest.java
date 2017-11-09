package com.legend.model;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;

public class ScenarioTest {

  @Test
  public void testMustBeEnemies(){

    CharacterGame enemy = new CharacterGame();
    enemy.setName("Bowser");
    enemy.setType("Enemy");

    Scenario scenario = new Scenario();
    scenario.addEnemy(enemy);

    assertThat(scenario.getEnemies().size(), greaterThan(0));

  }

  @Test
  public void testIfEnemyHaveAAttackAndDefensePoints(){

    CharacterGame enemy = new CharacterGame();
    enemy.setName("Bowser");
    enemy.setType("Enemy");

    Equipment sword = new Equipment("Sword", 10, "Attack");
    enemy.addEquipment(sword);

    Equipment shield = new Equipment("Shield", 10, "Defense");
    enemy.addEquipment(shield);

    Scenario scenario = new Scenario();
    scenario.addEnemy(enemy);

    assertThat(enemy.getAttack(), is(10) );
    assertThat(enemy.getDefense(), is(10));

  }
}

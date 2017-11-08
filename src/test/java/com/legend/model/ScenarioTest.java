package com.legend.model;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

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
}

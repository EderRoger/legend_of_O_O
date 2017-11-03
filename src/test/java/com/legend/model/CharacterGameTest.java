package com.legend.model;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;

public class CharacterGameTest {

  @Test
  public void testMustHaveAName() {

    CharacterGame hero = new CharacterGame();
    hero.setName("Mario");

    assertThat(hero.getName(), is("Mario"));
  }

  @Test
  public void testMustBeHaveAEnemyOrHero(){
    CharacterGame hero = new CharacterGame();
    hero.setName("Mario");
    hero.setType("Hero");

    CharacterGame enemy = new CharacterGame();
    enemy.setName("Bowser");
    enemy.setType("Enemy");

    assertThat(hero.getType(), is("Hero") );
    assertThat(enemy.getType(), is("Enemy") );
  }

  @Test
  public void testMustHaveEnergyPoints(){
    CharacterGame hero = new CharacterGame();
    hero.setName("Mario");
    hero.setEnergy(20);

    assertThat(hero.getEnergy(), greaterThan(10));
  }

  @Test
  public void testMustHaveAttackAndDefensePoints(){
    CharacterGame hero = new CharacterGame();
    hero.setName("Mario");
    hero.setEnergy(20);

    Equipment sword = new Equipment("Sword", 5, "Attack");
    hero.addEquipment(sword);

    Equipment shield = new Equipment("Shield", 10, "Defense");
    hero.addEquipment(shield);

    assertThat(hero.getAttack(), is(5) );
    assertThat(hero.getDefense(), is(10));
  }

  @Test
  public void testMustHaveAOneItem() {
    CharacterGame hero = new CharacterGame();

    Item item = new Item("Potion", 10);
    hero.addItem(item);

    assertThat(hero.getItems().size(), is(1));
  }

  @Test
  public void testMustHaveASwordAndShieldItem() {
    CharacterGame hero = new CharacterGame();

    Equipment sword = new Equipment("Sword", 10, "Attack");
    hero.addEquipment(sword);

    Equipment shield = new Equipment("Shield", 10, "Defense");
    hero.addEquipment(shield);

    assertThat(hero.getEquipments().size(), is(2));
  }
}
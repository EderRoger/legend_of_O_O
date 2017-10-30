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
  public void testMustHaveAttackAndEnergyPoints(){
    CharacterGame hero = new CharacterGame();
    hero.setName("Mario");
    hero.setAttack(10);
    hero.setEnergy(20);

    assertThat(hero.getAttack(), greaterThan(0) );
    assertThat(hero.getEnergy(), greaterThan(0) );
  }

  @Test
  public void testMustHaveAOneItem() {
    CharacterGame hero = new CharacterGame();

    Item item = new Item("Potion");
    hero.addItem(item);

    assertThat(hero.getItems().size(), is(1));
  }

  @Test
  public void testMustHaveASwordAndShieldItem() {
    CharacterGame hero = new CharacterGame();

    Equipment sword = new Equipment("Sword");
    hero.addEquipment(sword);

    Equipment shield = new Equipment("Shield");
    hero.addEquipment(shield);

    assertThat(hero.getEquipments().size(), is(2));
  }
}
package com.legend.model;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CharacterGameTest {

  @Test
  public void testIfCharacterHasAName() {

    CharacterGame hero = new CharacterGame();
    hero.setName("Mario");

    assertThat(hero.getName(), is("Mario"));

  }

  @Test
  public void testIfHasAOneItem() {
    CharacterGame hero = new CharacterGame();

    Item item = new Item("Sword");
    hero.addItem(item);

    assertThat(hero.getItems().size(), is(1));
  }

  @Test
  public void heroMustBeASwordAndShieldItem() {
    CharacterGame hero = new CharacterGame();

    Item sword = new Item("Sword");
    hero.addItem(sword);

    Item shield = new Item("Shield");
    hero.addItem(shield);

    assertThat(hero.getItems().size(), is(2));
  }
}
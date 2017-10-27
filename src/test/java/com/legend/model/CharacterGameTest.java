package com.legend.model;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CharacterGameTest {

  @Test
  public void testIfCharacterHasAName() {

    CharacterGame characterGame = new CharacterGame();
    characterGame.setName("Mario");

    assertThat(characterGame.getName(), is("Mario"));
  }
}
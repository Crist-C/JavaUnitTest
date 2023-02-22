package com.aprendizaje.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class PlayerTest {

    @Test
    public void losses_when_dice_number_is_too_low() {

        Dice dice = mock(Dice.class);
        when(dice.roll()).thenReturn(2);

        System.out.println(dice.roll());
        Player player = new Player(dice, 3);
        assertFalse(player.play());
    }

    @Test
    public void wins_when_dice_number_is_big() {

        Dice dice = mock(Dice.class);
        when(dice.roll()).thenReturn(4);

        System.out.println(dice.roll());
        Player player = new Player(dice, 3);
        assertTrue(player.play());
    }

}
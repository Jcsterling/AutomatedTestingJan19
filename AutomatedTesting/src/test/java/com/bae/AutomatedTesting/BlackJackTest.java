package com.bae.AutomatedTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlackJackTest {

	@Test
	public void test() {
		BlackJack testBlackJack1 = new BlackJack();
		assertEquals(21, testBlackJack1.blackjackMethod(21,0));
		
	}

}

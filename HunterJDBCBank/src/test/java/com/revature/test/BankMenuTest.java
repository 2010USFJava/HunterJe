package com.revature.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.project0.Customer;
import com.revature.services.BankMenu;



public class BankMenuTest {

	@BeforeClass
	public static void initialSetUp() {
		System.out.println("I run once before everything");
	}
	
	@Before
	public void runBeforeEachTest() {
		System.out.println("I run before each test");
	}
	
	
	@Test
	public void depositTest() {
		Customer myDeposit= new Customer("Jennifer", "Hunter", "West St", "jhunter77", "zeus", 0);
		BankMenu.depositMenu();
		int actual= myDeposit.deposit(3);
		assertEquals(3,actual);
		return;
	}
	
	@Test
	public void withdrawTest() {
		Customer myWithdraw= new Customer("Jennifer", "Hunter", "West St", "jhunter77", "zeus", 100);
		BankMenu.withdrawMenu();
		int actual= myWithdraw.withdraw(87);
		assertEquals(13,actual);
		return;
	}
}

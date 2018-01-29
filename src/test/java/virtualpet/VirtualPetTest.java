package virtualpet;

import org.junit.Assert;
import org.junit.Test;


public class VirtualPetTest {

	@Test
	public void VirtualPetInstantiates() {
		VirtualPet mypet = new VirtualPet();
		Assert.assertEquals(mypet.getClass(), VirtualPet.class);
	}
	
	@Test
	public void VirtualPetgetHungerInitial() {
		VirtualPet mypet = new VirtualPet();
		Assert.assertEquals(20, mypet.getHunger());
	}
	
	@Test
	public void VirtualPetgetThirstInitial() {
		VirtualPet mypet = new VirtualPet();
		Assert.assertEquals(20, mypet.getThirst());
	}
	
	@Test
	public void VirtualPetgetHealthInitial() {
		VirtualPet mypet = new VirtualPet();
		Assert.assertEquals(90, mypet.getHealth());
	}
	
	@Test
	public void VirtualPetgetSleepinessInitial() {
		VirtualPet mypet = new VirtualPet();
		Assert.assertEquals(10, mypet.getSleepy());
	}
	
	@Test
	public void VirtualPetgetHappyInitial() {
		VirtualPet mypet = new VirtualPet();
		Assert.assertEquals(90, mypet.getHappy());
	}
	
	@Test
	public void VirtualPetgetPoopynessInitial() {
		VirtualPet mypet = new VirtualPet();
		Assert.assertEquals(20, mypet.getPoopy());
	}
	
	@Test
	public void VirtualPetgetNameInitial() {
		VirtualPet mypet = new VirtualPet();
		Assert.assertEquals("Bob", mypet.getName());
	}
	
	@Test
	public void VirtualPetgetDescritptionInitial() {
		VirtualPet mypet = new VirtualPet();
		Assert.assertEquals("Wombat", mypet.getDescription());
	}
	
	@Test public void feedPetCheckNewValues() {
		VirtualPet mypet = new VirtualPet();
		mypet.feed();
		Assert.assertEquals(5, mypet.getHunger());
	
		Assert.assertEquals(25, mypet.getThirst());
		Assert.assertEquals(95, mypet.getHappy());
		Assert.assertEquals(35, mypet.getPoopy());
		Assert.assertEquals(95, mypet.getHealth());
		Assert.assertEquals(20, mypet.getSleepy());
	}
	
	@Test public void waterPetCheckNewValues() {

		VirtualPet mypet = new VirtualPet();
		mypet.water();
		Assert.assertEquals(5, mypet.getThirst());
		Assert.assertEquals(92, mypet.getHappy());
		Assert.assertEquals(25, mypet.getPoopy());
		Assert.assertEquals(91, mypet.getHealth());
	}
	
	@Test public void walkPetCheckNewValues() {
		VirtualPet mypet = new VirtualPet();
		mypet.walk();
		Assert.assertEquals(25, mypet.getHunger());	
		Assert.assertEquals(25, mypet.getThirst());
		Assert.assertEquals(100, mypet.getHappy());
		Assert.assertEquals(0, mypet.getPoopy());
		Assert.assertEquals(92, mypet.getHealth());
		Assert.assertEquals(15, mypet.getSleepy());
	}
	
	@Test public void sleepPetCheckNewValues() {
		VirtualPet mypet = new VirtualPet();
		mypet.sleep();
		Assert.assertEquals(40, mypet.getHunger());	
		Assert.assertEquals(30, mypet.getThirst());
		Assert.assertEquals(92, mypet.getHappy());
		Assert.assertEquals(30, mypet.getPoopy());
		Assert.assertEquals(92, mypet.getHealth());
		Assert.assertEquals(0, mypet.getSleepy());
	}
	
	@Test public void playPetCheckNewValues() {
		VirtualPet mypet = new VirtualPet();
		mypet.play();
		Assert.assertEquals(25, mypet.getHunger());	
		Assert.assertEquals(30, mypet.getThirst());
		Assert.assertEquals(100, mypet.getHappy());
		Assert.assertEquals(91, mypet.getHealth());
		Assert.assertEquals(20, mypet.getSleepy());
	}

}

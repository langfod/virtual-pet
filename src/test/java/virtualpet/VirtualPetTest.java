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
	

}

package virtualpet;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class VirtualPetTest {

	@Test
	public void VirtualPetInstantiates() {
		VirtualPet mypet = new VirtualPet();
		Assert.assertEquals(mypet.getClass(), VirtualPet.class);
	}
	
	

}

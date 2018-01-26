package virtualpet;

public class VirtualPet {

	private String name;
	private String description;
	private int health; 
	private int thirst; 
	private int sleepy; 
	private int poopy; 
	private int hunger;
	private int happy; 

	
	public VirtualPet() {
		setName("Bob");
		setDescription("Wombat");
		setHealth(90);
		setHunger(20);
		setThirst(20);
		setSleepy(10);
		setHappy(90);
		setPoopy(20);
	}
	
	public int getHealth() {
		return health;
	}
	
	private void setHealth(int health) {
		this.health = health;
	}

	public int getHunger() {
		return hunger;
	}

	private void setHunger(int hunger) {
		this.hunger = hunger;
	}

	public int getPoopy() {
		return poopy;
	}

	private void setPoopy(int poopy) {
		this.poopy = poopy;
	}

	public int getSleepy() {
		return sleepy;
	}

	private void setSleepy(int sleepy) {
		this.sleepy = sleepy;
	}

	public int getThirst() {
		return thirst;
	}

	private void setThirst(int thirst) {
		this.thirst = thirst;
	}

	public int getHappy() {
		return happy;
	}

	private void setHappy(int happy) {
		this.happy = happy;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	private void setDescription(String description) {
		this.description = description;
	}
	
	

}

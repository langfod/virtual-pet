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
		this.health = boundsFit(health);
	}

	public int getHunger() {
		return hunger;
	}

	private void setHunger(int hunger) {
		this.hunger = boundsFit(hunger);
	}

	public int getPoopy() {
		return poopy;
	}

	private void setPoopy(int poopy) {
		this.poopy = boundsFit(poopy);
	}

	public int getSleepy() {
		return sleepy;
	}

	private void setSleepy(int sleepy) {
		this.sleepy = boundsFit(sleepy);
	}

	public int getThirst() {
		return thirst;
	}

	private void setThirst(int thirst) {
		this.thirst = boundsFit(thirst);
	}

	public int getHappy() {
		return happy;
	}

	private void setHappy(int happy) {
		this.happy = boundsFit(happy);
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
	
	public boolean feed() {
		setHunger(getHunger() - 15);
		setThirst(getThirst() +5 );
		setHappy(getHappy() + 5);
		setPoopy(getPoopy() +15);
		setHealth(getHealth() +5);
		setSleepy(getSleepy() +10);
		return true;
	}
	
	public boolean water() {
		setThirst(getThirst() -15 );
		setHappy(getHappy() + 2);
		setPoopy(getPoopy() +5);
		setHealth(getHealth() +1);
		return true;
	}
	
	
	private int boundsFit(int num) {
		if (num < 0) num = 0;
		if (num > 100) num = 100;
		return num;
	}
}

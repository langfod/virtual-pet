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
		setName("ThortonBurg");
		setDescription("Blue Bellied Snark");
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

	public void setHealth(int health) {
		this.health = boundsFit(health);
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = boundsFit(hunger);
	}

	public int getPoopy() {
		return poopy;
	}

	public void setPoopy(int poopy) {
		this.poopy = boundsFit(poopy);
	}

	public int getSleepy() {
		return sleepy;
	}

	public void setSleepy(int sleepy) {
		this.sleepy = boundsFit(sleepy);
	}

	public int getThirst() {
		return thirst;
	}

	public void setThirst(int thirst) {
		this.thirst = boundsFit(thirst);
	}

	public int getHappy() {
		return happy;
	}

	public void setHappy(int happy) {
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
		setThirst(getThirst() + 5);
		setHappy(getHappy() + 5);
		setPoopy(getPoopy() + 15);
		setHealth(getHealth() + 5);
		setSleepy(getSleepy() + 10);
		return true;
	}

	public boolean water() {
		setThirst(getThirst() - 15);
		setHappy(getHappy() + 2);
		setPoopy(getPoopy() + 5);
		setHealth(getHealth() + 1);
		return true;
	}

	public boolean walk() {
		setHunger(getHunger() + 5);
		setThirst(getThirst() + 5);
		setHappy(getHappy() + 10);
		setPoopy(getPoopy() - 25);
		setHealth(getHealth() + 2);
		setSleepy(getSleepy() + 5);
		return true;
	}

	public boolean sleep() {
		setHunger(getHunger() + 20);
		setThirst(getThirst() + 10);
		setHappy(getHappy() + 2);
		setPoopy(getPoopy() + 10);
		setHealth(getHealth() + 2);
		setSleepy(getSleepy() - 40);
		return true;
	}

	public boolean play() {
		setHunger(getHunger() + 5);
		setThirst(getThirst() + 10);
		setHappy(getHappy() + 15);
		setHealth(getHealth() + 1);
		setSleepy(getSleepy() + 10);
		return true;
	}

	private int boundsFit(int num) {
		if (num < 0)
			num = 0;
		if (num > 100)
			num = 100;
		return num;
	}
}

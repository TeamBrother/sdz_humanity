package fr.teambrother.humanity.beans;

public class Car {
	
	private Color color;
	private Oil oil;
	private Human owner;

	public Car(Color color, Oil oil) {
		this.color = color;
		this.oil = oil;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString(){
		return "The " + color + " car of " + owner + ", that works with " + oil ;
	}

	public void setOwner(Human owner) {
		this.owner = owner;
	}

	public Human getOwner() {
		return this.owner;
	}

}

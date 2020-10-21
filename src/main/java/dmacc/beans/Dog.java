package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Dog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String breed;
	private int ownerPhoneNumber;
	private boolean shots;
	
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	
	public Dog(String name) {
		super();
		this.name = name;
	}

	public Dog(String name, String breed,int ownerPhoneNumber, boolean shots) {
		super();
		this.name = name;
		this.setBreed(breed);
		this.setOwnerPhoneNumber(ownerPhoneNumber);
		this.setShots(shots);
	}
	public Dog(long id, String name, String breed,int ownerPhoneNumber, boolean shots) {
		super();
		this.name = name;
		this.setBreed(breed);
		this.setOwnerPhoneNumber(ownerPhoneNumber);
		this.setShots(shots);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getOwnerPhoneNumber() {
		return ownerPhoneNumber;
	}

	public void setOwnerPhoneNumber(int ownerPhoneNumber) {
		this.ownerPhoneNumber = ownerPhoneNumber;
	}

	public boolean isShots() {
		return shots;
	}

	public void setShots(boolean shots) {
		this.shots = shots;
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", breed=" + breed + ", ownerPhoneNumber=" + ownerPhoneNumber
				+ ", shots=" + shots + "]";
	}

	
}

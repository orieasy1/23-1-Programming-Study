package com.spring.di.ex04;

public class Pet {
	
	private String cat;
	private String dog;
	private String fish;
	private String duck;
	
	public Pet(String cat, String dog) {
		this.cat = cat;
		this.dog = dog;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getDog() {
		return dog;
	}

	public void setDog(String dog) {
		this.dog = dog;
	}

	public String getFish() {
		return fish;
	}

	public void setFish(String fish) {
		this.fish = fish;
	}

	public String getDuck() {
		return duck;
	}

	public void setDuck(String duck) {
		this.duck = duck;
	}
}

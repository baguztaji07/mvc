package com.bagus.springMVCdemo.models;

public class Hero {
	
	private String name;
	private String type;
	private int atkspd;
	private int mana;
	private int hp;
	
	public Hero() {
		super();
	}
	
	public Hero(String name, String type, int atkspd, int mana, int hp) {
		super();
		this.name = name;
		this.type = type;
		this.atkspd = atkspd;
		this.mana = mana;
		this.hp = hp;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAtkSpd() {
		return atkspd;
	}
	public void setAtkSpd(int atkspd) {
		this.atkspd = atkspd;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	

}

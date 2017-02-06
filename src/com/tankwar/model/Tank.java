package com.tankwar.model;

import com.tankwar.impl.TankImpl;

public class Tank extends ObjectCanMove implements TankImpl {

	public Tank(int tankType, int direction) {
		this.type = tankType;
		this.direction = direction;
	}

	public Tank(int tankType, int direction, int x, int y) {
		this.type = tankType;
		this.direction = direction;
		this.x = x;
		this.y = y;
	}

	private int type;
	private int life = 100;
	private int def = 0; // ·ÀÓù
	private int speed = 10;
	private int direction;// ·½Ïò
	private int x = 0;
	private int y = 0;
	private int totalLife = 3;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public int getTotalLife() {
		return totalLife;
	}

	public void setTotalLife(int totalLife) {
		this.totalLife = totalLife;
	}

	@Override
	public void drawTank() {
		// TODO Auto-generated method stub

	}

	@Override
	public void duang(int l) {
		// TODO Auto-generated method stub
		this.life -= l;
	}

	@Override
	public void move(int speed) {
		// TODO Auto-generated method stub
		super.move(speed);
	}

	public void addLife(int i) {
		this.totalLife += i;
	}
//
}

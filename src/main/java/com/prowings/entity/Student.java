package com.prowings.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)

	@Column
	int id;

	@Column(name = "STD_ROLL")
	int roll;

	@Column
	String name;

	@Column(name = "STD_ADDRESS")
	String address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, int roll, String name, String address) {
		super();
		this.id = id;
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

}

package com.anuj.springmvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
private String firstName;

@Min(value=0,message="must be greter then 0")
@Max(value=10,message="must be smaller then 10")
private int freePaases;

@NotNull(message="is Required Bro !")
@Size(min=5,message="is Required Bro !")
private String lastName;

public int getFreePaases() {
	return freePaases;
}
public void setFreePaases(int freePaases) {
	this.freePaases = freePaases;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}


}

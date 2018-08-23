package com.anuj.springmvc;

import java.util.LinkedHashMap;

public class Student {
private String firstName;
private String lastName;
private String country;

private LinkedHashMap<String, String> countryOptions;

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public Student() {
	// Populate country options used ISO COde
	countryOptions = new LinkedHashMap<>();
	countryOptions.put("BR", "Brazil");
	countryOptions.put("IN", "INDIA");
	countryOptions.put("GR", "GERMANY");
	countryOptions.put("FR", "FRANCE");
}

public String getFirstName() {
	return firstName;
}

public LinkedHashMap<String, String> getCountryOptions() {
	return countryOptions;
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

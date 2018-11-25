package com.gsau.pojo;

import java.io.Serializable;

public class User implements Serializable{
    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String username;
    private String password;
    private String country;
    private String province;
    private String city;
    private String addressone;
    private String addresstwo;
    private String postcode;
    private String familyPhone;
    private String officePhone;
    private long telPhone;
    private String email;
    
    public User() {
    }
    
    public User(String username, String password, String country,
	    String province, String city, String addressone, String addresstwo,
	    String postcode, String familyPhone, String officePhone,
	    long telPhone, String email) {
	this.username = username;
	
	this.password = password;
	this.country = country;
	this.province = province;
	this.city = city;
	this.addressone = addressone;
	this.addresstwo = addresstwo;
	this.postcode = postcode;
	this.familyPhone = familyPhone;
	this.officePhone = officePhone;
	this.telPhone = telPhone;
	this.email = email;
    }

    
    public User(int id, String username, String password, String country,
	    String province, String city, String addressone, String addresstwo,
	    String postcode, String familyPhone, String officePhone,
	    long telPhone, String email) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.country = country;
	this.province = province;
	this.city = city;
	this.addressone = addressone;
	this.addresstwo = addresstwo;
	this.postcode = postcode;
	this.familyPhone = familyPhone;
	this.officePhone = officePhone;
	this.telPhone = telPhone;
	this.email = email;
    }

    public String getUsername() {
        return username;
    }
    public void setId(String username) {
	this.username = username;
    }
  
   
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddressone() {
        return addressone;
    }
    public void setAddressone(String addressone) {
        this.addressone = addressone;
    }
    public String getAddresstwo() {
        return addresstwo;
    }
    public void setAddresstwo(String addresstwo) {
        this.addresstwo = addresstwo;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public String getFamilyPhone() {
        return familyPhone;
    }
    public void setFamilyPhone(String familyPhone) {
        this.familyPhone = familyPhone;
    }
    public String getOfficePhone() {
        return officePhone;
    }
    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }
    public long getTelPhone() {
        return telPhone;
    }
    public void setTelPhone(long telPhone) {
        this.telPhone = telPhone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
	return "User [username=" + username + ", password="
		+ password + ", country=" + country + ", province=" + province
		+ ", city=" + city + ", addressone=" + addressone
		+ ", addresstwo=" + addresstwo + ", postcode=" + postcode
		+ ", familyPhone=" + familyPhone + ", officePhone="
		+ officePhone + ", telPhone=" + telPhone + ", email=" + email
		+ "]";
    }
    
}

package com.mentor.model;

import java.util.Date;

public class User {
	int userId ;
	 String userName ;
	  String password ;
	     String firstName ;
	     String lastName ;
	     int contactNumber ;
	     String role ;
	     String linkedinURL ;
	     int experience ;
	     boolean active ;
	     boolean confirmedSignUp ;
	     boolean resetPassword ;
	     public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
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
		public int getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(int contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getLinkedinURL() {
			return linkedinURL;
		}
		public void setLinkedinURL(String linkedinURL) {
			this.linkedinURL = linkedinURL;
		}
		public int getExperience() {
			return experience;
		}
		public void setExperience(int experience) {
			this.experience = experience;
		}
		public boolean isActive() {
			return active;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		public boolean isConfirmedSignUp() {
			return confirmedSignUp;
		}
		public void setConfirmedSignUp(boolean confirmedSignUp) {
			this.confirmedSignUp = confirmedSignUp;
		}
		public boolean isResetPassword() {
			return resetPassword;
		}
		public void setResetPassword(boolean resetPassword) {
			this.resetPassword = resetPassword;
		}
		public Date getResetPasswordDate() {
			return resetPasswordDate;
		}
		public void setResetPasswordDate(Date resetPasswordDate) {
			this.resetPasswordDate = resetPasswordDate;
		}
		Date resetPasswordDate;
}

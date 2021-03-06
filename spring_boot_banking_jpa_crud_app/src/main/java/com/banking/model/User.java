package com.banking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int uId;
		private int savingsAccount;
		private String firstName;
		private String lastName;
		private long moileNumber;
		private String address;
		private String city;
		private String state;
		private String country;
		private String gender;
		private String emailId;
		private String username;
		private String password;
		private boolean enable;
		private boolean disable;
		
//		@OneToOne
//	    private SavingsAccount savingsAccount;
//		
		public User() {
			// TODO Auto-generated constructor stub
		}

		
		public int getuId() {
			return uId;
		}


		public void setuId(int uId) {
			this.uId = uId;
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

		public long getMoileNumber() {
			return moileNumber;
		}

		public void setMoileNumber(long moileNumber) {
			this.moileNumber = moileNumber;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getState() {
			return state;
		}


		public void setState(String state) {
			this.state = state;
		}


		public String getCountry() {
			return country;
		}


		public void setCountry(String country) {
			this.country = country;
		}


		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		public int getSavingsAccount() {
			return savingsAccount;
		}

		public void setSavingsAccount(int savingsAccount) {
			this.savingsAccount = savingsAccount;
		}

		public boolean isEnable() {
			return enable;
		}

		public void setEnable(boolean enable) {
			this.enable = enable;
		}

		
	
		public boolean isDisable() {
			return disable;
		}


		public void setDisable(boolean disable) {
			this.disable = disable;
		}

		@Override
		public String toString() {
			return "User [uId=" + uId + ", savingsAccount=" + savingsAccount + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", moileNumber=" + moileNumber + ", address=" + address + ", city="
					+ city + ", state=" + state + ", country=" + country + ", gender=" + gender + ", emailId=" + emailId
					+ ", username=" + username + ", password=" + password + ", enable=" + enable + ", disable="
					+ disable + "]";
		}


		public User(int uId, String firstName, String lastName, long moileNumber, String address,
				String city, String state, String country, String gender, String emailId, String username,
				String password) {
			super();
			this.uId = uId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.moileNumber = moileNumber;
			this.address = address;
			this.city = city;
			this.state = state;
			this.country = country;
			this.gender = gender;
			this.emailId = emailId;
			this.username = username;
			this.password = password;

		}


		


		

}

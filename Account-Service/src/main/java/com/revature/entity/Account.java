package com.revature.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNT_TABLE")
public class Account {

  @Column(name = "ACC_ID")
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
	private int accId;
    
	@OneToOne
	@JoinColumn(name = "U_ID", nullable = false)
	@MapsId
	private User user;
	
    //@OneToOne(targetEntity = User.class, cascade = CascadeType.ALL)
    //@JoinColumn(name = "U_ID_FK", referencedColumnName = "U_ID")
//    @Column(name = "U_ID")
//    private int userId;
	
	@OneToOne
	@JoinColumn(name = "ACCTYPE_ID", nullable = false)
	@MapsId
	private AccountType accountType;
	
    //@OneToOne(targetEntity = AccountType.class, cascade = CascadeType.ALL)
    //@JoinColumn(name = "ACCTYPE_ID_FK", referencedColumnName = "ACCTYPE_ID")
//    @Column(name = "ACCTYPE_ID")
//    private int accTypeId;
	
  @Column(name = "POINTS", columnDefinition = "INTEGER DEFAULT 0")
	private int points;
 

	public Account() {
		super();
	}

	
	
	public Account(int accId, User user, AccountType accountType, int points) {
		super();
		this.accId = accId;
		this.user = user;
		this.accountType = accountType;
		this.points = points;
	}


	public Account(User user, AccountType accountType, int points) {
		super();
		this.user = user;
		this.accountType = accountType;
		this.points = points;
	}

	

	public Account(User user, AccountType accountType) {
		super();
		this.user = user;
		this.accountType = accountType;
	}



	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public AccountType getAccTypeId() {
		return accountType;
	}

	public void setAccTypeId(AccountType accountType) {
		this.accountType = accountType;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + accId;
//		result = prime * result + accTypeId;
//		result = prime * result + points;
//		result = prime * result + user;
//		return result;
//	}
//
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accId != other.accId)
			return false;
		if (accountType != other.accountType)
			return false;
		if (points != other.points)
			return false;
		if (user != other.user)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Account [accId=" + accId + ", user=" + user + ", accountType=" + accountType + ", points=" + points
				+ "]";
	}

	
}

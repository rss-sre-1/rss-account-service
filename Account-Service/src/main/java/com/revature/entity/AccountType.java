package com.revature.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "ACCTYPE_TABLE")
public class AccountType implements Serializable {

	private static final long serialVersionUID = -3658046805870912776L;

	@Id
	@NotNull
	@Column(name = "ACCTYPE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accTypeId;

	@NotNull
	@Column(name = "TYPE", unique = true)
	private String type;

	@OneToMany(mappedBy = "accountType")
	@JsonBackReference
	private List<Account> account;

	public AccountType() {
		super();
	}

	public AccountType(@NotNull int accTypeId, @NotNull String type, List<Account> account) {
		super();
		this.accTypeId = accTypeId;
		this.type = type;
		this.account = account;
	}

	public int getAccTypeId() {
		return accTypeId;
	}

	public void setAccTypeId(int accTypeId) {
		this.accTypeId = accTypeId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accTypeId, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AccountType)) {
			return false;
		}
		AccountType other = (AccountType) obj;
		return accTypeId == other.accTypeId && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "AccountType [accTypeId=" + accTypeId + ", type=" + type + "]";
	}
	
}

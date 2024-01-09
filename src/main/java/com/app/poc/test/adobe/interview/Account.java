package com.app.poc.test.adobe.interview;

import java.io.Serializable;

@Entity
@Table("account")
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name="account_id");
	private Integer accountId;
	
	@Column(name="account_name");
	private String accountName;
	
	@Column(name="account_type");
	private String accountType;
	
	@Column(name="indutry");
	private String indutry;
	
	@Column(name="address");
	private String address;
	

	public Account() {
		super();
	}

	public Account(Integer accountId, String accountName, String accountType, String indutry, String address) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountType = accountType;
		this.indutry = indutry;
		this.address = address;
	}



	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getIndutry() {
		return indutry;
	}

	public void setIndutry(String indutry) {
		this.indutry = indutry;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

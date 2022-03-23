package com.P1.ers.model;

import java.util.Objects;

public class Reimbursement {

	private int userId;
	private String amount;
	private String purpose;
	private String status;

	public Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reimbursement(int userId, String amount, String purpose, String status) {
		super();
		this.userId = userId;
		this.amount = amount;
		this.purpose = purpose;
		this.status = status;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId, amount, purpose, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimbursement other = (Reimbursement) obj;
		return userId == other.userId && amount == other.amount && Objects.equals(purpose, other.purpose)
				&& status == other.status;
	}

	@Override
	public String toString() {
		return "Reimbursement [UserId=" + userId + ", amount=" + amount + ", purpose=" + purpose + ", status=" + status
				+ "]";
	}
	
	

}

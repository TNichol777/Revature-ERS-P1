package com.P1.ers.dao;
import java.util.List;
import com.P1.ers.model.Reimbursement;
import com.P1.ers.model.User;

public interface ReimbursementDAO {
	public boolean requestReimbursement(Reimbursement reimbursement);
	public List<Reimbursement> getReimbursement();
	public List<Reimbursement> getResolvedReim();
	public List<Reimbursement> getReimbursementById(String userId);
	public List<Reimbursement> getResolvedReimById(int userId);
//	public boolean approveReimbursement();




}

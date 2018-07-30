package com.cg.dao;



import javax.persistence.EntityManager;

import com.cg.DB.DBUtil;
import com.cg.bean.Account;
import com.cg.exception.AccountException;

/**
 * 
 * Class name: AccountDaoImpl Number of Interface:1 Name of Interface:
 * AccountDao Number of Methods: 6 Number of constructor:0 Purpose: This is the
 * Dao layer class for manipulation and updation to be done on the database Name
 * of methods: String createAccount(Account acount), double showBalance(String
 * mobileNo), Account deposit(String mobileNo), Account withdraw(String
 * mobileNo), Boolean fundTransfer(String mobileNum), Account
 * printTransactionDetails(String mobileNum)
 * 
 * Author: Shuchita Date of creation: 11.7.2018 Last updated:14.7.2018
 *
 */

public class AccountDaoImpl implements AccountDao {

	@Override
	public String createAccount(Account acount) throws AccountException {
		
		
		
			EntityManager em= DBUtil.getConnection();
			em.getTransaction().begin();
			em.persist(acount);
			em.getTransaction().commit();
			if (acount.getMobileNo() == null || acount.getMobileNo().isEmpty()) {
				
				return acount.getMobileNo();
			} else {
				throw new AccountException("Could not create the account");
			}
		
	}

	@Override
	public double showBalance(String mobileNo) throws AccountException {
		EntityManager em= DBUtil.getConnection();
		
		Account ac=em.find(Account.class, mobileNo);
		if(ac!=null){
			
				return ac.getBalance();
			}
			else{
				throw new AccountException(
						"The entered mobile number does not exists.");
			}
		
	}

	@Override
	public Account deposit(String mobileNo) throws AccountException {
		// TODO Auto-generated method stub
EntityManager em= DBUtil.getConnection();
		
		Account ac=em.find(Account.class, mobileNo);
		if(ac!=null){
			
				return ac;
			}
			else{
				throw new AccountException(
						"The entered mobile number does not exists.");
			}
		
	
		
	}

	@Override
	public Account withdraw(String mobileNo) throws AccountException {
EntityManager em= DBUtil.getConnection();
		
		Account ac=em.find(Account.class, mobileNo);
		if(ac!=null){
			
				return ac;
			}
			else{
				throw new AccountException(
						"The entered mobile number does not exists.");
			}
		
	}

	@Override
	public Account printTransactionDetails(String mobileNum)
			throws AccountException {
EntityManager em= DBUtil.getConnection();
		
		Account ac=em.find(Account.class, mobileNum);
		if(ac!=null){
			
				return ac;
			}
			else{
				throw new AccountException(
						"The entered mobile number does not exists.");
			}
		
	}
}

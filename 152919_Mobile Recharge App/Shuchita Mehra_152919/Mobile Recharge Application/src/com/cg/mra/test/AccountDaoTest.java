package com.cg.mra.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImp;
import com.cg.mra.exception.AccountException;
/**
 * 
 * Class name:AccountDaoTest
 * Number of Interface:0
 * Number of Methods: 2
 * Number of constructor:0
 * Purpose: This tests the methods of the DAO layer Class AccountDaoImp
 * 
 * Name of methods: init(),testRechargeAccount() 
 * Author: Shuchita
 * Date of creation: 11.7.2018
 * 
 *
 */

public class AccountDaoTest {
	AccountDao acDao;
	@Before
	public void init(){
		acDao=new AccountDaoImp();
	}


	@Test
	public void testRechargeAccount() throws AccountException {
		String mobileNo="9876543210";
		int rechargeAmt=200;
		assertNotNull(acDao.rechargeAccount(mobileNo, rechargeAmt));
	}

}

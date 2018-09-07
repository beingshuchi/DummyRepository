package com.cg.mra.db;

import java.util.HashMap;

import com.cg.mra.beans.Account;

/**
 * 
 * Class name:Account DB
 * Number of Interface:0
 * Number of Methods: 1
 * Number of constructor:0
 * Purpose: This stores all the data coming from the DAO layer
 * It contains a static block so that there is already some database present in this class 
 * 
 * Name of methods: HashMap<String, Account> getCustomerData()
 * Author: Shuchita
 * Date of creation: 11.7.2018
 * 
 *
 */
public class AccountDB {
	
	private static HashMap<String, Account> customerData= new HashMap<String, Account>();
	public static HashMap<String, Account> getCustomerData(){
		return customerData;
	}
	static{
		customerData.put("9922943943", new Account("9922943943", "Normal", "Shubh", 350));
		customerData.put("9005001505", new Account("9005001505", "Priviliged", "Shashank", 239));
		customerData.put("9889885005", new Account("9889885005", "Normal", "Anshumaan", 40));
		customerData.put("9932012345", new Account("9932012345", "Priviliged", "Manish", 300));
		customerData.put("8853531087", new Account("8853531087", "Normal", "Tamanna", 50));
	}

}

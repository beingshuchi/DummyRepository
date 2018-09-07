package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.AccountException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

/**
 * 
 * Class name: MainUI
 * Number of Interface:0
 * Number of Methods: 3
 * Number of constructor:0
 * Purpose: This is the UI class for  accepting data, displaying output and 
 *         passing the data to the service layer
 * Name of methods: Main,accountBalanceEnquiry(),rechargeAccount()
 * Author: Shuchita
 * Date of creation: 11.7.2018
 * 
 *
 */

public class MainUI {
	Scanner sc = new Scanner(System.in);
	AccountService accService= new AccountServiceImpl();
/**
 * The main methods the options for the user to choose
 * 1) Account Balance Enquiry: calls the method-accountBalanceEnquiry()
 * 2) Recharge Account : calls the method-rechargeAccount()
 * 3) Exit: Simply closes the application
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainUI mainUI= new MainUI();
		String option="";
		while(true){
			System.out.println("1) Account Balance Enquiry");
			System.out.println("2) Recharge Account");
			System.out.println("3) Exit");
			System.out.println("Enter your choice: ");
			option=mainUI.sc.nextLine();
			switch(option){
			case "1":
				mainUI.accountBalanceEnquiry();
				break;
			case "2":
				mainUI.rechargeAccount();
				break;
			case "3":
				mainUI.sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Please enter the option between 1-3");
				break;
			}
		}
	}
	
	/**
	 * If the user chooses the option 1) Account Balance Enquiry,
	 * Mobile number is accepted from the user. If the mobile number does not exists
	 * it will show an expetion or if the entered mobile number does have 10 digits an
	 * exception is thrown
	 * If the mobile number exists then it will retieve the data from the service layer and
	 * display only the balance
	 */
	
	private void accountBalanceEnquiry(){
		System.out.print("Enter Mobile No : ");
		String mobileNo=sc.nextLine();
		try {
			boolean validate=accService.validateMobileNo(mobileNo);
			if(validate){
				Account ac=accService.getAccountDetails(mobileNo);
				System.out.println("Your Current Balance is Rs. "+ac.getAccountBalance());
			}
		} catch (AccountException e) {
			System.out.println();
			System.err.println(e.getMessage());
			System.out.println();
		}
	}
	
	/**
	 * If the user chooses the option 2) Recharge Account,
	 * Mobile number is accepted from the user. If the mobile number does not exists
	 * it will show an expetion or if the entered mobile number does have 10 digits an
	 * exception is thrown
	 * If the mobile number exists then it will check if the recharge balance is not less than or equal to 0.
	 * For recharge balance less than or equal to 0, it will trhow an exception
	 * If everything is validated, the updation of the balance is done and displayed finally.
	 */
	
	private void rechargeAccount(){
		System.out.print("Enter Mobile No: ");
		String mobileNo=sc.nextLine();
		try {
			boolean validatePhone=accService.validateMobileNo(mobileNo);
			if(validatePhone){
				Account ac=accService.getAccountDetails(mobileNo);
				System.out.print("Enter Recharge Amount: ");
				int rechargeAmount=Integer.parseInt(sc.nextLine());
				try {
					boolean validateAccount=accService.validateRechargeAmt(rechargeAmount);
					if(validateAccount){
						int newBal=accService.rechargeAccount(mobileNo, rechargeAmount);
						 ac=accService.getAccountDetails(mobileNo);
						System.out.println("Your Account Recharged Successfully");
						System.out.println("Hello "+ac.getCustomerName()+",Available Balance is "+newBal);
					}
				} catch (AccountException e) {
					System.out.println();
					System.err.println(e.getMessage());
					System.out.println();
				}
				
			}
		} catch (AccountException e1) {
			System.out.println();
			System.err.println("ERROR: Cannot Recharge Account as Given MobileNo Does Not Exists");
			System.out.println();
		}
		
		
	}
	
	

}

package com.ketan.mainMethod;

import java.util.Scanner;

import com.ketan.bean.Administrator;
import com.ketan.bean.Vendor;
import com.ketan.dataBase.object.Vendor_DAO;
import com.ketan.dataBase.object.Vendor_DAO_Impl;


public class RegisterVendorCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Admin Login");
		
		System.out.println("Enter Username:");
		String aemail = sc.next();
		
		System.out.println("Enter password:");
		String apassword = sc.next();
		
		Administrator admin = new Administrator();
		
		admin.setEmail(aemail);
		admin.setPassword(apassword);
		
		
		
		
		
		System.out.println("Enter Vendor Name:");
		String vname = sc.next();
		
		System.out.println("Enter GST Number:");
		int gst_no = sc.nextInt();
		
		System.out.println("Enter Establishment Date(yyyy/mm/dd):");
		String edate = sc.next();
		
		System.out.println("Enter Vendor email:");
		String email = sc.next();
		
		System.out.println("Create Vendor password:");
		String password = sc.next();
		
		System.out.println("Enter Admin Id:");
		int admin_id = sc.nextInt();
		
		
		Vendor vendor = new Vendor();
		
		vendor.setVname(vname);
		vendor.setGst_no(gst_no);
		vendor.setEdate(edate);
		vendor.setEmail(email);
		vendor.setPassword(password);
		vendor.setId(admin_id);
		
		Vendor_DAO dao = new Vendor_DAO_Impl();
		
		String result = dao.registerVendor(aemail, apassword, vname, gst_no, edate, email, password, admin_id);
		
		System.out.println(result);
		
		

	}

}

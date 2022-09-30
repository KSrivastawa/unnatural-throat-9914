package com.ketan.mainMethod;

import java.util.List;
import java.util.Scanner;

import com.ketan.bean.Bids;
import com.ketan.bean.Tenders;
import com.ketan.bean.Vendor;
import com.ketan.dataBase.object.Bids_DAO;
import com.ketan.dataBase.object.Bids_DAO_Impl;
import com.ketan.dataBase.object.Tenders_DAO;
import com.ketan.dataBase.object.Tenders_DAO_Impl;
import com.ketan.dataBase.object.Vendor_DAO;
import com.ketan.dataBase.object.Vendor_DAO_Impl;
import com.ketan.dataBase.object.Vendor_Tender_DAO;
import com.ketan.dataBase.object.Vendor_Tender_DAO_Impl;

public class Multicases {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Welcome to 'Tender Management System'");
		System.out.println("----------*********^^^^^^^^^----------\n");
		
		System.out.println("1. Administrator login\n"
				+ "2. Vendor login");
		
		System.out.println("Enter Choice:");
		int choice = sc.nextInt();
		
		switch(choice) {
			
		case 1:
			System.out.println("Welcome to Admin login\n");
			
			System.out.println("Enter username:");
			String uname = sc.next();
			
			System.out.println("Enter password:");
			String pass = sc.next();
			
			Vendor_DAO dao = new Vendor_DAO_Impl();
			
			String r = dao.adminLogin(uname, pass);
			
			System.out.println(r);
			
			if(r.equalsIgnoreCase("Login Successful...")) {
			
				while(true) {
				System.out.println("\n1. Register new Vendor\n"
						+ "2. View all the Vendors\n"
						+"3. Create New Tenders\n"
						+"4. View all the Tenders\n"
						+"5. View All the Bids of a tender\n"
						+"6. Assign tender to a vendor\n"
						+"7. Exit");
				
				System.out.println("Enter choice:");
				int ch = sc.nextInt();
				
				switch(ch) {
				
				case 1:
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
					
					
					Vendor_DAO dao2 = new Vendor_DAO_Impl();
					
					String result = dao2.registerNewVendor(vname, gst_no, edate, email, password, admin_id);
					
					System.out.println(result);
					break;
					
				case 2:
					
					Vendor_DAO dao3 = new Vendor_DAO_Impl();
					
				
					List<Vendor> list = dao3.viewAllVendorsDetails();
					
					System.out.println("\n LIST OF VENDORS WITH FULL DETAILS");
					System.out.println("===================================");
					
					list.forEach(s-> {
						
						System.out.println("Vendor Id: "+s.getId());
						System.out.println("Vendor Name: "+s.getVname());
						System.out.println("Vendor GST No.: "+s.getGst_no());
						System.out.println("Vendor Establishment: "+s.getEdate());
						System.out.println("Vendor Email: "+s.getEmail());
						System.out.println("Vendor Password: "+s.getPassword());
						System.out.println("Admin SignatureId: "+s.getSignature_id());
						
						System.out.println("----------****--------****---------");
					});
					break;
					
				case 3:
					System.out.println("Enter Tender Id:");
					int t_id = sc.nextInt();
					
					System.out.println("Enter Product Name:");
					String p_n = sc.next();
					
					System.out.println("Enter Required Quantity:");
					int r_q = sc.nextInt();
					
					System.out.println("Enter Department Name:");
					String dept = sc.next();
					
					System.out.println("Enter Address:");
					String address = sc.next();
					
					System.out.println("Enter Start Date(yyyy/mm/dd):");
					String s_d = sc.next();
					
					System.out.println("Enter End Date(yyyy/mm/dd):");
					String e_d = sc.next();
					
					Tenders_DAO dao4 = new Tenders_DAO_Impl();
					
					String result2 = dao4.registerTenders(t_id, p_n, r_q, dept, address, s_d, e_d);
					
					System.out.println(result2);
					break;
				
				case 4:
					Tenders_DAO dao5 = new Tenders_DAO_Impl();
					
					
					List<Tenders> list2 = dao5.viewAllTendersDetails();
					
					System.out.println("\n LIST OF TENDERS WITH FULL DETAILS");
					System.out.println("===================================");
					
					list2.forEach(s-> {
						
						System.out.println("Tender Id: "+s.getTender_id());
						System.out.println("Product Name: "+s.getProduct_name());
						System.out.println("Quantity Required: "+s.getQty_req());
						System.out.println("Department: "+s.getDept());
						System.out.println("Location: "+s.getAddress());
						System.out.println("Start Date: "+s.getS_date());
						System.out.println("End Date: "+s.getE_date());
						
						System.out.println("--------****------****--------");
					});
					break;
					
				case 5:
					System.out.println("Enter Bid connection Id with respective Tender:");
					int bt = sc.nextInt();
					
					Bids_DAO dao6 = new Bids_DAO_Impl();
					
					List<Bids> list5 = dao6.viewAllBidsOf_A_Tender(bt);
					
					System.out.println("\nList of All the Bids of a tender Id "+bt+" :");
					System.out.println("============================================");
					
					list5.forEach(s-> {
						
						System.out.println("Bid No.: "+s.getBid_no());
						System.out.println("Offer Price: "+s.getOfferPrice());
						System.out.println("Bid tender Id: "+s.getBid_tender());
						System.out.println("Bid Vendor Id: "+s.getBid_vendor());
						System.out.println("Bid Status: "+s.getStatus());
						
						System.out.println("---------------------------");
						
					});
					break;
					
				case 6:
					System.out.println("Enter Vendor Id:");
					int vendor_id = sc.nextInt();
					
					System.out.println("Enter Tender Id:");
					int tender_id = sc.nextInt();
					
					Vendor_Tender_DAO dao7 = new Vendor_Tender_DAO_Impl();
					
					String resultss = dao7.AssignVendorToTender(vendor_id, tender_id);
					
					System.out.println(resultss );
					break;
					
					
					
				case 7:
					System.out.println("Thankyou!\n");
					Multicases.main(args);
					
				}// sw
				
				}// wi
				
			 }// if
		   
			
		case 2:
			System.out.println("Welcome to Vendor Login\n");
			
			System.out.println("Enter Username:");
			String v_user = sc.next();
			
			System.out.println("Enter Password:");
			String v_pass = sc.next();
			
			Vendor_DAO dao2 = new Vendor_DAO_Impl();
			
			String result = dao2.vendorLogin(v_user, v_pass);
			
			System.out.println(result);
			
			if(result.equalsIgnoreCase("Login Successful...")) {
				
				while(true) {
				System.out.println("\n1. View all the Tenders list\n"
									+"2. Place a Bid against a Tender\n"
									+"3. View status of a Bid(Whether Selected or Not)\n"
									+"4. View his own Bid History\n"
									+"5. Exit");
				
				System.out.println("Enter Choice:");
				int choice2 = sc.nextInt();
				
				switch(choice2) {
				
				case 1:
					
					Tenders_DAO dao5 = new Tenders_DAO_Impl();
					
					
					List<Tenders> list2 = dao5.viewAllTendersDetails();
					
					System.out.println("\n LIST OF TENDERS WITH FULL DETAILS");
					System.out.println("===================================");
					
					list2.forEach(s-> {
						
						System.out.println("Tender Id: "+s.getTender_id());
						System.out.println("Product Name: "+s.getProduct_name());
						System.out.println("Quantity Required: "+s.getQty_req());
						System.out.println("Department: "+s.getDept());
						System.out.println("Location: "+s.getAddress());
						System.out.println("Start Date: "+s.getS_date());
						System.out.println("End Date: "+s.getE_date());
						
						System.out.println("--------****------****--------");
					});
					break;
					
				case 2:
					
					System.out.println("Enter Offer Price:");
					int op = sc.nextInt();

					System.out.println("Enter Bid connection Id with respective Tender:");
					int bt = sc.nextInt();
					
					System.out.println("Enter Your Vendor Id:");
					int vi = sc.nextInt();
					
					Bids_DAO dao3 = new Bids_DAO_Impl();
					
					String results = dao3.bidAgainstTender(op, bt,vi, "Not Selected" );
					
					System.out.println(results);
					break;
					
				case 3:
					System.out.println("Enter Bid No:");
					int br = sc.nextInt();
					
					System.out.println("Enter Bid connection Id with respective Tender:");
					int bt2 = sc.nextInt();
					
					Bids_DAO dao7 = new Bids_DAO_Impl();
					
					List<Bids> list6 = dao7.viewAllBidsByBid_No_Tender(br, bt2);
					
					list6.forEach(s-> {
						
						System.out.println("Bid No.: "+s.getBid_no());
						System.out.println("Offer Price: "+s.getOfferPrice());
						System.out.println("Bid tender Id: "+s.getBid_tender());
						System.out.println("Bid Vendor Id: "+s.getBid_vendor());
						System.out.println("Bid Status: "+s.getStatus());
						
						System.out.println("---------------------------");
						
					});
					break;
					
					
				case 4:
					System.out.println("Enter Your Vendor Id:");
					int yvi = sc.nextInt();
					
					Bids_DAO dao8 = new Bids_DAO_Impl();
					
					List<Bids> list7 = dao8.ViewOwnBidHistory(yvi);
					
					list7.forEach(s-> {
						
						System.out.println("Bid No.: "+s.getBid_no());
						System.out.println("Offer Price: "+s.getOfferPrice());
						System.out.println("Bid tender Id: "+s.getBid_tender());
						System.out.println("Bid Vendor Id: "+s.getBid_vendor());
						
						System.out.println("---------------------------");
						
					});
					break;
					
					
				case 5:
					System.out.println("Thankyou!\n");
					Multicases.main(args);
				
				}//sw
				
			   }//wi
				
			 }//if
			
			
		}//msw
		
		

	}//main

}























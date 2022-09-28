package com.ketan.dataBase.object;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ketan.Utility.DataBaseUtility;

public class Vendor_DAO_Impl implements Vendor_DAO {

	@Override
	public String registerVendor(String aemail,String apassword,String name,int gst_no, String edate, String email, String password, int signature_id) {
		String status = "Not Inserted..";
		
		try(Connection conn = DataBaseUtility.provideTenderConnection()) {
			
			PreparedStatement ps1 = conn.prepareStatement("select * from administrator where email = ?");
			
			ps1.setString(1, aemail);
			
			ResultSet rs1 = ps1.executeQuery();
			
			if(rs1.next()) {
				
				PreparedStatement ps2 = conn.prepareStatement("select * from administrator where password = ?");
				
				ps2.setString(1, apassword);
				
				ResultSet rs2 = ps2.executeQuery();
				
				if(rs2.next()) {
					
					PreparedStatement ps3 = conn.prepareStatement("insert into vendor(vname,GST_no,edate,email,password,signature_id) values(?,?,?,?,?,?)");
					
					ps3.setString(1, name);
					ps3.setInt(2, gst_no);
					ps3.setString(3, edate);
					ps3.setNString(4, email);
					ps3.setString(5, password);
					ps3.setInt(6, signature_id);
					
					int x = ps3.executeUpdate();
					
					if(x>0)
						status = "Registered Successfully...";
					
				}else {
					System.out.println("Password Incorrect...");
				}
				
			}else {
				System.out.println("User does not exist..");
			}
			
			
		} catch (SQLException e) {
			status = e.getMessage();
		}
		
		
		
		
		
		return status;
	}
	

}

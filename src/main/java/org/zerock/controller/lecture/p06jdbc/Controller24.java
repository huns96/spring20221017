package org.zerock.controller.lecture.p06jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.lecture.Customer;

@Controller
@RequestMapping("ex24")
public class Controller24 {
	
	@Autowired
	private DataSource dataSource;

	@GetMapping("sub01")
	public void listAllCustomers(@ModelAttribute("customerList") ArrayList<Customer> list) throws Exception{
		
		String sql = "SELECT CustomerID id, CustomerName name, ContactName, Address, City, Postalcode, Country, FROM Customers, ORDER BY CustomerID DESC";
		
		try (Connection con = dataSource.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);){
					
			while (rs.next()) {
				Customer c = new Customer();
				c.setName(rs.getString("name"));
				c.setAddress(rs.getString("address"));
				c.setCity(rs.getString("city"));
				c.setCountry(rs.getString("country"));
				c.setPostalCode(rs.getString("postalCode"));
				c.setId(rs.getInt("id"));
				c.setContactName(rs.getString("contactName"));
				
				list.add(c);
			}
		}
	}
	
	@GetMapping("sub02")
	public String listCustomers(
			@RequestParam(name = "page", defaultValue="1") int page,
			@ModelAttribute("customerList") ArrayList<Customer> list,
			@ModelAttribute("pageInfo") HashMap<String, Object> pageInfo) throws Exception {
		String sql = "SELECT "
				+ "CustomerID id, "
				+ "CustomerName name, "
				+ "ContactName, "
				+ "Address, "
				+ "City, "
				+ "PostalCode, "
				+ "Country "
				+ "FROM Customers "
				+ "ORDER BY CustomerID DESC "
				+ "LIMIT ?, ?";
		
		try (Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setInt(1, (10 * (page - 1)));
			pstmt.setInt(2, 10);
			
			try (ResultSet rs = pstmt.executeQuery();) {
				while (rs.next()) {
					Customer c = new Customer();
					c.setName(rs.getString("name"));
					c.setAddress(rs.getString("address"));
					c.setCity(rs.getString("city"));
					c.setCountry(rs.getString("country"));
					c.setPostalCode(rs.getString("postalCode"));
					c.setId(rs.getInt("id"));
					c.setContactName(rs.getString("contactName"));
					
					list.add(c);
				}
				
			}
			
		}
		
		pageInfo.put("current", page);
		return "ex24/sub01";
	}
	
	
	
}

















package org.zerock.mapper.lecture;

import java.time.LocalDate;

import org.apache.ibatis.annotations.Select;

public interface Mapper01 {

	@Select("SELECT NOW()")
	public String getCurrentTime();
	
	@Select("SELECT CustomerName FROM w3schools.Customers WHERE CustomerID = 1")
	public String getCustomerName();
	
	public String getEmployeeName();
	
	public String getProductName();
	
	public double getPrice();
	
	public int getQuantity();
	
	public LocalDate getBirthDate();
}

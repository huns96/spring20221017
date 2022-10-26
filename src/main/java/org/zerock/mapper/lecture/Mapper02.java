package org.zerock.mapper.lecture;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

public interface Mapper02 {
	
	List<String> getCustomerNames();
	
	List<String> getCustomerIds();
	
	List<Double> getProductPrices();
	
	List<LocalDate> getBirthDate();
	
}

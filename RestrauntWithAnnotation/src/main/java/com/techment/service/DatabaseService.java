package com.techment.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.techment.model.iHotDrink;
import com.techment.model.iSoftDrink;

@Service
public class DatabaseService {

	@Autowired
	@Qualifier("milk")
	iHotDrink hotdrink;
	
	@Autowired
	@Qualifier("pepsi")
	iSoftDrink softdrink;
	
	public void details()
	{
		hotdrink.drink();
		softdrink.drink();
	}
	
	
}

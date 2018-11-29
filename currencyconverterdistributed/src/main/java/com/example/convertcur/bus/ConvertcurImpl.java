package com.example.convertcur.bus;

import com.example.convertcur.model.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.xml.transform.Result;
import com.example.convertcur.model.*;


public class ConvertcurImpl {
	private Map<String, ArrayList> currenciesMap = new HashMap<>();
	private ArrayList<Convert> list;
	
	public ConvertcurImpl() {
		Convert myrMalaysia0= new Convert( "SKW", 267.73);
		Convert myrMalaysia1 = new Convert( "RR", 15.81);
		Convert myrMalaysia2 = new Convert( "PS", 0.19);
		
		list = new ArrayList<>();
		list.add(myrMalaysia0);
		list.add(myrMalaysia1);
		list.add(myrMalaysia2);
		currenciesMap.put("RM", list);
		
		Convert UnitedStateDollar0= new Convert( "HKD", 0.782);
		Convert UnitedStateDollar1 = new Convert( "MYR", 4.19);
		Convert UnitedStateDollar2 = new Convert( "JY", 113.31);
		
		list = new ArrayList<>();
		list.add(UnitedStateDollar0);
		list.add(UnitedStateDollar1);
		list.add(UnitedStateDollar2);
		currenciesMap.put("USD", list);
		
		Convert UnitedArabEmirates0 = new Convert( "SGD", 0.37);
		Convert UnitedArabEmirates1 = new Convert( "RM", 1.14);
		Convert UnitedArabEmirates2 = new Convert( "IDR", 3902.96);
		
		list = new ArrayList<>();
		list.add(UnitedArabEmirates0);
		list.add(UnitedArabEmirates1);
		list.add(UnitedArabEmirates2);
		currenciesMap.put("UAE", list);
		
		
	}
	
	public ArrayList getCurrencyResult (String denomination) {
		return currenciesMap.get(denomination);
	}


}

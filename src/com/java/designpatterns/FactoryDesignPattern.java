package com.java.designpatterns;

//Defining a abstract class or interface for creating an object  but let sub classes decide which classes to instantiate.
public class FactoryDesignPattern {//Also called as Virtual Constructor

	public CellularPlan getPlan(String planType) {
		if(planType==null) {
			return null;
		}else if(planType.equalsIgnoreCase("AbcNetwork")) {
			return new AbcNetwork();
		}else if(planType.equalsIgnoreCase("XyzNetwork")) {
			return new XyzNetwork();
		}
		return null;
	}
	
	
	
	public static void main(String[] args) {
		FactoryDesignPattern phoneBill=new FactoryDesignPattern();
		CellularPlan bill=phoneBill.getPlan("AbcNetwork");
		bill.getRate();
		bill.processBill(100);
		
	}
}
abstract class CellularPlan {

	protected double rate;
	abstract void getRate();
	void processBill(int minute) {
		System.out.println(rate*minute);
	}
}

class XyzNetwork extends CellularPlan {
	@Override
	void getRate() {
		super.rate = 1.50;

	}

}
class AbcNetwork extends CellularPlan{

	@Override
	public void getRate() {
		rate=1.50;
		
	}

}

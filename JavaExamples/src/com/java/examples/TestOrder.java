package com.java.examples;

public class TestOrder {
	
	public void getOrder(int orderId) throws OrderNotFoundException {
		
		if(orderId==101) {
			throw new OrderNotFoundException("Order is not found for "+orderId);
		}
	}
	public static void main(String[] args) {
		TestOrder order=new TestOrder();
		try {
			order.getOrder(101);
		} catch (OrderNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

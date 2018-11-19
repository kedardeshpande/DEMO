package com.test.observer.demo;

public class GrabDemo {

	public static void main(String[] args) {
		
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver so1 = new StockObserver(stockGrabber);
		stockGrabber.setApplPrice(10);
		stockGrabber.setGoogPrice(20);
		stockGrabber.setIbmPrice(30);
		
		StockObserver so2 = new StockObserver(stockGrabber);
		stockGrabber.setApplPrice(20);
		stockGrabber.setGoogPrice(40);
		stockGrabber.setIbmPrice(56);
	}

}

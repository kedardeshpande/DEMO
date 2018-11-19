package com.test.observer.demo;

public class StockObserver implements Observer {

	private int ibmPrice;
	private int googPrice;
	private int applPrice;
	public static int observerIDTracker = 0;
	
	private int observerID;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber)
	{
		this.stockGrabber = stockGrabber;
		this.observerID = ++ observerIDTracker;
		System.out.println("New observer:"+this.observerID);
		stockGrabber.register(this);
	}
	public void update(int ibmPrice, int googPrice, int applPrice) {
		this.ibmPrice = ibmPrice;
		this.googPrice = googPrice;
		this.applPrice = applPrice;
		printStock();

	}
	private void printStock() {
		System.out.println("Observer Id:"+this.observerID+"\n IBM:"+this.ibmPrice+"\n Google:"+this.googPrice+"\n Apple:"+this.applPrice);
		
	}

}

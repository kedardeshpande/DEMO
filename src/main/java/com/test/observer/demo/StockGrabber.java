package com.test.observer.demo;

import java.util.ArrayList;

public class StockGrabber implements Subject {
	
	private ArrayList<Observer> observers;
	private int ibmPrice;
	private int googPrice;
	private int applPrice;

	public void register(Observer o) {
		observers.add(o);

	}

	public void unRegister(Observer o) {
		observers.remove(o);
		System.out.println("Observer unRegistered:"+o);

	}

	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}

	public int getIbmPrice() {
		return ibmPrice;
	}

	public void setIbmPrice(int ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public int getGoogPrice() {
		return googPrice;
	}

	public void setGoogPrice(int googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}

	public int getApplPrice() {
		return applPrice;
	}

	public void setApplPrice(int applPrice) {
		this.applPrice = applPrice;
		notifyObserver();
	}

	public void notifyObserver() {
		for(Observer o: observers)
		{
			o.update(ibmPrice, googPrice, applPrice);
		}

	}

}

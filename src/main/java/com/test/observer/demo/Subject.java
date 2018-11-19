package com.test.observer.demo;

public interface Subject  {
	
	void register(Observer o);
	void unRegister(Observer o);
	void notifyObserver();
	
}

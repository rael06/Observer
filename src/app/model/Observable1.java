package app.model;

import core.Observable;

public class Observable1 {
	
	private Observable<Observable1> observable = new Observable<>();
	
	public Observable<Observable1> getObservable() {
		return observable;
	}

	public void event() {
		observable.notifyObservers(this);
	}
}

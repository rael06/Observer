package app.model;

import core.Observable;

public class Observable2 {
	
	private Observable<Observable2> observable = new Observable<>();
	
	public Observable<Observable2> getObservable() {
		return observable;
	}

	public void event() {
		observable.notifyObservers(this);
	}
}

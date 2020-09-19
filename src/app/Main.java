package app;

import app.model.Observable1;
import app.model.Observable2;
import app.model.Observer1;
import app.model.Observer2;

public class Main {
	public static void main(String[] args) {
		Observer1 observer1 = new Observer1();
		Observer2 observer2 = new Observer2();
		
		Observable1 observable1 = new Observable1();
		Observable2 observable2 = new Observable2();		
		
		observable1.getObservable().addObserver(observer1.getObserverOfObservable1());
		observable2.getObservable().addObserver(observer1.getObserverOfObservable2());
		
		observable1.getObservable().addObserver(observer2.getObserverOfObservable1());
		observable2.getObservable().addObserver(observer2.getObserverOfObservable2());
		
		observable1.event();
		observable2.event();
	}
}

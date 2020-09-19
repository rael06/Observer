package app.model;

import core.Observer;

public class Observer1 {

	private ObserverOfObservable1 observerOfObservable1 = new ObserverOfObservable1(this);
	private ObserverOfObservable2 observerOfObservable2 = new ObserverOfObservable2(this);

	public ObserverOfObservable1 getObserverOfObservable1() {
		return observerOfObservable1;
	}

	public ObserverOfObservable2 getObserverOfObservable2() {
		return observerOfObservable2;
	}

	public static class ObserverOfObservable1 extends Observer<Observer1, Observable1> {

		protected ObserverOfObservable1(Observer1 observer) {
			super(observer);
		}

		@Override
		public void update(Observable1 observable) {
			System.out.println(observer.getClass().getSimpleName() + " a reçu l'évènement de "
					+ observable.getClass().getSimpleName());
		}
	}

	public static class ObserverOfObservable2 extends Observer<Observer1, Observable2> {

		protected ObserverOfObservable2(Observer1 observer) {
			super(observer);
		}

		@Override
		public void update(Observable2 observable) {
			System.out.println(observer.getClass().getSimpleName() + " a reçu l'évènement de "
					+ observable.getClass().getSimpleName());
		}
	}
}

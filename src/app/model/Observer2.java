package app.model;

import core.Observer;

public class Observer2 {

	private ObserverOfObservable1<Observer2> observerOfObservable1 = new ObserverOfObservable1<Observer2>(this);
	private ObserverOfObservable2<Observer2> observerOfObservable2 = new ObserverOfObservable2<Observer2>(this);

	public ObserverOfObservable1<Observer2> getObserverOfObservable1() {
		return observerOfObservable1;
	}

	public ObserverOfObservable2<Observer2> getObserverOfObservable2() {
		return observerOfObservable2;
	}

	public static class ObserverOfObservable1<T> extends Observer<T, Observable1> {

		protected ObserverOfObservable1(T observer) {
			super(observer);
		}

		@Override
		public void update(Observable1 observable) {
			System.out.println(observer.getClass().getSimpleName() + " a reçu l'évènement de "
					+ observable.getClass().getSimpleName());
		}
	}

	public static class ObserverOfObservable2<T> extends Observer<T, Observable2> {

		protected ObserverOfObservable2(T observer) {
			super(observer);
		}

		@Override
		public void update(Observable2 observable) {
			System.out.println(observer.getClass().getSimpleName() + " a reçu l'évènement de "
					+ observable.getClass().getSimpleName());
		}
	}
}

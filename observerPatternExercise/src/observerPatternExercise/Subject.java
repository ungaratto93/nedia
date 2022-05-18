package observerPatternExercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.logging.Logger;

public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers() {
		ListIterator<Observer> iterators = observers.listIterator(0);
		int index = 0;
		try {
			while(iterators.next() != null) {
				Observer observer = observers.get(index);
				System.out.println("[Notify] Observer " + index);
				observer.update(this);
				++index;
			}
		} catch(NoSuchElementException e) {
			System.out.println("No such element");
		}

	}
}

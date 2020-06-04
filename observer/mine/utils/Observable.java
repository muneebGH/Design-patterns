package observer.mine.utils;


import java.util.HashSet;
import java.util.Set;

public class Observable {
    private boolean isChanged;
    private Set<Observer> observers;

    public Observable() {
        observers = new HashSet<>();
        isChanged = false;
    }

    public void addObserver(Observer o) {
        if (o == null) {
            throw new NullPointerException("Observer trying to add is null");
        }
        observers.add(o);
    }

    public int countObservers() {
        return observers.size();
    }

    public void deleteObservers() {
        observers = new HashSet<>();

    }

    public void deleteObserver(Observer o) {
        if (o == null) {
            return;
        }

        if (observers.contains(o)) {
            observers.remove(o);
        }
    }


    protected void setChanged() {
        isChanged = true;
    }

    protected void clearChanged() {
        isChanged = false;
    }

    public boolean hasChanged() {
        return isChanged;
    }

    public void notifyObservers(Object arg) {

        if (hasChanged()) {
            for (Observer o : observers) {
                o.update(this, arg);
            }
            clearChanged();
        }

    }

    public void notifyObservers() {
        notifyObservers(null);
    }

}

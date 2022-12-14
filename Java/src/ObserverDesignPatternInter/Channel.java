package ObserverDesignPatternInter;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	List<Subscriber> subs = new ArrayList<>();
	String title;

	@Override
	public void subcribe(Subscriber sub) {
		subs.add(sub);
	}

	@Override
	public void unSubscribe(Observer sub) {
		subs.remove(sub);
	}

	@Override
	public void notifySubscribers() {
		for (Observer sub : subs) {
			sub.update();
		}
	}

	@Override
	public void upload(String title) {
		this.title = title;
		notifySubscribers();

	}

}

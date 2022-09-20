package ObserverDesignPatternInter;

public interface Subject {   //channel

	void subcribe(Subscriber sub);

	void unSubscribe(Observer sub);

	void notifySubscribers();

	void upload(String title);

}
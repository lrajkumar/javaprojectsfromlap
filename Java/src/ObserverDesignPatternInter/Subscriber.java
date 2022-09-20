package ObserverDesignPatternInter;

public class Subscriber implements Observer {
	private String name;
	private Channel channel = new Channel();    //

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("Hey " + name + " Video Uploded: " + channel.title);
	}

	@Override
	public void subcribeChannel(Channel ch) {
		this.channel = ch;
	}

}

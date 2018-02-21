package prob07;

public class TV {
	//TV tv = new TV( 7, 20, false);
	private int channel;
	private int volume;
	private boolean power;
	
	public TV() {
	
	}

	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void channel(int channel) {
		if(channel == 0)
			channel = 255;
		this.channel = channel;
	}
	
	public void channel(boolean channel) {
		if(channel) {
			if(this.channel == 255) {
				this.channel = 0;
			}
			this.channel++;
		}
		else {
			if(this.channel == 0) {
				this.channel = 256;
			}
			this.channel--;
		}
	}
	
	public void power(boolean power) {
		this.power = power;
	}
	
	public void volume(int volume) {
		if(volume >= 100)
			volume = 100;
		this.volume = volume;
	}
	
	public void volume(boolean volume) {
		if(volume)
			this.volume++;
		else
			this.volume--;
	}
	
	public void status() {
		System.out.println("TV[channel="+channel+
						   ", volume="+volume+
						   ", power="+power+"]");	
	}
}

import java.util.Random;
public class Sensor {
	private int temp ;
	private int wind;
	private int time ;
	
	public Sensor() {}
	
	public Sensor(int temp, int wind, int time) {
		this.temp = temp;
		this.time = time;
		this.wind = wind;
	}

	public int getTemp() {
		Random random = new Random();
		int temp = random.nextInt(50);
		return temp;
	}
	public int getTime() {
		Random random = new Random();
		int time = random.nextInt(50);
		return time;
	}
	public int getWind() {
		Random random = new Random();
		int wind = random.nextInt(50);
		return wind;
	}
}

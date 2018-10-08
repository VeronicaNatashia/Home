import javax.swing.*;

public class View {
	public View() {
		
	}
	
	static Time time1 = new Time(1600); 
	static Temp temp1 = new Temp(20);
	static Wind wind1 = new Wind(11);
	static int timenow = time1.getTime();
	static int tempnow = temp1.getTemp();
	static int windnow = wind1.getWind();
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JLabel timeLabel = new JLabel("Time: "+timenow);
		JLabel tempLabel = new JLabel("Temp: "+tempnow+"C");
		JLabel windLabel = new JLabel("Wind: "+windnow+"km/h");
		JLabel acLabel = new JLabel("AC: ");
		JLabel acOption = new JLabel();
		if(tempnow > 23) {
			acOption.setText("On");
		}else {
			acOption.setText("Off");
		}
		JLabel blindsLabel = new JLabel("Blinds: ");
		JLabel blindsOption = new JLabel();
		if(timenow <= 1700) {
			blindsOption.setText("Open");
		}else {
			blindsOption.setText("Close");
		}
		frame.setLayout(null);
		
		timeLabel.setBounds(0, 0, 100, 50);
		tempLabel.setBounds(0, 30, 100, 50);
		windLabel.setBounds(0, 60, 100, 50);
		acLabel.setBounds(0, 90, 50, 50);
		acOption.setBounds(20, 90, 50, 50);
		blindsLabel.setBounds(100, 90, 50, 50);
		blindsOption.setBounds(140, 90, 100, 50);
		
		frame.getContentPane().add(timeLabel);
		frame.getContentPane().add(tempLabel);
		frame.getContentPane().add(windLabel);
		frame.getContentPane().add(acLabel);
		frame.getContentPane().add(acOption);
		frame.getContentPane().add(blindsLabel);
		frame.getContentPane().add(blindsOption);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 300);
	}
}

import graphics.LoginUI;

import java.awt.EventQueue;

import com.jvmhub.tutorial.App;



public class ShitMain {
	public static void main(String[] args) throws Exception {
		App.StartDB();
		//Setting.setDBType("file");
		Setting.setDB();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI frame = new LoginUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

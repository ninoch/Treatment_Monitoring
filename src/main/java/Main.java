import graphics.LoginUI;
import java.awt.EventQueue;
import com.jvmhub.tutorial.App;

public class Main {
	public static void main(String[] args) throws Exception {
		App.StartDB();
		//new Consult();
		//new Consult("nazanin");
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

package Á·Ï°;
import javax.swing.*;
public class frame {
public static void run(final JFrame f,final int w,final int l)
{
	SwingUtilities.invokeLater(new Runnable() {
		public void run()
		{
			f.setTitle(f.getClass().getSimpleName());
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(w,l);
			f.setVisible(true);
		}
	});
}
}

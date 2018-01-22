package sample;

import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;

public class SaveFile {
	public static void save(String sb) {
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("/home/me/Documents"));
		int retrival = chooser.showSaveDialog(null);
		if (retrival == JFileChooser.APPROVE_OPTION) {
			try (FileWriter fw = new FileWriter(chooser.getSelectedFile() + ".csv")) {
				fw.write(sb.toString());
				fw.flush();
				fw.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}

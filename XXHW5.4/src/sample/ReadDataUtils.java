package sample;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ReadDataUtils {

	public static File ReadFile(String dialogMEssage, JFrame parent, String fileExtensionDescription,
			String... fileExtension) {
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(fileExtensionDescription, fileExtension);
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(parent);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			System.out.println("You chose to open this file: " + chooser.getSelectedFile().getName());
			return chooser.getSelectedFile();
		}
		return null;
	}
}
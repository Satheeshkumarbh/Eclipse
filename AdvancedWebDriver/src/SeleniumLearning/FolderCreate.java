package SeleniumLearning;

import java.io.File;

public class FolderCreate {

	public static void main(String[] args) {
	File file = new File ("C:\\Users\\Satheesh\\Downloads\\selenium");
	file.mkdir();
	//file.delete();
	String S1=file.getPath();
	boolean S2=file.exists();
	System.out.println(S2);


	}

}

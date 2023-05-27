package Read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromAFile {

	public static void main(String[] args) throws IOException {
		FileReader f= new FileReader("C:\Users\user\eclipse-workspace\FILE_I_O\src\Read\test.txt");
		BufferedReader br = new BufferedReader(f);
		String line=br.readLine();
		System.out.println(line);
		f.close();

	}

}

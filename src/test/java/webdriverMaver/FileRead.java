package webdriverMaver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\ram.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		String name="ram";
		String height="5.10";
		bw.write(name);
		bw.newLine();
		bw.write("name");
		bw.newLine();
		bw.write(height);
		bw.close();
		
	}

}

package sample01;

import java.io.*;

public class FileOutputter implements Outputter {
	
	private String filePath;
	
	@Override
	public void output(String message) throws IOException {
		// TODO Auto-generated method stub
		FileWriter out = new FileWriter(filePath);
		out.write(message);
		out.close();
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	

}

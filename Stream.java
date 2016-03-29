import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Stream {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		InputStream in = new URL("https://mail.ru").openStream();
		OutputStream out = new FileOutputStream("d:\\112.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
		String str = reader.readLine();
		String lineSeparator = System.getProperty("line.separator");
		
		while(str != null){
			if (str.contains("href=")){
			checkline(str, out, lineSeparator);
			}
			str = reader.readLine();
		}
		out.flush();
		in.close();
		out.close();
	}
	public static String checkline(String str, OutputStream out, String lineSeparator) throws IOException{
		String newstr = null;
			
			int start = str.indexOf("href=");
			
		String temp = str.substring(start+6);
			
			int end = temp.indexOf("\"");
			
		newstr = str.substring(start+6, start+end+6);
		str = str.substring(start+end+6);
			// System.out.println(newstr);
			
				out.write(newstr.getBytes());
				out.write(lineSeparator.getBytes());
		
		if (str.contains("href=")){
			checkline(str, out, lineSeparator);
		}
		
		return newstr;
	}
	
}


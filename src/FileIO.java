import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;


public class FileIO extends Thread{

	private BufferedReader br;
	private BufferedWriter bw;

	public FileIO(BufferedReader br, BufferedWriter bw){
		this.br = br;
		this.bw = bw;
	}

	public void run(){
		String str;
		do {
			str = fileio();
		} while (str != null);
			str = fileio();
	}

	public synchronized String fileio(){
		String str = null;
		try {
			str = br.readLine();
			if(str != null){
				bw.write(str);
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		return str;
	}
}

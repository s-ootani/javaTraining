import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileIO extends Thread {

	private static Object lock = new Object();
	private BufferedReader br;
	private BufferedWriter bw;

	public FileIO(BufferedReader br, BufferedWriter bw) {
		this.br = br;
		this.bw = bw;
	}

	public void run() {
		while (true) {
			synchronized (lock) {
				try {
					lock.notify();
					String str = br.readLine();
					if (str == null) {
						break;
					}
					bw.write(str);
					lock.wait();
				} catch (IOException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			}
		}
	}
}

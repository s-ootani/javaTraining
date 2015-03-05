import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Ex18_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
			BufferedReader br1 = new BufferedReader(new FileReader("in1.txt"));
			BufferedReader br2 = new BufferedReader(new FileReader("in2.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));

			FileIO fio1 = new FileIO(br1, bw);
			FileIO fio2 = new FileIO(br2, bw);

			fio1.start();
			fio2.start();

			fio1.join();
			fio2.join();

			br1.close();
			br2.close();
			bw.close();

		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Java16_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
			BufferedReader br = new BufferedReader(new FileReader("input.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
			String str;

			while (true) {
				str = br.readLine();
				if (str == null)
					break;
				bw.write(str + "\n");
			}

			br.close();
			bw.close();

		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}

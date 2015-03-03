import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Ex16_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
			String str = "1,2,3,4,5,6,7,8,9,10";
			bw.write(str);
			bw.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}


	}

}

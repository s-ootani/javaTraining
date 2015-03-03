import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Java16_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("入力して下さい");
		String s;
		try {
			s = br.readLine();
			System.out.println("入力データ:" + s);
			br.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}

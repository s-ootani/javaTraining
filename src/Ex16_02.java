import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ex16_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int kisuu = 0;
		int guusuu = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("test.txt"));
			String str;
			str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, ",");

			while (st.hasMoreTokens()) {
				int tmp = Integer.parseInt(st.nextToken());
				if (tmp % 2 == 0) {
					guusuu += tmp;
				} else {
					kisuu += tmp;
				}
			}

			br.close();

			System.out.println(str + "内の奇数の合計は" + kisuu + "です。");
			System.out.println(str + "内の偶数の合計は" + guusuu + "です。");

		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}

}

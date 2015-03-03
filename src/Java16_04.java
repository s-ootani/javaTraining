import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Java16_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
			BufferedReader br = new BufferedReader(new FileReader("text.txt"));
			String str;
			String name;
			String nationality;
			int age;

			while (true) {
				str = br.readLine();

				if (str == null)
					break;

				StringTokenizer st = new StringTokenizer(str, ",");
				name = st.nextToken();
				nationality = st.nextToken();
				age = Integer.parseInt(st.nextToken());

				System.out.print("名前は" + name + "です。");
				System.out.print("国籍は" + nationality + "です。");
				System.out.println("年齢は" + age + "歳です。");
			}

			br.close();

		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}

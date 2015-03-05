package java_additional;

public class String_Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/* ＋演算子 */
		String str = "";
		for(int i = 0; i < 10; i++){
			str += i;
		}

		/* StringBuilder */
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 10; i++){
			sb.append(i);
		}
		String str2 = sb.toString();

	}

}

package java_additional;

public class String_Test2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/* ＋演算子 */
		String str = "";
		String a = "a";
		String b = "b";
		String c = "c";
		String d = "d";
		String e = "e";
		String f = "f";
		String g = "g";
		String h = "h";
		String i = "i";
		String j = "j";

		str += a;
		str += b;
		str += c;
		str += d;
		str += e;
		str += f;
		str += g;
		str += h;
		str += i;
		str += j;


		/* StringBuilder */
		StringBuilder sb = new StringBuilder();
		for(int t = 0; t < 10; t++){
			sb.append(t);
		}
		String str2 = sb.toString();
	}

}

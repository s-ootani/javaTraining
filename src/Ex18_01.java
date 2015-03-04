
public class Ex18_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		MyVector vector = new MyVector();

		/* 要素の追加 */
		for(int i = 0; i < 20; i++){
			vector.add(i, i);
		}

		/* 0番目の要素を削除 */
		vector.remove(0);

		/* 0番目の要素をコンソール出力 */
		System.out.println("0番目の要素:" + vector.get(0));

		/* 要素数をコンソール出力 */
		System.out.println("要素数     :" + vector.size());


	}

}

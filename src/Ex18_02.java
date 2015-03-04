
public class Ex18_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		MyStack stack = new MyStack();

		/* スタックに挿入 */
		for(int i = 0; i < 20; i++){
			stack.push(i);
		}

		/* スタックから5つ要素を取り出し、コンソール表示 */
		System.out.print("5個の要素 : ");
		for(int i = 0; i < 5; i++){
			System.out.print(stack.pop() + " ");
		}
		System.out.println("");

		/* 要素数をコンソール表示 */
		System.out.println("要素数    : " + stack.size());

	}

}

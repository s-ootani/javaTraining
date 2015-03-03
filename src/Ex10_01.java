interface N{
	int N = 10;
	void b();
}

public class Ex10_01 implements N{

	public void b(){
		System.out.println("bメソッド");
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("N = " + N);
		Ex10_01 inst = new Ex10_01();
		inst.b();
	}

}

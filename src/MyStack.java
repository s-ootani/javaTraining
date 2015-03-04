
public class MyStack extends MyVector {

	public void push(int n){
		//スタックに要素を入れる
		add(n, size());
	}

	public int pop(){
		//スタックの先頭要素を削除し、その要素を取り出す
		int t = get(size() - 1);
		remove(size() - 1);
		return t;
	}
}

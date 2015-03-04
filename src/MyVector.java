
public class MyVector {

	private int array[];
	private int end;		//要素数

	public MyVector(){
		//容量の初期化
		array = new int[10];
		end = 0;
	}

	public int size(){
		//要素数を返す
		return end;
	}

	public void add(int n, int index){
		//指定位置に要素を挿入する。容量がいっぱいなら容量を10増して挿入する。
		if(index < 0 || index > end){
			throw new ArrayIndexOutOfBoundsException();
		}

		if(array.length == end){
			int tmp[] = new int[array.length + 10];

			for(int i = 0; i < array.length; i++){
				tmp[i] = array[i];
			}

			array = tmp;
		}

		for(int i = end -1; i > index; i--){
			array[i + 1] = array[i];
		}

		array[index] = n;
		end++;
	}

	public void remove(int index){
		//指定位置の要素を削除する。指定位置以降の要素は左に移動する
		if(index < 0 || index >= end){
			throw new ArrayIndexOutOfBoundsException();
		}

		for(int i = index; i < end - 1; i++){
			array[i] = array[i + 1];
		}

		end--;
	}

	public int get(int index){
		//指定位置の要素を返す。
		if(index < 0 || index >= end){
			throw new ArrayIndexOutOfBoundsException();
		}
		return array[index];
	}
}

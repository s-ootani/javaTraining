interface Copy{
	public void copy();
}

interface Scanner{
	public void scan();
}

interface Print{
	//Size表示
	public void print();
}

class Printer implements Print{
	public String Size;

	Printer(String size){
		this.Size = size;
	}

	public void print(){
		System.out.print("印刷します。");
		System.out.println("  サイズ:" + Size);
	}
}

class MultiPrinter extends Printer implements Copy,Scanner{

	MultiPrinter(String size) {
		super(size);
	}

	public void copy(){
		System.out.println("コピーします。");
	}

	public void scan(){
		System.out.println("スキャンします。");
	}
}

public class Ex12_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		MultiPrinter mp = new MultiPrinter("A4");
		mp.print();
		mp.copy();
		mp.scan();

	}

}

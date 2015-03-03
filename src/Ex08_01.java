class Triangle{

	private double teihen;		//底辺
	private double takasa;		//高さ

	Triangle(double l, double h){
		this.teihen = l;
		this.takasa = h;
	}

	double result(){
		return teihen * takasa / 2.0;
	}
}


public class Ex08_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Triangle triangle = new Triangle(3.5, 5.2);
		System.out.println(triangle.result());	

	}

}

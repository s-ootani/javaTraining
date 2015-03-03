class Animal{
	int age;

	Animal(int age){
		this.age = age;
	}

	void work(){
		System.out.println("歩きます");
	}
}

class Dog extends Animal{

	Dog(int age){
		super(age);
	}

	void dogMethod(){
		super.work();
		System.out.println("噛みつきます");
	}
}

class Cat extends Animal{

	Cat(int age){
		super(age);
	}

	void catMethod(){
		super.work();
		System.out.println("ひっかきます");
	}
}

public class Ex09_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Dog dog = new Dog(8);
		Cat cat = new Cat(5);

		System.out.println("犬の年齢:" + dog.age + "歳");
		System.out.println("猫の年齢:" + cat.age + "歳");
		System.out.println("▼犬の行動");
		dog.dogMethod();
		System.out.println("▼猫の行動");
		cat.catMethod();
	}

}

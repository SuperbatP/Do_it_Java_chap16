package sec01_theneedforgeneric.EX01;
//Apple 클래스와 Apple 클래스를 담을 수 있는 클래스
class Apple{}
class Goods1{
	private Apple apple = new Apple(); //우클릭-source-getters and setters / alt+shift+s
	public Apple getApple() {return apple;}
	public void setApple(Apple apple) {this.apple = apple;}
}


//Pencil 클래스와 Pencil 클래스를 담을 수 있는 클래스
class Pencil{}
class Goods2{
	private Pencil pencil = new Pencil();
	public Pencil getPencil() {return pencil;}
	public void setPencil(Pencil pencil) {this.pencil = pencil;}	
}



public class ProblemsBeforeGeneric {
public static void main(String[] args) {
	// Goods1을 이용해 Apple 객체 추가 및 가져오기
	Goods1 goods1 = new Goods1();
	goods1.setApple(new Apple());
	Apple apple = goods1.getApple();
	
	// Goods2을 이용해 Pencil 객체 추가 및 가져오기
	Goods2 goods2 = new Goods2();
	goods2.setPencil(new Pencil());
	Pencil pencil = goods2.getPencil();
}
}

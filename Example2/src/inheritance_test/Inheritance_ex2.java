package inheritance_test;

// Tv클래스 선언
class Tv {
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

//SmartTV 클래스 선언 및 Tv클래스 상속
class SmartTV extends Tv {
	
	boolean caption;
	
	void displayCation(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	
}


public class Inheritance_ex2 {
	//상속 테스트
	public static void main(String[] args) {
		
		SmartTV stv = new SmartTV();
		stv.power = true;
		System.out.println(stv.power);
		
		stv.channel = 10;
		System.out.println(stv.channel);
		
		stv.channelUp();
		System.out.println(stv.channel);
		
		stv.channelUp();
		System.out.println(stv.channel);
		
		stv.channelDown();
		System.out.println(stv.channel);
		
		stv.caption = true;
		stv.displayCation("화면출력");
				
		
	}

}

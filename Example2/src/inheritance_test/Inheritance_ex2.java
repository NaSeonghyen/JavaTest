package inheritance_test;

// TvŬ���� ����
class Tv {
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

//SmartTV Ŭ���� ���� �� TvŬ���� ���
class SmartTV extends Tv {
	
	boolean caption;
	
	void displayCation(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
	
}


public class Inheritance_ex2 {
	//��� �׽�Ʈ
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
		stv.displayCation("ȭ�����");
				
		
	}

}

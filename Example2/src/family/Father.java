package family;

public class Father extends Family implements Job{
	public Father() {
	}
	public Father(String name) {
		super(name);
	}
	@Override
	public String work() {
		return "일하러 나간다";
	}
	
	@Override
	public String toString() {
		return super.toString()+work();
	}
}

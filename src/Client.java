
public class Client {

	public static void main(String[] args) {
		HummerH1Model h1 = new HummerH1Model();
		h1.setAlarm(false);//h1不鸣笛
		h1.run();
		HummerH2Model h2 = new HummerH2Model();
		h2.run();
	}
}

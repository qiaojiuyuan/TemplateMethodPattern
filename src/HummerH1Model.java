
public class HummerH1Model extends HummerModel{

	//不要喇叭
	private boolean alarmFlag = false;
	
	@Override
	public void start() {
		System.out.println("悍马H1发动");
	}

	@Override
	public void stop() {
		System.out.println("悍马H1停车");
	}

	@Override
	public void alarm() {
		System.out.println("悍马H1鸣笛");
	}

	@Override
	public void engineBoom() {
		System.out.println("悍马H1引擎声音是这样的");
	}
	
	@Override
	protected boolean isAlarm() {
		// TODO Auto-generated method stub
		return this.alarmFlag;
	}
	
	public void setAlarm(boolean isAlarm) {
		this.alarmFlag = isAlarm;
	}

}

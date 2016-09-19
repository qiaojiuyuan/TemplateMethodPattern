
public abstract class HummerModel {

	/**
	 * 首先这个模型要能够被发动起来，别管是手摇发动，还是电力发动，反正
	 * 是要能够发动起来
	 */
	protected abstract void start();
	
	/**
	 * 能发动，还要能停下来
	 */
	protected abstract void stop();
	/**
	 * 喇叭会出声
	 */
	protected abstract void alarm();
	/**
	 * 引擎会轰隆隆地响
	 */
	protected abstract void engineBoom();
	/**
	 * 汽车开始跑动
	 */
	public void run() {
		this.start();
		this.engineBoom();
		if(this.isAlarm()) {
			this.alarm();
		}
		this.stop();
	}
	
	//钩子方法，当有需要改变模板方法调用顺序或有哪些方法不需要每次都调用的时候使用此方法
	protected boolean isAlarm() {
		return true;
	}
}

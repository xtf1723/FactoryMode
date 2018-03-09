package func;

import entity.HighSpeedRail;
import entity.JapanHighSpeedRail;

public class JapanFactory implements MethodFactory {

	@Override
	public HighSpeedRail getHighSpeedRail() {
		return new JapanHighSpeedRail();
	}

}

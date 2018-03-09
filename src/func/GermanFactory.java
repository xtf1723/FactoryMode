package func;

import entity.GermanHighSpeedRail;
import entity.HighSpeedRail;

public class GermanFactory implements MethodFactory {

	@Override
	public HighSpeedRail getHighSpeedRail() {
		return new GermanHighSpeedRail();
	}

}

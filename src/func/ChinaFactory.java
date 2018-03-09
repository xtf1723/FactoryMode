package func;

import entity.ChinaHighSpeedRail;
import entity.HighSpeedRail;

public class ChinaFactory implements MethodFactory {

	@Override
	public HighSpeedRail getHighSpeedRail() {
		return new ChinaHighSpeedRail();
	}

}

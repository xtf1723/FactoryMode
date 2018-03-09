package abstr;

import entity.ChinaHighSpeedRail;
import entity.GermanHighSpeedRail;
import entity.HighSpeedRail;
import entity.JapanHighSpeedRail;

public class Factory extends AbstractFactory {

	@Override
	public HighSpeedRail getChinese() {
		return new ChinaHighSpeedRail();
	}

	@Override
	public HighSpeedRail getJapanese() {
		return new JapanHighSpeedRail();
	}

	@Override
	public HighSpeedRail getGerman() {
		return new GermanHighSpeedRail();
	}

}

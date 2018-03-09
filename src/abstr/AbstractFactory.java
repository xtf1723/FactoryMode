package abstr;

import entity.HighSpeedRail;

/**
 * 抽象工厂模式
 * 提供抽象方法，工厂实现类统一根据相应生产实现抽象方法，扩展容易
 */
public abstract class AbstractFactory {
	public abstract HighSpeedRail getChinese();
	public abstract HighSpeedRail getJapanese();
	public abstract HighSpeedRail getGerman();
}

package func;

import entity.HighSpeedRail;

/**
 * 工厂方法模式接口
 * 提供工厂接口，不同产品有不同的工厂实现
 */
public interface MethodFactory {
	public HighSpeedRail getHighSpeedRail();
}

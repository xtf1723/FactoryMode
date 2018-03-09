package abstr;

import entity.HighSpeedRail;

/**
 * ���󹤳�ģʽ
 * �ṩ���󷽷�������ʵ����ͳһ������Ӧ����ʵ�ֳ��󷽷�����չ����
 */
public abstract class AbstractFactory {
	public abstract HighSpeedRail getChinese();
	public abstract HighSpeedRail getJapanese();
	public abstract HighSpeedRail getGerman();
}

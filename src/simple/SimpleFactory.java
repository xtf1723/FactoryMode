package simple;

import entity.ChinaHighSpeedRail;
import entity.GermanHighSpeedRail;
import entity.HighSpeedRail;
import entity.JapanHighSpeedRail;

/**
 * �򵥹���
 * ������ͨ���߼��жϣ�������Ӧ�Ķ���
 */
public class SimpleFactory {
	public HighSpeedRail getHighSpeedRail(String name){
		if("china".equalsIgnoreCase(name)){
			return new ChinaHighSpeedRail();
		}else if("japan".equalsIgnoreCase(name)){
			return new JapanHighSpeedRail();
		}else if("german".equalsIgnoreCase(name)){
			return new GermanHighSpeedRail();
		}
		return null;
	}
}

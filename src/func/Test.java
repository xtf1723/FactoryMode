package func;
/**
 * ��������ģʽ������
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		MethodFactory m = new JapanFactory();
		System.out.println(m.getHighSpeedRail().getFeatures());
	}
}

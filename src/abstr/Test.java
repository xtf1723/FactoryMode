package abstr;
/**
 * 抽象工厂测试类
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Factory f = new Factory();
		System.out.println(f.getGerman().getFeatures());
	}
}

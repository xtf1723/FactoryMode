package simple;

import entity.HighSpeedRail;

/**
 * ≤‚ ‘ºÚµ•π§≥ß
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		SimpleFactory s = new SimpleFactory();
		HighSpeedRail h = s.getHighSpeedRail("chiNa");
		System.out.println(h.getFeatures());
	}
}

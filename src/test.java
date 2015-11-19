
public class test {

	public static void main(String[] args) {

	}

	public static int smallest(int[] x) {
		int s = x[0];
		for (int i = 0; i < x.length; i++) {
			if (x[i] < s) {
				s = x[i];
			}
		}
		return s;

	}

	public static int[] populateArray(int x, int y, int z) {
		int[] a = new int[z];
		for (int i = 0; i < z; i++) {
			a[i] = x + (int) ((y - x) * Math.random());
		}
		return a;

	}

	public static double[] populateArray(double x, double y, int z) {
		double[] a = new double[z];
		for (int i = 0; i < z; i++) {
			a[i] = x + (y - x) * Math.random();
		}
		return a;

	}

	public static int[] grow(int[] x) {
		int[] y = new int[2 * x.length];
		for (int i = 0; i < x.length; ++i) {
			y[i] = x[i];
		}
		return y;

	}

	public static int[] shrink(int[] x) {
		int[] y = new int[x.length / 2];
		for (int i = 0; i < y.length; ++i) {
			y[i] = x[i];
		}
		return y;

	}

	public static double[] grow(double[] x) {
		double[] y = new double[2 * x.length];
		for (int i = 0; i < x.length; ++i) {
			y[i] = x[i];
		}
		return y;

	}

	public static double[] shrink(double[] x) {
		double[] y = new double[x.length / 2];
		for (int i = 0; i < y.length; ++i) {
			y[i] = x[i];
		}
		return y;

	}

}

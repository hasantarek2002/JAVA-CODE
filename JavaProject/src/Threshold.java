
public class Threshold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int his[] = new int[256];
		int totalNumberOfPixel = 0;

		for (int i = 0; i < 256; i++) {
			his[i] = 0;
		}
		his[0] = 8;
		his[1] = 7;
		his[2] = 2;
		his[3] = 6;
		his[4] = 9;
		his[5] = 4;

		for (int i = 0; i < 256; i++) {
			totalNumberOfPixel += his[i];
		}
		float maxVariable = 0;
		int threshold = 0;

		for (int t = 0; t < 256; t++) {
			float wb = 0, wf = 0, mb = 0, mf = 0, sumB = 0, sumF = 0, sumN2 = 0, sumN1 = 0, betweenVariance = 0;
			for (int i = 0; i < t; i++) {
				sumN1 += his[i];
				sumB = sumB + (i * his[i]);

			}
			wb = sumN1 / totalNumberOfPixel;
			if (wb == 0)
				continue;
			mb = sumB / sumN1;

			for (int i = t; i < 256; i++) {
				sumN2 += his[i];
				sumF = sumF + (i * his[i]);

			}

			wf = sumN2 / totalNumberOfPixel;
			if (wf == 0)
				break;
			mf = sumF / sumN2;

			betweenVariance = wb * wf * (mb - mf) * (mb - mf);
			if (betweenVariance > maxVariable) {
				maxVariable = betweenVariance;
				threshold = t;
			}

		}
		
		System.out.println("threshold value is "+threshold);

	}

}

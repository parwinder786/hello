package challengesChapter5ControlFlow;

public class paint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Tested parameters are : " + getBucketCount(-3.4, 2.1, 1.5, 2));
		System.out.println("The Tested parameters are : " + getBucketCount(2.75, 3.25, 2.5, 1));
		System.out.println("The Tested parameters are : " + getBucketCount(0.75, 0.75, 0.5, 0));

		System.out.println("The Tested parameters are : " + getBucketCount(-3.4, 2.1, 1.5));
		System.out.println("The Tested parameters are : " + getBucketCount(3.4, 2.1, 1.5));
		System.out.println("The Tested parameters are : " + getBucketCount(7.5, 4.3, 2.35));

		System.out.println("The Tested parameters are : " + getBucketCount(3.4, 1.5));

		System.out.println("The Tested parameters are : " + getBucketCount(6.26, 2.2));
		System.out.println("The Tested parameters are : " + getBucketCount(3.26, 0.75));
	}

	// area = width * height
	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
			return -1;
		}
		double area = width * height; // 7.14
		double newArea = area / areaPerBucket; // 4.76

		// int neededBucket = (int) Math.round(newArea - extraBuckets);
		// The Math.ceil() method rounds a number UPWARDS to the nearest integer, and
		// returns the resul
		int neededBucket = (int) Math.ceil(newArea - extraBuckets);
		return neededBucket;

	}

	public static int getBucketCount(double width, double height, double areaPerBucket) {
		if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		double area = width * height;
		double newArea = area / areaPerBucket;
		int neededBucket = (int) Math.ceil(newArea);
		return neededBucket;
	}

	public static int getBucketCount(double area, double areaPerBucket) {
		if (area <= 0 || areaPerBucket <= 0) {
			return -1;
		}
		double newArea = area / areaPerBucket;
		int neededBucket = (int) Math.ceil(newArea);
		return neededBucket;
	}

}

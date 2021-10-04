package paintJob;

public class Main {
    public static void main(String[] args) {
        System.out.println(getBucketCount(0.0, 2.1, 1.5, 7));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket,
                                     int extraBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
            return -1;
        }
        double areaOfTheRoom = width * height;
        return (int) (Math.ceil(areaOfTheRoom / areaPerBucket - extraBucket));

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double areaOfTheRoom = width * height;
        return (int) (Math.ceil(areaOfTheRoom / areaPerBucket));
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) (Math.ceil(area / areaPerBucket));
    }
}


package exercise;

public class DistanceTwoPoint {

    public static double distance(float x_point_1, float y_point_1, float x_point_2, float y_point_2) {
        double distance = Math.sqrt(Math.pow((x_point_2 - x_point_1), 2) + Math.pow((y_point_2 - y_point_1), 2));
        return Math.round(distance*100.0) / 100.0;
    }
}

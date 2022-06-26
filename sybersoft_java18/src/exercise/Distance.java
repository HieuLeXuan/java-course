package exercise;

public class Distance {

    public static float distance(float x, float y, float x1, float y2) {
        float distance = (float) Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y2 - y), 2));
        return (float) (Math.ceil(distance * 100) / 100);
    }
}

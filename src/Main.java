public class Main {
    public static void main(String[] args) {
        // Question 1
        Vector3D vector = new Vector3D(1, 2, 3);

        // Question 2
        System.out.println(vector.getX() + " " + vector.getY() + " " + vector.getZ());

        // Question 3
        System.out.println(vector);
    }
}

class Vector3D {

    private double x, y, z;

    // Question 1
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Question 2
    public double getX() {
        return x;
    }

    // Question 2
    public double getY() {
        return y;
    }

    // Question 2
    public double getZ() {
        return z;
    }

    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }

}
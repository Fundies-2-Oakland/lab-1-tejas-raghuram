public class Main {
    public static void main(String[] args) {
        // Question 1
        Vector3D vector = new Vector3D(1, 2, 3);

        // Question 2
        System.out.println(vector.getX() + " " + vector.getY() + " " + vector.getZ());

        // Question 3
        System.out.println(vector);

        // Question 4
        System.out.println(vector.getMagnitude());

        // Question 5
        System.out.println(vector.normalize());

        // Question 6
        System.out.println(vector.add(vector));

        // Question 7
        System.out.println(vector.multiply(2));

        // Question 8
        System.out.println(vector.dotProduct(vector));

        // Question 9
        System.out.println(vector.angleBetween(new Vector3D(4, 5, 6)));
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

    // Question 4
    public double getMagnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    // Question 5
    public Vector3D normalize() {
        if (getMagnitude() == 0) {
            throw new IllegalStateException();
        } else {
            return new Vector3D(x / getMagnitude(), y / getMagnitude(), z / getMagnitude());
        }
    }

    // Question 6
    public Vector3D add(Vector3D other) {
        return new Vector3D(x + other.getX(), y + other.getY(), z + other.getZ());
    }

    // Question 7
    public Vector3D multiply(double scalar) {
        return new Vector3D(x * scalar, y * scalar, z * scalar);
    }

    // Question 8
    public double dotProduct(Vector3D other) {
        return x * other.getX() + y * other.getY() + z * other.getZ();
    }

    // Question 9
    public double angleBetween(Vector3D other) {
        if (getMagnitude() == 0 || other.getMagnitude() == 0) {
            throw new IllegalStateException();
        } else {
            return Math.toDegrees(Math.acos(dotProduct(other) / (getMagnitude() * other.getMagnitude())));
        }
    }

    // Question 3
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }

}
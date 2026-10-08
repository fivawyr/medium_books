class RangeCalc {

    RangeCalc(double speed, double angleInDegrees) {
        double angleInRads;
        double range;
        float GRAVITATION = 9.81f;
        float PI = 3.141f;

        angleInRads = angleInDegrees * PI / 180;
        range = 2 * speed * speed * Math.sin(angleInRads) * Math.cos(angleInRads) / GRAVITATION;
        System.out.println("Range = " + range + " meters");
    }

    public static void main(String[] args) {
        new RangeCalc(20, 45);
    }
}

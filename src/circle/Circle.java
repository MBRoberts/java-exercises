package circle;

/**
 * Created by M.Ben_Roberts on 11/30/16.
 */

import java.lang.Math;


class Circle {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    double getCircum() {
        return (radius * 2) * Math.PI;
    }

    double getArea() {
        return (radius * radius) * Math.PI;
    }
}

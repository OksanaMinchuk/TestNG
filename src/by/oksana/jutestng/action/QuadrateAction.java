package by.oksana.jutestng.action;

import by.oksana.jutestng.entity.Quandrate;

public class QuadrateAction {
    public int square (Quandrate quandrate) {
        int side = quandrate.getA();
        return (int)Math.pow(side, 2);
    }

    public double hypotenuse (Quandrate quandrate) {
        int side = quandrate.getA();
        return Math.hypot(side, side);
    }

    public int perimetre (Quandrate quandrate) {
        int side = quandrate.getA();
        if (side <= 0) {
            throw new IllegalArgumentException();
        }
        return  4 * side;
    }
}

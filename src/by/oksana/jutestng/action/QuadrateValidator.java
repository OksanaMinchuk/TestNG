package by.oksana.jutestng.action;

import by.oksana.jutestng.entity.Quandrate;

public class QuadrateValidator {
    public boolean isQuadrate (Quandrate quandrate) {
        return  quandrate.getA() > 0;
    }
}

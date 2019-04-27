package by.oksana.jutestng.entity;

public class Quandrate {
    private int a;

    public Quandrate(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Quandrate{" +
                "a=" + a +
                '}';
    }


}

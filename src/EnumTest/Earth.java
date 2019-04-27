package EnumTest;

import static EnumTest.Earth.*;

class EnumTest {

    public static void main(String[] args) {
       EarthCorner co1 = EarthCorner.EAST;
       EarthCorner co2 = EarthCorner.EAST;
        System.out.println(co1 == co2);

        String string1 = "jav";
        String string2 = new String(string1);
        System.out.println(string1 == string2);

        EarthCorner corner = EarthCorner.EAST;
        System.out.println(corner);


    }

}

class Earth {
    public enum EarthCorner {
        NORTH, SOUTH, EAST, WEST;
    }
}

package by.oksana.jutestng.entity;

public class Main {
    public static void main(String[] args) {


        System.out.println("a"+10+15); //a1015
        System.out.println("b"+10+15+1.8+"qwe"+00+"text");//b10151.8qwe0text
        System.out.println(10+15+1.8+"qwe"+00+"text");//26.8qwe0text

        int aa = 5_5;
        int b = 5___5;
        System.out.println(5__5);
        System.out.println(0_21);
        System.out.println(5_000.5);
        long l = 10;
        float f = 10;;

//*********************************
        double d1 = 0.023f;
            System.out.println(d1);

        Double d2 = new Double(.0f);

        //Double d3 = 0.0f; fail compile

        //Double d4 = new Double("10L"); //exeption; "10" - OK
        //  System.out.println(d4);

        Double d5 = 70.8d;
            System.out.println(d5);

        //Double d6 = 1L;  fail compile


// *********************************
        int i1 = Integer.parseInt("14");
            System.out.println(i1);

        Integer i2 = 85;
            System.out.println(i2);

        int i3 = Integer.decode("512"); //('12') -fail
            System.out.println(i3);

        int i4 = Integer.valueOf("21");
            System.out.println(i4);

       // int i5 = Integer.valueOf(null);//Exception in thread "main" java.lang.NumberFormatException: null
        //    System.out.println(i5);

        int i6 = new Integer("15");
            System.out.println(i6);

        System.out.println((true?null:0));
        System.out.println((String) null);
        System.out.println(new String("null"));
        //System.out.println((char[])null);

        Double d = Double.POSITIVE_INFINITY;
        System.out.println(d);
        System.out.println(d.intValue());
        double d7 = d.intValue() + Double.NEGATIVE_INFINITY;
        System.out.println(d7);




    }
}


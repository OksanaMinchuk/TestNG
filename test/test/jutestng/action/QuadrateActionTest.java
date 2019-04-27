package test.jutestng.action;

import by.oksana.jutestng.action.QuadrateAction;
import by.oksana.jutestng.entity.Quandrate;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class QuadrateActionTest {
//<!-- для запуска testng.xml правой кнопкой и Run '...'-->

    QuadrateAction action;

    @BeforeClass //метод сработает один раз до запуска класса
    public void setUp() {
        action = new QuadrateAction();
    }

    @Test(description = "positive test for square", enabled = true, groups = {"G1", "G2"})
    public void squarePositive () {
        Quandrate quandrate = new Quandrate(7);
     //   QuadrateAction action = new QuadrateAction();
        int actual = action.square(quandrate);
        int expected = 49;
        Assert.assertEquals(actual, expected, "test wrong because ...");
    }

    @Test(description = "positive test for hypotenuse", groups = "G1")
    public void hypotenuse () {
        Quandrate quandrate = new Quandrate(7);
    //    QuadrateAction action = new QuadrateAction();
        double actual = action.hypotenuse(quandrate);
        double expected = Math.sqrt(2) * quandrate.getA();
        Assert.assertEquals(actual, expected);
    }


    @Test(expectedExceptions = IllegalArgumentException.class, groups = "G2")
    // should have thrown an exception of class java.lang.IllegalArgumentException
    public void perimetreExeption() {
        Quandrate quandrate = new Quandrate(-7);
    //    QuadrateAction action = new QuadrateAction();
        action.perimetre(quandrate);
    }

    @Test(groups = "G1")
    public void perimetrePositive() {
        Quandrate quandrate = new Quandrate(7);
     //   QuadrateAction action = new QuadrateAction();
        try {
            int actual = action.perimetre(quandrate);
            int expected = 28;
            Assert.assertEquals(actual, expected);
        } catch (IllegalArgumentException e ) {
            Assert.fail("bacause of exeption", e);
        }
    }

    @Test(timeOut = 20, groups = "G2")
    //время выполнения превышает 20мс и тест упадет
    public void timeTest () {
        for (int i = 0; i < Short.MAX_VALUE; i++) {
    //        QuadrateAction action = new QuadrateAction();
            Quandrate quandrate = new Quandrate(700);
            action.hypotenuse(quandrate);
        }
    }

    @DataProvider(name = "perimeter") //для передачи объектов-параметров в следущий папаметризированный тест
    public Object[][] initData() {
        return new Object[][]{
            {28, new Quandrate(7)},
            {32, new Quandrate(8)},
            {800, new Quandrate(200)}
        };
    }
    //тест запустится 3 раза
    @Test(dataProvider = "perimeter")
    public void perimeterTwo (int expected, Quandrate quandrate) {
    //    QuadrateAction action = new QuadrateAction();
        try {
            int actual = action.perimetre(quandrate);
            Assert.assertEquals(actual, expected);
        } catch (IllegalArgumentException e){
            Assert.fail("test throw exeption from method");
        }
    }
//**************************************
    @DataProvider(name = "perimeterString") //для передачи объектов-параметров в следущий папаметризированный тест
    public Object[][] initDataString() {
        return new Object[][]{
                {28, new Quandrate(7), "java"},
                {32, new Quandrate(8), new String("hello") },
                {800, new Quandrate(200), null}
        };
    }
    @Test(dataProvider = "perimeterString")
    public void perimeterTwoString (int expected, Quandrate quandrate, String name) {
    //    QuadrateAction action = new QuadrateAction();
        try {
            int actual = action.perimetre(quandrate);
            Assert.assertEquals(actual, expected);
        } catch (IllegalArgumentException e){
            Assert.fail("test throw exeption from method");
        }
    }

    @AfterClass //тут можно закрывать потоки, обнулять и т.д.
    public void tierDown() {
        action = null;
    }



}

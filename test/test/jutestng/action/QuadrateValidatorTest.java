package test.jutestng.action;

import by.oksana.jutestng.action.QuadrateValidator;
import by.oksana.jutestng.entity.Quandrate;
import org.testng.Assert;
import org.testng.annotations.Test;

public class QuadrateValidatorTest {
    //<!-- для запуска testng.xml правой кнопкой и Run '...testng.xml'-->
    @Test(groups = "G2")
    public void isQuadratePositive () {
        Quandrate quandrate = new Quandrate(7);
        QuadrateValidator validator = new QuadrateValidator();
        boolean condition = validator.isQuadrate(quandrate);
        Assert.assertTrue(condition);
    }

    @Test(groups = "G2")
    public void isQuadrateNegative () {
        Quandrate quandrate = new Quandrate(-7);
        QuadrateValidator validator = new QuadrateValidator();
        boolean condition = validator.isQuadrate(quandrate);
        Assert.assertFalse(condition);
    }
}

package gab;

import org.junit.Assert;
import org.junit.Test;

public class CurrencyConverterTest {



    @Test
    public void whenToUnitIsNullShouldReturnValue() {
        double eur = CurrencyConverter.toUnit(1000.0, null);

        Assert.assertEquals(1000., eur, 0.1);
    }

    @Test
    public void shouldConvertToEUR() {
        double eur = CurrencyConverter.toUnit(1000.0, "EUR");

        Assert.assertEquals(1000., eur, 0.1);
    }

    @Test
    public void shouldConvertToKEUR() {
        double keur = CurrencyConverter.toUnit(1000.0, "KEUR");

        Assert.assertEquals(1., keur, 0.1);
    }

    @Test
    public void shouldConvertTo_keur() {
        double keur = CurrencyConverter.toUnit(1000.0, "keur");

        Assert.assertEquals(1., keur, 0.1);
    }

    @Test
    public void shouldConvertToMEUR() {
        double keur = CurrencyConverter.toUnit(1000000.0, "MEUR");

        Assert.assertEquals(1., keur, 0.1);
    }

    @Test
    public void shouldConvertToBEUR() {
        double keur = CurrencyConverter.toUnit(1000000000.0, "BEUR");

        Assert.assertEquals(1., keur, 0.1);
    }

    @Test
    public void shouldConvertToDOL() {
        double eur = CurrencyConverter.toUnit(1000.0, "DOL");

        Assert.assertEquals(1000., eur, 0.1);
    }

    @Test
    public void shouldConvertToKDOL() {
        double keur = CurrencyConverter.toUnit(1000.0, "KDOL");

        Assert.assertEquals(1., keur, 0.1);
    }

    @Test
    public void shouldConvertToMDOL() {
        double keur = CurrencyConverter.toUnit(1000000.0, "MDOL");

        Assert.assertEquals(1., keur, 0.1);
    }

    @Test
    public void shouldConvertToBDOL() {
        double keur = CurrencyConverter.toUnit(1000000000.0, "BDOL");

        Assert.assertEquals(1., keur, 0.1);
    }

    @Test
    public void whenFromUnitIsNullShouldReturnValue() {
        double eur = CurrencyConverter.fromUnit(1., null);

        Assert.assertEquals(1., eur, 0.1);
    }

    @Test
    public void shouldConvertFromEUR() {
        double eur = CurrencyConverter.fromUnit(1., "EUR");

        Assert.assertEquals(1., eur, 0.1);
    }

    @Test
    public void shouldConvertFrom_keur() {
        double keur = CurrencyConverter.fromUnit(1.0, "keur");

        Assert.assertEquals(1000., keur, 0.1);
    }

    @Test
    public void shouldConvertFromKEUR() {
        double eur = CurrencyConverter.fromUnit(1., "KEUR");

        Assert.assertEquals(1000., eur, 0.1);
    }

    @Test
    public void shouldConvertFromMEUR() {
        double eur = CurrencyConverter.fromUnit(1., "MEUR");

        Assert.assertEquals(1000000., eur, 0.1);
    }

    @Test
    public void shouldConvertFromBEUR() {
        double eur = CurrencyConverter.fromUnit(1., "BEUR");

        Assert.assertEquals(1000000000., eur, 0.1);
    }

    @Test
    public void shouldConvertFromDOL() {
        double dol = CurrencyConverter.fromUnit(1., "DOL");
        Assert.assertEquals(1., dol, 0.1);
    }


    @Test
    public void shouldConvertFromKDOL() {
        double kdol = CurrencyConverter.fromUnit(1., "KDOL");
        Assert.assertEquals(1000., kdol, 0.1);
    }

    @Test
    public void shouldConvertFromMDOL() {
        double mdol = CurrencyConverter.fromUnit(1., "MDOL");
        Assert.assertEquals(1000000., mdol, 0.1);
    }

    @Test
    public void shouldConvertFromBDOL() {
        double bdol = CurrencyConverter.fromUnit(1., "BDOL");

        Assert.assertEquals(1000000000., bdol, 0.1);
    }

}

package gab;

public class CurrencyConverter {



    public static double toUnit(double value, String unit) {

        if (unit != null) {
            String upperCaseUnit = unit.toUpperCase();

            if (upperCaseUnit.startsWith("K")) {
                return value / 1000;
            } else if (upperCaseUnit.startsWith("M")) {
                return value / 1000000;
            } else if (upperCaseUnit.startsWith("B")) {
                return value / 1000000000;
            }
        }

        return value;
    }



    public static double fromUnit(double value, String unit) {

        if (unit != null) {
            String upperCaseUnit = unit.toUpperCase();

            if (upperCaseUnit .startsWith("K")) {
                return value * 1000;
            } else if (upperCaseUnit .startsWith("M")) {
                return value * 1000000;
            } else if (upperCaseUnit .startsWith("B")) {
                return value * 1000000000;
            }
        }

        return value;
    }
}



package com.yuliiakulyk.app.homework.lesson4;
import java.math.BigDecimal;
import java.math.RoundingMode;
import static java.lang.System.out;

/**
 * Created by 123 on 15.10.2016.
 */
public class BiologyCalc {
    public double getIdealWeight (int height, String gender) {
        double idealWeight;
        if (gender.equals("male")) {
            idealWeight =  (height - 100)*1.15;
        } else {
            idealWeight = (height - 110)*1.15;
        }
        out.println("Ideal weight for a " + gender + " of " + height + " cm height is " + idealWeight + " kg.");
        return idealWeight;
    }
    public double getWaterNorm (String gender, double weight) {
        double waterNorm;
        if (gender.equals("male")) {
            waterNorm = new BigDecimal(weight*35/1000).setScale(1, RoundingMode.HALF_UP).doubleValue();
        } else {
            waterNorm = new BigDecimal(weight*31/1000).setScale(1, RoundingMode.HALF_UP).doubleValue();
        }
        waterNorm = new BigDecimal (waterNorm).setScale(1, RoundingMode.HALF_UP).doubleValue();
        out.println("Water norm for a " + gender + " of " + weight + " kg weight is " + waterNorm + " litres.");
        return waterNorm;
    }
}

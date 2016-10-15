package com.yuliiakulyk.app.homework.lesson4;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by 123 on 15.10.2016.
 */
public class BiologyCalc {
    public int getIdealWeight (double height, String gender) {
        int idealWeight;
        if (gender.equals("male")) {
            idealWeight = (int) Math.round((height - 100)*1.15);
        } else {
            idealWeight = (int) Math.round((height - 110)*1.15);
        }
        return idealWeight;
    }
    public double getWaterNorm (String gender, double weight) {
        double waterNorm;
        if (gender.equals("male")) {
            waterNorm = new BigDecimal(weight*35/1000).setScale(1, RoundingMode.HALF_UP).doubleValue();
        } else {
            waterNorm = new BigDecimal(weight*31/1000).setScale(1, RoundingMode.HALF_UP).doubleValue();
        }
        return waterNorm;
    }
}

public class Calculation {
    public static double fee(double s, boolean isTheWeatherBad, boolean isNight) throws IllegalArgumentException {
        double total = 0;
        if (s < 0) {throw new IllegalArgumentException("Input không hợp lệ");}
        else {
            total = 12000;
            if (isTheWeatherBad) {total += 5000;}
            if (isNight) {total += 10000;}
            if (s > 2) {total += 4000 * (s - 2);}            
        }
        return total;
    }
}
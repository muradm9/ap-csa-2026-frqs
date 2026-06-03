public class Bottle
{
    private double volume;
    private double currentAmount;

    public Bottle(double v) {
        volume = v;
        currentAmount = v;
    }

    public double updateAmount(double minus) {
        double temp = volume * 0.25;
        currentAmount -= minus;
        if (currentAmount < temp) {
            currentAmount = volume;
        }
        return currentAmount;
    }
}
package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double tempFahr = temperatureCelsius*1.8 + 32;
        System.out.println(tempFahr);
    }
}

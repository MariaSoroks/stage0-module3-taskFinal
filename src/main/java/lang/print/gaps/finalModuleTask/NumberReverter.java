package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int a = number/100;
        int b = (number%100)/10;
        int c = (number%100)%10;
        int invert = c*100 + b*10 + a;
        System.out.println(invert);
    }
}

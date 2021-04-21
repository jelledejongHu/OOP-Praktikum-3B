public class Cirkel {
    private int radious;
    private int xPositie;
    private int yPositie;

    public Cirkel(int rad, int x, int y){
        radious = rad;
        xPositie = x;
        yPositie = y;

        if(radious <= 0){
            throw new IllegalArgumentException("Radious moet groter zijn dan 0!");
        }
    }

    public String toString(){
        return "Cirkel ( " + xPositie + ", " + yPositie + ") met een radious van " + radious;
    }

}

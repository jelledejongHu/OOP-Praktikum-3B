public class Main {

    public static void main(String[] args) {
	// write your code here
        Cirkel C1 = null, C2 = null;


        try {
            C1 = new Cirkel(10,0,0);
            C2 = new Cirkel(0,10,10);
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }

        System.out.println(C1);
        System.out.println(C2);
    }
}

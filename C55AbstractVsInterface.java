import java.util.function.BiConsumer;
//Interface isliye banaya gya taki ek se jayada template bana sake;

interface Bicycle {
    int a = 45;          //properties   this is final 

    void applyBrake(int decrement);

    void speedup(int increment);

    interface HornBicycle {
        int b = 45;

        void blowhornkgf2(int decrement);   //Methods in interface are public by defualt

        void blowhornkgf(int increment);

    }

    class AvonCycle implements Bicycle, HornBicycle { // Bicycle ek interface hai or Avoncycle usko implements kr rahi
                                                   // hai to
        void blowhorn() { // usme interface ke saare methods hone chahiye or unki body bhi sath hi public
                          // karne padenge
            System.out.println("peeee   pooooo");
        }

        public void applyBrake(int decrement) {
            System.out.println("heelllll");
        }

        public void speedup(int increment) {
            System.out.println("badao speed bado");
        }

        public void blowhornkgf2(int decrement) {
            System.out.println("dhan dhana dhan dhan");
        }

        public void blowhornkgf(int increment) {
            System.out.println("salam rocky bhai");
        }

    }

    public class C55AbstractVsInterface {
        public static void main(String[] args) {
            AvonCycle Cycleharry = new AvonCycle();
            Cycleharry.applyBrake(1);
            Cycleharry.blowhorn();
            System.out.println(a); // as it value a will not change as it declares in interfaces
            Cycleharry.speedup(4);
            Cycleharry.blowhornkgf(5);
            Cycleharry.blowhornkgf2(3);
        }
    }
}
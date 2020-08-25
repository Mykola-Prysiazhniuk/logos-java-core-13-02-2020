package home.work.hm11.Auto;

public class HelpTools {

         public static int rnd(int min, int max) {
            max -= min;
            return (int) (Math.random() * ++max) + min;
        }
}

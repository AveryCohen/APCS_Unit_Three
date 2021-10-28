public class Season {

    public static String season(int a, int b) {
        if (a >=1 && a<=3 || a==12) {
            if (a==12 && b >=21) {
                return "winter";
            }
            else if (a==3 && b <=19) {
                return "winter";
            }
            else if (a==3 && b>19) {
                return "spring";
            }
            else if (a ==12 && b <21) {
                return "fall";
            }
            else {
                return "winter";
            }
        }
    }



}

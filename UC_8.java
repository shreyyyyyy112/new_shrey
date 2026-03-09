public class UC_8 {

    // Static method for O pattern
    public static String[] getOPattern() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    // Static method for P pattern
    public static String[] getPPattern() {
        return new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };
    }

    // Static method for S pattern
    public static String[] getSPattern() {
        return new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };
    }

    public static void main(String[] args) {

        // Call helper methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Loop to print banner
        for (int i = 0; i < 7; i++) {
            System.out.println(oPattern[i] + "   "
                    + oPattern[i] + "   "
                    + pPattern[i] + "   "
                    + sPattern[i]);
        }
    }
}
public class OOPSBannerUC6 {

    public static String[] getO() {
        return new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        };
    }

    public static String[] getP() {
        return new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        };
    }

    public static String[] getS() {
        return new String[]{
                " SSSS",
                "S    ",
                " SSS ",
                "    S",
                "SSSS "
        };
    }

    public static void main(String[] args) {

        String[] O1 = getO();
        String[] O2 = getO(); 
        String[] P  = getP();
        String[] S  = getS();

        for (int i = 0; i < O1.length; i++) {
            System.out.println(O1[i] + "  " +
                               O2[i] + "  " +
                               P[i]  + "  " +
                               S[i]);
        }
    }
}

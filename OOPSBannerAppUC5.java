public class OOPSBannerAppUC5 {
    public static void main(String[] args) {
        String[] bannerLines = {
            String.join("", "*", "*", "*", "*", "*", "*", "*"),
            String.join(" ", "*", "W", "e", "l", "c", "o", "m", "e", "*"),
            String.join(" ", "*", "T", "o", "O", "O", "P", "S", "*"),
            String.join(" ", "*", "B", "a", "n", "n", "e", "r", "A", "p", "p", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*")
        };
        
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
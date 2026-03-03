public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize banner lines in a single statement
        String[] banner = {
            String.join("   ",
                    "  OOO  ",
                    " PPPP  ",
                    "  SSSS ",
                    "  SSSS "),
            
            String.join("   ",
                    " O   O ",
                    " P   P ",
                    " S     ",
                    " S     "),
            
            String.join("   ",
                    " O   O ",
                    " PPPP  ",
                    "  SSS  ",
                    "  SSS  "),
            
            String.join("   ",
                    " O   O ",
                    " P     ",
                    "     S ",
                    "     S "),
            
            String.join("   ",
                    " O   O ",
                    " P     ",
                    "     S ",
                    "     S "),
            
            String.join("   ",
                    " O   O ",
                    " P     ",
                    " S   S ",
                    " S   S "),
            
            String.join("   ",
                    "  OOO  ",
                    " P     ",
                    "  SSSS ",
                    "  SSSS ")
        };

        // Use for-each loop to print each banner line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}

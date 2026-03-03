/**
 * OOPSBannerApp UC6 - OOPS Banner Application (Use Case 6)
 * This use case implements a modular approach to generate each 
 * letter's pattern through dedicated methods.
 */
public class OOPSBannerApp {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  **** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            " ** ** ",
            "  **** "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            " ***** ",
            " ** ** ",
            " ** ** ",
            " ***** ",
            " ** ",
            " ** ",
            " ** "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            "  ***** ",
            " ** ",
            " ** ",
            "  **** ",
            "     ** ",
            "     ** ",
            " ***** "
        };
    }

    public static void main(String[] args) {
        // Declare String Arrays and call methods to populate them
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Use a loop to assemble and print each line of the banner
        // Maintaining the 7-line, 9-character width alignment
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(String.join(" ", 
                oPattern[i], 
                oPattern[i], 
                pPattern[i], 
                sPattern[i]
            ));
        }
    }
}

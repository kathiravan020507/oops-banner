import java.util.HashMap;

public class OOPSBannerApp {

    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        charMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        charMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        charMap.put(' ', new String[]{
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
        });

        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        message = message.toUpperCase();

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                System.out.print(pattern[line] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        displayBanner("OOPS", charMap);
    }
}

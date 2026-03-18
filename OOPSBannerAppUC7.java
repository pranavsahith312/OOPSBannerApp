public class OOPSBannerAppUC7 {

    /**
     * Inner class to store character and its ASCII pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Create and initialize character pattern maps
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] oPattern = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] pPattern = {
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };

        String[] sPattern = {
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };

        String[] spacePattern = {
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        };

        return new CharacterPatternMap[]{
                new CharacterPatternMap('O', oPattern),
                new CharacterPatternMap('P', pPattern),
                new CharacterPatternMap('S', sPattern),
                new CharacterPatternMap(' ', spacePattern)
        };
    }

    /**
     * Get pattern for given character
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // If not found, return space pattern
        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Print message as banner
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = charMaps[0].getPattern().length;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < message.length(); j++) {

                char ch = message.charAt(j);
                String[] pattern = getCharacterPattern(ch, charMaps);
                System.out.print(pattern[i] + "  ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        printMessage("OOPS", charMaps);
    }
}
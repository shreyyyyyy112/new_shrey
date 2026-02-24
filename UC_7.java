public class UC_7 {

   
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

    
    public static CharacterPatternMap[] createCharacterPatterns() {

        return new CharacterPatternMap[]{

                new CharacterPatternMap('O', new String[]{
                        " *** ",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*   *",
                        "*   *",
                        " *** "
                }),

                new CharacterPatternMap('P', new String[]{
                        "**** ",
                        "*   *",
                        "*   *",
                        "**** ",
                        "*    ",
                        "*    ",
                        "*    "
                }),

                new CharacterPatternMap('S', new String[]{
                        " ****",
                        "*    ",
                        "*    ",
                        " *** ",
                        "    *",
                        "    *",
                        "**** "
                }),

                new CharacterPatternMap(' ', new String[]{
                        "     ",
                        "     ",
                        "     ",
                        "     ",
                        "     ",
                        "     ",
                        "     "
                })
        };
    }

    
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return new String[7]; // fallback
    }

    
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                String[] pattern = getCharacterPattern(message.charAt(i), charMaps);
                line.append(pattern[row]).append("   ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatterns();

        printMessage("OOPS", charMaps);
    }
}
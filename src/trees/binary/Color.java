package trees.binary;

import trees.binary.search.NodeBST;

import java.util.Locale;

public enum Color {
    //Color end string, color reset
    RESET("\033[0m"),
    // Regular Colors. Normal color, no bold, background color etc.
    BLACK("\033[0;30m"),    // BLACK
    RED("\033[0;31m"),      // RED
    GREEN("\033[0;32m"),    // GREEN
    YELLOW("\033[0;33m"),   // YELLOW
    BLUE("\033[0;34m"),     // BLUE
    MAGENTA("\033[0;35m"),  // MAGENTA
    CYAN("\033[0;36m"),     // CYAN
    WHITE("\033[0;37m"),    // WHITE
    ORANGE("\033[38;5;166m");// had to find code for orange because someone didn't like it
    private final String code;

    Color(String code) {
        this.code = code;
    }

    public static Object getColor(int number) {

        switch (number) {
            case 1:
            case 8:
                return RED;
            case 2:
            case 9:
                return ORANGE;
            case 3:
            case 10:
                return BLUE;
            case 4:
            case 11:
                return GREEN;
            case 5:
            case 12:
                return YELLOW;
            case 6:
            case 13:
                return CYAN;
            case 7:
            case 14:
                return MAGENTA;
        }
        return Color.RESET;
    }

    @Override
    public String toString() {
        return code;
    }
}
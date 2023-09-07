package enums.Colors;
// Assignment: 4
// Author: Michael Kupfer, ID: 209493246
/**
 * The ColorPalette class represents a palette of colors.
 */
public class ColorPalette {
    private Color[] colors;


    /**
     * Constructs a ColorPalette with the specified array of colors.
     * @param arr the array of colors
     */
    public ColorPalette(Color[] arr) {
        this.colors = arr;
    }
    /**
     * Retrieves the color from the palette by its name.
     * @param name the name of the color
     * @return the Color enum constant with the specified name, or null if not found
     */
    public Color getColorByName(String name) {
        switch (name) {
            case "RED":
                return Color.RED;
            case "GREEN":
                return Color.GREEN;
            case "BLUE":
                return Color.BLUE;
            case "WHITE":
                return Color.WHITE;
            case "BLACK":
                return Color.BLACK;
        }
        return null;
    }
}

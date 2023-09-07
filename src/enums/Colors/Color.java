package enums.Colors;
// Assignment: 4
// Author: Michael Kupfer, ID: 209493246
/**
 * The Color enum represents a set of predefined colors with associated RGB values.
 */
public enum Color {
    RED(255,0,0),
    GREEN(0,255,0),
    BLUE(0,0,255),
    WHITE(255,255,255),
    BLACK(0,0,0);

    private int  red;
    private int  green;
    private int  blue;
    /**
     * Constructs a Color enum constant with the specified RGB values.
     * @param red   the red component of the RGB color.
     * @param green the green component of the RGB color .
     * @param blue  the blue component of the RGB color.
     */
    Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    /**
     * Returns the RGB values of the color as a formatted string.
     * @return a string representation of the RGB values in the format "(red, green, blue)"
     */
    public String getRGB(){
        return "("+red+','+green+','+blue+')';
    }

}

package enums.Colors;
// Assignment: 4
// Author: Michael Kupfer, ID: 209493246

public class ColorPaletteTest {
    public static void main(String[] args) {
        Color[] arr = new Color[5];
        arr[0]= Color.RED;
        arr[1]= Color.GREEN;
        arr[2]= Color.BLUE;
        arr[3]= Color.WHITE;
        arr[4]= Color.BLACK;
        ColorPalette test = new ColorPalette(arr);
        for (int i=0; i<5;i++){
            System.out.println((test.getColorByName(arr[i].name())).getRGB());
        }
    }
}

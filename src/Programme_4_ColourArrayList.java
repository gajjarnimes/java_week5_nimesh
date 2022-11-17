import java.util.ArrayList;

public class Programme_4_ColourArrayList {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("Black");
        colorList.add("White");
        colorList.add("Orange");
        colorList.add("Purple");
        colorList.add("Cyan");

        for (String colourlist : colorList){
            System.out.println(colorList+",");
        }


    }
}

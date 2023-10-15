import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {
        List<String[]> rows = new ArrayList<>(); //[{}, {}, {}]
        String[] col = {"abcdqw","aafdcw4ffs","ddheehed","ddwq43334"};
        String[] col2 = {"ab","acbdw","dddddddddd","fdfdfdfdffe333d"};
        String[] col3 = {"fdswddddd","ab","dddd","ddd3dffff3"};
        rows.add(col);
        rows.add(col2);
        rows.add(col3);

        System.out.println(Arrays.toString(maxColLengths(rows)));
    }

    public static int[] maxColLengths(List<String[]> rows){
        //compare length of element row by row
        int[] maxColLengths = {0, 0, 0, 0};
        for(int i = 0; i < rows.size(); i++){
            String[] columns = rows.get(i);
            for(int j = 0; j < columns.length; j++){
                if(columns[j].length() > maxColLengths[j]){
                    maxColLengths[j] = columns[j].length();
                }
            }
        }
        return maxColLengths;
    }
}

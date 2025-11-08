import java.util.ArrayList;
import java.util.Collections;

class InnerLeardersInArray {

    public void findLeaders() {
        int arr[] = {1, 2, 3, 4, 5, 2};
        ArrayList<Integer> leaders = new ArrayList<>();

        int maxFromRight = arr[arr.length-1];
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }
        Collections.reverse(leaders);
        System.out.println(leaders);
    }
}
public class LeardersInArray {
    public static void main(String[] args) {
        InnerLeardersInArray d = new InnerLeardersInArray();
        d.findLeaders();
    }
}

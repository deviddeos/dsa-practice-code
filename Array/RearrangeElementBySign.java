import java.util.ArrayList;

class InnerRearrangeElementBySign {

  public void rearrangeElement() {
    int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
    ArrayList<Integer> pos = new ArrayList<>();
    ArrayList<Integer> neg = new ArrayList<>();
    int nIndex = 0, pIndex = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= 0) {
        pos.add(arr[i]);
      } else neg.add(arr[i]);
    }

    int index = 0;
    while (nIndex < neg.size() && pIndex < pos.size()) {
      arr[index++] = pos.get(pIndex++);
      arr[index++] = neg.get(nIndex++);
    }

    while (pIndex < pos.size()) {
      arr[index++] = pos.get(pIndex++);
    }
    while (nIndex < neg.size()) {
      arr[index++] = neg.get(nIndex++);
    }

    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}

public class RearrangeElementBySign {

  public static void main(String[] args) {
    InnerRearrangeElementBySign d = new InnerRearrangeElementBySign();
    d.rearrangeElement();
  }
}

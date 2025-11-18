public class SortArrOfString {

  public static void main(String[] args) {
    String[] s = { "ram", "shyam", "vinode", "arjun" };
    String[] s1 = sortString(s);

    for (int i = 0; i < s1.length; i++) {
        System.out.print(s1[i]+" ");
    }
  }

  public static String[] sortString(String[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j].compareTo(arr[j + 1]) > 0) {
            String tmp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = tmp;
        }
      }
    }
    return arr;
  }
}

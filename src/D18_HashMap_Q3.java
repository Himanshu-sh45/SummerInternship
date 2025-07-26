import java.util.HashMap;

public class D18_HashMap_Q3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3, 3, 3};

        int mostFrequent = findMostFrequentElement(arr);
        System.out.println("Most frequent element: " + mostFrequent);
    }

    public static int findMostFrequentElement(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int mostFrequent = arr[0];

        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) > maxCount) {
                maxCount = freqMap.get(key);
                mostFrequent = key;
            }
        }

        return mostFrequent;
    }
}

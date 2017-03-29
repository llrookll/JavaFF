class BinaryVsLinear {

    private static int linearSearch(int key, int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) if (array[i] == key) return i;
        return -1;
    }

    private static int binarySearch(int key, int[] array) {
        int lo = 0;
        int hi = array.length - 1;
        int count = 0;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            count++;
            if (key < array[mid]) hi = mid - 1;
            else if (key > array[mid]) lo = mid + 1;
            else return count;//mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        for (int length = 1; length <= 30; length += 1) {
            int[] array = new int[length];
            for (int index = 0; index < length; index += 1) {
                array[index] = index;
            }

            double linearTotal = 0.0;
            double binaryTotal = 0.0;
            for (int element = 0; element < length; element += 1) {
                linearTotal += linearSearch(element, array);
                binaryTotal += binarySearch(element, array);
            }

            double linearAverage = linearTotal / length;
            double binaryAverage = binaryTotal / length;
            System.out.println(length + " " + linearAverage + " " + binaryAverage);
        }
    }
}

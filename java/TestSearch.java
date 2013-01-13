public class TestSearch {
    public static Double[] createRandomData(int length) {
        Double[] data = new Double[length];

        for(int i = 0; i < data.length; i++)
            data[i] = length * Math.random();
        return data;
    }

    public static void main(String[] args) {
        long start, stop;
        System.out.print("Creating Array: ");
        start = System.nanoTime();
        Double[] d = createRandomData(100000000);
        stop = Sytem.nanoTime();
        System.out.println(stop - start);
        System.out.print("Sorting Array: ");
        start = System.nanoTime();
        MergeSort.sort(d);
        stop = System.nanoTime();
        System.out.println(stop - start);
    }
}


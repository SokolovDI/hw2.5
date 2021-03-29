public class MyThread extends Thread {
    private final float[] arr;

    MyThread(float[] arr) {
        this.arr = arr;
    }

    float[] getArr() {
        return arr;
    }

    @Override
    public void run() {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}



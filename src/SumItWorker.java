class SumItWorker implements Runnable {
    private final long start;
    private final long width;
    private final Result result;

    SumItWorker(long start, long width, Result result) {
        this.start = start;
        this.width = width;
        this.result = result;
    }

    public void run() {
        long res = 0;
        for (long i = start; i < start + width; i++) {
            res += i;
        }
        result.add(res);
    }
}
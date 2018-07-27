class SumItUp {
    public static void main(String[] args) {
        long end = UserDialogue.getEndNum();
        int threadCount = 3;
        Result result = new Result();
        long numPerThread = end / threadCount;
        long restPerThread = end % threadCount;
        Thread[] tPool = new Thread[threadCount];
        for (int i = 0; i < tPool.length; i++) {
            if (i + 1 != tPool.length) {
                tPool[i] = new Thread(new SumItWorker(i * numPerThread + 1, numPerThread, result));
            } else {
                tPool[i] = new Thread(new SumItWorker(i * numPerThread + 1, numPerThread + restPerThread, result));
            }
            tPool[i].start();
        }
        try {
            for (int i = 0; i < tPool.length; i++) {
                tPool[i].join();
            }
        } catch (InterruptedException ex) {
            System.exit(1);
        }
        System.out.println("Result: " + Long.toString(result.getResult()));
    }
}

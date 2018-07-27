class Result {
    private long result;

    public Result() {
        this.result = 0;
    }

    synchronized void add(long addTo) {
        this.result += addTo;
    }

    long getResult() {
        return this.result;
    }
}

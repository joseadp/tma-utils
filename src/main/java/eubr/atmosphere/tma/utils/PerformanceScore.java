package eubr.atmosphere.tma.utils;

public class PerformanceScore implements Score {

    public static final Double MAX_THROUGHPUT = 100.00;
    public static final Double MAX_RESPONSE_TIME = 100.00;
    
    private Double score;
    private Double throughput;
    private Double responseTime;
    private long timestamp;

    public Double getThroughput() {
        return throughput;
    }

    public void setThroughput(Double throughput) {
        this.throughput = throughput;
    }

    public Double getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(Double responseTime) {
        this.responseTime = responseTime;
    }
    
    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    
    @Override
    public String toString() {
        return "Score [throughput: " + this.getThroughput() +
              ", responseTime: " + this.getResponseTime() +
              ", timestamp: " + this.getTimestamp() + "]";
    }

    @Override
    public Double getScore() {
        Double a5 = this.getThroughput() / MAX_THROUGHPUT;
        Double a6 = this.getResponseTime() / MAX_RESPONSE_TIME;
        this.score = 0.5 * a5 + 0.5 * a6;
        
        return this.score;
    }
}

package gatewayapps.crondroid.core;

public interface SampledStatistics {
    long getJobsScheduledMostRecentSample();
    long getJobsExecutingMostRecentSample();
    long getJobsCompletedMostRecentSample();
    void shutdown();
}

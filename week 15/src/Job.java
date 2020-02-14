import java.util.ArrayList;
import java.util.Scanner;

public class Job {
    private Integer jobPriority;
    private String jobName;
    private String jobDescription;
    private Boolean completed;


    public Job(Integer jobPriority, String jobName, Boolean completed) {
        this.jobPriority = jobPriority;
        this.jobName = jobName;
        this.jobDescription = jobDescription;
        this.completed = completed;

    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public Integer getJobPriority() {
        return jobPriority;
    }

    public void setJobPriority(Integer jobPriority) {
        this.jobPriority = jobPriority;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String printJobDetailsAsString(){
        return null;
    }

    public static void main(String[] args) {
        Job build = new Job("1","build")
    }


}

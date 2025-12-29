package com.luiscacuango.jobsearch.api;

import com.luiscacuango.jobsearch.JobPosition;
import java.util.List;

public class APIResponse {
    private List<JobPosition> data;

    public List<JobPosition> getData() { return data; }
    public void setData(List<JobPosition> data) { this.data = data; }
}
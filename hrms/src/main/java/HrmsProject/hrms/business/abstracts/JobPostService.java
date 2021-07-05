package HrmsProject.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import HrmsProject.hrms.core.utilities.results.DataResult;
import HrmsProject.hrms.core.utilities.results.Result;
import HrmsProject.hrms.entities.concretes.JobPost;

@Service
public interface JobPostService{
	
	DataResult<List<JobPost>> getAll();
	
	Result add(JobPost jobPost);

}

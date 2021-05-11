package kodlama.hrms.apicontrollers.concretes;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.JobPositionService;
import kodlama.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("api/jobposition")
public class JobPositionController {
	private JobPositionService jobPositionService;

	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	@GetMapping("/getAll")
	public List<JobPosition>getAll()
	{
		return this.jobPositionService.getAll();
	}
	
	

}

package kodlama.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.hrms.business.abstracts.JobPositionService;
import kodlama.hrms.dataAccess.abstracts.JobPositionDao;
import kodlama.hrms.entities.concretes.JobPosition;

@Service

public class JobPositionManager implements JobPositionService {
	private JobPositionDao jobPositionDao;
	

	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}


	@Override
	public List<JobPosition> getAll() {
		// TODO Auto-generated method stub
		return this.jobPositionDao.findAll();
	}
	

}

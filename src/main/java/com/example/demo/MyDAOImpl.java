package com.example.demo;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyDAOImpl implements MyDAO{

	Logger log = Logger.getLogger(getClass());
	
	@Autowired
	MyJPA jpa;
	
	@Autowired
	TrainJPA2 jpa2;
	
	@Override
	public StudentVO getByDefaultImplicit(String rollNum) {
		
		log.info(rollNum);
		
		StudentVO studentVO = new StudentVO();
		
		//StudentEntity entity = jpa.getById(rollNum);
		
		//StudentEntity entity = jpa.getByName(rollNum);
		StudentEntity entity = jpa.getByNameAndRollNum("Ajay",rollNum);
		
		if(entity!=null) {
			studentVO.setRollNum(entity.getRollNum());
			studentVO.setName(entity.getName());
			studentVO.setDob(entity.getDob());
				
		}		
		
		log.info(jpa.useCusom());
		log.info(jpa.useCusom("Jim"));
		
		//StudentEntity entity = jpa.getByNameAndRollNum("Ajay",rollNum);
		//studentVO.setRollNum(entity.getRollNum());
		//studentVO.setName(entity.getName());
		//studentVO.setDob(entity.getDob());
		
		
	//		System.out.println(jpa.getByCusom(rollNum));
			System.out.println(jpa.useByCusomNative(rollNum));
		
		
			
			TrainEntity entity2 = new TrainEntity();
			entity2.setName("Ajay");
			entity2.setDob("12-Jan");
			
			jpa2.save(entity2);
		return studentVO;
	}

}

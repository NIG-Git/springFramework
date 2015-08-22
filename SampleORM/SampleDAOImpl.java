package sysblo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Service;

import sysblo.entity.SampleEntity;

@Service
public class SampleDAOImpl implements SampleDAO<SampleEntity> {

	@Autowired /*** 1 ***/
	private LocalContainerEntityManagerFactoryBean factory;

	@PersistenceContext /*** 2 ***/
	private EntityManager manager;

	public List<SampleEntity> getAllData() {

		/*** 3 ***/
		Query query = manager.createNamedQuery("SampleEntity.getAllData");

		List<SampleEntity> resultList = new ArrayList<SampleEntity>();

		/*** 4 ***/
		resultList = query.getResultList();

		return resultList;
	}

}

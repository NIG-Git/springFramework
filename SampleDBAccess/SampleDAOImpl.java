package sysblo.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class SampleDAOImpl implements SampleDAO {

	@Autowired /*** 1 ***/
	private JdbcTemplate jdbcTemplate;

	public List<Map<String, Object>> getAllData() {

		/*** 2 ***/
		List<Map<String, Object>>  resultList = jdbcTemplate.queryForList("select * from sampledao.sample_table");

		return resultList;
	}

}

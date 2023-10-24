package wm.spring.repositories;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import wm.spring.dto.DuoDTO;

@Repository
public class DuoDAO {

	@Autowired
	private SqlSessionTemplate db;
	
	public int insertDuoSearch(DuoDTO dto) {
		return db.insert("Duo.insertDuoSearch", dto);
	}
	
	public List<DuoDTO> selectDuoSearch(){
		return db.selectList("Duo.selectDuoSearch");
	}
	
}

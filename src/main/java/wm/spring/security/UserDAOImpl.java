package wm.spring.security;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int insertUser(Map<String, String> map) {
		return sqlSession.insert("Member.signUp", map);
	}

	@Override
	public Map<String, Object> selectUser(String userid) {
		return sqlSession.selectOne("Member.signIn", userid);
	}
}

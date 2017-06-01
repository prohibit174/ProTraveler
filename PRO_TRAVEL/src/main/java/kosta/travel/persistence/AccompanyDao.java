package kosta.travel.persistence;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import kosta.travel.domain.AccompanyVO;
import kosta.travel.domain.RouteVO;

public class AccompanyDao {
	
	private static AccompanyDao dao = new AccompanyDao();

	
	public static AccompanyDao getInstance() {
		return dao;
	}

	@Inject
	private SqlSession session;
	
	private static String namespace = "pro_travel.mapper.accompanyMapper";
	
	public List<AccompanyVO> getUserRoute(RouteVO route) throws Exception {
		return session.selectList(namespace+".getUserRoute", route);
	}
	
	public List<AccompanyVO> getUserInfo(String ID) throws Exception {
		return session.selectList(namespace+".getUserInfo", ID);
	}

	public List<AccompanyVO> getAccompanies(AccompanyVO accompany) throws Exception {
		return session.selectList(namespace+".getAccompanies", accompany);
	}
	
}



	
	
	
	



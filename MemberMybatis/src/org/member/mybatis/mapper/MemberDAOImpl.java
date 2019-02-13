package org.member.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.member.config.MybatisManager;
import org.member.mybatis.vo.MemberVO;
import org.springframework.stereotype.Repository;

@Repository("mdao")
public class MemberDAOImpl implements MemberDAO{
	
	
private SqlSession sqlMap;
//어노테이션을 쓰지않고 생성자로 생성

	public MemberDAOImpl() {
		SqlSessionFactory sqlMapper = MybatisManager.getMapper();
		sqlMap = sqlMapper.openSession();
	}
	@Override
	public List<MemberVO> getMemberList() {
		List<MemberVO> arr = sqlMap.selectList("selectList");
		return arr;
	}

	@Override
	public void insert(MemberVO user) {
		sqlMap.insert("insertMember",user);
		sqlMap.commit();
		
	}

	@Override
	public void update(MemberVO user) {
		sqlMap.update("updateMember",user);
		sqlMap.commit();
		
	}

	@Override
	public void delete(String id) {
		sqlMap.delete("deleteMember",id);
		sqlMap.commit();
		
	}

	@Override
	public MemberVO findById(String id) {
		MemberVO vo = sqlMap.selectOne("selectMember",id);
		return vo;
	}

}

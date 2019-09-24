package pack.business;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SqlMapperInter { // MyBatis Annotation 사용
	@Select("SELECT * FROM membertab")
	public List<DataDto> selectDataAll();
	
	@Select("SELECT * FROM membertab WHERE id=#{id}")
	public DataDto selectDataPart(String id);
	
	@Insert("insert into membertab values(#{id}, #{name}, #{passwd}, NOW())")
	public int insertData(DataFormBean bean);
	
	@Update("update membertab set name=#{name} where id=#{id}")
	public int updateData(DataFormBean bean); 
	
	@Delete("delete from membertab where id=#{id}")
	public int deleteData(String id);
}	
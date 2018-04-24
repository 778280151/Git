package dayimaleixingl;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface dayimaleixing {
	public List<dayimaleixing> select(@Param("id") int id);
}

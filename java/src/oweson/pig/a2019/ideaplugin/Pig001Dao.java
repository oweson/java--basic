package oweson.pig.a2019.ideaplugin;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import oweson.pig.a2019.ideaplugin.Pig001;

public interface Pig001Dao {

    int insert(@Param("pojo") Pig001 pojo);

    int insertList(@Param("pojos") List< Pig001> pojo);

    List<Pig001> select(@Param("pojo") Pig001 pojo);

    int update(@Param("pojo") Pig001 pojo);

}

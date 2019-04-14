package oweson.pig.a2019.ideaplugin;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import oweson.pig.a2019.ideaplugin.Pig001;
import oweson.pig.a2019.ideaplugin.Pig001Dao;

@Service
public class Pig001Service {

    @Resource
    private Pig001Dao pig001Dao;

    public int insert(Pig001 pojo){
        return pig001Dao.insert(pojo);
    }

    public int insertList(List< Pig001> pojos){
        return pig001Dao.insertList(pojos);
    }

    public List<Pig001> select(Pig001 pojo){
        return pig001Dao.select(pojo);
    }

    public int update(Pig001 pojo){
        return pig001Dao.update(pojo);
    }

}

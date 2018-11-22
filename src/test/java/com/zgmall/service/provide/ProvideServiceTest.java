package  com.zgmall.service.provide;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.zgmall.common.util.PageUtils;
import com.zgmall.common.util.SpringUtil;
import com.zgmall.mapper.businessdb.provide.ProvideMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zgmall.model.provide.Provide;
import com.zgmall.service.provide.ProvideService;
import com.zgmall.vo.provide.ProvideVo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProvideServiceTest {
    @Autowired
   ProvideService provideService;
    @Autowired
    ProvideMapper ProvideMapper;
     @Test
    public void selectList() {
        ProvideVo provideVo=new ProvideVo();
        PageHelper.startPage(2, PageUtils.PAGE_TWENTYFIVE);
        System.out.println("==========="+new Gson().toJson(provideService.selectList(provideVo)));
    }
    @Test
    public void add(){
        Provide provide=new Provide();
    }
    @Test
    public void update(){

    }
    @Test
    public void del(){
    }
}

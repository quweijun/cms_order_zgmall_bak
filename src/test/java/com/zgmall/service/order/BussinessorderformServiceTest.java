package  com.zgmall.service.order;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.zgmall.common.util.PageUtils;
import com.zgmall.common.util.SpringUtil;
import com.zgmall.mapper.businessdb.order.BussinessorderformMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zgmall.model.order.Bussinessorderform;
import com.zgmall.service.order.BussinessorderformService;
import com.zgmall.vo.order.BussinessorderformVo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BussinessorderformServiceTest {
    @Autowired
   BussinessorderformService bussinessorderformService;
    @Autowired
    BussinessorderformMapper BussinessorderformMapper;
     @Test
    public void selectList() {
        BussinessorderformVo bussinessorderformVo=new BussinessorderformVo();
        PageHelper.startPage(1, PageUtils.PAGE_TWENTY);
        System.out.println("==========="+new Gson().toJson(bussinessorderformService.selectList(bussinessorderformVo)));
    }
    @Test
    public void add(){
        Bussinessorderform bussinessorderform=new Bussinessorderform();
    }
    @Test
    public void update(){

    }
    @Test
    public void del(){
    }
}

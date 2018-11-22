package  com.zgmall.service.bussiness;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.zgmall.common.util.PageUtils;
import com.zgmall.common.util.SpringUtil;
import com.zgmall.mapper.businessdb.bussiness.HdtableMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zgmall.model.bussiness.Hdtable;
import com.zgmall.service.bussiness.HdtableService;
import com.zgmall.vo.bussiness.HdtableVo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HdtableServiceTest {
    @Autowired
   HdtableService hdtableService;
    @Autowired
    HdtableMapper HdtableMapper;
     @Test
    public void selectList() {
        HdtableVo hdtableVo=new HdtableVo();
        PageHelper.startPage(1, PageUtils.PAGE_TWENTY);
        System.out.println("==========="+new Gson().toJson(hdtableService.selectList(hdtableVo)));
    }
    @Test
    public void add(){
        Hdtable hdtable=new Hdtable();
    }
    @Test
    public void update(){

    }
    @Test
    public void del(){
    }
}

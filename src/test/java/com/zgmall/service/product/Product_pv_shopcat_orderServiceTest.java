package  com.zgmall.service.product;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.zgmall.common.util.PageUtils;
import com.zgmall.common.util.SpringUtil;
import com.zgmall.mapper.businessdb.product.Product_pv_shopcat_orderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zgmall.model.product.Product_pv_shopcat_order;
import com.zgmall.service.product.Product_pv_shopcat_orderService;
import com.zgmall.vo.product.Product_pv_shopcat_orderVo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Product_pv_shopcat_orderServiceTest {
    @Autowired
   Product_pv_shopcat_orderService product_pv_shopcat_orderService;
    @Autowired
    Product_pv_shopcat_orderMapper Product_pv_shopcat_orderMapper;
     @Test
    public void selectList() {
        Product_pv_shopcat_orderVo product_pv_shopcat_orderVo=new Product_pv_shopcat_orderVo();
        PageHelper.startPage(1, PageUtils.PAGE_TWENTY);
        System.out.println("==========="+new Gson().toJson(product_pv_shopcat_orderService.selectList(product_pv_shopcat_orderVo)));
    }
    @Test
    public void add(){
        Product_pv_shopcat_order product_pv_shopcat_order=new Product_pv_shopcat_order();
    }
    @Test
    public void update(){

    }
    @Test
    public void del(){
    }
}

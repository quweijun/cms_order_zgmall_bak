package com.zgmall.mapper.businessdb.product;
import com.zgmall.model.product.Product_pv_shopcat_order;
import com.zgmall.config.mybatis.MyMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
@Service("Product_pv_shopcat_orderMapper")
public interface Product_pv_shopcat_orderMapper extends MyMapper<Product_pv_shopcat_order> {
}

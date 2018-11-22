package com.zgmall.common.redis;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zgmall.model.product.JDProductLib;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Repository
public class ProductRedis {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;


    public void add(String key, Long time, JDProductLib jdProductLib) {
        Gson gson = new Gson();
        redisTemplate.opsForValue().set(key, gson.toJson(jdProductLib), time, TimeUnit.MINUTES);
    }

    public void add(String key, Long time, List<JDProductLib> jdProductLib) {
        Gson gson = new Gson();
        redisTemplate.opsForValue().set(key, gson.toJson(jdProductLib), time, TimeUnit.MINUTES);
    }


    public JDProductLib get(String key) {
        Gson gson = new Gson();
        JDProductLib jdProductLib = null;
        String json = redisTemplate.opsForValue().get(key);
        if(!StringUtils.isEmpty(json))
            jdProductLib = gson.fromJson(json, JDProductLib.class);
        return jdProductLib;
    }

    public List<JDProductLib> getList(String key) {
        Gson gson = new Gson();
        List<JDProductLib> ts = null;
        String listJson = redisTemplate.opsForValue().get(key);
        if(!StringUtils.isEmpty(listJson))
            ts = gson.fromJson(listJson, new TypeToken<List<JDProductLib>>(){}.getType());
        return ts;
    }

    public void delete(String key){
        redisTemplate.opsForValue().getOperations().delete(key);
    }
}

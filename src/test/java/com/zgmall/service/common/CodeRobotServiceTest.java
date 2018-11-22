package com.zgmall.service.common;

import com.zgmall.common.util.CodeRobotUtil;
import com.zgmall.model.provide.Provide;
import com.zgmall.vo.provide.ProvideVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.lang.reflect.Field;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CodeRobotServiceTest {
    @Autowired
    CodeRobotService codeRobotService;
    //@Test
    public void generateMapperInteface() {
        System.out.println(codeRobotService.generateMapperInteface("provide","com.zgmall.mapper.bussinessdb.provide"));
    }

    //@Test
    public void generateModel() {
        System.out.println(codeRobotService.generateModel("provide","com.zgmall.model.provide"));
    }

    //@Test
    public void generateVo() {
        System.out.println(codeRobotService.generateVo("provide","com.zgmall.vo.provide"));

    }
    //@Test
    public void generateService(){
        System.out.println(codeRobotService.generateService("provide","com.zgmall.service.bussiness.provide"));

    }
    //@Test
    public void generateController() {
        System.out.println(codeRobotService.generateController("provide","com.zgmall.controller.provide"));

    }
    //@Test
    public void generateVueComponents(){
        System.out.println(codeRobotService.generateVueComponents("provide","provide"));
    }
    //@Test
    public void writefile(){
//        //ModelClass
//        StringBuffer modelBuf=codeRobotService.generateModel("provide","com.zgmall.model.provide");
//        CodeRobotUtil.writefile(modelBuf,"src/main/java","com/zgmall/model/provide","Provide.java");
//        //MapperClass
//        StringBuffer mapperBuf=codeRobotService.generateMapperInteface("provide","com.zgmall.mapper.businessdb.provide");
//        CodeRobotUtil.writefile(mapperBuf,"src/main/java","com/zgmall/mapper/businessdb/provide","ProvideMapper.java");
//        //VoClass
//        StringBuffer VoBuf=codeRobotService.generateVo("provide","com.zgmall.vo.provide");
//        CodeRobotUtil.writefile(VoBuf,"src/main/java","com/zgmall/vo/provide","ProvideVo.java");
//        //ServiceClass
//         StringBuffer serviceBuf=codeRobotService.generateService("provide","com.zgmall.service.provide");
//         CodeRobotUtil.writefile(serviceBuf,"src/main/java","com/zgmall/service/provide","ProvideService.java");
//        //ControllerClass
//        StringBuffer controllerBuf=codeRobotService.generateController("provide","com.zgmall.controller.provide");
//        CodeRobotUtil.writefile(controllerBuf,"src/main/java","com/zgmall/controller/provide","ProvideController.java");
        //ServiceClass
         StringBuffer serviceBuf=codeRobotService.generateServiceTest("provide","com.zgmall.service.provide");
         CodeRobotUtil.writefile(serviceBuf,"src/test/java","com/zgmall/service/provide","ProvideServiceTest.java");
    }
    //@Test
    public void testAop(){
        ProvideVo provideVo=new ProvideVo();
        Field[] fields= Provide.class.getDeclaredFields();
        for(int i=0;i<fields.length;i++){
            System.out.println(fields[i].getName());
        }
    }
    @Test
    public void testGenerateAllJavaFile(){
        codeRobotService.generateAllJavaFile("bigtype","product","Bigtype",1);
        codeRobotService.generateAllJavaFile("bigtype","product","Bigtype",2);
        codeRobotService.generateAllJavaFile("bigtype","product","Bigtype",3);
        //codeRobotService.generateAllJavaFile("bussinessorderform","order","Bussinessorderform",7);
        //codeRobotService.generateAllJavaFile("hdtable","bussiness","Hdtable",100);
        //codeRobotService.generateAllJavaFile("product_pv_shopcat_order","product","Product_pv_shopcat_order",7);
    }
}
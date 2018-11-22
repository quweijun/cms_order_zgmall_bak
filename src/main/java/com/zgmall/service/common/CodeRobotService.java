package com.zgmall.service.common;

import com.google.gson.Gson;
import com.zgmall.common.util.CodeRobotUtil;
import com.zgmall.mapper.businessdb.common.CommonMapper;
import com.zgmall.model.common.BaseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CodeRobotService")
public class CodeRobotService {
    @Autowired
    CommonMapper commonMapper;

     /**
     *根据表名生成Model类源码
     * @param tablename
     * @param packagename
     * @return
     */
    public StringBuffer generateModel(String tablename,String packagename){
        StringBuffer buf=new StringBuffer();
        buf.append("package " + packagename+";\n\n");
        buf.append("import java.math.BigDecimal;\nimport java.util.Date;\nimport javax.persistence.Id;\n\n");
        buf.append("public class "+CodeRobotUtil.tablename2class(tablename)+" {\n");
        List<BaseModel> list= commonMapper.descTable(tablename);
        //private
        for (int i=0;i<list.size();i++){
            BaseModel baseModel=list.get(i);
            if (baseModel.getIsKey().equals("PRI")) buf.append("  @Id\n");
            buf.append("  private "+ CodeRobotUtil.convertFieldType(baseModel.getType())+" "+baseModel.getField().toLowerCase()+";\n");
        }
        //get
        for (int i=0;i<list.size();i++){
            BaseModel baseModel=list.get(i);
            buf.append("  public "+ CodeRobotUtil.convertFieldType(baseModel.getType())+" get"+CodeRobotUtil.fieldname2value(baseModel.getField())+"()\n");
            buf.append("  {\n");
            buf.append("    return this."+baseModel.getField().toLowerCase()+";\n");
            buf.append("  }\n");
        }
        //set
        for (int i=0;i<list.size();i++){
            BaseModel baseModel=list.get(i);
            buf.append("  public  void set"+CodeRobotUtil.fieldname2value(baseModel.getField())+"("+ CodeRobotUtil.convertFieldType(baseModel.getType())+" "+baseModel.getField().toLowerCase()+")\n");
            buf.append("  {\n");
            buf.append("    this."+baseModel.getField().toLowerCase()+" = "+baseModel.getField().toLowerCase()+";\n");
            buf.append("  }\n");
        }
        buf.append("}");
        return buf;
    }

    /**
     * 生成Vo类源码
     * @param tablename
     * @param packagename
     * @return
     */
    public StringBuffer generateVo(String tablename,String packagename){
        String catalog=packagename.substring(packagename.lastIndexOf(".")+1);
        StringBuffer buf=new StringBuffer();
        buf.append("package "+packagename+";\n" +
                "\n" +
                "import com.zgmall.model."+catalog+"."+CodeRobotUtil.tablename2class(tablename)+";\n" +
                "\n" +
                "\n" +
                "public class "+CodeRobotUtil.tablename2class(tablename)+"Vo extends "+CodeRobotUtil.tablename2class(tablename)+" {\n" +
                "    private Integer  p=1;\n" +
                "    private Integer  psize=15;\n" +
                "    public int getP() {\n" +
                "        return p;\n" +
                "    }\n" +
                "    public void setP(int p) {this.p = p;}\n" +
                "    public int getPsize(){return psize;}\n" +
                "    public void setPsize(int psize){this.psize=psize;}\n" +
                "}\n");
        return buf;
    }

    /**
     * 生成Mapper类源码
     * @param tablename
     * @param packagename
     * @return
     */
    public StringBuffer generateMapperInteface(String tablename,String packagename){
            String catalog=packagename.substring(packagename.lastIndexOf(".")+1);
            StringBuffer buf=new StringBuffer();
            buf.append("package "+packagename+";\n"+
                       "import com.zgmall.model."+catalog+"."+CodeRobotUtil.tablename2class(tablename)+";\n" +
                       "import com.zgmall.config.mybatis.MyMapper;\n"+
                       "import org.apache.ibatis.annotations.Select;\n"+
                       "import org.springframework.stereotype.Service;\n"+
                        "@Service(\""+CodeRobotUtil.tablename2class(tablename)+"Mapper\")\n"+
                        "public interface "+CodeRobotUtil.tablename2class(tablename)+"Mapper extends MyMapper<"+CodeRobotUtil.tablename2class(tablename)+"> {\n"+
                         "}\n");
        return buf;
    }

    /**
     * 生成服务Service类源码
     * @param tablename
     * @param packagename
     * @return
     */
    public StringBuffer generateService(String tablename,String packagename){
        String modelclass=CodeRobotUtil.tablename2class(tablename);
        String modelobject=tablename;
        String classname=modelclass;
        String modulepath=packagename.substring(packagename.lastIndexOf(".")+1);
        StringBuffer buf=new StringBuffer();
        buf.append("package #packagename;\n" +
                "\n" +
                "import com.github.pagehelper.PageInfo;\n" +
                "import com.google.gson.Gson;\n" +
                "import com.zgmall.mapper.businessdb.#modulepath.#modelclassMapper;\n" +
                "import com.zgmall.model.#modulepath.#modelclass;\n" +
                "import org.springframework.stereotype.Service;\n" +
                "import org.springframework.beans.factory.annotation.Autowired;\n" +
                "import tk.mybatis.mapper.entity.Example;\n" +
                "import com.zgmall.common.util.mybatisUtil;\n"+
                "\n" +
                "import java.util.LinkedHashMap;\n" +
                "import java.util.List;\n" +
                "import java.util.Map;\n" +
                "@Service(\"#classnameService\")\n" +
                "public class #classnameService {\n" +
                "    @Autowired\n" +
                "    #modelclassMapper #modelobjectMapper;\n" +
                "        //@Override\n" +
                "    public Map<String, Object> selectList(#modelclass #modelobject) {\n" +
                "        Example example = new Example(#modelclass.class);\n" +
                "        Example.Criteria criteria=example.createCriteria();\n" +
                "        //根据对象的属性值补充过滤条件\n" +
                "        mybatisUtil.generateCriteria(criteria,#modelobject);\n"+
                "        //example.setOrderByClause(\"id desc\");\n"+
                "        Map<String, Object> resultMap = new LinkedHashMap<>();\n" +
                "        List<#modelclass> #modelobjectList = #modelobjectMapper.selectByExample(example);\n" +
                "        PageInfo pageInfo = new PageInfo<>(#modelobjectList);\n" +
                "        resultMap.put(\"pageInfo\", pageInfo);\n" +
                "        return resultMap;\n" +
                "    }\n" +
                "\n" +
                "    //@Override\n" +
                "    public void add(#modelclass #modelobject) {\n" +
                "        #modelobjectMapper.insert(#modelobject);\n" +
                "    }\n" +
                "\n" +
                "    //@Override\n" +
                "    public void update(#modelclass #modelobject) {\n" +
                "        //logger.info(new Gson().toJson(#modelobject));\n" +
                "        #modelobjectMapper.updateByPrimaryKeySelective(#modelobject);\n" +
                "    }\n" +
                "\n" +
                "    //@Override\n" +
                "    public void del(#modelclass #modelobject) {\n" +
                "        #modelobjectMapper.deleteByPrimaryKey(#modelobject);\n" +
                "    }\n" +
                "}\n");
        String tmpstr=buf.toString();
        String tmpstr2=tmpstr.replaceAll("#packagename",packagename).replaceAll("#modelclass",modelclass).replaceAll("#modelobject",modelobject).replaceAll("#classname",classname).replaceAll("#modulepath",modulepath);
        //tmpstr.replaceAll()
        return new StringBuffer(tmpstr2);
    }

    /**
     * 生成Controller类源码
     * @param tablename
     * @param packagename
     * @return
     */
    public StringBuffer generateController(String tablename,String packagename){
        String modelclass=CodeRobotUtil.tablename2class(tablename);
        String modelobject=tablename;
        String modulepath=packagename.substring(packagename.lastIndexOf(".")+1);
        StringBuffer buf=new StringBuffer();
        buf.append("package #packagename;\n" +
                "import com.alibaba.fastjson.JSONObject;\n" +
                "import com.github.pagehelper.PageHelper;\n" +
                "import com.google.gson.Gson;\n" +
                "\n" +
                "import com.zgmall.model.#modulepath.#modelclass;\n" +
                "import com.zgmall.service.#modulepath.#modelclassService;\n" +
                "import com.zgmall.common.util.PageUtils;\n" +
                "import com.zgmall.common.util.exception.ExceptionContent;\n" +
                "import com.zgmall.common.util.exception.RestException;\n" +
                "\n" +
                "import com.zgmall.vo.#modulepath.#modelclassVo;\n" +
                "import org.springframework.beans.factory.annotation.Autowired;\n" +
                "import org.springframework.beans.factory.annotation.Value;\n" +
                "import org.springframework.web.bind.annotation.*;\n" +
                "\n" +
                "import java.util.LinkedHashMap;\n" +
                "import java.util.Map;\n" +
                "\n" +
                "import org.slf4j.Logger;\n" +
                "import org.slf4j.LoggerFactory;\n" +
                "\n" +
                "\n" +
                "@RestController\n" +
                "@RequestMapping(\"/#modulepath\")\n" +
                "public class #modelclassController {\n" +
                "    //logback\n" +
                "    private static Logger logger = LoggerFactory.getLogger(#modelclassController.class);\n" +
                "    @Autowired\n" +
                "    #modelclassService #modelobjectService;\n" +
                "\n" +
                "    @RequestMapping(\"/#modelobject/list\")\n" +
                "    public Map<String, Object> selectList(@RequestBody #modelclassVo #modelobjectVo) throws RestException {\n" +
                "        Map<String, Object> resultMap = new LinkedHashMap<>();\n" +
                "        try{\n" +
                "            int p=#modelobjectVo.getP();\n" +
                "            int psize=#modelobjectVo.getPsize();\n" +
                "            if (psize<=0) psize=PageUtils.PAGE_TEN;\n" +
                "            if(p>0){\n" +
                "                PageHelper.startPage(p,psize);\n" +
                "            }\n" +
                "            resultMap.putAll(#modelobjectService.selectList(#modelobjectVo));\n" +
                "            resultMap.put(\"code\", ExceptionContent.SUCCESS);\n" +
                "            resultMap.put(\"message\", ExceptionContent.SUCCESS_MSG);\n" +
                "        }catch (Exception e){\n" +
                "            e.printStackTrace();\n" +
                "            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);\n" +
                "        }\n" +
                "        return resultMap;\n" +
                "    }\n" +
                "    @RequestMapping(\"/#modelobject/{id}\")\n");
        List<BaseModel> list= commonMapper.descTable(tablename);
        String pkid="";
        String pktype="";
        for (int i=0;i<list.size();i++){
            BaseModel baseModel=list.get(i);
            if (baseModel.getIsKey().equals("PRI")) {
                pkid=baseModel.getField();
                pktype=CodeRobotUtil.convertFieldType(baseModel.getType());
            }
        }
        buf.append("    public Map<String, Object> selectById(@PathVariable int id) throws RestException {\n" +
                "        Map<String, Object> resultMap = new LinkedHashMap<>();\n" +
                "        try{\n" +
                "            #modelclassVo #modelobjectVo=new #modelclassVo();\n" +
                "            #modelobjectVo.set"+CodeRobotUtil.UpperFirstChar(pkid)+"(id);\n" +
                "            resultMap.putAll(#modelobjectService.selectList(#modelobjectVo));\n" +
                "            //logger.info(new Gson().toJson(resultMap));\n" +
                "            resultMap.put(\"code\", ExceptionContent.SUCCESS);\n" +
                "            resultMap.put(\"message\", ExceptionContent.SUCCESS_MSG);\n" +
                "        }catch (Exception e){\n" +
                "            e.printStackTrace();\n" +
                "            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);\n" +
                "        }\n" +
                "        return resultMap;\n" +
                "    }\n" +
                "    @RequestMapping(\"/#modelobject/add\")\n" +
                "    public Map<String, Object> add(@RequestBody #modelclassVo #modelobjectVo) throws RestException {\n" +
                "        Map<String, Object> resultMap = new LinkedHashMap<>();\n" +
                "        try{\n" +
                "            #modelobjectService.add(#modelobjectVo);\n" +
                "            resultMap.put(\"code\", ExceptionContent.SUCCESS);\n" +
                "            resultMap.put(\"message\", ExceptionContent.SUCCESS_MSG);\n" +
                "        }catch (Exception e){\n" +
                "            e.printStackTrace();\n" +
                "            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);\n" +
                "        }\n" +
                "        return resultMap;\n" +
                "    }\n" +
                "\n" +
                "    @RequestMapping(\"/#modelobject/update\")\n" +
                "    public Map<String, Object> update(@RequestBody #modelclassVo #modelobjectVo) throws RestException {\n" +
                "        Map<String, Object> resultMap = new LinkedHashMap<>();\n" +
                "        try{\n" +
                "            logger.info(new Gson().toJson(#modelobjectVo));\n" +
                "            #modelobjectService.update(#modelobjectVo);\n" +
                "            resultMap.put(\"code\", ExceptionContent.SUCCESS);\n" +
                "            resultMap.put(\"message\", ExceptionContent.SUCCESS_MSG);\n" +
                "        }catch (Exception e){\n" +
                "            e.printStackTrace();\n" +
                "            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);\n" +
                "        }\n" +
                "        return resultMap;\n" +
                "    }\n" +
                "    @RequestMapping(\"/#modelobject/del\")\n" +
                "    public Map<String, Object> del(@RequestBody #modelclassVo #modelobjectVo) throws RestException {\n" +
                "        Map<String, Object> resultMap = new LinkedHashMap<>();\n" +
                "        try{\n" +
                "            #modelobjectService.del(#modelobjectVo);\n" +
                "            resultMap.put(\"code\", ExceptionContent.SUCCESS);\n" +
                "            resultMap.put(\"message\", ExceptionContent.SUCCESS_MSG);\n" +
                "        }catch (Exception e){\n" +
                "            e.printStackTrace();\n" +
                "            throw new RestException(ExceptionContent.SELECT_ERROR_MSG, ExceptionContent.SELECT_ERROR_CODE);\n" +
                "        }\n" +
                "        return resultMap;\n" +
                "    }\n" +
                "}\n");
        String tmpstr=buf.toString();
        String tmpstr2=tmpstr.replaceAll("#packagename",packagename).replaceAll("#modelclass",modelclass).replaceAll("#modelobject",modelobject).replaceAll("#modulepath",modulepath);
        //tmpstr.replaceAll()
        return new StringBuffer(tmpstr2);
    }

    /**
     * 生成服务测试ServiceTest类源码
     * @param tablename
     * @param packagename
     * @return
     */
    public StringBuffer generateServiceTest(String tablename,String packagename){
        String modelclass=CodeRobotUtil.tablename2class(tablename);
        String modelobject=tablename;
        String classname=modelclass;
        String modulepath=packagename.substring(packagename.lastIndexOf(".")+1);
        StringBuffer buf=new StringBuffer();
        buf.append("package  #packagename;\n" +
                "\n" +
                "import com.github.pagehelper.PageHelper;\n" +
                "import com.google.gson.Gson;\n" +
                "import com.zgmall.common.util.PageUtils;\n" +
                "import com.zgmall.common.util.SpringUtil;\n" +
                "import com.zgmall.mapper.businessdb.#modulepath.#modelclassMapper;\n" +
                "import org.junit.Test;\n" +
                "import org.junit.runner.RunWith;\n" +
                "import org.springframework.beans.factory.annotation.Autowired;\n" +
                "import org.springframework.boot.test.context.SpringBootTest;\n" +
                "import org.springframework.test.context.junit4.SpringRunner;\n" +
                "\n" +
                "import com.zgmall.model.#modulepath.#modelclass;\n" +
                "import com.zgmall.service.#modulepath.#modelclassService;\n" +
                "import com.zgmall.vo.#modulepath.#modelclassVo;\n" +
                "\n" +
                "@RunWith(SpringRunner.class)\n" +
                "@SpringBootTest\n" +
                "public class #modelclassServiceTest {\n" +
                "    @Autowired\n" +
                "   #modelclassService #modelobjectService;\n" +
                "    @Autowired\n" +
                "    #modelclassMapper #modelclassMapper;\n" +
                "     @Test\n" +
                "    public void selectList() {\n" +
                "        #modelclassVo #modelobjectVo=new #modelclassVo();\n" +
                "        PageHelper.startPage(1, PageUtils.PAGE_TWENTY);\n" +
                "        System.out.println(\"===========\"+new Gson().toJson(#modelobjectService.selectList(#modelobjectVo)));\n" +
                "    }\n" +
                "    @Test\n" +
                "    public void add(){\n" +
                "        #modelclass #modelobject=new #modelclass();\n" +
                "    }\n" +
                "    @Test\n" +
                "    public void update(){\n" +
                "\n" +
                "    }\n" +
                "    @Test\n" +
                "    public void del(){\n" +
                "    }\n" +
                "}\n");
        String tmpstr=buf.toString();
        String tmpstr2=tmpstr.replaceAll("#packagename",packagename).replaceAll("#modelclass",modelclass).replaceAll("#modelobject",modelobject).replaceAll("#classname",classname).replaceAll("#modulepath",modulepath);
        return new StringBuffer(tmpstr2);
    }

    /**
     * 生成VueComponents组件源码
     * @param tablename
     * @param modulename
     * @return
     */
    public StringBuffer generateVueComponents(String tablename,String modulename){
       String pkid="";
       StringBuffer buf=new StringBuffer();
       buf.append("<template>\n" +
               "    <div style=\"margin-top: 0px;\">\n" +
               "        <div  title=\"删选&添加按钮区域\"  class=\"handle-box\">\n" +
               "          <el-button icon=\"add\" @click=\"resetForm(#tablenameForm);dialogTableVisible =true\" type=\"primary\">添加</el-button>\n" +
               "        </div>\n" +
               "        <!--积分规则列表BEGIN-->\n" +
               "        <el-table v-loading=\"loading\"\n" +
               "                  element-loading-text=\"拼命加载中\"\n" +
               "                  element-loading-spinner=\"el-icon-loading\"\n" +
               "                  element-loading-background=\"rgba(0, 0, 0, 0.8)\"\n" +
               "                  title=\"列表区\" :data=\"#tablenamelist\" border style=\"width: 100%\">\n");
        List<BaseModel> list= commonMapper.descTable(tablename);
        //列表区字段
        for (int i=0;i<list.size();i++){
            BaseModel baseModel=list.get(i);
            if (baseModel.getIsKey().equals("PRI")) {
                pkid=baseModel.getField().toLowerCase();
            }
            String fieldlabel=baseModel.getComment();
            if (fieldlabel==null || fieldlabel.equals("")) fieldlabel=baseModel.getField();
            buf.append("            <el-table-column prop=\""+baseModel.getField().toLowerCase()+"\" label=\""+fieldlabel+"\"></el-table-column>\n");
        }
        buf.append("            <el-table-column label=\"操作\"   width=\"160px\">\n" +
               "                <template scope=\"scope\">\n" +
               "                    <el-button icon=\"edit\" @click=\"getrow(scope.row);dialogTableVisible =true\" type=\"warning\" size=\"small\" ></el-button>\n" +
               "                    <el-button @click=\"updateState(scope.row,1)\" type=\"danger\" size=\"small\" v-if=\"scope.row.enableflag==0\">启用</el-button>\n" +
               "                    <el-button @click=\"updateState(scope.row,0)\" type=\"danger\" size=\"small\" v-if=\"scope.row.enableflag==1\">禁用</el-button>\n" +
               "                    <el-button icon=\"delete\" @click=\"del(scope.row)\" type=\"danger\" size=\"small\"></el-button>\n" +
               "                </template>\n" +
               "            </el-table-column>\n" +
               "        </el-table>\n" +
               "        <!--列表END-->\n" +
               "        <!--显示分页栏BEGIN-->\n" +
               "        <div title=\"分页代码区\" class=\"block\">\n" +
               "            <el-pagination\n" +
               "                    @current-change=\"handleCurrentChange\"\n" +
               "                    @size-change=\"handleSizeChange\"\n" +
               "                    :current-page.sync=\"currentPage\"\n" +
               "                    :page-size=\"pageInfo.pageSize\"\n" +
               "                    layout=\"->,total, sizes, prev, pager, next, jumper\"\n" +
               "                    :total=\"pageInfo.total\">\n" +
               "            </el-pagination>\n" +
               "          <!--layout=\"->, prev, pager, next\"-->\n" +
               "        </div>\n" +
               "        <!--显示分页栏END-->\n" +
               "      <!--新增/编辑对话框BEGIN-->\n" +
               "      <el-dialog title=\"添加/修改\" :visible.sync=\"dialogTableVisible\">\n" +
               "        <el-row :gutter=\"20\">\n" +
               "          <el-col :span=\"18\">\n"+
               "            <el-form :model=\"#tablenameForm\" :rules=\"rules\" ref=\"#tablenameForm\" label-width=\"100px\" class=\"demo-ruleForm\">\n");
        //编辑区字段
        for (int i=0;i<list.size();i++){
            BaseModel baseModel=list.get(i);
            buf.append("              <el-form-item label=\""+baseModel.getField().toLowerCase()+"\" prop=\""+baseModel.getField().toLowerCase()+"\"><el-input v-model=\"#tablenameForm."+baseModel.getField().toLowerCase()+"\"></el-input></el-form-item>\n");
        }
        buf.append("              <el-form-item>\n" +
               "                <el-button size=\"small\" type=\"primary\" @click=\"submitForm('#tablenameForm')\">保存</el-button>\n" +
               "                <el-button size=\"small\" @click=\"resetForm('#tablenameForm')\">重置</el-button>\n" +
               "              </el-form-item>\n" +
               "            </el-form>\n" +
               "          </el-col>\n" +
               "        </el-row>\n" +
               "      </el-dialog>\n" +
               "      <!--新增/编辑对话框END-->\n" +
               "       </div>\n" +
               "</template>\n" +
               "<script>\n" +
               "    export default {\n" +
               "      props: [\"#tablename\"],\n" +
               "        data() {\n" +
               "            return {\n" +
               "                currentPage: 1,\n" +
               "                psize:10,\n" +
               "                #tablenamelist: [],//列表数组\n" +
               "                pageInfo:[],\n" +
               "                dialogTableVisible: false,\n" +
               "                #tablenameForm: {//新增、修改\n");
        for (int i=0;i<list.size();i++){
            BaseModel baseModel=list.get(i);
            buf.append("                  "+baseModel.getField().toLowerCase()+":\"\",\n");
        }

        buf.append("},\n" +
               "                rules: {\n" +
               "                  actiondesc: [{required: true, message: '规则描述不能为空!', trigger: 'blur'},],\n" +
               "                },\n" +
               "                loading:false\n" +
               "            }\n" +
               "        },\n" +
               "        mounted(){\n" +
               "            this.selectList();\n" +
               "         },\n" +
               "        methods: {\n" +
               "            selectList(){//带筛选条件列表\n" +
               "                this.loading=true;\n" +
               "                var param = {\n" +
               "                    p:this.currentPage,\n" +
               "                    psize:this.psize\n" +
               "                };\n" +
               "\n" +
               "                this.axios.post(this.api.#modulename.#tablename.selectlist,param)\n" +
               "                    .then((res) => {\n" +
               "                        this.#tablenamelist = res.data.pageInfo.list; //返回的列表赋给vue数组\n" +
               "                        this.pageInfo = res.data.pageInfo;\n" +
               "                        this.loading=false;\n" +
               "                    })\n" +
               "\n" +
               "            },\n" +
               "            del(item){\n" +
               "                var param = {\n" +
               "                   #pkid: item.#pkid\n" +
               "                };\n" +
               "                this.axios.post(this.api.#modulename.#tablename.del,param)\n" +
               "                    .then((res) => {\n" +
               "                        this.selectList();\n" +
               "                    })\n" +
               "            },\n" +
               "            updateState(item,state){\n" +
               "                var param = {\n" +
               "                    #pkid: item.#pkid,\n" +
               "                    enableflag: state\n" +
               "                };\n" +
               "                this.axios.post(this.api.#modulename.#tablename.updatestate,param)\n" +
               "                    .then((res) => {\n" +
               "                        this.selectList();\n" +
               "                    })\n" +
               "            },\n" +
               "            getrow(item){\n" +
               "              this.axios.get(this.api.#modulename.#tablename.getrow + item.#pkid)\n" +
               "                .then((res) => {\n" +
               "                   this.activeName = \"#tablenameupdate\";\n" +
               "                   this.#tablenameForm=res.data.pageInfo.list[0];//从接口获取产品数据绑定productForm\n" +
               "                });\n" +
               "            },\n" +
               "            submitForm(formName) {\n" +
               "                this.$refs[formName].validate((valid) => {\n" +
               "                    if (valid) {\n" +
               "\n" +
               "                      if (this.#tablenameForm.#pkid== \"\"){\n" +
               "                        this.axios.post(this.api.#modulename.#tablename.add, this.#tablenameForm) //提交Form\n" +
               "                          .then((res) => {\n" +
               "                            this.dialogTableVisible = false;\n" +
               "                            this.selectList();\n" +
               "                            this.resetForm(\"#tablenameForm\");\n" +
               "                          })\n" +
               "                      }\n" +
               "                      else {\n" +
               "                        this.axios.post(this.api.#modulename.#tablename.update, this.#tablenameForm)\n" +
               "                          .then((res) => {\n" +
               "                            this.dialogTableVisible = false;\n" +
               "                            this.selectList();\n" +
               "                            this.resetForm(\"#tablenameForm\");\n" +
               "                          })\n" +
               "                      }\n" +
               "                    } else {\n" +
               "                        console.log('error submit!!');\n" +
               "                        return false;\n" +
               "                    }\n" +
               "                });\n" +
               "            },\n" +
               "            resetForm(formName) {\n" +
               "                 if (this.#tablenameForm.#pkid!=\"\"||this.#tablenameForm.operation!=\"\")  this.$refs['#tablenameForm'].resetFields();\n" +
               "            },\n" +
               "            handleCurrentChange(val){\n" +
               "                this.currentPage = val;\n" +
               "                this.selectList();\n" +
               "            },\n" +
               "            handleSizeChange(val){\n" +
               "              this.psize = val;\n" +
               "              this.selectList();\n" +
               "            },\n" +
               "        }\n" +
               "    }\n" +
               "</script>\n");
        String tmpstr=buf.toString();
        String tmpstr2=tmpstr.replaceAll("#tablename",tablename).replaceAll("#modulename",modulename).replaceAll("#pkid",pkid);
        //tmpstr.replaceAll()
        return new StringBuffer(tmpstr2);
    }


    /**
     * 生成所有的JAVA文件
     * @param tablename
     * @param modulename
     * @param modelname
     */
    public void generateAllJavaFile(String tablename,String modulename,String modelname,int flag) {
        //ModelClass
        if (flag == 1 || flag == 100) {
            StringBuffer modelBuf = this.generateModel(tablename, "com.zgmall.model." + modulename);
            CodeRobotUtil.writefile(modelBuf, "src/main/java", "com/zgmall/model/" + modulename, modelname + ".java");
        }
        //MapperClass
        if (flag == 2 || flag == 100) {
            StringBuffer mapperBuf = this.generateMapperInteface(tablename, "com.zgmall.mapper.businessdb." + modulename);
            CodeRobotUtil.writefile(mapperBuf, "src/main/java", "com/zgmall/mapper/businessdb/" + modulename, modelname + "Mapper.java");
        }
        //VoClass
        if (flag == 3 || flag == 100) {
            StringBuffer VoBuf = this.generateVo(tablename, "com.zgmall.vo." + modulename);
            CodeRobotUtil.writefile(VoBuf, "src/main/java", "com/zgmall/vo/" + modulename, modelname + "Vo.java");
        }
        //ServiceClass
        if (flag == 4 || flag == 100) {
            StringBuffer serviceBuf = this.generateService(tablename, "com.zgmall.service." + modulename);
            CodeRobotUtil.writefile(serviceBuf, "src/main/java", "com/zgmall/service/" + modulename, modelname + "Service.java");
        }
        //ControllerClass
        if (flag == 5 || flag == 100) {
            StringBuffer controllerBuf = this.generateController(tablename, "com.zgmall.controller." + modulename);
            CodeRobotUtil.writefile(controllerBuf, "src/main/java", "com/zgmall/controller/" + modulename, modelname + "Controller.java");
        }
        //ServiceTestClass
        if (flag == 6 || flag == 100) {
            StringBuffer serviceTestBuf = this.generateServiceTest(tablename, "com.zgmall.service." + modulename);
            CodeRobotUtil.writefile(serviceTestBuf, "src/test/java", "com/zgmall/service/" + modulename, modelname + "ServiceTest.java");
        }
        //VueComponents
        if (flag == 7 || flag == 100) {
            StringBuffer vueBuf = this.generateVueComponents(tablename,modulename);;
            CodeRobotUtil.writefile(vueBuf, "D:\\Program Files\\nodejs\\vuejsapp\\cms_ui\\src\\components\\", modulename, tablename + ".vue");
        }
    }
}


### restful风格实现CURD
传统增删改查 @RequestMapping("/delete") 多个路径匹配

restful：一个路径，通过不同请求方式识别CURD操作

- post   : save

- get  :  select

- put  ： update

- delete   :delete

步骤：
1. web.xml增加filter
    该过滤器将post请求转换为put或delete
    ```
   <filter>
           <filter-name>hidden</filter-name>
           <filter-class>org.springframework.web.filter.HiddenHttpMethodFilter</filter-class>
       </filter>
       <filter-mapping>
           <filter-name>hidden</filter-name>
           <url-pattern>/*</url-pattern>
       </filter-mapping>
   ```    
1. 前台添加hidden name值必须为 **_method** value为delete或put 所处的表单提交方式必须为**post**
    ```
   <input type="hidden" name="_method" value="delete">
   ```
1. controller层方法添加method ={}
    ```
    @RequestMapping(value="/user",method ={RequestMethod.PUT})
    ```


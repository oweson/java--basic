package cattle.pig.article.web;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 15:31
 */
public class SessionTest {
    /** 1 Web程序中，当前用户上下文信息应该保存在下面哪个对象中（）

     正确答案: C   你的答案: C
     page
     request
     session
     Application

     解析：
     JSP 四大作用域： page (作用范围最小)、request、session、application（作用范围最大）。

     存储在application对象中的属性可以被同一个WEB应用程序中的所有Servlet和JSP页面访问。（属性作用范围最大）
     存储在session对象中的属性可以被属于同一个会话（浏览器打开直到关闭称为一次会话，且在此期间会话不失效）的所有Servlet和JSP页面访问。
     存储在request对象中的属性可以被属于同一个请求的所有Servlet和JSP页面访问（在有转发的情况下可以跨页面获取属性值），
     例如使用PageContext.forward和PageContext.include方法连接起来的多个Servlet和JSP页面。
     存储在pageContext对象中的属性仅可以被当前JSP页面的当前响应过程中调用的各个组件访问，例如，正在响应当前请求的JSP页面和它调用的各个自定义标签类。*/
}

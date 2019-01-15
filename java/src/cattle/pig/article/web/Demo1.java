package cattle.pig.article.web;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 12:19
 */
public class Demo1 {
    /** 1 下面有关forward和redirect的描述，正确的是() ？
     正确答案: B C D   你的答案: B C
     forward是服务器将控制权转交给另外一个内部服务器对象，由新的对象来全权负责响应用户的请求
     执行forward时，浏览器不知道服务器发送的内容是从何处来，浏览器地址栏中还是原来的地址
     执行redirect时，服务器端告诉浏览器重新去请求地址
     forward是内部重定向，redirect是外部重定向
     redirect默认将产生301 Permanently moved的HTTP响应
     解析：1.从地址栏显示来说
     forward是服务器请求资源,服务器直接访问目标地址的URL,把那个URL的响应内容读取过来,然后把这些内容再发给浏览器.浏览器根本不知道服务器发送的内容从哪里来的,所以它的地址栏还是原来的地址.
     redirect是服务端根据逻辑,发送一个状态码,告诉浏览器重新去请求那个地址.所以地址栏显示的是新的URL.

     2.从数据共享来说
     forward:转发页面和转发到的页面可以共享request里面的数据.
     redirect:不能共享数据.

     3.从运用地方来说
     forward:一般用于用户登陆的时候,根据角色转发到相应的模块.
     redirect:一般用于用户注销登陆时返回主页面和跳转到其它的网站等.

     4.从效率来说
     forward:高.
     redirect:低.*/
}

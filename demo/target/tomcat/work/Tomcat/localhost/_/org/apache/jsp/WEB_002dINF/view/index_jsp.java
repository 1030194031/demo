/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-01-31 10:24:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.os.comment.base.CommonConstants;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/base.jsp", Long.valueOf(1454235194821L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /base.jsp(7,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctx");
      // /base.jsp(7,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(CommonConstants.contextPath);
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>搭建的第一个ssm</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/mailAutoComplete/style.css\"/>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/validate/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/mailAutoComplete/jquery.mailAutoComplete-3.1.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/layer-v2.1/layer/layer.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/layer-v2.1/layer/extend/layer.ext.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t//邮箱提示下拉\r\n");
      out.write("\t\t\t$(\"#customTest\").mailAutoComplete({\r\n");
      out.write("\t\t\t\tboxClass: \"out_box\", //外部box样式\r\n");
      out.write("\t\t\t\tlistClass: \"list_box\", //默认的列表样式\r\n");
      out.write("\t\t\t\tfocusClass: \"focus_box\", //列表选样式中\r\n");
      out.write("\t\t\t\tmarkCalss: \"mark_box\", //高亮样式\r\n");
      out.write("\t\t\t\tautoClass: false,\r\n");
      out.write("\t\t\t\ttextHint: true, //提示文字自动隐藏\r\n");
      out.write("\t\t\t\thintText: \"请输入邮箱地址\"\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t//发送邮件弹窗\r\n");
      out.write("\t\t\t$(\"#sendEmail\").on(\"click\",function(){\r\n");
      out.write("\t\t\t\tlayer.prompt({\r\n");
      out.write("\t\t\t\t\ttitle: '输入您的邮箱'\r\n");
      out.write("\t\t\t\t},function(val,index){\r\n");
      out.write("\t\t\t\t\tsendEmail(val);\r\n");
      out.write("\t\t\t\t\t//关闭弹窗\r\n");
      out.write("\t\t\t\t\tlayer.close(index);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t/**\r\n");
      out.write("\t\t * 发送邮件\r\n");
      out.write("\t\t **/\r\n");
      out.write("\t\tfunction sendEmail(email){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/front/ajax/sendEmail\",\r\n");
      out.write("\t\t\t\tdata:{\"email\":email},\r\n");
      out.write("\t\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\t\tcache : false,\r\n");
      out.write("\t\t\t\tasync:false,\r\n");
      out.write("\t\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\t\talert(result.message);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t/**\r\n");
      out.write("\t\t * 获取图形验证码\r\n");
      out.write("\t\t */\r\n");
      out.write("\t\tfunction changeVerifyCode(){\r\n");
      out.write("\t\t\t$(\"#verifyCode\").attr(\"src\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/VerifyCode/code?\"+Math.random());\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form action=\"/front/getUserList\" id=\"formSubmit\" method=\"post\">\r\n");
      out.write("\t  <div class=\"form-inline\">\r\n");
      out.write("\t      <label>操作</label>\r\n");
      out.write("\t      <button type=\"button\" class=\"btn btn-primary\" onclick=\"javascript:window.location='/front/user/getList'\">用户增删改查</button>\r\n");
      out.write("\t      <button type=\"button\" class=\"btn btn-primary\" onclick=\"javascript:window.location='/front/fileupload/list'\">上传下载文件</button>\r\n");
      out.write("\t      <button type=\"button\" class=\"btn btn-primary\" onclick=\"javascript:window.location='/front/template'\">velocity</button>\r\n");
      out.write("\t      <button type=\"button\" class=\"btn btn-primary\" onclick=\"javascript:window.location='/front/chooseUser'\">弹窗选择用户</button>\r\n");
      out.write("\t      <button type=\"button\" class=\"btn btn-primary\" onclick=\"javascript:window.location='/front/toValidate'\">validate表单验证</button>\r\n");
      out.write("\t      <button type=\"button\" class=\"btn btn-primary\" onclick=\"javascript:window.location='/front/toValidform'\">validForm表单验证</button>\r\n");
      out.write("\t\t      邮箱自动补全:<input type=\"text\" id=\"customTest\"  class=\"form-control\" name=\"\" value=\"\">\r\n");
      out.write("\t\t  <button type=\"button\" class=\"btn btn-primary\" onclick=\"javascript:window.location='/front/epiClock'\">倒计时</button>\r\n");
      out.write("\t\t  <button type=\"button\" class=\"btn btn-primary\" onclick=\"javascript:window.location='/front/My97DatePicker'\">My97DatePicker</button>\r\n");
      out.write("\t      <img alt=\"\" id=\"verifyCode\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/VerifyCode/code\" onclick=\"changeVerifyCode()\" style=\"width:90px;height:40px;\">\r\n");
      out.write("\t      <button type=\"button\" class=\"btn btn-primary\" onclick=\"javascript:window.location='/front/subject/subjectList'\">ztree</button>\r\n");
      out.write("\t      <button id=\"sendEmail\" type=\"button\" class=\"btn btn-primary\" onclick=\"javascript:void(0)\">邮件发送</button>\r\n");
      out.write("\t      <button type=\"button\" class=\"btn btn-primary\" onclick=\"javascript:window.location='/front/interfaces'\">接口</button>\r\n");
      out.write("\t      <button type=\"button\" class=\"btn btn-primary\" onclick=\"javascript:window.location='/front/baiduMap'\">百度地图</button>\r\n");
      out.write("\t      <button type=\"button\" class=\"btn btn-primary\" onclick=\"javascript:window.location='/front/userAjaxPage'\">ajax分页</button>\r\n");
      out.write("\t\t  <button type=\"button\" class=\"btn btn-primary\" onclick=\"javascript:window.location='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/front/toMd5'\">md5加解密</button>\r\n");
      out.write("\t\t  <button type=\"button\" class=\"btn btn-primary\" onclick=\"javascript:window.location='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/front/userPic'\">Jcrop头像裁剪</button>\r\n");
      out.write("\t\t  <button type=\"button\" class=\"btn btn-primary\" onclick=\"javascript:window.location='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/front/uploadifyTest'\">上传插件测试</button>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-01-31 10:24:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.subject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.os.comment.base.CommonConstants;

public final class subject_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>用户列表</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/ztree/css/zTreeStyle.css\" type=\"text/css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/ztree/css/demo.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/ztree/jquery-1.4.4.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/ztree/jquery.ztree.core-3.5.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/ztree/jquery.ztree.excheck-3.5.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/static/js/ztree/jquery.ztree.exedit-3.5.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\tvar zTreeNodes=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subjectListString}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\t\tvar treeObj= $.fn.zTree.init($(\"#tree\"), setting, zTreeNodes);\r\n");
      out.write("\t\t\ttreeObj.expandAll(true);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar checked = treeObj.getNodes()[0].checked;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tvar setting = {\r\n");
      out.write("\t\t\t\tcheck: {\r\n");
      out.write("\t\t\t\t\tenable: true,\r\n");
      out.write("\t\t\t\t\tchkStyle: \"checkbox\",\r\n");
      out.write("\t\t\t\t\tchkboxType: { \"Y\": \"ps\", \"N\": \"ps\" }\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tview: {\r\n");
      out.write("\t\t\t\t\tshowIcon: true,\r\n");
      out.write("\t\t\t\t\tshowLine: true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tedit: {\r\n");
      out.write("\t\t\t\t\tenable: true,\r\n");
      out.write("\t\t\t\t\teditNameSelectAll: true,\r\n");
      out.write("\t\t\t\t\trenameTitle: \"编辑专业名称\",\r\n");
      out.write("\t\t\t\t\tremoveTitle: \"删除专业\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tdata: {\r\n");
      out.write("\t\t\t\t\tkey: {\r\n");
      out.write("\t\t\t\t\t\ttitle: \"name\",\r\n");
      out.write("\t\t\t\t\t\tname:\"name\"\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tsimpleData: {\r\n");
      out.write("\t\t\t\t\t\tenable: true,\r\n");
      out.write("\t\t\t\t\t\tidKey: \"id\",\r\n");
      out.write("\t\t\t\t\t\tpIdKey: \"parentId\"\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tcallback: {\r\n");
      out.write("\t\t\t\t\tbeforeRename: beforeRename,\r\n");
      out.write("\t\t\t\t\tonRename: updateSubject,\r\n");
      out.write("\t\t\t\t\tbeforeRemove: beforeDelSubject,\r\n");
      out.write("\t\t\t\t\tonDrop: updateSubjectParent\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t//修改名称前检验数据\r\n");
      out.write("\t\tfunction beforeRename(treeId, treeNode, newName) {\r\n");
      out.write("\t\t\tif (newName.length == 0) {\r\n");
      out.write("\t\t\t\talert(\"专业名称不能为空.\");\r\n");
      out.write("\t\t\t\tvar zTree = $.fn.zTree.getZTreeObj(\"tree\");\r\n");
      out.write("\t\t\t\tsetTimeout(function(){zTree.editName(treeNode)}, 10);\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//修改专业名称\r\n");
      out.write("\t\tfunction updateSubject(event, treeId, treeNode, isCancel) {\r\n");
      out.write("\t\t\tif(treeNode.name==''){\r\n");
      out.write("\t\t\t\talert(\"请填写名称\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/front/subject/updateSubject',\r\n");
      out.write("\t\t\t\ttype:'post',\r\n");
      out.write("\t\t\t\tdataType:'json',\r\n");
      out.write("\t\t\t\tdata:{\r\n");
      out.write("\t\t\t\t\t'subject.id':treeNode.id,\r\n");
      out.write("\t\t\t\t\t'subject.name':treeNode.name\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\t\tif(result.success==false){\r\n");
      out.write("\t\t\t\t\t\talert('系统繁忙');\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//删除专业\r\n");
      out.write("\t\tfunction beforeDelSubject(treeId, treeNode){\r\n");
      out.write("\t\t\tvar tip='确定删除';\r\n");
      out.write("\t\t\tif(treeNode.isParent){\r\n");
      out.write("\t\t\t\ttip+='父节点\"'+treeNode.name+'\"';\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\ttip+='\"'+treeNode.name+'\"'\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\ttip+='及其子节点吗？';\r\n");
      out.write("\t\t\tif(confirm(tip)){\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/front/subject/delSubject',\r\n");
      out.write("\t\t\t\t\ttype:'post',\r\n");
      out.write("\t\t\t\t\tdataType:'json',\r\n");
      out.write("\t\t\t\t\tdata:{\r\n");
      out.write("\t\t\t\t\t\t'ids':treeNode.id\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\t\t\tif(result.success==false){\r\n");
      out.write("\t\t\t\t\t\t\talert('系统繁忙');\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//修改专业父节点\r\n");
      out.write("\t\tfunction updateSubjectParent(event, treeId, treeNodes, targetNode, moveType) {\r\n");
      out.write("\t\t\tvar id=treeNodes[0].id;\r\n");
      out.write("\t\t\tvar pId=0;\r\n");
      out.write("\t\t\tif(targetNode!=null){\r\n");
      out.write("\t\t\t\t//拖拽目标不是根目录\r\n");
      out.write("\t\t\t\tpId=targetNode.id;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/front/subject/updateSubjectParent',\r\n");
      out.write("\t\t\t\ttype:'post',\r\n");
      out.write("\t\t\t\tdataType:'json',\r\n");
      out.write("\t\t\t\tdata:{\r\n");
      out.write("\t\t\t\t\t'subject.id':id,\r\n");
      out.write("\t\t\t\t\t'subject.parentId':pId\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\t\tif(result.success==false){\r\n");
      out.write("\t\t\t\t\t\talert('系统繁忙');\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//创建专业节点\r\n");
      out.write("\t\tfunction createSubject(){\r\n");
      out.write("\t\t\tvar zTree = $.fn.zTree.getZTreeObj(\"tree\"),\r\n");
      out.write("\t\t\tnodes = zTree.getSelectedNodes(),\r\n");
      out.write("\t\t\ttreeNode = nodes[0];\r\n");
      out.write("\t\t\tvar pId=0;\r\n");
      out.write("\t\t\tif (treeNode) {\r\n");
      out.write("\t\t\t\tpId=treeNode.id;\r\n");
      out.write("\t\t\t\ttreeNode = zTree.addNodes(treeNode, {pId:treeNode.id, isParent:false, name:\"新建专业\"});\r\n");
      out.write("\t\t\t} else{\r\n");
      out.write("\t\t\t\ttreeNode = zTree.addNodes(null, { pId:0, isParent:false, name:\"新建专业\"});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/front/subject/createSubject',\r\n");
      out.write("\t\t\t\ttype:'post',\r\n");
      out.write("\t\t\t\tdataType:'json',\r\n");
      out.write("\t\t\t\tdata:{\r\n");
      out.write("\t\t\t\t\t'subject.name':'新建专业',\r\n");
      out.write("\t\t\t\t\t'subject.parentId':pId\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\t\tif(result.success==false){\r\n");
      out.write("\t\t\t\t\t\talert('系统繁忙');\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//获得勾选checkbox的节点\r\n");
      out.write("\t\tfunction getSelectSubject(){\r\n");
      out.write("\t\t\tvar treeObj = $.fn.zTree.getZTreeObj(\"tree\");\r\n");
      out.write("\t\t\tvar nodes = treeObj.getCheckedNodes(true);\r\n");
      out.write("\t\t\tvar names='';\r\n");
      out.write("\t\t\tfor(var i=0;i<nodes.length;i++){\r\n");
      out.write("\t\t\t\tnames+=\"[\"+nodes[i].id+nodes[i].name+\"]\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\talert(names);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//全选\r\n");
      out.write("\t\tfunction selectAllSubject(){\r\n");
      out.write("\t\t\tvar treeObj = $.fn.zTree.getZTreeObj(\"tree\");\r\n");
      out.write("\t\t\ttreeObj.checkAllNodes(true);//false\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//checkNodecheckNodecheckNodecheckNodecheckNodecheckNode选中节点\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<ul id=\"tree\" class=\"ztree\"></ul>\r\n");
      out.write("\t<input type=\"button\" class=\"btn btn-primary\" value=\"全选\"  onClick=\"selectAllSubject()\"/>\r\n");
      out.write("\t<input type=\"button\" class=\"btn btn-primary\" value=\"添加分类\"  onClick=\"createSubject()\"/>\r\n");
      out.write("\t<input type=\"button\" class=\"btn btn-primary\" value=\"获得选中节点的id\"  onClick=\"getSelectSubject()\"/><br/>\r\n");
      out.write("\t\r\n");
      out.write("------------------------------------------------------------------------------------------------------------------------------------------------\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\tvar zTreeNodes=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${subjectListString}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\r\n");
      out.write("\t\t\t$.fn.zTree.init($(\"#treeDemo\"), settimg, zTreeNodes);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tvar settimg = {\r\n");
      out.write("\t\t\t\tview: {\r\n");
      out.write("\t\t\t\t\tdblClickExpand: false\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tdata: {\r\n");
      out.write("\t\t\t\t\tkey: {\r\n");
      out.write("\t\t\t\t\t\ttitle: \"name\",\r\n");
      out.write("\t\t\t\t\t\tname:\"name\"\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tsimpleData: {\r\n");
      out.write("\t\t\t\t\t\tenable: true,\r\n");
      out.write("\t\t\t\t\t\tidKey: \"id\",\r\n");
      out.write("\t\t\t\t\t\tpIdKey: \"parentId\"\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tcallback: {\r\n");
      out.write("\t\t\t\t\tbeforeClick: beforeClick,\r\n");
      out.write("\t\t\t\t\tonClick: onClick\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\r\n");
      out.write("\t \t\tfunction beforeClick(treeId, treeNode) {\r\n");
      out.write("\t \t\t\tvar check = (treeNode && !treeNode.isParent);\r\n");
      out.write("\t \t\t\tif (!check) alert(\"只能选择子节点...\");\r\n");
      out.write("\t \t\t\treturn check;\r\n");
      out.write("\t \t\t}\r\n");
      out.write("\t \t\t\r\n");
      out.write("\t \t\tfunction onClick(e, treeId, treeNode) {\r\n");
      out.write("\t \t\t\tvar zTree = $.fn.zTree.getZTreeObj(\"treeDemo\"),\r\n");
      out.write("\t \t\t\tnodes = zTree.getSelectedNodes(),\r\n");
      out.write("\t \t\t\tv = \"\";\r\n");
      out.write("\t \t\t\tnodes.sort(function compare(a,b){return a.id-b.id;});\r\n");
      out.write("\t \t\t\tfor (var i=0, l=nodes.length; i<l; i++) {\r\n");
      out.write("\t \t\t\t\tv += nodes[i].name + \",\";\r\n");
      out.write("\t \t\t\t}\r\n");
      out.write("\t \t\t\tif (v.length > 0 ) v = v.substring(0, v.length-1);\r\n");
      out.write("\t \t\t\tvar cityObj = $(\"#citySel\");\r\n");
      out.write("\t \t\t\tcityObj.attr(\"value\", v);\r\n");
      out.write("\t \t\t}\r\n");
      out.write("\r\n");
      out.write("\t \t\tfunction showMenu() {\r\n");
      out.write("\t \t\t\tvar cityObj = $(\"#citySel\");\r\n");
      out.write("\t \t\t\tvar cityOffset = $(\"#citySel\").offset();\r\n");
      out.write("\t \t\t\t$(\"#menuContent\").css({left:cityOffset.left + \"px\", top:cityOffset.top + cityObj.outerHeight() + \"px\"}).slideDown(\"fast\");\r\n");
      out.write("\r\n");
      out.write("\t \t\t\t$(\"body\").bind(\"mousedown\", onBodyDown);\r\n");
      out.write("\t \t\t}\r\n");
      out.write("\t \t\tfunction hideMenu() {\r\n");
      out.write("\t \t\t\t$(\"#menuContent\").fadeOut(\"fast\");\r\n");
      out.write("\t \t\t\t$(\"body\").unbind(\"mousedown\", onBodyDown);\r\n");
      out.write("\t \t\t}\r\n");
      out.write("\t \t\tfunction onBodyDown(event) {\r\n");
      out.write("\t \t\t\tif (!(event.target.id == \"menuBtn\" || event.target.id == \"menuContent\" || $(event.target).parents(\"#menuContent\").length>0)) {\r\n");
      out.write("\t \t\t\t\thideMenu();\r\n");
      out.write("\t \t\t\t}\r\n");
      out.write("\t \t\t}\r\n");
      out.write("\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li>&nbsp;&nbsp;<span>选择城市时，按下 Ctrl 或 Cmd 键可以进行多选</span></li>\r\n");
      out.write("\t\t<li>&nbsp;&nbsp;城市：<input id=\"citySel\" onclick=\"showMenu();\" type=\"text\" readonly value=\"\" style=\"width:120px;\"/></li>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t<div id=\"menuContent\" class=\"menuContent\" style=\"display:none; position: absolute;\">\r\n");
      out.write("\t\t<ul id=\"treeDemo\" class=\"ztree\" style=\"margin-top:0; width:160px;\"></ul>\r\n");
      out.write("\t</div>\r\n");
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

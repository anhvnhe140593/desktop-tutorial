package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Entity.Product;
import java.util.List;

public final class product_002ddetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/component/navbar.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html> \n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/product-details.css\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <title>Hello, world!</title>\n");
      out.write("        <!--        khi di chuyen con trỏ chuột đén thì tạo hiệu ứng chuyển màu-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            * {box-sizing: border-box;}\n");
      out.write("\n");
      out.write("            .img-magnifier-container {\n");
      out.write("                position:relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .img-magnifier-glass {\n");
      out.write("                position: absolute;\n");
      out.write("                border: 3px solid #000;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                cursor: none;\n");
      out.write("                /*Set the size of the magnifier glass:*/\n");
      out.write("                width: 100px;\n");
      out.write("                height: 100px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function magnify(imgID, zoom) {\n");
      out.write("                var img, glass, w, h, bw;\n");
      out.write("                img = document.getElementById(imgID);\n");
      out.write("                /*create magnifier glass:*/\n");
      out.write("                glass = document.createElement(\"DIV\");\n");
      out.write("                glass.setAttribute(\"class\", \"img-magnifier-glass\");\n");
      out.write("                /*insert magnifier glass:*/\n");
      out.write("                img.parentElement.insertBefore(glass, img);\n");
      out.write("                /*set background properties for the magnifier glass:*/\n");
      out.write("                glass.style.backgroundImage = \"url('\" + img.src + \"')\";\n");
      out.write("                glass.style.backgroundRepeat = \"no-repeat\";\n");
      out.write("                glass.style.backgroundSize = (img.width * zoom) + \"px \" + (img.height * zoom) + \"px\";\n");
      out.write("                bw = 3;\n");
      out.write("                w = glass.offsetWidth / 2;\n");
      out.write("                h = glass.offsetHeight / 2;\n");
      out.write("                /*execute a function when someone moves the magnifier glass over the image:*/\n");
      out.write("                glass.addEventListener(\"mousemove\", moveMagnifier);\n");
      out.write("                img.addEventListener(\"mousemove\", moveMagnifier);\n");
      out.write("                /*and also for touch screens:*/\n");
      out.write("                glass.addEventListener(\"touchmove\", moveMagnifier);\n");
      out.write("                img.addEventListener(\"touchmove\", moveMagnifier);\n");
      out.write("                function moveMagnifier(e) {\n");
      out.write("                    var pos, x, y;\n");
      out.write("                    /*prevent any other actions that may occur when moving over the image*/\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    /*get the cursor's x and y positions:*/\n");
      out.write("                    pos = getCursorPos(e);\n");
      out.write("                    x = pos.x;\n");
      out.write("                    y = pos.y;\n");
      out.write("                    /*prevent the magnifier glass from being positioned outside the image:*/\n");
      out.write("                    if (x > img.width - (w / zoom)) {\n");
      out.write("                        x = img.width - (w / zoom);\n");
      out.write("                    }\n");
      out.write("                    if (x < w / zoom) {\n");
      out.write("                        x = w / zoom;\n");
      out.write("                    }\n");
      out.write("                    if (y > img.height - (h / zoom)) {\n");
      out.write("                        y = img.height - (h / zoom);\n");
      out.write("                    }\n");
      out.write("                    if (y < h / zoom) {\n");
      out.write("                        y = h / zoom;\n");
      out.write("                    }\n");
      out.write("                    /*set the position of the magnifier glass:*/\n");
      out.write("                    glass.style.left = (x - w) + \"px\";\n");
      out.write("                    glass.style.top = (y - h) + \"px\";\n");
      out.write("                    /*display what the magnifier glass \"sees\":*/\n");
      out.write("                    glass.style.backgroundPosition = \"-\" + ((x * zoom) - w + bw) + \"px -\" + ((y * zoom) - h + bw) + \"px\";\n");
      out.write("                }\n");
      out.write("                function getCursorPos(e) {\n");
      out.write("                    var a, x = 0, y = 0;\n");
      out.write("                    e = e || window.event;\n");
      out.write("                    /*get the x and y positions of the image:*/\n");
      out.write("                    a = img.getBoundingClientRect();\n");
      out.write("                    /*calculate the cursor's x and y coordinates, relative to the image:*/\n");
      out.write("                    x = e.pageX - a.left;\n");
      out.write("                    y = e.pageY - a.top;\n");
      out.write("                    /*consider any page scrolling:*/\n");
      out.write("                    x = x - window.pageXOffset;\n");
      out.write("                    y = y - window.pageYOffset;\n");
      out.write("                    return {x: x, y: y};\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"https://kit.fontawesome.com/c386bc4f78.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <a style=\"font-size: 20px; font-weight: bold;\" class=\"navbar-brand\" href=\"products\">Shop Dem</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\n");
      out.write("            <div class=\"ml-auto\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <form class=\"form-inline mr-3\" action=\"search\" method=\"get\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input style=\"margin-left: 300px;\" type=\"text\" class=\"form-control\" name=\"input-text\" placeholder=\"Tìm kiếm\">\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <button type=\"submit\" name=\"btn-search\" class=\"input-group-text\">Search</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a style=\"margin-left: 50px;\" class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                            Sắp xếp\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <li><a class=\"mt-3\" style=\"text-transform: uppercase; font-weight: 500; margin-left: 15px;\" href=\"sort?type=3\" >Tăng dần</a></li>\n");
      out.write("                            <li><a class=\"mt-3\" style=\"text-transform: uppercase; font-weight: 500; margin-left: 15px;\" href=\"sort?type=4\" >Giảm dầns</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li style=\"margin-left: 150px;\" class=\"nav-item mr-2\">\n");
      out.write("                        <a class=\"nav-link\" href=\"cart.jsp\">\n");
      out.write("                            <i class=\"fas fa-shopping-cart\" style=\"font-size: 22px;\"><span class=\"badge rounded-pill bg-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.totalProduct}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span></i>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--container co chuc nang la thu nhỏ hoac phong to hai bên le cua trang web-->\n");
      out.write("        <div id=\"main-contain\" class=\"container\">\n");
      out.write("            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- Option 1: Bootstrap Bundle with Popper -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script>\n");
      out.write("            /* Initiate Magnify Function\n");
      out.write("             with the id of the image, and the strength of the magnifier glass:*/\n");
      out.write("            magnify(\"myimage\", 3);\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("    \n");
        out.write("                        <li class=\"nav-item dropdown\">\n");
        out.write("                            <a style=\"margin-left: 10px;\" class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
        out.write("                                ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                            </a>\n");
        out.write("                            <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
        out.write("                                <li><a class=\"dropdown-item\" href=\"user-index.jsp\">Thông tin tài khoản</a></li>\n");
        out.write("                                <li><a class=\"dropdown-item\" href=\"logout\">Đăng xuất</a></li>\n");
        out.write("                            </ul>\n");
        out.write("                        </li>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <li style=\"margin-left: 50px;\" class=\"nav-item\">\n");
        out.write("                            <a  class=\"nav-link\" href=\"Register.jsp\">Đăng ký</a>\n");
        out.write("                        </li>\n");
        out.write("                        <li class=\"nav-item\">\n");
        out.write("                            <a class=\"nav-link\" href=\"login.jsp\">Đăng nhập</a>\n");
        out.write("                        </li>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lsProduct eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <div class=\"row\">\n");
        out.write("                    <div class=\"col-md-12\">\n");
        out.write("                        <h4 class=\"text-center\">Không tìm thấy sản phẩm nào.</h4>\n");
        out.write("                        <h6 class=\"text-center\"><a href=\"products\">Quay lại ></a></h6>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lsProduct ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <div class=\"row\">\n");
        out.write("                    <div class=\"col-md-6\" style=\"margin-top: 60px;\">\n");
        out.write("                        <div class=\"img mg-top-15\">\n");
        out.write("                            <div class=\"container-img\">\n");
        out.write("                                <div class=\"img-magnifier-container\">\n");
        out.write("                                    <img id=\"myimage\" src=\"asset/product/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.lsProduct.imgName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" width=\"600\" height=\"400\">\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("                    <div class=\"col-md-5\">\n");
        out.write("                        <div class=\"product-details\">\n");
        out.write("                            <h3>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lsProduct.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h3>\n");
        out.write("                            <p class=\"price\">Giá: ");
        if (_jspx_meth_fmt_formatNumber_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("<sup>đ</sup>\n");
        out.write("                                ");
        if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </p>\n");
        out.write("                            <div > Số lượng: \n");
        out.write("                                <button type=\"button\" class=\"minus\">-</button>\n");
        out.write("                                <input type=\"number\" id=\"quantity_6060b852c5672\" style=\"width: 50px;\" class=\"input-text qty text\" step=\"1\" min=\"1\" max=\"10\" name=\"quantity\" value=\"1\" title=\"SL\" size=\"4\" placeholder=\"\" inputmode=\"numeric\">\n");
        out.write("                                <button type=\"button\" class=\"plus\">+</button>\n");
        out.write("                            </div>\n");
        out.write("                            <a href=\"cart?id=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lsProduct.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"btn-add-to-cart\">\n");
        out.write("                                <i class=\"fas fa-cart-plus fa-fw fa-lg mg-right-5\"></i> Thêm vào giỏ hàng\n");
        out.write("                            </a>\n");
        out.write("                            <div class=\"row\">\n");
        out.write("                                <div class=\"col-md-12 info\">\n");
        out.write("                                    <p class=\"description bd-t pt-3\">\n");
        out.write("                                        <label>Chi tiết sản phẩm</label>\n");
        out.write("                                        <span>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lsProduct.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\n");
        out.write("                                    </p>\n");
        out.write("                                    <p class=\"local bd-t pt-3\">\n");
        out.write("                                        <label>Mua hàng trực tiếp tại cửa hàng</label>\n");
        out.write("                                    <ul>\n");
        out.write("                                        <li>133 Thái Hà, Phường Trung Liệt, Q.Đống Đa, Hà Nội</li>\n");
        out.write("                                    </ul>\n");
        out.write("                                    </p>\n");
        out.write("                                    <p class=\"refund bd-t pt-3\">\n");
        out.write("                                        <label>Giao hàng và trả lại hàng</label>\n");
        out.write("                                    <ul>\n");
        out.write("                                        <li>Đổi hàng trong vòng 72h</li>\n");
        out.write("                                        <li>Phí vận chuyển nội thành Hà Nội: 20.000 </li>\n");
        out.write("                                        <li>Phí vận chuyển ngoại thành/ngoại tỉnh: tùy thuộc vào địa điểm</li>\n");
        out.write("                                        <li>Thanh toán khi nhận hàng</li>\n");
        out.write("                                    </ul>\n");
        out.write("                                    </p>\n");
        out.write("                                    <p class=\"bd-t\"></p>\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_fmt_formatNumber_0.setType("number");
    _jspx_th_fmt_formatNumber_0.setMaxFractionDigits(3);
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lsProduct.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lsProduct.status == 2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <span class=\"badge badge-success mg-left-10\">SALE</span>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }
}

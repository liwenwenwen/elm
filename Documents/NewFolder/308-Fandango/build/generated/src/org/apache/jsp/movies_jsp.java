package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class movies_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<html class=\"no-js\" lang=\"\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Movies | ELM</title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\n");
      out.write("        <!-- Place favicon.ico in the root directory -->\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("        <script src=\"js/vendor/modernizr-2.8.3.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/site.css\">\n");
      out.write("        \n");
      out.write("        <!-- Fonts -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Luckiest+Guy|Permanent+Marker\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("        <!-- Page specific CSS links go here -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/header.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/movies.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--[if lt IE 8]>\n");
      out.write("            <p class=\"browserupgrade\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> to improve your experience.</p>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("        <!-- Navbar -->\n");
      out.write("        <div id=\"header\" class=\"container\">\n");
      out.write("          <a href=\"#\" id=\"logo\">ELM:Stay Frosty</a>\n");
      out.write("          <ul class=\"nav nav-pills \">\n");
      out.write("            <li>\n");
      out.write("              <form action=\"#\">\n");
      out.write("                <input id=\"search-bar\" type=\"text\" placeholder=\"Search\">\n");
      out.write("              </form>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("              <a class=\"nav-btn dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Menu</a>\n");
      out.write("              <ul class=\"dropdown-menu nav-dropdown\">\n");
      out.write("                <li><a href=\"#\">Movies</a></li>\n");
      out.write("                <li><a href=\"actors.html\">Actors</a></li>\n");
      out.write("                <li><a href=\"news.html\">News</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            <li><a class=\"nav-btn\" href=\"#\">Showtimes</a></li>\n");
      out.write("            <li><a class=\"nav-btn\" href=\"#\">Login / Register</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <!-- /Navbar -->\n");
      out.write("        <!-- Title -->\n");
      out.write("        <div id=\"title-bg\">\n");
      out.write("         <div id=\"title-div\" class=\"container\">\n");
      out.write("           <span id=\"page-title\">MOVIES</span>\n");
      out.write("         </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /Title -->        \n");
      out.write("        <!-- Page Content -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <h1>Opening this Week</h1>\n");
      out.write("          <div class=\"movie-listing\">\n");
      out.write("            <a href=\"#\" class=\"thumbnail movie-thumbnail\">\n");
      out.write("              <img class=\"movie-poster img-responsive noMargin\" src=\"http://placehold.it/270x400\" alt=\"\">\n");
      out.write("              <div class=\"movie-text\">\n");
      out.write("                <span class=\"movie-title\">Movie Name</span>\n");
      out.write("                <span class=\"movie-release\">12/31/9999</span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"thumbnail movie-thumbnail\">\n");
      out.write("              <img class=\"movie-poster img-responsive noMargin\" src=\"http://placehold.it/270x400\" alt=\"\">\n");
      out.write("              <div class=\"movie-text\">\n");
      out.write("                <span class=\"movie-title\">Movie Name</span>\n");
      out.write("                <span class=\"movie-release\">12/31/9999</span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"thumbnail movie-thumbnail\">\n");
      out.write("              <img class=\"movie-poster img-responsive noMargin\" src=\"http://placehold.it/270x400\" alt=\"\">\n");
      out.write("              <div class=\"movie-text\">\n");
      out.write("                <span class=\"movie-title\">Movie Name</span>\n");
      out.write("                <span class=\"movie-release\">12/31/9999</span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"thumbnail movie-thumbnail\">\n");
      out.write("              <img class=\"movie-poster img-responsive noMargin\" src=\"http://placehold.it/270x400\" alt=\"\">\n");
      out.write("              <div class=\"movie-text\">\n");
      out.write("                <span class=\"movie-title\">Movie Name</span>\n");
      out.write("                <span class=\"movie-release\">12/31/9999</span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <h1>In Theaters</h1>\n");
      out.write("          <div class=\"movie-listing\">\n");
      out.write("            <a href=\"#\" class=\"thumbnail movie-thumbnail\">\n");
      out.write("              <img class=\"movie-poster img-responsive noMargin\" src=\"http://placehold.it/270x400\" alt=\"\">\n");
      out.write("              <div class=\"movie-text\">\n");
      out.write("                <span class=\"movie-title\">Movie Name</span>\n");
      out.write("                <span class=\"movie-release\">12/31/9999</span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"thumbnail movie-thumbnail\">\n");
      out.write("              <img class=\"movie-poster img-responsive noMargin\" src=\"http://placehold.it/270x400\" alt=\"\">\n");
      out.write("              <div class=\"movie-text\">\n");
      out.write("                <span class=\"movie-title\">Movie Name</span>\n");
      out.write("                <span class=\"movie-release\">12/31/9999</span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"thumbnail movie-thumbnail\">\n");
      out.write("              <img class=\"movie-poster img-responsive noMargin\" src=\"http://placehold.it/270x400\" alt=\"\">\n");
      out.write("              <div class=\"movie-text\">\n");
      out.write("                <span class=\"movie-title\">Movie Name</span>\n");
      out.write("                <span class=\"movie-release\">12/31/9999</span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"thumbnail movie-thumbnail\">\n");
      out.write("              <img class=\"movie-poster img-responsive noMargin\" src=\"http://placehold.it/270x400\" alt=\"\">\n");
      out.write("              <div class=\"movie-text\">\n");
      out.write("                <span class=\"movie-title\">Movie Name</span>\n");
      out.write("                <span class=\"movie-release\">12/31/9999</span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"thumbnail movie-thumbnail\">\n");
      out.write("              <img class=\"movie-poster img-responsive noMargin\" src=\"http://placehold.it/270x400\" alt=\"\">\n");
      out.write("              <div class=\"movie-text\">\n");
      out.write("                <span class=\"movie-title\">Movie Name</span>\n");
      out.write("                <span class=\"movie-release\">12/31/9999</span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"thumbnail movie-thumbnail\">\n");
      out.write("              <img class=\"movie-poster img-responsive noMargin\" src=\"http://placehold.it/270x400\" alt=\"\">\n");
      out.write("              <div class=\"movie-text\">\n");
      out.write("                <span class=\"movie-title\">Movie Name</span>\n");
      out.write("                <span class=\"movie-release\">12/31/9999</span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"thumbnail movie-thumbnail\">\n");
      out.write("              <img class=\"movie-poster img-responsive noMargin\" src=\"http://placehold.it/270x400\" alt=\"\">\n");
      out.write("              <div class=\"movie-text\">\n");
      out.write("                <span class=\"movie-title\">Movie Name</span>\n");
      out.write("                <span class=\"movie-release\">12/31/9999</span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"thumbnail movie-thumbnail\">\n");
      out.write("              <img class=\"movie-poster img-responsive noMargin\" src=\"http://placehold.it/270x400\" alt=\"\">\n");
      out.write("              <div class=\"movie-text\">\n");
      out.write("                <span class=\"movie-title\">Movie Name</span>\n");
      out.write("                <span class=\"movie-release\">12/31/9999</span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"thumbnail movie-thumbnail\">\n");
      out.write("              <img class=\"movie-poster img-responsive noMargin\" src=\"http://placehold.it/270x400\" alt=\"\">\n");
      out.write("              <div class=\"movie-text\">\n");
      out.write("                <span class=\"movie-title\">Movie Name</span>\n");
      out.write("                <span class=\"movie-release\">12/31/9999</span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"thumbnail movie-thumbnail\">\n");
      out.write("              <img class=\"movie-poster img-responsive noMargin\" src=\"http://placehold.it/270x400\" alt=\"\">\n");
      out.write("              <div class=\"movie-text\">\n");
      out.write("                <span class=\"movie-title\">Movie Name</span>\n");
      out.write("                <span class=\"movie-release\">12/31/9999</span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"thumbnail movie-thumbnail\">\n");
      out.write("              <img class=\"movie-poster img-responsive noMargin\" src=\"http://placehold.it/270x400\" alt=\"\">\n");
      out.write("              <div class=\"movie-text\">\n");
      out.write("                <span class=\"movie-title\">Movie Name</span>\n");
      out.write("                <span class=\"movie-release\">12/31/9999</span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\" class=\"thumbnail movie-thumbnail\">\n");
      out.write("              <img class=\"movie-poster img-responsive noMargin\" src=\"http://placehold.it/270x400\" alt=\"\">\n");
      out.write("              <div class=\"movie-text\">\n");
      out.write("                <span class=\"movie-title\">Movie Name</span>\n");
      out.write("                <span class=\"movie-release\">12/31/9999</span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-1.12.0.min.js\"></script>\n");
      out.write("        <script>window.jQuery || document.write('<script src=\"js/vendor/jquery-1.12.0.min.js\"><\\/script>')</script>\n");
      out.write("        <script src=\"js/plugins.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
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
}

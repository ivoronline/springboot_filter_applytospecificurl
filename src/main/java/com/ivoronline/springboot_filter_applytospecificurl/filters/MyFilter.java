package com.ivoronline.springboot_filter_applytospecificurl.filters;

import org.springframework.web.filter.OncePerRequestFilter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = {"/Filtered"})
public class MyFilter extends OncePerRequestFilter {

  //===================================================================
  // DO FILTER
  //===================================================================
  @Override
  public void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
    throws IOException, ServletException {
    System.out.println("FILTER");
    chain.doFilter(request, response);
  }

}




package com.course.platform.security;

import com.course.platform.repository.UserRepository;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
@Component

public class SecurityFilter extends OncePerRequestFilter {
    private static final String AUTHORIZATION = "Authorization";
    private static final String BEARER = "Bearer";
    @Autowired
    private TokenService service;

    @Autowired
    private UserRepository repository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
      var token = recoverToken(request);
      if(token != null ){
      var email = service.validateToken(token);
          UserDetails user = repository.findByEmail(email);
          var authentication = new UsernamePasswordAuthenticationToken(user , null , user.getAuthorities());
          SecurityContextHolder.getContext().setAuthentication(authentication);
      }
      filterChain.doFilter(request , response);
    }
    private String recoverToken(HttpServletRequest request){
        var authHeader = request.getHeader(AUTHORIZATION);
        if(authHeader == null) return null;
        return authHeader.replace(BEARER, " ");
    }

}

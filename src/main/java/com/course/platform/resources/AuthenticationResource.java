package com.course.platform.resources;

import com.course.platform.entities.User;
import com.course.platform.entities.dto.ResponseToken;
import com.course.platform.entities.dto.UserDTO;
import com.course.platform.repository.UserRepository;
import com.course.platform.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "auth")
public class AuthenticationResource {
    @Autowired
    private TokenService service;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/login")
    public ResponseEntity<?> login(@RequestBody @Valid UserDTO dto){
     var emailPassword = new UsernamePasswordAuthenticationToken(dto.getEmail() , dto.getPassword());
     var auth = authenticationManager.authenticate(emailPassword);
     var token =  service.generateToken((User) auth.getPrincipal());
     return ResponseEntity.ok(new ResponseToken(token));
    }

    @PostMapping(value = "/register")
    public ResponseEntity<?> register(@RequestBody @Valid UserDTO dto){
         if(userRepository.findByEmail(dto.getEmail()) != null) return ResponseEntity.badRequest().build();
         String encryptedPassword = new BCryptPasswordEncoder().encode(dto.getPassword());
         User createdUser = new User(dto.getName() , dto.getEmail() , encryptedPassword , dto.getRole());
         userRepository.save(createdUser);
         return ResponseEntity.ok().build();


    }


}

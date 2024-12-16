package br.com.jj.nervosia.controller;

import br.com.jj.nervosia.dto.DadosCadastroUser;
import br.com.jj.nervosia.dto.UserDTO;
import br.com.jj.nervosia.service.UserService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/cadastrar")
    @Transactional
    public ResponseEntity<?> cadastrar(@RequestBody @Valid DadosCadastroUser dados){
        return userService.cadastrar(dados);
    }

    @GetMapping
    public String listar(){
        return userService.obterTodosUsers();
    }
}

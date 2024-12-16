package br.com.jj.nervosia.service;

import br.com.jj.nervosia.dto.DadosCadastroUser;
import br.com.jj.nervosia.dto.UserDTO;
import br.com.jj.nervosia.model.Users;
import br.com.jj.nervosia.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<UserDTO> cadastrar(@RequestBody @Valid DadosCadastroUser dados){
        String senhaCriptografada = dados.password();
        var dadosCadastroUser = new DadosCadastroUser(dados.username(), senhaCriptografada);

        var login = new Users(dadosCadastroUser);
        userRepository.save(login);

        return ResponseEntity.ok().build();
    }

    public String obterTodosUsers() {
        return "aqui aparecerá todos os usuários listados";
    }

//    private List<UserDTO> converteDados(List<Users> users){
//        return users.stream().map(l -> new UserDTO(1L,"jackson")).collect(Collectors.toList());
//    }
}

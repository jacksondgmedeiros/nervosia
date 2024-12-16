package br.com.jj.nervosia.model;

import br.com.jj.nervosia.dto.DadosCadastroUser;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    private String password;

    public Users(DadosCadastroUser dados) {
        this.username = dados.username();
        this.password = dados.password();

    }

}

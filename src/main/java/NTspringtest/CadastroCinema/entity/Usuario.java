package NTspringtest.CadastroCinema.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "USUARIO")
public class Usuario {

    @Id
    private int id;

    private String nome;
    private String role;
    private int idade;

}



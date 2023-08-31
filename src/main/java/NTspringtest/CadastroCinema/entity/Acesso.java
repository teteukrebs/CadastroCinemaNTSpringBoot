package NTspringtest.CadastroCinema.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "ACESSO")
public class Acesso {

    @Id
    private int id;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    private String username;
    private String password;

}


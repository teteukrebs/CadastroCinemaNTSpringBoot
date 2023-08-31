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

    private int idUsuario;
    private String username;
    private String password;


}

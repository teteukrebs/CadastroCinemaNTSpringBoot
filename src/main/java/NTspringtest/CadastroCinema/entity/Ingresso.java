package NTspringtest.CadastroCinema.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "INGRESSO")
public class Ingresso {

    @Id
    private int id;

    private int idFilme;
    private int idUsuario;

}

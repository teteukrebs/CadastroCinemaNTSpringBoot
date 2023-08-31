package NTspringtest.CadastroCinema.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "FILME")
public class Filme {

    @Id
    private int id;

    private String titulo;
    private String genero;
    private int idadeMinima;
    private int tempo;
    private double valor;
    private String tecnologia;
    private int poltronasDisponiveis;


}


package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class PeliculaEntity extends BaseEntity{
    private String titulo;
    private int anioLanzamiento;


    @ManyToMany(mappedBy="peliculas")
    private List<ActorEntity> actores = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="director")
    private DirectorEntity director;
}

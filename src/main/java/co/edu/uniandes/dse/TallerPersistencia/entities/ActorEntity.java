package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import lombok.Data;

@Data
@Entity
public class ActorEntity extends BaseEntity{
    private String nombre;
    private String nacionalidad;


    @ManyToMany
    @JoinTable(name="actores_peliculas")
    private List<PeliculaEntity> peliculas = new ArrayList<>();

}

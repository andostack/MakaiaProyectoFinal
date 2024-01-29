package com.makaia.MakaiaProyectoFinal.entities;

import com.makaia.MakaiaProyectoFinal.enums.*;
import jakarta.persistence.*;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

@Entity
@Getter
@Table(name = "aspirante")
public class Aspirante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(length = 100, nullable = false)
    private String idAspirantePrueba;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Programa programa;

    @Column(length = 100, nullable = false)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @NotNull
    private TipoDocumento tipoDocumento;

    @Column(length = 20, nullable = false)
    private Integer numDocumento;

    @Enumerated(EnumType.STRING)

    private Genero genero;

    @Column(length = 2, nullable = false)
    private int edad ;

    @Column(length = 6, nullable = false)
    private Date nacimiento;

    @Column(length = 15, nullable = false)
    private Integer celular;

    @Column(nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)

    private Departamento departamento;

    @Column(length = 50, nullable = false)
    private String ciudad;

    @Column(length = 80, nullable = false)
    private String direccionResidencia;

    @Enumerated(EnumType.STRING)

    private Estrato estrato;

    @Enumerated(EnumType.STRING)

    private Reconocimiento reconocimiento;

    @Enumerated(EnumType.STRING)

    private Discapacidad discapacidad ;

    @Enumerated(EnumType.STRING)

    private Poblacion poblacion;

    @Enumerated(EnumType.STRING)

    private NivelEducativo nivelEducativo;

    @Enumerated(EnumType.STRING)

    private Ocupacion ocupacion ;

    @Column(length = 50, nullable = false)
    private String ultimoTituloAcademico ;

    @Column(length = 50, nullable = false)
    private String estudioTrabajo;

    @Enumerated(EnumType.STRING)

    private Salario salario;

    @Column(length = 100, nullable = false)
    private String tiempoLibre;

    @Enumerated(EnumType.STRING)

    private EstadoAspirante estadoAspirante = EstadoAspirante.PROCESO_DE_PRUEBA;


    public Aspirante() {
    }

    public Aspirante(String idAspirantePrueba, Programa programa, String nombre, TipoDocumento tipoDocumento, Integer numDocumento, Genero genero, int edad, Date nacimiento, Integer celular, String email, Departamento departamento, String ciudad, String direccionResidencia, Estrato estrato, Reconocimiento reconocimiento, Discapacidad discapacidad, Poblacion poblacion, NivelEducativo nivelEducativo, Ocupacion ocupacion, String ultimoTituloAcademico, String estudioTrabajo, Salario salario, String tiempoLibre) {
        this.idAspirantePrueba = idAspirantePrueba;
        this.programa = programa;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.genero = genero;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.celular = celular;
        this.email = email;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.direccionResidencia = direccionResidencia;
        this.estrato = estrato;
        this.reconocimiento = reconocimiento;
        this.discapacidad = discapacidad;
        this.poblacion = poblacion;
        this.nivelEducativo = nivelEducativo;
        this.ocupacion = ocupacion;
        this.ultimoTituloAcademico = ultimoTituloAcademico;
        this.estudioTrabajo = estudioTrabajo;
        this.salario = salario;
        this.tiempoLibre = tiempoLibre;
    }



    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public void setEstadoAspirante(EstadoAspirante estadoAspirante) {
        this.estadoAspirante = estadoAspirante;
    }


    @OneToOne(mappedBy = "aspirante")
    private ValidadorDeTestGorilla validadorDeTestGorilla;

    @OneToOne(mappedBy = "aspirante")
    private PerfilamientoAspirante perfilamientoAspirante;

}

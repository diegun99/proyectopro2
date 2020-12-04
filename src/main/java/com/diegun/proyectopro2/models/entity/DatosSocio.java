package com.diegun.proyectopro2.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name = "datospersonales")
public class DatosSocio implements Serializable {// serial version id ,siempre debe ir

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY )
    private long id;

    @NotBlank(message = "Digite la edad en años.")// definir mensaje si hay un espacio en blanco
    private int edad;//variable 1 p2

    @NotEmpty(message = "el nombre no puede quedar vacio")
    @Size(min =20, max = 30, message = "debe escribir mas de 25 caracteres")
    private String nombre; // p1
    
    @NotEmpty(message = "el No documento no puede quedar vacio")
    private int cedulanum; //  p3
    private String tipoDoc;
    private String genero; //variable p4
    @NotEmpty(message = "el télefono no puede quedar vacio")
    private int telefono;// p5 variable 3
    @NotEmpty(message = "el Estado civil no puede quedar vacio")
    private String estadoCivil; //p6
    @Max(value= 5, message = "digite el estrato de 1 a 5")
    private String estrato; //p8
    private String direccion; //p11
    private String estudiaActual; //p12

    @CreationTimestamp// muestra la fecha de creacion
    private Date created;


    @UpdateTimestamp//actualiza a la ultima fecha de actualizacion
    private Date updated;


    



    
}

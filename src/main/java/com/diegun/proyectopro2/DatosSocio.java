package com.diegun.proyectopro2;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="datossociodemo")
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

    private int cedulanum; //  p3
    private String tipoDoc;
    private String genero; //variable p4
    private int telefono;// p5 variable 3
    private String estadoCivil; //p6
    private String nivelEducativo; ///p7
    private String estrato; //p8
    private String regimenSalud; //p9
    private String zonaResidencia; //p10
    private String direccion; //p11
    private String estudiaActual; //p12
    private String trabajaActual; //
    private String tieneHijos; //p13
    private String dependenciaPadres; //p14
    
    //segunda parte tamizaje
    
    private double peso; // pero en kg variable 4
    private double altura; // en mts
    private double resultadoImc; //variable 5
    private String interpretacionImc;
    private String descripcionImc;
    
    private double perAbdominal; // en cms variable 6 aproximar
    private double tensionArterial; //  aproximar
    private String ejercicioDiario; //variable 7
    private String consumoVerduras; //variable 8
    private String tieneHtensionArt;
    private String tomaMedicamentos; //var 9
    private String nivelAzucar; //var 10
    private String familiarDiabetes; //var 11
    private String diabetico; //var 12
    private String fuma; //var 13


    
}

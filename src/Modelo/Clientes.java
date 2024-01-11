/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class Clientes {
    private int id;
    private String nombreCliente;
    private String nombreMascota;
    private int edad;
    private String sexo;
    private String email;
    private int numeroSecuencial;

    // Constructor
    public Clientes(int id, String nombreCliente, String nombreMascota, int edad, String sexo, String email) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.nombreMascota = nombreMascota;
        this.edad = edad;
        this.sexo = sexo;
        this.email = email;
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeroSecuencial() {
        return numeroSecuencial;
    }

}

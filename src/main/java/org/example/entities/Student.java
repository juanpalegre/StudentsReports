package org.example.entities;

//This is the super class refered to Student. From this model, it is posible to extend from diferent
//kind of specific student type.

abstract public class Student {

    private String nombre;
    private String apellido;
    private int documentNumber;

    public Student(){

    }

    public Student(String nombre, String apellido, int documentNumber) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentNumber = documentNumber;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }


}

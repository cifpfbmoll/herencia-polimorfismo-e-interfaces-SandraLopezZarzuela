/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biiblioteca;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Reserva {
    //ATRIBUTOS
    private static Scanner sc = new Scanner(System.in);
    private Libro libro;
    private LocalDate fecha;
    private LocalTime hora;
    private int cantidadReservada;
    private Usuario usuario;

    //CONSTRUCTORES
    public Reserva() {
    }

    public Reserva(Libro libro, LocalDate fecha, LocalTime hora, int cantidadReservada, Usuario usuario) {
        this.setLibro(libro);
        this.setFecha(fecha);
        this.setHora(hora);
        this.setCantidadReservada(cantidadReservada);
        this.setUsuario(usuario);
    }
    public Reserva(Reserva r1) {
        this.setLibro(r1.getLibro());
        this.setFecha(r1.getFecha());
        this.setHora(r1.getHora());
        this.setCantidadReservada(r1.getCantidadReservada());
        this.setUsuario(r1.getUsuario());
    }
    //TOSTRING


    @Override
    public String toString() {
        return "Reserva{" +
                "libro=" + libro +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", cantidadReservada=" + cantidadReservada +
                ", usuario=" + usuario +
                '}';
    }

    //GETTERS Y SETTERS
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getCantidadReservada() {
        return cantidadReservada;
    }

    public void setCantidadReservada(int cantidadReservada) {
        this.cantidadReservada = cantidadReservada;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void reservarLibro(ArrayList <Libro> listaLibros,Usuario usuario){
        System.out.println("Introduce el isbn del libro");
        int isbn = sc.nextInt();
        
        System.out.println("Cuantos libros quieres reservar?");
        int libros = sc.nextInt();
        
            
        }
        
        
    }
}

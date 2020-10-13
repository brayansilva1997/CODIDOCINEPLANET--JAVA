/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import cine.ClienteVip1;
import cine.Disponibilidad;
import cine.Entrada;
import cine.Cliente;
import cine.Funcion;
import cine.Pelicula;
import cine.Sala;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.LinkedList;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class AppCine extends javax.swing.JFrame {

    /**
     * Creates new form AppCine
     */
    public AppCine() {

        initComponents();
        peliculas.add(new Pelicula(" Spider-Man:Lejos de Casa ", "2D", "Accion, Ciencia Ficcion, SuperHeroes", " Apto para todo publico", " 2h 15m"));
        peliculas.add(new Pelicula(" Annabelle 3: vuelve a casa ", "2D", "Terror, Sobrenatural", " Myores de 14", " 1h 40m"));
        peliculas.add(new Pelicula(" Toy Story 4 ", "2D", "Animacion, Aventura", " Apto para todo publico", " 1h 40m"));
        peliculas.add(new Pelicula(" Hombres de Negro: Internacional ", "2D", "Accion, Ciencia Ficcion, Comedia", " Apto para todo publico", " 2h 10m"));
        
        salas.add(new Sala(1, "Proyector-XLN", 4));
        salas.add(new Sala(2, "Proyector-XMN", 3));
        salas.add(new Sala(3, "Proyector-XLN", 2));
        salas.add(new Sala(4, "Proyector-XLN", 3));
        salas.add(new Sala(5, "Proyector-XMN", 2));
        salas.add(new Sala(6, "Proyector-XlN", 3));
        funciones.add(new Funcion(peliculas.get(0), salas.get(0), 7, 7, 2019, "1:00 pm", 20)); // Pelicula Spiderman 1:00 0
        funciones.add(new Funcion(peliculas.get(1), salas.get(1), 7, 7, 2019, "1:20 pm", 20)); // Pelicula Annabelle 1:20 1
        funciones.add(new Funcion(peliculas.get(2), salas.get(2), 7, 7, 2019, "1:10 pm", 20)); // Pelicula Toy Story 1:10 2
        funciones.add(new Funcion(peliculas.get(3), salas.get(3), 7, 7, 2019, "1:30 pm", 20)); // Pelicula Hombres de Negro 1:30 3
        funciones.add(new Funcion(peliculas.get(0), salas.get(4), 7, 7, 2019, "2:00 pm", 20)); // Pelicula Spiderman 2:00 4
        funciones.add(new Funcion(peliculas.get(0), salas.get(5), 7, 7, 2019, "2:30 pm", 20)); // Pelicula Spiderman 2:30 5
        funciones.add(new Funcion(peliculas.get(2), salas.get(0), 7, 7, 2019, "3:20 pm", 25)); // Pelicula Toy Story 3:20 6 
        funciones.add(new Funcion(peliculas.get(0), salas.get(1), 7, 7, 2019, "3:50 pm", 25)); // Pelicula Spiderman 3:50 7
        funciones.add(new Funcion(peliculas.get(3), salas.get(2), 7, 7, 2019, "3:55 pm", 25)); // Pelicula Hombres de Negro 3:55 8
        funciones.add(new Funcion(peliculas.get(1), salas.get(3), 7, 7, 2019, "3:40 pm", 25)); // Pelicula Annabelle 3:40 9
        funciones.add(new Funcion(peliculas.get(2), salas.get(4), 7, 7, 2019, "4:40 pm", 25)); // Pelicula Toy Story 4:40 10
        funciones.add(new Funcion(peliculas.get(0), salas.get(5), 7, 7, 2019, "4:50 pm", 25)); // Pelicula Spiderman 4:50 11
        funciones.add(new Funcion(peliculas.get(0), salas.get(0), 7, 7, 2019, "5:20 pm", 25)); // Pelicula Spiderman 5:20 12
        funciones.add(new Funcion(peliculas.get(3), salas.get(2), 7, 7, 2019, "5:30 pm", 25)); // Pelicula Hombres de negro 5:30 13
        funciones.add(new Funcion(peliculas.get(2), salas.get(3), 7, 7, 2019, "5:40 pm", 25)); // Pelicula Toy Story 5:40 14
        funciones.add(new Funcion(peliculas.get(1), salas.get(1), 7, 7, 2019, "6:30 pm", 25)); // Pelicula Annabelle 6:30 15 
        funciones.add(new Funcion(peliculas.get(0), salas.get(4), 7, 7, 2019, "6:40 pm", 20)); // Pelicula Spiderman 6:40 16
        funciones.add(new Funcion(peliculas.get(2), salas.get(5), 7, 7, 2019, "7:30 pm", 20)); // Pelicula Toy Story 7:30 17
        funciones.add(new Funcion(peliculas.get(3), salas.get(3), 7, 7, 2019, "7:40 pm", 20)); // Pelicula Hombres de Negro 7:40 18
        funciones.add(new Funcion(peliculas.get(0), salas.get(2), 7, 7, 2019, "7:50 pm", 20)); // Pelicula Spiderman 7:50 19
        funciones.add(new Funcion(peliculas.get(0), salas.get(1), 7, 7, 2019, "8:35 pm", 20)); // Pelicula Spiderman 8:35 20
        funciones.add(new Funcion(peliculas.get(1), salas.get(0), 7, 7, 2019, "8:30 pm", 18)); // Pelicula Annabelle 8:30 21
        funciones.add(new Funcion(peliculas.get(3), salas.get(4), 7, 7, 2019, "9:20 pm", 18)); // Pelicula Hombres de Negro 9:20 22
        funciones.add(new Funcion(peliculas.get(0), salas.get(5), 7, 7, 2019, "9:30 pm", 18)); // Pelicula Spiderman 9:30 23
        funciones.add(new Funcion(peliculas.get(1), salas.get(3), 7, 7, 2019, "9:55 pm", 18)); // Pelicula Annabelle  9:55 24
        funciones.add(new Funcion(peliculas.get(2), salas.get(2), 7, 7, 2019, "10:30 pm", 18));// Pelicula Toy Story 10:30 25
        funciones.add(new Funcion(peliculas.get(1), salas.get(0), 7, 7, 2019, "10:50 pm", 18));// Pelicula Anabelle 10:50 26
        
        for(int i=0;i<salas.size();i++){
            for(int j=0;j<funciones.size();j++){
                if(funciones.get(j).getSala().getSala()==salas.get(i).getSala()){
                    salas.get(i).setFunciones(funciones.get(j));
                }
            }
        }
        for(int i=0;i<peliculas.size();i++){
            for(int j=0;j<funciones.size();j++){
                if(funciones.get(j).getPelicula().getNombre().compareTo(peliculas.get(i).getNombre())==0){
                    peliculas.get(i).setFunciones(funciones.get(j));
                }
            }
        }
       
        for(int i=0;i<peliculas.get(1).getFunciones().size();i++){
            System.out.println(peliculas.get(1).getFunciones().get(i).getHora());
        }
        
        Lbutacas.add(butaca0);
        Lbutacas.add(butaca1);
        Lbutacas.add(butaca2);
        Lbutacas.add(butaca3);
        Lbutacas.add(butaca4);
        Lbutacas.add(butaca5);
        Lbutacas.add(butaca6);
        Lbutacas.add(butaca7);
        Lbutacas.add(butaca8);
        Lbutacas.add(butaca9);
        Lbutacas.add(butaca10);
        Lbutacas.add(butaca11);
        Lbutacas.add(butaca12);
        Lbutacas.add(butaca13);
        Lbutacas.add(butaca14);
        Lbutacas.add(butaca15);
        Lbutacas.add(butaca16);
        Lbutacas.add(butaca17);
        Lbutacas.add(butaca18);
        Lbutacas.add(butaca19);

        for (int z = 0; z < 6; z++) {
            for (int i = 0; i < 27; i++) {
                if (funciones.get(i).getSala().getSala() == salas.get(z).getSala()) {
                    for (int j = 0; j < 20; j++) {

                        disponibles.add(new Disponibilidad(funciones.get(i), salas.get(z).getButacasDisponibles().get(j)));
                        funciones.get(i).setButacasDisponibles(disponibles.getLast());
                        salas.get(z).getButacasDisponibles().get(j).setDisponible(disponibles.getLast());

                    }
                }
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaSpiderman = new javax.swing.JFrame();
        PanelSpiderman = new javax.swing.JPanel();
        tituloRealPlaza2 = new javax.swing.JLabel();
        horario1 = new javax.swing.JButton();
        horario2 = new javax.swing.JButton();
        horario3 = new javax.swing.JButton();
        horario4 = new javax.swing.JButton();
        horario5 = new javax.swing.JButton();
        horario6 = new javax.swing.JButton();
        horario7 = new javax.swing.JButton();
        horario8 = new javax.swing.JButton();
        horario9 = new javax.swing.JButton();
        horario10 = new javax.swing.JButton();
        diaFuncion1 = new javax.swing.JLabel();
        tituloSpiderman1 = new javax.swing.JLabel();
        fandango2 = new javax.swing.JLabel();
        regresarSpiderman = new javax.swing.JButton();
        imgfandango2 = new javax.swing.JLabel();
        capaPrincipalSpiderman = new javax.swing.JLabel();
        ventanaAnnabelle = new javax.swing.JFrame();
        PanelAnnabelle3 = new javax.swing.JPanel();
        horario11 = new javax.swing.JButton();
        horario12 = new javax.swing.JButton();
        horario13 = new javax.swing.JButton();
        horario16 = new javax.swing.JButton();
        horario19 = new javax.swing.JButton();
        horario20 = new javax.swing.JButton();
        tituloRealPlaza3 = new javax.swing.JLabel();
        diaFuncion2 = new javax.swing.JLabel();
        tituloAnabelle1 = new javax.swing.JLabel();
        fandango3 = new javax.swing.JLabel();
        imgfandango3 = new javax.swing.JLabel();
        regresarAnabelle3 = new javax.swing.JButton();
        capaPrincipalAnnabelle1 = new javax.swing.JLabel();
        ventanaToyStory = new javax.swing.JFrame();
        PanelToyStory = new javax.swing.JPanel();
        horario14 = new javax.swing.JButton();
        horario15 = new javax.swing.JButton();
        horario17 = new javax.swing.JButton();
        horario18 = new javax.swing.JButton();
        horario21 = new javax.swing.JButton();
        horario22 = new javax.swing.JButton();
        tituloRealPlaza4 = new javax.swing.JLabel();
        diaFuncion3 = new javax.swing.JLabel();
        tituloToyStory = new javax.swing.JLabel();
        fandango4 = new javax.swing.JLabel();
        imgfandango4 = new javax.swing.JLabel();
        regresarToyStory = new javax.swing.JButton();
        capaPrincipalToyStory = new javax.swing.JLabel();
        ventanaHombresNegro = new javax.swing.JFrame();
        PanelHombresNegro = new javax.swing.JPanel();
        horario23 = new javax.swing.JButton();
        horario24 = new javax.swing.JButton();
        horario25 = new javax.swing.JButton();
        diaFuncion4 = new javax.swing.JLabel();
        horario26 = new javax.swing.JButton();
        horario27 = new javax.swing.JButton();
        tituloRealPlaza5 = new javax.swing.JLabel();
        tituloHombresNegro = new javax.swing.JLabel();
        fandango5 = new javax.swing.JLabel();
        imgfandango5 = new javax.swing.JLabel();
        regresarHombresNegro = new javax.swing.JButton();
        capaPrincipalHombresNegro = new javax.swing.JLabel();
        VentanaCliente = new javax.swing.JFrame();
        PanelCliente = new javax.swing.JPanel();
        nombreCliente = new javax.swing.JTextField();
        apellidoCliente = new javax.swing.JTextField();
        emailCliente = new javax.swing.JTextField();
        nTarjetaCliente = new javax.swing.JTextField();
        nButacas = new javax.swing.JTextField();
        cvcCliente = new javax.swing.JTextField();
        textoInformacionCliente = new javax.swing.JLabel();
        fandango1 = new javax.swing.JLabel();
        duracionPelicula = new javax.swing.JLabel();
        textoCensura = new javax.swing.JLabel();
        textoDuracion = new javax.swing.JLabel();
        textoSala = new javax.swing.JLabel();
        texoPelicula = new javax.swing.JLabel();
        censuraPelicula = new javax.swing.JLabel();
        nSala = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        nombrePelicula = new javax.swing.JLabel();
        imgfandango1 = new javax.swing.JLabel();
        textoEmail = new javax.swing.JLabel();
        textoNombre = new javax.swing.JLabel();
        textoCVC1 = new javax.swing.JLabel();
        textoNTarjeta = new javax.swing.JLabel();
        textoApellido = new javax.swing.JLabel();
        textoCVC = new javax.swing.JLabel();
        textoPrecioButaca = new javax.swing.JLabel();
        PrecioButaca = new javax.swing.JLabel();
        CapaBlanca = new javax.swing.JLabel();
        CapaNegra = new javax.swing.JLabel();
        ventanaAsientos = new javax.swing.JFrame();
        PanelAsientos = new javax.swing.JPanel();
        butaca0 = new javax.swing.JCheckBox();
        butaca1 = new javax.swing.JCheckBox();
        butaca2 = new javax.swing.JCheckBox();
        butaca3 = new javax.swing.JCheckBox();
        butaca4 = new javax.swing.JCheckBox();
        butaca5 = new javax.swing.JCheckBox();
        butaca6 = new javax.swing.JCheckBox();
        butaca7 = new javax.swing.JCheckBox();
        butaca8 = new javax.swing.JCheckBox();
        butaca9 = new javax.swing.JCheckBox();
        butaca10 = new javax.swing.JCheckBox();
        butaca11 = new javax.swing.JCheckBox();
        butaca12 = new javax.swing.JCheckBox();
        butaca13 = new javax.swing.JCheckBox();
        butaca14 = new javax.swing.JCheckBox();
        butaca15 = new javax.swing.JCheckBox();
        butaca16 = new javax.swing.JCheckBox();
        butaca17 = new javax.swing.JCheckBox();
        butaca18 = new javax.swing.JCheckBox();
        butaca19 = new javax.swing.JCheckBox();
        tituloPantalla = new javax.swing.JLabel();
        botonComprar = new javax.swing.JButton();
        textoFondoVerde = new javax.swing.JLabel();
        textoFondoRojo = new javax.swing.JLabel();
        textoFondoBlanco = new javax.swing.JLabel();
        textoOcupado = new javax.swing.JLabel();
        textoSeleccionado = new javax.swing.JLabel();
        textoLibre = new javax.swing.JLabel();
        capaInferior = new javax.swing.JLabel();
        capaSuperior = new javax.swing.JLabel();
        ventanaCompra = new javax.swing.JFrame();
        panelCompra = new javax.swing.JPanel();
        nombreClienteCompra = new javax.swing.JLabel();
        apellidoClienteCompra = new javax.swing.JLabel();
        emailClienteCompra = new javax.swing.JLabel();
        nroTarjetaCompra = new javax.swing.JLabel();
        nombrePeliculaCompra = new javax.swing.JLabel();
        tipoPeliculaCompra = new javax.swing.JLabel();
        censuraPeliculaCompra = new javax.swing.JLabel();
        MontoTotal = new javax.swing.JLabel();
        duracionPeliculaCompra = new javax.swing.JLabel();
        diaPeliculaCompra = new javax.swing.JLabel();
        mesPeliculaCompra = new javax.swing.JLabel();
        horarioPeliculaCompra = new javax.swing.JLabel();
        salaPeliculaCompra = new javax.swing.JLabel();
        asientosCompra = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        textoAsientos = new javax.swing.JLabel();
        textoNombreP = new javax.swing.JLabel();
        textoNombreC = new javax.swing.JLabel();
        textoCensuraC = new javax.swing.JLabel();
        textoTipoP = new javax.swing.JLabel();
        textoCensuraP = new javax.swing.JLabel();
        textoDuracionP = new javax.swing.JLabel();
        textoMontoTotal = new javax.swing.JLabel();
        textoDiaP = new javax.swing.JLabel();
        textoMesP = new javax.swing.JLabel();
        textoHorarioP = new javax.swing.JLabel();
        textoSalaP = new javax.swing.JLabel();
        tituloCliente = new javax.swing.JLabel();
        tituloCompra = new javax.swing.JLabel();
        tituloPelicula = new javax.swing.JLabel();
        textoEmailC = new javax.swing.JLabel();
        textoApellidoC = new javax.swing.JLabel();
        imagenQR = new javax.swing.JLabel();
        textoVip = new javax.swing.JLabel();
        descuentoCompra = new javax.swing.JLabel();
        textoDescuentoCompra = new javax.swing.JLabel();
        capaPrincipalCompra = new javax.swing.JLabel();
        VentanaVip = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        Acepto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nroTarjetaVip = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cvcTexto = new javax.swing.JLabel();
        cvcVip1 = new javax.swing.JTextField();
        nombreVip = new javax.swing.JTextField();
        apellidoVip = new javax.swing.JTextField();
        emailVip = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        salidaVip = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        escogerPelicula = new javax.swing.JButton();
        spiderman = new javax.swing.JRadioButton();
        annabelle3 = new javax.swing.JRadioButton();
        toyStory4 = new javax.swing.JRadioButton();
        hombresNegro = new javax.swing.JRadioButton();
        infToyStory = new javax.swing.JLabel();
        infSpiderman = new javax.swing.JLabel();
        infHombresNegro = new javax.swing.JLabel();
        infAnnabelle = new javax.swing.JLabel();
        fandango = new javax.swing.JLabel();
        imgfandango = new javax.swing.JLabel();
        tituloRealPlaza = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        capaPrincipal = new javax.swing.JLabel();

        ventanaSpiderman.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ventanaSpiderman.setBounds(new java.awt.Rectangle(200, 200, 800, 600));
        ventanaSpiderman.setLocation(new java.awt.Point(550, 200));
        ventanaSpiderman.setResizable(false);

        PanelSpiderman.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloRealPlaza2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tituloRealPlaza2.setForeground(new java.awt.Color(255, 255, 255));
        tituloRealPlaza2.setText("CINEPLANET TRUJILLO REAL PLAZA");
        PanelSpiderman.add(tituloRealPlaza2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 460, 50));

        horario1.setBackground(new java.awt.Color(255, 255, 255));
        horario1.setText("1:00 pm");
        horario1.setFocusPainted(false);
        horario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario1ActionPerformed(evt);
            }
        });
        PanelSpiderman.add(horario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 90, 30));

        horario2.setBackground(new java.awt.Color(255, 255, 255));
        horario2.setText("2:00 pm");
        horario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario2ActionPerformed(evt);
            }
        });
        PanelSpiderman.add(horario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 90, 30));

        horario3.setBackground(new java.awt.Color(255, 255, 255));
        horario3.setText("2:30 pm");
        horario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario3ActionPerformed(evt);
            }
        });
        PanelSpiderman.add(horario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 90, 30));

        horario4.setBackground(new java.awt.Color(255, 255, 255));
        horario4.setText("3:50 pm");
        horario4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario4ActionPerformed(evt);
            }
        });
        PanelSpiderman.add(horario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 90, 30));

        horario5.setBackground(new java.awt.Color(255, 255, 255));
        horario5.setText("4:50 pm");
        horario5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario5ActionPerformed(evt);
            }
        });
        PanelSpiderman.add(horario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 90, 30));

        horario6.setBackground(new java.awt.Color(255, 255, 255));
        horario6.setText("5:20 pm");
        horario6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario6ActionPerformed(evt);
            }
        });
        PanelSpiderman.add(horario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 90, 30));

        horario7.setBackground(new java.awt.Color(255, 255, 255));
        horario7.setText("6:40 pm");
        horario7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario7ActionPerformed(evt);
            }
        });
        PanelSpiderman.add(horario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 90, 30));

        horario8.setBackground(new java.awt.Color(255, 255, 255));
        horario8.setText("7:50 pm");
        horario8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario8ActionPerformed(evt);
            }
        });
        PanelSpiderman.add(horario8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 90, 30));

        horario9.setBackground(new java.awt.Color(255, 255, 255));
        horario9.setText("8:35 pm");
        horario9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario9ActionPerformed(evt);
            }
        });
        PanelSpiderman.add(horario9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 90, 30));

        horario10.setBackground(new java.awt.Color(255, 255, 255));
        horario10.setText("9:30 pm");
        horario10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario10ActionPerformed(evt);
            }
        });
        PanelSpiderman.add(horario10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 90, 30));

        diaFuncion1.setBackground(new java.awt.Color(50, 125, 255));
        diaFuncion1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        diaFuncion1.setForeground(new java.awt.Color(255, 255, 255));
        diaFuncion1.setText("   Domingo 7 JUL");
        diaFuncion1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        diaFuncion1.setOpaque(true);
        PanelSpiderman.add(diaFuncion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 120, 30));

        tituloSpiderman1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        tituloSpiderman1.setForeground(new java.awt.Color(100, 100, 100));
        tituloSpiderman1.setText("SPIDER-MAN: LEJOS DE CASA");
        PanelSpiderman.add(tituloSpiderman1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        fandango2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        fandango2.setForeground(new java.awt.Color(51, 60, 255));
        fandango2.setText("FANDANGO");
        PanelSpiderman.add(fandango2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 210, 40));

        regresarSpiderman.setText("Regresar");
        regresarSpiderman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarSpidermanActionPerformed(evt);
            }
        });
        PanelSpiderman.add(regresarSpiderman, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 90, 30));

        imgfandango2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fandango2.png"))); // NOI18N
        PanelSpiderman.add(imgfandango2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        capaPrincipalSpiderman.setBackground(new java.awt.Color(40, 40, 40));
        capaPrincipalSpiderman.setText("S");
        capaPrincipalSpiderman.setOpaque(true);
        capaPrincipalSpiderman.setPreferredSize(new java.awt.Dimension(800, 600));
        PanelSpiderman.add(capaPrincipalSpiderman, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout ventanaSpidermanLayout = new javax.swing.GroupLayout(ventanaSpiderman.getContentPane());
        ventanaSpiderman.getContentPane().setLayout(ventanaSpidermanLayout);
        ventanaSpidermanLayout.setHorizontalGroup(
            ventanaSpidermanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(ventanaSpidermanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ventanaSpidermanLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelSpiderman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ventanaSpidermanLayout.setVerticalGroup(
            ventanaSpidermanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(ventanaSpidermanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ventanaSpidermanLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelSpiderman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ventanaAnnabelle.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ventanaAnnabelle.setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        ventanaAnnabelle.setLocation(new java.awt.Point(550, 200));
        ventanaAnnabelle.setResizable(false);

        PanelAnnabelle3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        horario11.setBackground(new java.awt.Color(255, 255, 255));
        horario11.setText("9:55 pm");
        horario11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario11ActionPerformed(evt);
            }
        });
        PanelAnnabelle3.add(horario11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 90, 30));

        horario12.setBackground(new java.awt.Color(255, 255, 255));
        horario12.setText("1:20 pm");
        horario12.setFocusPainted(false);
        horario12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario12ActionPerformed(evt);
            }
        });
        PanelAnnabelle3.add(horario12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 90, 30));

        horario13.setBackground(new java.awt.Color(255, 255, 255));
        horario13.setText("10:50 pm");
        horario13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario13ActionPerformed(evt);
            }
        });
        PanelAnnabelle3.add(horario13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 90, 30));

        horario16.setBackground(new java.awt.Color(255, 255, 255));
        horario16.setText("8:30 pm");
        horario16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario16ActionPerformed(evt);
            }
        });
        PanelAnnabelle3.add(horario16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 90, 30));

        horario19.setBackground(new java.awt.Color(255, 255, 255));
        horario19.setText("6:30 pm");
        horario19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario19ActionPerformed(evt);
            }
        });
        PanelAnnabelle3.add(horario19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 90, 30));

        horario20.setBackground(new java.awt.Color(255, 255, 255));
        horario20.setText("3:40 pm");
        horario20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario20ActionPerformed(evt);
            }
        });
        PanelAnnabelle3.add(horario20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 90, 30));

        tituloRealPlaza3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tituloRealPlaza3.setForeground(new java.awt.Color(255, 255, 255));
        tituloRealPlaza3.setText("CINEPLANET TRUJILLO REAL PLAZA");
        PanelAnnabelle3.add(tituloRealPlaza3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 460, 50));

        diaFuncion2.setBackground(new java.awt.Color(50, 125, 255));
        diaFuncion2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        diaFuncion2.setForeground(new java.awt.Color(255, 255, 255));
        diaFuncion2.setText("   Domingo 7 JUL");
        diaFuncion2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        diaFuncion2.setOpaque(true);
        PanelAnnabelle3.add(diaFuncion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 120, 30));

        tituloAnabelle1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        tituloAnabelle1.setForeground(new java.awt.Color(100, 100, 100));
        tituloAnabelle1.setText("ANNABELLE 3: VIENE A CASA");
        PanelAnnabelle3.add(tituloAnabelle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        fandango3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        fandango3.setForeground(new java.awt.Color(51, 60, 255));
        fandango3.setText("FANDANGO");
        PanelAnnabelle3.add(fandango3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 210, 40));

        imgfandango3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fandango2.png"))); // NOI18N
        PanelAnnabelle3.add(imgfandango3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        regresarAnabelle3.setText("Regresar");
        regresarAnabelle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarAnabelle3ActionPerformed(evt);
            }
        });
        PanelAnnabelle3.add(regresarAnabelle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 90, 30));

        capaPrincipalAnnabelle1.setBackground(new java.awt.Color(40, 40, 40));
        capaPrincipalAnnabelle1.setText("S");
        capaPrincipalAnnabelle1.setOpaque(true);
        capaPrincipalAnnabelle1.setPreferredSize(new java.awt.Dimension(800, 600));
        PanelAnnabelle3.add(capaPrincipalAnnabelle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout ventanaAnnabelleLayout = new javax.swing.GroupLayout(ventanaAnnabelle.getContentPane());
        ventanaAnnabelle.getContentPane().setLayout(ventanaAnnabelleLayout);
        ventanaAnnabelleLayout.setHorizontalGroup(
            ventanaAnnabelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAnnabelle3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaAnnabelleLayout.setVerticalGroup(
            ventanaAnnabelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAnnabelle3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ventanaToyStory.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ventanaToyStory.setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        ventanaToyStory.setLocation(new java.awt.Point(550, 200));
        ventanaToyStory.setResizable(false);

        PanelToyStory.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        horario14.setBackground(new java.awt.Color(255, 255, 255));
        horario14.setText("7:30 pm");
        horario14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario14ActionPerformed(evt);
            }
        });
        PanelToyStory.add(horario14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 90, 30));

        horario15.setBackground(new java.awt.Color(255, 255, 255));
        horario15.setText("1:10 pm");
        horario15.setFocusPainted(false);
        horario15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario15ActionPerformed(evt);
            }
        });
        PanelToyStory.add(horario15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 90, 30));

        horario17.setBackground(new java.awt.Color(255, 255, 255));
        horario17.setText("10:30 pm");
        horario17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario17ActionPerformed(evt);
            }
        });
        PanelToyStory.add(horario17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 90, 30));

        horario18.setBackground(new java.awt.Color(255, 255, 255));
        horario18.setText("5:40 pm");
        horario18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario18ActionPerformed(evt);
            }
        });
        PanelToyStory.add(horario18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 90, 30));

        horario21.setBackground(new java.awt.Color(255, 255, 255));
        horario21.setText("4:40 pm");
        horario21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario21ActionPerformed(evt);
            }
        });
        PanelToyStory.add(horario21, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 90, 30));

        horario22.setBackground(new java.awt.Color(255, 255, 255));
        horario22.setText("3:20 pm");
        horario22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario22ActionPerformed(evt);
            }
        });
        PanelToyStory.add(horario22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 90, 30));

        tituloRealPlaza4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tituloRealPlaza4.setForeground(new java.awt.Color(255, 255, 255));
        tituloRealPlaza4.setText("CINEPLANET TRUJILLO REAL PLAZA");
        PanelToyStory.add(tituloRealPlaza4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 460, 50));

        diaFuncion3.setBackground(new java.awt.Color(50, 125, 255));
        diaFuncion3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        diaFuncion3.setForeground(new java.awt.Color(255, 255, 255));
        diaFuncion3.setText("   Domingo 7 JUL");
        diaFuncion3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        diaFuncion3.setOpaque(true);
        PanelToyStory.add(diaFuncion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 120, 30));

        tituloToyStory.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        tituloToyStory.setForeground(new java.awt.Color(100, 100, 100));
        tituloToyStory.setText("Toy Story 4");
        PanelToyStory.add(tituloToyStory, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 230, -1));

        fandango4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        fandango4.setForeground(new java.awt.Color(51, 60, 255));
        fandango4.setText("FANDANGO");
        PanelToyStory.add(fandango4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 210, 40));

        imgfandango4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fandango2.png"))); // NOI18N
        PanelToyStory.add(imgfandango4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        regresarToyStory.setText("Regresar");
        regresarToyStory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarToyStoryActionPerformed(evt);
            }
        });
        PanelToyStory.add(regresarToyStory, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 90, 30));

        capaPrincipalToyStory.setBackground(new java.awt.Color(40, 40, 40));
        capaPrincipalToyStory.setText("S");
        capaPrincipalToyStory.setOpaque(true);
        capaPrincipalToyStory.setPreferredSize(new java.awt.Dimension(800, 600));
        PanelToyStory.add(capaPrincipalToyStory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout ventanaToyStoryLayout = new javax.swing.GroupLayout(ventanaToyStory.getContentPane());
        ventanaToyStory.getContentPane().setLayout(ventanaToyStoryLayout);
        ventanaToyStoryLayout.setHorizontalGroup(
            ventanaToyStoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelToyStory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaToyStoryLayout.setVerticalGroup(
            ventanaToyStoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelToyStory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ventanaHombresNegro.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ventanaHombresNegro.setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        ventanaHombresNegro.setLocation(new java.awt.Point(550, 200));
        ventanaHombresNegro.setResizable(false);

        PanelHombresNegro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        horario23.setBackground(new java.awt.Color(255, 255, 255));
        horario23.setText("7:40 pm");
        horario23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario23ActionPerformed(evt);
            }
        });
        PanelHombresNegro.add(horario23, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 90, 30));

        horario24.setBackground(new java.awt.Color(255, 255, 255));
        horario24.setText("5:30 pm");
        horario24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario24ActionPerformed(evt);
            }
        });
        PanelHombresNegro.add(horario24, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 90, 30));

        horario25.setBackground(new java.awt.Color(255, 255, 255));
        horario25.setText("1:30 pm");
        horario25.setFocusPainted(false);
        horario25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario25ActionPerformed(evt);
            }
        });
        PanelHombresNegro.add(horario25, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 90, 30));

        diaFuncion4.setBackground(new java.awt.Color(50, 125, 255));
        diaFuncion4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        diaFuncion4.setForeground(new java.awt.Color(255, 255, 255));
        diaFuncion4.setText("   Domingo 7 JUL");
        diaFuncion4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        diaFuncion4.setOpaque(true);
        PanelHombresNegro.add(diaFuncion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 120, 30));

        horario26.setBackground(new java.awt.Color(255, 255, 255));
        horario26.setText("3:55 pm");
        horario26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario26ActionPerformed(evt);
            }
        });
        PanelHombresNegro.add(horario26, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 90, 30));

        horario27.setBackground(new java.awt.Color(255, 255, 255));
        horario27.setText("9:20 pm");
        horario27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horario27ActionPerformed(evt);
            }
        });
        PanelHombresNegro.add(horario27, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 90, 30));

        tituloRealPlaza5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tituloRealPlaza5.setForeground(new java.awt.Color(255, 255, 255));
        tituloRealPlaza5.setText("CINEPLANET TRUJILLO REAL PLAZA");
        PanelHombresNegro.add(tituloRealPlaza5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 460, 50));

        tituloHombresNegro.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        tituloHombresNegro.setForeground(new java.awt.Color(100, 100, 100));
        tituloHombresNegro.setText("Hombres de Negro: Internacional");
        PanelHombresNegro.add(tituloHombresNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 380, -1));

        fandango5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        fandango5.setForeground(new java.awt.Color(51, 60, 255));
        fandango5.setText("FANDANGO");
        PanelHombresNegro.add(fandango5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 210, 40));

        imgfandango5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fandango2.png"))); // NOI18N
        PanelHombresNegro.add(imgfandango5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        regresarHombresNegro.setText("Regresar");
        regresarHombresNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarHombresNegroActionPerformed(evt);
            }
        });
        PanelHombresNegro.add(regresarHombresNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 90, 30));

        capaPrincipalHombresNegro.setBackground(new java.awt.Color(40, 40, 40));
        capaPrincipalHombresNegro.setOpaque(true);
        capaPrincipalHombresNegro.setPreferredSize(new java.awt.Dimension(800, 600));
        PanelHombresNegro.add(capaPrincipalHombresNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout ventanaHombresNegroLayout = new javax.swing.GroupLayout(ventanaHombresNegro.getContentPane());
        ventanaHombresNegro.getContentPane().setLayout(ventanaHombresNegroLayout);
        ventanaHombresNegroLayout.setHorizontalGroup(
            ventanaHombresNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHombresNegro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaHombresNegroLayout.setVerticalGroup(
            ventanaHombresNegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelHombresNegro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        VentanaCliente.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        VentanaCliente.setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        VentanaCliente.setLocation(new java.awt.Point(550, 200));
        VentanaCliente.setResizable(false);

        PanelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreCliente.setBackground(new java.awt.Color(240, 240, 240));
        PanelCliente.add(nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 170, 40));

        apellidoCliente.setBackground(new java.awt.Color(240, 240, 240));
        PanelCliente.add(apellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 170, 40));

        emailCliente.setBackground(new java.awt.Color(240, 240, 240));
        PanelCliente.add(emailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 170, 40));

        nTarjetaCliente.setBackground(new java.awt.Color(240, 240, 240));
        PanelCliente.add(nTarjetaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 170, 40));

        nButacas.setBackground(new java.awt.Color(240, 240, 240));
        nButacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nButacasActionPerformed(evt);
            }
        });
        PanelCliente.add(nButacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 170, 40));

        cvcCliente.setBackground(new java.awt.Color(240, 240, 240));
        PanelCliente.add(cvcCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 170, 40));

        textoInformacionCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        textoInformacionCliente.setForeground(new java.awt.Color(30, 30, 30));
        textoInformacionCliente.setText("INFORMACION DEL CLIENTE");
        PanelCliente.add(textoInformacionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        fandango1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        fandango1.setForeground(new java.awt.Color(51, 60, 255));
        fandango1.setText("FANDANGO");
        PanelCliente.add(fandango1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 210, 40));

        duracionPelicula.setOpaque(true);
        PanelCliente.add(duracionPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 100, 30));

        textoCensura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoCensura.setForeground(new java.awt.Color(240, 240, 240));
        textoCensura.setText(" Censura :");
        PanelCliente.add(textoCensura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        textoDuracion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoDuracion.setForeground(new java.awt.Color(240, 240, 240));
        textoDuracion.setText("Duracion :");
        PanelCliente.add(textoDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        textoSala.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoSala.setForeground(new java.awt.Color(240, 240, 240));
        textoSala.setText("Sala :");
        PanelCliente.add(textoSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 40, -1));

        texoPelicula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texoPelicula.setForeground(new java.awt.Color(240, 240, 240));
        texoPelicula.setText("Pelicula : ");
        PanelCliente.add(texoPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        censuraPelicula.setOpaque(true);
        PanelCliente.add(censuraPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 170, 30));

        nSala.setOpaque(true);
        PanelCliente.add(nSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 100, 30));

        jButton2.setText("Ingresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PanelCliente.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, -1, -1));

        nombrePelicula.setOpaque(true);
        PanelCliente.add(nombrePelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 170, 30));

        imgfandango1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fandango2.png"))); // NOI18N
        PanelCliente.add(imgfandango1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 40, 40));

        textoEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoEmail.setText("E-MAIL:");
        PanelCliente.add(textoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 80, 20));

        textoNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoNombre.setText("NOMBRE: ");
        PanelCliente.add(textoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 80, 20));

        textoCVC1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoCVC1.setText("N° Butacas:");
        PanelCliente.add(textoCVC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 100, 20));

        textoNTarjeta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoNTarjeta.setText(" N° TARJETA:");
        PanelCliente.add(textoNTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 100, 20));

        textoApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoApellido.setText("APELLIDO:");
        PanelCliente.add(textoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 80, 20));

        textoCVC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoCVC.setText("CVC:");
        PanelCliente.add(textoCVC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 40, 20));

        textoPrecioButaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoPrecioButaca.setForeground(new java.awt.Color(240, 240, 240));
        textoPrecioButaca.setText("Precio/Butaca :");
        PanelCliente.add(textoPrecioButaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 110, -1));

        PrecioButaca.setOpaque(true);
        PanelCliente.add(PrecioButaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 110, 30));

        CapaBlanca.setBackground(new java.awt.Color(40, 40, 40));
        CapaBlanca.setOpaque(true);
        PanelCliente.add(CapaBlanca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 600));

        CapaNegra.setBackground(new java.awt.Color(255, 255, 255));
        CapaNegra.setOpaque(true);
        PanelCliente.add(CapaNegra, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 520, 600));

        javax.swing.GroupLayout VentanaClienteLayout = new javax.swing.GroupLayout(VentanaCliente.getContentPane());
        VentanaCliente.getContentPane().setLayout(VentanaClienteLayout);
        VentanaClienteLayout.setHorizontalGroup(
            VentanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VentanaClienteLayout.setVerticalGroup(
            VentanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ventanaAsientos.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ventanaAsientos.setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        ventanaAsientos.setLocation(new java.awt.Point(550, 200));
        ventanaAsientos.setResizable(false);

        PanelAsientos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butaca0.setText("A1");
        butaca0.setBorder(null);
        butaca0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca0.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca0.setFocusPainted(false);
        butaca0.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca0.setRequestFocusEnabled(false);
        butaca0.setRolloverEnabled(false);
        butaca0.setOpaque(true);
        butaca0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca0ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca0, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        butaca1.setText("A2");
        butaca1.setBorder(null);
        butaca1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca1.setFocusPainted(false);
        butaca1.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca1.setRequestFocusEnabled(false);
        butaca1.setOpaque(true);
        butaca1.setRolloverEnabled(false);
        butaca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca1ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        butaca2.setText("A3");
        butaca2.setBorder(null);
        butaca2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca2.setFocusPainted(false);
        butaca2.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca2.setRequestFocusEnabled(false);
        butaca2.setRolloverEnabled(false);
        butaca2.setOpaque(true);
        butaca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca2ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        butaca3.setText("A4");
        butaca3.setBorder(null);
        butaca3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca3.setFocusPainted(false);
        butaca3.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca3.setRequestFocusEnabled(false);
        butaca3.setRolloverEnabled(false);
        butaca3.setOpaque(true);
        butaca3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca3ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        butaca4.setText("A5");
        butaca4.setBorder(null);
        butaca4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca4.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca4.setFocusPainted(false);
        butaca4.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca4.setRequestFocusEnabled(false);
        butaca4.setRolloverEnabled(false);
        butaca4.setOpaque(true);
        butaca4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca4ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        butaca5.setText("B1");
        butaca5.setBorder(null);
        butaca5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca5.setFocusPainted(false);
        butaca5.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca5.setRequestFocusEnabled(false);
        butaca5.setRolloverEnabled(false);
        butaca5.setOpaque(true);
        butaca5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca5ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        butaca6.setText("B2");
        butaca6.setBorder(null);
        butaca6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca6.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca6.setFocusPainted(false);
        butaca6.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca6.setRequestFocusEnabled(false);
        butaca6.setRolloverEnabled(false);
        butaca6.setOpaque(true);
        butaca6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca6ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        butaca7.setText("B3");
        butaca7.setBorder(null);
        butaca7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca7.setFocusPainted(false);
        butaca7.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca7.setRequestFocusEnabled(false);
        butaca7.setRolloverEnabled(false);
        butaca7.setOpaque(true);
        butaca7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca7ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        butaca8.setText("B4");
        butaca8.setBorder(null);
        butaca8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca8.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca8.setFocusPainted(false);
        butaca8.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca8.setRequestFocusEnabled(false);
        butaca8.setRolloverEnabled(false);
        butaca8.setOpaque(true);
        butaca8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca8ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        butaca9.setText("B5");
        butaca9.setBorder(null);
        butaca9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca9.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca9.setFocusPainted(false);
        butaca9.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca9.setRequestFocusEnabled(false);
        butaca9.setRolloverEnabled(false);
        butaca9.setOpaque(true);
        butaca9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca9ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        butaca10.setText("C1");
        butaca10.setBorder(null);
        butaca10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca10.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca10.setFocusPainted(false);
        butaca10.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca10.setRequestFocusEnabled(false);
        butaca10.setRolloverEnabled(false);
        butaca10.setOpaque(true);
        butaca10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca10ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        butaca11.setText("C2");
        butaca11.setBorder(null);
        butaca11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca11.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca11.setFocusPainted(false);
        butaca11.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca11.setRequestFocusEnabled(false);
        butaca11.setRolloverEnabled(false);
        butaca11.setOpaque(true);
        butaca11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca11ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, -1, -1));

        butaca12.setText("C3");
        butaca12.setBorder(null);
        butaca12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca12.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca12.setFocusPainted(false);
        butaca12.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca12.setRequestFocusEnabled(false);
        butaca12.setRolloverEnabled(false);
        butaca12.setOpaque(true);
        butaca12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca12ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        butaca13.setText("C4");
        butaca13.setBorder(null);
        butaca13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca13.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca13.setFocusPainted(false);
        butaca13.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca13.setRequestFocusEnabled(false);
        butaca13.setRolloverEnabled(false);
        butaca13.setOpaque(true);
        butaca13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca13ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        butaca14.setText("C5");
        butaca14.setBorder(null);
        butaca14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca14.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca14.setFocusPainted(false);
        butaca14.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca14.setRequestFocusEnabled(false);
        butaca14.setRolloverEnabled(false);
        butaca14.setOpaque(true);
        butaca14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca14ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        butaca15.setText("D1");
        butaca15.setBorder(null);
        butaca15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca15.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca15.setFocusPainted(false);
        butaca15.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca15.setRequestFocusEnabled(false);
        butaca15.setRolloverEnabled(false);
        butaca15.setOpaque(true);
        butaca15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca15ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        butaca16.setText("D2");
        butaca16.setBorder(null);
        butaca16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca16.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca16.setFocusPainted(false);
        butaca16.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca16.setRequestFocusEnabled(false);
        butaca16.setRolloverEnabled(false);
        butaca16.setOpaque(true);
        butaca16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca16ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, -1));

        butaca17.setText("D3");
        butaca17.setBorder(null);
        butaca17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca17.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca17.setFocusPainted(false);
        butaca17.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca17.setRequestFocusEnabled(false);
        butaca17.setRolloverEnabled(false);
        butaca17.setOpaque(true);
        butaca17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca17ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        butaca18.setText("D4");
        butaca18.setBorder(null);
        butaca18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca18.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca18.setFocusPainted(false);
        butaca18.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca18.setRequestFocusEnabled(false);
        butaca18.setRolloverEnabled(false);
        butaca18.setOpaque(true);
        butaca18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca18ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        butaca19.setText("D5");
        butaca19.setBorder(null);
        butaca19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        butaca19.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        butaca19.setFocusPainted(false);
        butaca19.setPreferredSize(new java.awt.Dimension(40, 20));
        butaca19.setRequestFocusEnabled(false);
        butaca19.setRolloverEnabled(false);
        butaca19.setOpaque(true);
        butaca19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaca19ActionPerformed(evt);
            }
        });
        PanelAsientos.add(butaca19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        tituloPantalla.setBackground(new java.awt.Color(220, 220, 220));
        tituloPantalla.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        tituloPantalla.setText("  PANTALLA");
        tituloPantalla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tituloPantalla.setOpaque(true);
        tituloPantalla.setVerifyInputWhenFocusTarget(false);
        PanelAsientos.add(tituloPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 240, 100));

        botonComprar.setText("Comprar");
        botonComprar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarActionPerformed(evt);
            }
        });
        PanelAsientos.add(botonComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 90, 40));

        textoFondoVerde.setBackground(new java.awt.Color(79, 255, 51));
        textoFondoVerde.setOpaque(true);
        PanelAsientos.add(textoFondoVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 40, 40));

        textoFondoRojo.setBackground(new java.awt.Color(255, 51, 51));
        textoFondoRojo.setOpaque(true);
        PanelAsientos.add(textoFondoRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 40, 40));

        textoFondoBlanco.setBackground(new java.awt.Color(255, 255, 255));
        textoFondoBlanco.setOpaque(true);
        PanelAsientos.add(textoFondoBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 40, 40));

        textoOcupado.setText("Ocupado");
        PanelAsientos.add(textoOcupado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, -1, -1));

        textoSeleccionado.setText("Seleccionado");
        PanelAsientos.add(textoSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, -1, -1));

        textoLibre.setText("Libre");
        PanelAsientos.add(textoLibre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, -1));

        capaInferior.setBackground(new java.awt.Color(220, 220, 220));
        capaInferior.setOpaque(true);
        PanelAsientos.add(capaInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 800, 190));

        capaSuperior.setBackground(new java.awt.Color(100, 100, 100));
        capaSuperior.setOpaque(true);
        capaSuperior.setPreferredSize(new java.awt.Dimension(35, 20));
        PanelAsientos.add(capaSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        javax.swing.GroupLayout ventanaAsientosLayout = new javax.swing.GroupLayout(ventanaAsientos.getContentPane());
        ventanaAsientos.getContentPane().setLayout(ventanaAsientosLayout);
        ventanaAsientosLayout.setHorizontalGroup(
            ventanaAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAsientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaAsientosLayout.setVerticalGroup(
            ventanaAsientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAsientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ventanaCompra.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ventanaCompra.setBounds(new java.awt.Rectangle(0, 0, 800, 750));
        ventanaCompra.setLocation(new java.awt.Point(550, 200));
        ventanaCompra.setResizable(false);

        panelCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreClienteCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nombreClienteCompra.setOpaque(true);
        panelCompra.add(nombreClienteCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 160, 30));

        apellidoClienteCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        apellidoClienteCompra.setOpaque(true);
        panelCompra.add(apellidoClienteCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 160, 30));

        emailClienteCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        emailClienteCompra.setOpaque(true);
        panelCompra.add(emailClienteCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 160, 30));

        nroTarjetaCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nroTarjetaCompra.setOpaque(true);
        panelCompra.add(nroTarjetaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 160, 30));

        nombrePeliculaCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nombrePeliculaCompra.setOpaque(true);
        panelCompra.add(nombrePeliculaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 160, 30));

        tipoPeliculaCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tipoPeliculaCompra.setOpaque(true);
        panelCompra.add(tipoPeliculaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 160, 30));

        censuraPeliculaCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        censuraPeliculaCompra.setOpaque(true);
        panelCompra.add(censuraPeliculaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 160, 30));

        MontoTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MontoTotal.setOpaque(true);
        panelCompra.add(MontoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 160, 30));

        duracionPeliculaCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        duracionPeliculaCompra.setOpaque(true);
        panelCompra.add(duracionPeliculaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 160, 30));

        diaPeliculaCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        diaPeliculaCompra.setOpaque(true);
        panelCompra.add(diaPeliculaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 160, 30));

        mesPeliculaCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mesPeliculaCompra.setOpaque(true);
        panelCompra.add(mesPeliculaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 160, 30));

        horarioPeliculaCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        horarioPeliculaCompra.setOpaque(true);
        panelCompra.add(horarioPeliculaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 160, 30));

        salaPeliculaCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salaPeliculaCompra.setOpaque(true);
        panelCompra.add(salaPeliculaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, 160, 30));

        asientosCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        asientosCompra.setOpaque(true);
        panelCompra.add(asientosCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, 250, 30));

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        panelCompra.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 670, 80, 30));

        textoAsientos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoAsientos.setText("Asientos:");
        panelCompra.add(textoAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 610, 80, 40));

        textoNombreP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoNombreP.setText("Nombre:");
        panelCompra.add(textoNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 70, 40));

        textoNombreC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoNombreC.setText("Nombre:");
        panelCompra.add(textoNombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 70, 40));

        textoCensuraC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoCensuraC.setText("N°Tarjeta:");
        panelCompra.add(textoCensuraC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 80, 40));

        textoTipoP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoTipoP.setText("Tipo:");
        panelCompra.add(textoTipoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 70, 40));

        textoCensuraP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoCensuraP.setText("Censura:");
        panelCompra.add(textoCensuraP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 70, 40));

        textoDuracionP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoDuracionP.setText("Duracion:");
        panelCompra.add(textoDuracionP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 80, 40));

        textoMontoTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoMontoTotal.setText("Monto Total :");
        panelCompra.add(textoMontoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 100, 40));

        textoDiaP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoDiaP.setText("Dia:");
        panelCompra.add(textoDiaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 40, 40));

        textoMesP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoMesP.setText(" Mes: ");
        panelCompra.add(textoMesP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 40, 40));

        textoHorarioP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoHorarioP.setText("Horario: ");
        panelCompra.add(textoHorarioP, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, 70, 40));

        textoSalaP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoSalaP.setText("Sala: ");
        panelCompra.add(textoSalaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 80, 40));

        tituloCliente.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tituloCliente.setText("DATOS CLIENTE");
        panelCompra.add(tituloCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, 30));

        tituloCompra.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        tituloCompra.setText("DATOS DE LA COMPRA");
        panelCompra.add(tituloCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 460, 70));

        tituloPelicula.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        tituloPelicula.setText("DATOS PELICULA");
        panelCompra.add(tituloPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 220, 30));

        textoEmailC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoEmailC.setText("E-mail:");
        panelCompra.add(textoEmailC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 70, 40));

        textoApellidoC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoApellidoC.setText("Apellido:");
        panelCompra.add(textoApellidoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 70, 40));

        imagenQR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/codigoQR.png"))); // NOI18N
        imagenQR.setToolTipText("");
        panelCompra.add(imagenQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 190, 180));

        textoVip.setBackground(new java.awt.Color(255, 153, 0));
        textoVip.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        textoVip.setForeground(new java.awt.Color(255, 153, 0));
        panelCompra.add(textoVip, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 60, 30));

        descuentoCompra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        descuentoCompra.setText("Descuento: ");
        panelCompra.add(descuentoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        textoDescuentoCompra.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textoDescuentoCompra.setOpaque(true);
        panelCompra.add(textoDescuentoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 150, 30));

        capaPrincipalCompra.setBackground(new java.awt.Color(255, 255, 255));
        capaPrincipalCompra.setOpaque(true);
        panelCompra.add(capaPrincipalCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 750));

        javax.swing.GroupLayout ventanaCompraLayout = new javax.swing.GroupLayout(ventanaCompra.getContentPane());
        ventanaCompra.getContentPane().setLayout(ventanaCompraLayout);
        ventanaCompraLayout.setHorizontalGroup(
            ventanaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaCompraLayout.setVerticalGroup(
            ventanaCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        VentanaVip.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        VentanaVip.setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Acepto.setBackground(new java.awt.Color(255, 102, 0));
        Acepto.setText("ACEPTO");
        Acepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptoActionPerformed(evt);
            }
        });
        jPanel2.add(Acepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 160, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("¿QUÉ BENEFICIOS TRAE?");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 310, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿Quieres ser VIP?");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 310, 60));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("30%");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, 100));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("* TENDRAS PERMISO PARA RECARGA DE BEBIDA");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SE OTORGA UNA TARJETA ESPECIAL");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("* TENDRAS ACCESO A COMBOS PREMIUM");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("* TENDRAS PERMISO PARA RECARGA DE CANCHA");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 420, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("¿QUE HACE?");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("N° TARJETA: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 130, 30));
        jPanel2.add(nroTarjetaVip, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 170, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("NOMBRE: ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 120, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("APELLIDOS : ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 130, 30));

        cvcTexto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cvcTexto.setText("CVC:");
        jPanel2.add(cvcTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 130, 30));
        jPanel2.add(cvcVip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 170, 30));
        jPanel2.add(nombreVip, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 170, 30));
        jPanel2.add(apellidoVip, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 170, 30));
        jPanel2.add(emailVip, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 170, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("EMAIL: ");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 130, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("LAS COMPRAS ONLINE REQUIEREN TU EMAIL PARA APLICAR EL DESCUENTO.");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 500, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("LAS COMPRAS EN PERSONA SOLO NECESITA LA TARJETA.");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("NOTA : ");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 120, 20));

        salidaVip.setText("Regresar");
        salidaVip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaVipActionPerformed(evt);
            }
        });
        jPanel2.add(salidaVip, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  DESCUENTO                A TODAS LAS FUNCIONES");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 560, 40));

        jLabel12.setBackground(new java.awt.Color(102, 102, 102));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setOpaque(true);
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 390, 540));

        jLabel14.setBackground(new java.awt.Color(102, 102, 255));
        jLabel14.setForeground(new java.awt.Color(0, 255, 255));
        jLabel14.setOpaque(true);
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 410, 540));

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        javax.swing.GroupLayout VentanaVipLayout = new javax.swing.GroupLayout(VentanaVip.getContentPane());
        VentanaVip.getContentPane().setLayout(VentanaVipLayout);
        VentanaVipLayout.setHorizontalGroup(
            VentanaVipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VentanaVipLayout.setVerticalGroup(
            VentanaVipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(pantalla.getScreenSize().width/4,pantalla.getScreenSize().height/4);
        setLocationByPlatform(true);
        setResizable(false);

        PanelPrincipal.setPreferredSize(new java.awt.Dimension(800, 600));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escogerPelicula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        escogerPelicula.setText("Escoja una pelicula");
        escogerPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(55, 125, 255), 4));
        escogerPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escogerPeliculaActionPerformed(evt);
            }
        });
        PanelPrincipal.add(escogerPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 130, 30));

        spiderman.setBackground(new java.awt.Color(0, 0, 0));
        spiderman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        spiderman.setBorderPainted(true);
        spiderman.setContentAreaFilled(false);
        spiderman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/spidermanwork.jpg"))); // NOI18N
        spiderman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spidermanActionPerformed(evt);
            }
        });
        PanelPrincipal.add(spiderman, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 170, 170));

        annabelle3.setText("jRadioButton2");
        annabelle3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        annabelle3.setBorderPainted(true);
        annabelle3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anabellework.jpg"))); // NOI18N
        annabelle3.setPreferredSize(new java.awt.Dimension(170, 170));
        annabelle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annabelle3ActionPerformed(evt);
            }
        });
        PanelPrincipal.add(annabelle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        toyStory4.setText("jRadioButton3");
        toyStory4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        toyStory4.setBorderPainted(true);
        toyStory4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/toystoryWork.jpg"))); // NOI18N
        toyStory4.setPreferredSize(new java.awt.Dimension(170, 170));
        toyStory4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toyStory4ActionPerformed(evt);
            }
        });
        PanelPrincipal.add(toyStory4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        hombresNegro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        hombresNegro.setBorderPainted(true);
        hombresNegro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HombresdenegroWork.jpg"))); // NOI18N
        hombresNegro.setPreferredSize(new java.awt.Dimension(170, 170));
        hombresNegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hombresNegroActionPerformed(evt);
            }
        });
        PanelPrincipal.add(hombresNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        infToyStory.setForeground(new java.awt.Color(200, 200, 200));
        infToyStory.setText("Apta para todo publico| 1h 40m | 2019");
        PanelPrincipal.add(infToyStory, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 210, 30));

        infSpiderman.setForeground(new java.awt.Color(200, 200, 200));
        infSpiderman.setText("Apta para todo publico| 2h 15m | 2019");
        PanelPrincipal.add(infSpiderman, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 210, 30));

        infHombresNegro.setForeground(new java.awt.Color(200, 200, 200));
        infHombresNegro.setText("Apta para todo publico| 2h 30m | 2019");
        PanelPrincipal.add(infHombresNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 210, 30));

        infAnnabelle.setForeground(new java.awt.Color(200, 200, 200));
        infAnnabelle.setText("Mayores de 14 | 1h 40m | 2019");
        PanelPrincipal.add(infAnnabelle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 190, 30));

        fandango.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        fandango.setForeground(new java.awt.Color(51, 60, 255));
        fandango.setText("FANDANGO");
        PanelPrincipal.add(fandango, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 210, 40));

        imgfandango.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fandango2.png"))); // NOI18N
        PanelPrincipal.add(imgfandango, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        tituloRealPlaza.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        tituloRealPlaza.setForeground(new java.awt.Color(255, 255, 255));
        tituloRealPlaza.setText("CINEPLANET TRUJILLO REAL PLAZA");
        PanelPrincipal.add(tituloRealPlaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 460, 50));

        jButton3.setBackground(new java.awt.Color(255, 204, 0));
        jButton3.setText("Cuenta VIP");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 4));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        PanelPrincipal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, 110, 30));

        capaPrincipal.setBackground(new java.awt.Color(40, 40, 40));
        capaPrincipal.setOpaque(true);
        ButtonGroup pelis=new ButtonGroup();
        pelis.add(spiderman);
        pelis.add(annabelle3);
        pelis.add(toyStory4);
        pelis.add(hombresNegro);
        PanelPrincipal.add(capaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void escogerPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escogerPeliculaActionPerformed
        // TODO add your handling code here:

        if (spiderman.isSelected()) {
            this.setVisible(false);
            ventanaSpiderman.setVisible(rootPaneCheckingEnabled);
            nombrePelicula.setText(peliculas.get(0).getNombre());
            censuraPelicula.setText(peliculas.get(0).getCensura()); // 0 = SPIDERMAN, 1=ANABELLE, 2=TOYSTORY, 3=HOMBRESNEGRO
            duracionPelicula.setText(peliculas.get(0).getDuracion());
            peliculaElegida = peliculas.get(0);

        }
        if (annabelle3.isSelected()) {
            this.setVisible(false);
            ventanaAnnabelle.setVisible(rootPaneCheckingEnabled);
            nombrePelicula.setText(peliculas.get(1).getNombre());
            censuraPelicula.setText(peliculas.get(1).getCensura());
            duracionPelicula.setText(peliculas.get(1).getDuracion());
            peliculaElegida = peliculas.get(1);

        }
        if (toyStory4.isSelected()) {
            this.setVisible(false);
            ventanaToyStory.setVisible(rootPaneCheckingEnabled);
            nombrePelicula.setText(peliculas.get(2).getNombre());
            censuraPelicula.setText(peliculas.get(2).getCensura());
            duracionPelicula.setText(peliculas.get(3).getDuracion());
            peliculaElegida = peliculas.get(2);

        }
        if (hombresNegro.isSelected()) {
            this.setVisible(false);
            ventanaHombresNegro.setVisible(rootPaneCheckingEnabled);
            nombrePelicula.setText(peliculas.get(3).getNombre());
            censuraPelicula.setText(peliculas.get(3).getCensura());
            duracionPelicula.setText(peliculas.get(3).getDuracion());
            peliculaElegida = peliculas.get(3);
        }


    }//GEN-LAST:event_escogerPeliculaActionPerformed

    private void spidermanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spidermanActionPerformed
        // TODO add your handling code here:
        spiderman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 0, 0), 3));
        annabelle3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        toyStory4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        hombresNegro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

    }//GEN-LAST:event_spidermanActionPerformed

    private void annabelle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annabelle3ActionPerformed
        // TODO add your handling code here:
        annabelle3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 0, 0), 3));
        spiderman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        toyStory4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        hombresNegro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
    }//GEN-LAST:event_annabelle3ActionPerformed

    private void hombresNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hombresNegroActionPerformed
        // TODO add your handling code here:
        hombresNegro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 0, 0), 3));
        spiderman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        annabelle3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        toyStory4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
    }//GEN-LAST:event_hombresNegroActionPerformed

    private void toyStory4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toyStory4ActionPerformed
        // TODO add your handling code here:
        toyStory4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 0, 0), 3));
        spiderman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        annabelle3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        hombresNegro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
    }//GEN-LAST:event_toyStory4ActionPerformed

    private void horario6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario6ActionPerformed
        ventanaSpiderman.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(12);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));

    }//GEN-LAST:event_horario6ActionPerformed

    private void horario11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario11ActionPerformed
        // TODO add your handling code here:
        ventanaAnnabelle.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(24);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario11ActionPerformed

    private void horario14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario14ActionPerformed
        // TODO add your handling code here:
        ventanaToyStory.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(17);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario14ActionPerformed

    private void horario23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario23ActionPerformed
        // TODO add your handling code here:
        ventanaHombresNegro.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(18);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario23ActionPerformed

    private void horario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario1ActionPerformed
        ventanaSpiderman.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(0);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));

    }//GEN-LAST:event_horario1ActionPerformed

    private void horario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario2ActionPerformed
        ventanaSpiderman.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(4);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario2ActionPerformed

    private void horario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario3ActionPerformed
        ventanaSpiderman.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(5);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario3ActionPerformed

    private void horario4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario4ActionPerformed
        ventanaSpiderman.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(7);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario4ActionPerformed

    private void horario5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario5ActionPerformed
        ventanaSpiderman.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(11);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario5ActionPerformed

    private void horario7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario7ActionPerformed
        ventanaSpiderman.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(16);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario7ActionPerformed

    private void horario8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario8ActionPerformed
        ventanaSpiderman.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(19);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario8ActionPerformed

    private void horario9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario9ActionPerformed
        ventanaSpiderman.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(20);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario9ActionPerformed

    private void horario10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario10ActionPerformed
        ventanaSpiderman.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(23);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario10ActionPerformed

    private void horario12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario12ActionPerformed
        ventanaAnnabelle.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(1);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario12ActionPerformed

    private void horario13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario13ActionPerformed
        ventanaAnnabelle.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(26);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario13ActionPerformed

    private void horario16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario16ActionPerformed
        ventanaAnnabelle.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(21);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario16ActionPerformed

    private void horario19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario19ActionPerformed
        ventanaAnnabelle.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(15);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario19ActionPerformed

    private void horario20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario20ActionPerformed
        ventanaAnnabelle.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(9);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario20ActionPerformed

    private void horario15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario15ActionPerformed
        // TODO add your handling code here:
        ventanaToyStory.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(2);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario15ActionPerformed

    private void horario22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario22ActionPerformed
        ventanaToyStory.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(6);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario22ActionPerformed

    private void horario21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario21ActionPerformed
        ventanaToyStory.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(10);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario21ActionPerformed

    private void horario18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario18ActionPerformed
        ventanaToyStory.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(14);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario18ActionPerformed

    private void horario17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario17ActionPerformed
        ventanaToyStory.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(25);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario17ActionPerformed

    private void horario24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario24ActionPerformed
        // TODO add your handling code here:
        ventanaHombresNegro.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(13);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario24ActionPerformed

    private void horario25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario25ActionPerformed
        // TODO add your handling code here:
        ventanaHombresNegro.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(3);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario25ActionPerformed

    private void horario26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario26ActionPerformed
        // TODO add your handling code here:
        ventanaHombresNegro.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(8);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario26ActionPerformed

    private void horario27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horario27ActionPerformed
        // TODO add your handling code here:
        ventanaHombresNegro.setVisible(false);
        VentanaCliente.setVisible(rootPaneCheckingEnabled);
        funcionElegida = funciones.get(22);
        nSala.setText(Integer.toString(funcionElegida.getSala().getSala()));
        PrecioButaca.setText(Integer.toString(funcionElegida.getPrecio()));
    }//GEN-LAST:event_horario27ActionPerformed

    private void butaca9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca9ActionPerformed
        if (Color.green == butaca9.getBackground()) {
            butaca9.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(9).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca9.getBackground())) {
            butaca9.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(9).setDisponible(0);
            butacas = butacas - 1;
        }
    }//GEN-LAST:event_butaca9ActionPerformed

    private void butaca3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca3ActionPerformed
        if (Color.green == butaca3.getBackground()) {
            butaca3.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(3).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca3.getBackground())) {
            butaca3.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(3).setDisponible(0);
            butacas = butacas - 1;
        }
    }//GEN-LAST:event_butaca3ActionPerformed

    private void butaca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca1ActionPerformed
        if (Color.green == butaca1.getBackground()) {
            butaca1.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(1).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca1.getBackground())) {
            butaca1.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(1).setDisponible(0);
            butacas = butacas - 1;
        }

    }//GEN-LAST:event_butaca1ActionPerformed

    private void butaca10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca10ActionPerformed
        if (Color.green == butaca10.getBackground()) {
            butaca10.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(10).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca10.getBackground())) {
            butaca10.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(10).setDisponible(0);
            butacas = butacas - 1;
        }
    }//GEN-LAST:event_butaca10ActionPerformed

    private void butaca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca2ActionPerformed
        if (Color.green == butaca2.getBackground()) {
            butaca2.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(2).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca2.getBackground())) {
            butaca2.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(2).setDisponible(0);
            butacas = butacas - 1;
        }
    }//GEN-LAST:event_butaca2ActionPerformed

    private void butaca0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca0ActionPerformed
        // TODO add your handling code here:
        if (Color.green == butaca0.getBackground()) {
            butaca0.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(0).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca0.getBackground())) {
            butaca0.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(0).setDisponible(0);
            butacas = butacas - 1;
        }


    }//GEN-LAST:event_butaca0ActionPerformed

    private void butaca5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca5ActionPerformed
        if (Color.green == butaca5.getBackground()) {
            butaca5.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(5).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca5.getBackground())) {
            butaca5.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(5).setDisponible(0);
            butacas = butacas - 1;
        }
    }//GEN-LAST:event_butaca5ActionPerformed

    private void butaca6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca6ActionPerformed
        if (Color.green == butaca6.getBackground()) {
            butaca6.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(6).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca6.getBackground())) {
            butaca6.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(6).setDisponible(0);
            butacas = butacas - 1;
        }
    }//GEN-LAST:event_butaca6ActionPerformed

    private void butaca7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca7ActionPerformed
        if (Color.green == butaca7.getBackground()) {
            butaca7.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(7).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca7.getBackground())) {
            butaca7.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(7).setDisponible(0);
            butacas = butacas - 1;
        }
    }//GEN-LAST:event_butaca7ActionPerformed

    private void butaca8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca8ActionPerformed
        if (Color.green == butaca8.getBackground()) {
            butaca8.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(8).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca8.getBackground())) {
            butaca8.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(8).setDisponible(0);
            butacas = butacas - 1;
        }
    }//GEN-LAST:event_butaca8ActionPerformed

    private void butaca19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca19ActionPerformed
        if (Color.green == butaca19.getBackground()) {
            butaca19.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(19).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca19.getBackground())) {
            butaca19.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(19).setDisponible(0);
            butacas = butacas - 1;
        }
    }//GEN-LAST:event_butaca19ActionPerformed

    private void butaca4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca4ActionPerformed
        if (Color.green == butaca4.getBackground()) {
            butaca4.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(4).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca4.getBackground())) {
            butaca4.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(4).setDisponible(0);
            butacas = butacas - 1;
        }
    }//GEN-LAST:event_butaca4ActionPerformed

    private void butaca11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca11ActionPerformed
        if (Color.green == butaca11.getBackground()) {
            butaca11.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(11).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca11.getBackground())) {
            butaca11.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(11).setDisponible(0);
            butacas = butacas - 1;
        }
    }//GEN-LAST:event_butaca11ActionPerformed

    private void butaca12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca12ActionPerformed
        if (Color.green == butaca12.getBackground()) {
            butaca12.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(12).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca12.getBackground())) {
            butaca12.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(12).setDisponible(0);
            butacas = butacas - 1;
        }
    }//GEN-LAST:event_butaca12ActionPerformed

    private void butaca13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca13ActionPerformed
        if (Color.green == butaca13.getBackground()) {
            butaca13.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(13).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca13.getBackground())) {
            butaca13.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(13).setDisponible(0);
            butacas = butacas - 1;
        }
    }//GEN-LAST:event_butaca13ActionPerformed

    private void butaca14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca14ActionPerformed
        if (Color.green == butaca14.getBackground()) {
            butaca14.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(14).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca14.getBackground())) {
            butaca14.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(14).setDisponible(0);
            butacas = butacas - 1;
        }
    }//GEN-LAST:event_butaca14ActionPerformed

    private void butaca15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca15ActionPerformed
        if (Color.green == butaca15.getBackground()) {
            butaca15.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(15).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca15.getBackground())) {
            butaca15.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(15).setDisponible(0);
            butacas = butacas - 1;
        }
    }//GEN-LAST:event_butaca15ActionPerformed

    private void butaca16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca16ActionPerformed
        if (Color.green == butaca16.getBackground()) {
            butaca16.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(16).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca16.getBackground())) {
            butaca16.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(16).setDisponible(0);
            butacas = butacas - 1;
        }
    }//GEN-LAST:event_butaca16ActionPerformed

    private void butaca17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca17ActionPerformed
        if (Color.green == butaca17.getBackground()) {
            butaca17.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(17).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca17.getBackground())) {
            butaca17.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(17).setDisponible(0);
            butacas = butacas - 1;
        }
    }//GEN-LAST:event_butaca17ActionPerformed

    private void butaca18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaca18ActionPerformed
        if (Color.green == butaca18.getBackground()) {
            butaca18.setBackground(Color.white);
            funcionElegida.getButacasDisponibles().get(18).setDisponible(1);
            butacas = butacas + 1;
        } else if (butacas > 0 && (Color.red != butaca18.getBackground())) {
            butaca18.setBackground(Color.green);
            funcionElegida.getButacasDisponibles().get(18).setDisponible(0);
            butacas = butacas - 1;
        }
    }//GEN-LAST:event_butaca18ActionPerformed

    private void botonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarActionPerformed
        // TODO add your handling code here:
        if (butacas == 0) {
            ventanaAsientos.setVisible(false);
            ventanaCompra.setVisible(rootPaneCheckingEnabled);
            for (int i = 0; i < clientesVip1.size(); i++) {
                esClienteVip1 = false;
                if (clientesVip1.get(i).getEmail().compareTo(email) == 0) {
                    textoVip.setText("VIP");
                    textoDescuentoCompra.setText(Integer.toString((int)(compraTotal*0.3)));
                    esClienteVip1 = true;
                    nroClienteVip1 = i;
                    break;
                }

            }

            for (int i = 0; i < clientes.size(); i++) {
                if ((email.compareTo(clientes.get(i).getEmail())) == 0) {
                    nuevoCliente = false;
                    nroCliente = i;
                    break;

                }
            }
            if (esClienteVip1 == true) {
                clientesVip1.get(nroClienteVip1).comprarBoleta(new Entrada(funcionElegida, clientesVip1.get(nroClienteVip1), compraTotal));
                funcionElegida.setBoletas(clientesVip1.get(nroClienteVip1).getBoleta().getLast());
            } else if (nuevoCliente) {
                clientes.add(new Cliente(nombre, apellido, email, nroTarjeta, CVC));
                clientes.getLast().comprarBoleta(new Entrada(funcionElegida, clientes.getLast(), compraTotal));
                nroCliente = clientes.size() - 1;
                funcionElegida.setBoletas(clientes.getLast().getBoleta().getLast());

            } else {
                clientes.get(nroCliente).comprarBoleta(new Entrada(funcionElegida, clientes.get(nroCliente), compraTotal));
                funcionElegida.setBoletas(clientes.get(nroCliente).getBoleta().getLast());

            }
            nuevoCliente = true;
            if (esClienteVip1 == false) {
                for (int i = 0; i < 20; i++) {
                    if (Color.green == Lbutacas.get(i).getBackground()) {
                        clientes.get(nroCliente).getBoleta().getLast().setAsientos(salas.get(0).getButacasDisponibles().get(i).getAsiento());
                    }
                }
                for (int i = 0; i < clientes.get(nroCliente).getBoleta().getLast().getAsientos().size(); i++) {
                    asientosCompra.setText(asientosCompra.getText() + clientes.get(nroCliente).getBoleta().getLast().getAsientos().get(i) + " - ");
                }
            } else {
                for (int i = 0; i < 20; i++) {
                    if (Color.green == Lbutacas.get(i).getBackground()) {

                        clientesVip1.get(nroClienteVip1).getBoleta().getLast().setAsientos(salas.get(0).getButacasDisponibles().get(i).getAsiento());

                    }
                }
                for (int i = 0; i < clientesVip1.get(nroClienteVip1).getBoleta().getLast().getAsientos().size(); i++) {
                    asientosCompra.setText(asientosCompra.getText() + clientesVip1.get(nroClienteVip1).getBoleta().getLast().getAsientos().get(i) + " - ");
                }
            }
            if (esClienteVip1 == true) {
                apellidoClienteCompra.setText(clientesVip1.get(nroClienteVip1).getApellido());
                nombreClienteCompra.setText(clientesVip1.get(nroClienteVip1).getNombre());
                emailClienteCompra.setText(clientesVip1.get(nroClienteVip1).getEmail());
                nroTarjetaCompra.setText(clientesVip1.get(nroClienteVip1).getnTarjeta());
                nombrePeliculaCompra.setText(funcionElegida.getPelicula().getNombre());
                tipoPeliculaCompra.setText(funcionElegida.getPelicula().getTipo());
                censuraPeliculaCompra.setText(funcionElegida.getPelicula().getCensura());
                duracionPeliculaCompra.setText(funcionElegida.getPelicula().getDuracion());
                diaPeliculaCompra.setText(Integer.toString(funcionElegida.getDia()));
                mesPeliculaCompra.setText(Integer.toString(funcionElegida.getMes()));
                horarioPeliculaCompra.setText(funcionElegida.getHora());
                salaPeliculaCompra.setText(Integer.toString(funcionElegida.getSala().getSala()));
                MontoTotal.setText(Integer.toString(clientesVip1.get(nroClienteVip1).getBoleta().getLast().getMontoTotal()));
            } else {
                apellidoClienteCompra.setText(clientes.get(nroCliente).getApellido());
                nombreClienteCompra.setText(clientes.get(nroCliente).getNombre());
                emailClienteCompra.setText(clientes.get(nroCliente).getEmail());
                nroTarjetaCompra.setText(clientes.get(nroCliente).getnTarjeta());
                nombrePeliculaCompra.setText(funcionElegida.getPelicula().getNombre());
                tipoPeliculaCompra.setText(funcionElegida.getPelicula().getTipo());
                censuraPeliculaCompra.setText(funcionElegida.getPelicula().getCensura());
                duracionPeliculaCompra.setText(funcionElegida.getPelicula().getDuracion());
                diaPeliculaCompra.setText(Integer.toString(funcionElegida.getDia()));
                mesPeliculaCompra.setText(Integer.toString(funcionElegida.getMes()));
                horarioPeliculaCompra.setText(funcionElegida.getHora());
                salaPeliculaCompra.setText(Integer.toString(funcionElegida.getSala().getSala()));
                MontoTotal.setText(Integer.toString(compraTotal));
            }
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println("Nombre: " + clientes.get(i).getNombre());
                System.out.println("Apellido: " + clientes.get(i).getApellido());
                System.out.println("Correo Electronico: " + clientes.get(i).getEmail());
                System.out.println("Peliculas: ");
                for (int j = 0; j < clientes.get(i).getBoleta().size(); j++) {
                    System.out.println((j + 1) + ". Pelicula: " + clientes.get(i).getBoleta().get(j).getFuncion().getPelicula().getNombre());
                    System.out.println((j + 1) + ". Horario: " + clientes.get(i).getBoleta().get(j).getFuncion().getHora());
                }
            }
        }
    }//GEN-LAST:event_botonComprarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        validaciones = true;
        if (nombreCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo nombre esta vacio");
            validaciones = false;
        }
        if (apellidoCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo apellido esta vacio");
            validaciones = false;

        }
        if (emailCliente.getText().isEmpty() || !emailCliente.getText().contains("@hotmail.com")) {
            JOptionPane.showMessageDialog(null, "El correo electronico no es valido");
            validaciones = false;
        }

        try {
            Double.parseDouble(nTarjetaCliente.getText());
            if (nTarjetaCliente.getText().length() != 16) {
                JOptionPane.showMessageDialog(null, "El numero de tarjeta de credito es incorrecto");
                validaciones=false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El numero de tarjeta es Invalido");
            validaciones = false;
        }
        try {
            Integer.parseInt(cvcCliente.getText());
            if(cvcCliente.getText().length()!=3){
                JOptionPane.showMessageDialog(null,"El CVC es incorrecto");
                validaciones=false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El CVC Invalido");
            validaciones = false;
        }
        try {
            if (Integer.parseInt(nButacas.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "Debe colocar al menos una butaca");
                validaciones=false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese el numero de butacas");
            validaciones = false;
        }

        if (validaciones) {

            VentanaCliente.setVisible(false);
            ventanaAsientos.setVisible(rootPaneCheckingEnabled);
            nombre = nombreCliente.getText();
            apellido = apellidoCliente.getText();      //Temporales para guardar la informacion hasta que el usuario compre 
            email = emailCliente.getText();
            nroTarjeta = nTarjetaCliente.getText();
            CVC = Integer.parseInt(cvcCliente.getText());
            butacas = Integer.parseInt(nButacas.getText());
            compraTotal = funcionElegida.getPrecio() * butacas;

            for (int i = 0; i < 20; i++) {
                if (funcionElegida.getButacasDisponibles().get(i).getDisponible() == 0) {
                    Lbutacas.get(i).setBackground(Color.red);
                } else {
                    Lbutacas.get(i).setBackground(Color.white);
                }

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        ventanaCompra.setVisible(false);
        this.setVisible(rootPaneCheckingEnabled);
        nombreCliente.setText("");
        apellidoCliente.setText("");
        emailCliente.setText("");
        nTarjetaCliente.setText("");
        nButacas.setText("");
        cvcCliente.setText("");
        textoVip.setText("");
        textoDescuentoCompra.setText("");
        System.out.println(salas.get(0).getButacasDisponibles().get(0).getDisponible().size());
        for (int i = 0; i < salas.get(0).getButacasDisponibles().get(0).getDisponible().size(); i++) {
            System.out.println(salas.get(0).getButacasDisponibles().get(0).getDisponible().get(i).getFuncion().getHora() + " - " + salas.get(0).getButacasDisponibles().get(0).getDisponible().get(i).getDisponible());
        }
        for (int i = 0; i < 20; i++) {
            Lbutacas.get(i).setSelected(false);
        }

        asientosCompra.setText("");

    }//GEN-LAST:event_botonSalirActionPerformed

    private void AceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptoActionPerformed
        // TODO add your handling code here:
                validaciones = true;
        if (nombreVip.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo nombre esta vacio");
            validaciones = false;
        }
        if (apellidoVip.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo apellido esta vacio");
            validaciones = false;

        }
        if (emailVip.getText().isEmpty() || !emailVip.getText().contains("@hotmail.com")) {
            JOptionPane.showMessageDialog(null, "El correo electronico no es valido");
            validaciones = false;
        }

        try {
            Double.parseDouble(nroTarjetaVip.getText());
            if (nroTarjetaVip.getText().length() != 16) {
                JOptionPane.showMessageDialog(null, "El numero de tarjeta de credito es incorrecto");
                validaciones=false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El numero de tarjeta es Invalido");
            validaciones = false;
        }
        try {
            Integer.parseInt(cvcVip1.getText());
            if(cvcVip1.getText().length()!=3){
                JOptionPane.showMessageDialog(null,"El CVC es incorrecto");
                validaciones=false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El CVC Invalido");
            validaciones = false;
        }
    
        if(validaciones){
        clientesVip1.add(new ClienteVip1(nombreVip.getText(), apellidoVip.getText(), emailVip.getText(), nroTarjetaVip.getText(), Integer.parseInt(cvcVip1.getText())));
        VentanaVip.setVisible(false);
        this.setVisible(true);
        nombreVip.setText("");
        emailVip.setText("");
        apellidoVip.setText("");
        nroTarjetaVip.setText("");
        cvcVip1.setText("");
        }
    }//GEN-LAST:event_AceptoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        nombreVip.setText("");
        apellidoVip.setText("");
        cvcVip1.setText("");
        nroTarjetaVip.setText("");
        emailVip.setText("");
        this.setVisible(false);
        VentanaVip.setVisible(true);
        VentanaVip.setBounds(550, 200, 800, 600);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void regresarSpidermanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarSpidermanActionPerformed
        // TODO add your handling code here:
        spiderman.setSelected(false);
        ventanaSpiderman.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_regresarSpidermanActionPerformed

    private void regresarAnabelle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarAnabelle3ActionPerformed
        // TODO add your handling code here:
        annabelle3.setSelected(false);
        ventanaAnnabelle.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_regresarAnabelle3ActionPerformed

    private void regresarToyStoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarToyStoryActionPerformed
        // TODO add your handling code here:
        toyStory4.setSelected(false);
        ventanaToyStory.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_regresarToyStoryActionPerformed

    private void regresarHombresNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarHombresNegroActionPerformed
        // TODO add your handling code here:
        hombresNegro.setSelected(false);
        ventanaHombresNegro.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_regresarHombresNegroActionPerformed

    private void nButacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nButacasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nButacasActionPerformed

    private void salidaVipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaVipActionPerformed
        // TODO add your handling code here:
        this.setVisible(true);
        VentanaVip.setVisible(false);
    }//GEN-LAST:event_salidaVipActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppCine().setVisible(true);
            }
        });
    }

    private LinkedList<Cliente> clientes = new LinkedList<>();
    private LinkedList<Sala> salas = new LinkedList<>();
    private LinkedList<Funcion> funciones = new LinkedList<>();
    private LinkedList<Pelicula> peliculas = new LinkedList<>();
    private Funcion funcionElegida = new Funcion();
    private Pelicula peliculaElegida = new Pelicula();
    private Cliente cliente = new Cliente();
    private String nombre, apellido, email, nroTarjeta;
    private int CVC, butacas, nroCliente;
    private boolean nuevoCliente = true;
    private Toolkit pantalla = Toolkit.getDefaultToolkit();
    private LinkedList<JCheckBox> Lbutacas = new LinkedList<>();
    private LinkedList<Disponibilidad> disponibles = new LinkedList<>();
    private int compraTotal;
    private LinkedList<ClienteVip1> clientesVip1 = new LinkedList<>();
    private boolean esClienteVip1 = false;
    private int nroClienteVip1;
    private boolean validaciones = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acepto;
    private javax.swing.JLabel CapaBlanca;
    private javax.swing.JLabel CapaNegra;
    private javax.swing.JLabel MontoTotal;
    private javax.swing.JPanel PanelAnnabelle3;
    private javax.swing.JPanel PanelAsientos;
    private javax.swing.JPanel PanelCliente;
    private javax.swing.JPanel PanelHombresNegro;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelSpiderman;
    private javax.swing.JPanel PanelToyStory;
    private javax.swing.JLabel PrecioButaca;
    private javax.swing.JFrame VentanaCliente;
    private javax.swing.JFrame VentanaVip;
    private javax.swing.JRadioButton annabelle3;
    private javax.swing.JTextField apellidoCliente;
    private javax.swing.JLabel apellidoClienteCompra;
    private javax.swing.JTextField apellidoVip;
    private javax.swing.JLabel asientosCompra;
    private javax.swing.JButton botonComprar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JCheckBox butaca0;
    private javax.swing.JCheckBox butaca1;
    private javax.swing.JCheckBox butaca10;
    private javax.swing.JCheckBox butaca11;
    private javax.swing.JCheckBox butaca12;
    private javax.swing.JCheckBox butaca13;
    private javax.swing.JCheckBox butaca14;
    private javax.swing.JCheckBox butaca15;
    private javax.swing.JCheckBox butaca16;
    private javax.swing.JCheckBox butaca17;
    private javax.swing.JCheckBox butaca18;
    private javax.swing.JCheckBox butaca19;
    private javax.swing.JCheckBox butaca2;
    private javax.swing.JCheckBox butaca3;
    private javax.swing.JCheckBox butaca4;
    private javax.swing.JCheckBox butaca5;
    private javax.swing.JCheckBox butaca6;
    private javax.swing.JCheckBox butaca7;
    private javax.swing.JCheckBox butaca8;
    private javax.swing.JCheckBox butaca9;
    private javax.swing.JLabel capaInferior;
    private javax.swing.JLabel capaPrincipal;
    private javax.swing.JLabel capaPrincipalAnnabelle1;
    private javax.swing.JLabel capaPrincipalCompra;
    private javax.swing.JLabel capaPrincipalHombresNegro;
    private javax.swing.JLabel capaPrincipalSpiderman;
    private javax.swing.JLabel capaPrincipalToyStory;
    private javax.swing.JLabel capaSuperior;
    private javax.swing.JLabel censuraPelicula;
    private javax.swing.JLabel censuraPeliculaCompra;
    private javax.swing.JTextField cvcCliente;
    private javax.swing.JLabel cvcTexto;
    private javax.swing.JTextField cvcVip1;
    private javax.swing.JLabel descuentoCompra;
    private javax.swing.JLabel diaFuncion1;
    private javax.swing.JLabel diaFuncion2;
    private javax.swing.JLabel diaFuncion3;
    private javax.swing.JLabel diaFuncion4;
    private javax.swing.JLabel diaPeliculaCompra;
    private javax.swing.JLabel duracionPelicula;
    private javax.swing.JLabel duracionPeliculaCompra;
    private javax.swing.JTextField emailCliente;
    private javax.swing.JLabel emailClienteCompra;
    private javax.swing.JTextField emailVip;
    private javax.swing.JButton escogerPelicula;
    private javax.swing.JLabel fandango;
    private javax.swing.JLabel fandango1;
    private javax.swing.JLabel fandango2;
    private javax.swing.JLabel fandango3;
    private javax.swing.JLabel fandango4;
    private javax.swing.JLabel fandango5;
    private javax.swing.JRadioButton hombresNegro;
    private javax.swing.JButton horario1;
    private javax.swing.JButton horario10;
    private javax.swing.JButton horario11;
    private javax.swing.JButton horario12;
    private javax.swing.JButton horario13;
    private javax.swing.JButton horario14;
    private javax.swing.JButton horario15;
    private javax.swing.JButton horario16;
    private javax.swing.JButton horario17;
    private javax.swing.JButton horario18;
    private javax.swing.JButton horario19;
    private javax.swing.JButton horario2;
    private javax.swing.JButton horario20;
    private javax.swing.JButton horario21;
    private javax.swing.JButton horario22;
    private javax.swing.JButton horario23;
    private javax.swing.JButton horario24;
    private javax.swing.JButton horario25;
    private javax.swing.JButton horario26;
    private javax.swing.JButton horario27;
    private javax.swing.JButton horario3;
    private javax.swing.JButton horario4;
    private javax.swing.JButton horario5;
    private javax.swing.JButton horario6;
    private javax.swing.JButton horario7;
    private javax.swing.JButton horario8;
    private javax.swing.JButton horario9;
    private javax.swing.JLabel horarioPeliculaCompra;
    private javax.swing.JLabel imagenQR;
    private javax.swing.JLabel imgfandango;
    private javax.swing.JLabel imgfandango1;
    private javax.swing.JLabel imgfandango2;
    private javax.swing.JLabel imgfandango3;
    private javax.swing.JLabel imgfandango4;
    private javax.swing.JLabel imgfandango5;
    private javax.swing.JLabel infAnnabelle;
    private javax.swing.JLabel infHombresNegro;
    private javax.swing.JLabel infSpiderman;
    private javax.swing.JLabel infToyStory;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mesPeliculaCompra;
    private javax.swing.JTextField nButacas;
    private javax.swing.JLabel nSala;
    private javax.swing.JTextField nTarjetaCliente;
    private javax.swing.JTextField nombreCliente;
    private javax.swing.JLabel nombreClienteCompra;
    private javax.swing.JLabel nombrePelicula;
    private javax.swing.JLabel nombrePeliculaCompra;
    private javax.swing.JTextField nombreVip;
    private javax.swing.JLabel nroTarjetaCompra;
    private javax.swing.JTextField nroTarjetaVip;
    private javax.swing.JPanel panelCompra;
    private javax.swing.JButton regresarAnabelle3;
    private javax.swing.JButton regresarHombresNegro;
    private javax.swing.JButton regresarSpiderman;
    private javax.swing.JButton regresarToyStory;
    private javax.swing.JLabel salaPeliculaCompra;
    private javax.swing.JButton salidaVip;
    private javax.swing.JRadioButton spiderman;
    private javax.swing.JLabel texoPelicula;
    private javax.swing.JLabel textoApellido;
    private javax.swing.JLabel textoApellidoC;
    private javax.swing.JLabel textoAsientos;
    private javax.swing.JLabel textoCVC;
    private javax.swing.JLabel textoCVC1;
    private javax.swing.JLabel textoCensura;
    private javax.swing.JLabel textoCensuraC;
    private javax.swing.JLabel textoCensuraP;
    private javax.swing.JLabel textoDescuentoCompra;
    private javax.swing.JLabel textoDiaP;
    private javax.swing.JLabel textoDuracion;
    private javax.swing.JLabel textoDuracionP;
    private javax.swing.JLabel textoEmail;
    private javax.swing.JLabel textoEmailC;
    private javax.swing.JLabel textoFondoBlanco;
    private javax.swing.JLabel textoFondoRojo;
    private javax.swing.JLabel textoFondoVerde;
    private javax.swing.JLabel textoHorarioP;
    private javax.swing.JLabel textoInformacionCliente;
    private javax.swing.JLabel textoLibre;
    private javax.swing.JLabel textoMesP;
    private javax.swing.JLabel textoMontoTotal;
    private javax.swing.JLabel textoNTarjeta;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel textoNombreC;
    private javax.swing.JLabel textoNombreP;
    private javax.swing.JLabel textoOcupado;
    private javax.swing.JLabel textoPrecioButaca;
    private javax.swing.JLabel textoSala;
    private javax.swing.JLabel textoSalaP;
    private javax.swing.JLabel textoSeleccionado;
    private javax.swing.JLabel textoTipoP;
    private javax.swing.JLabel textoVip;
    private javax.swing.JLabel tipoPeliculaCompra;
    private javax.swing.JLabel tituloAnabelle1;
    private javax.swing.JLabel tituloCliente;
    private javax.swing.JLabel tituloCompra;
    private javax.swing.JLabel tituloHombresNegro;
    private javax.swing.JLabel tituloPantalla;
    private javax.swing.JLabel tituloPelicula;
    private javax.swing.JLabel tituloRealPlaza;
    private javax.swing.JLabel tituloRealPlaza2;
    private javax.swing.JLabel tituloRealPlaza3;
    private javax.swing.JLabel tituloRealPlaza4;
    private javax.swing.JLabel tituloRealPlaza5;
    private javax.swing.JLabel tituloSpiderman1;
    private javax.swing.JLabel tituloToyStory;
    private javax.swing.JRadioButton toyStory4;
    private javax.swing.JFrame ventanaAnnabelle;
    private javax.swing.JFrame ventanaAsientos;
    private javax.swing.JFrame ventanaCompra;
    private javax.swing.JFrame ventanaHombresNegro;
    private javax.swing.JFrame ventanaSpiderman;
    private javax.swing.JFrame ventanaToyStory;
    // End of variables declaration//GEN-END:variables
}

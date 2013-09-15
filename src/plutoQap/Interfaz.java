/*
 * Clase Interfaz
 * 
 * Versión 1.1
 * 
 * 8 de Marzo de 2013
 * 
 * Copyright Vicente Yáñez Cuadra
*/

package plutoQap;

import java.awt.Canvas;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 * Clase que maneja la interfaz del programa, crea los objetos necesario y usa
 * sus metodos.
 * 
 * @author vicente
 * @version 1.1
 */


public class Interfaz extends javax.swing.JFrame {
    
    public Interfaz() {
        super("Identificador de rocas plutonicas Pluto 1.1");
        initComponents();
    }
    
    /*
     * Variables y objetos globales a la clase
     */
    RocaQap roca = new RocaQap();         //Objeto para el calculo numerico
    float x, y;                  //Variables numericas de posición en el grafico
    int largo = 0;          //Variable numerica que cuenta el numero de muestras
    GraficoQap grafico = new GraficoQap();  //objeto que crea el grafico QAP
    DefaultListModel modeloLista = new DefaultListModel();
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventana = new javax.swing.JPanel();
        PanelMinerales = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SpinnerModel sm4 = new SpinnerNumberModel(0, 0, 100, 1);
        jSpinner4 = new javax.swing.JSpinner(sm4);
        jLabel9 = new javax.swing.JLabel();
        SpinnerModel sm6 = new SpinnerNumberModel(0, 0, 100, 1);
        jSpinner6 = new javax.swing.JSpinner(sm6);
        SpinnerModel sm3 = new SpinnerNumberModel(0, 0, 100, 1);
        jSpinner3 = new javax.swing.JSpinner(sm3);
        SpinnerModel sm11 = new SpinnerNumberModel(0, 0, 100, 1);
        jSpinner11 = new javax.swing.JSpinner(sm11);
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SpinnerModel sm10 = new SpinnerNumberModel(0, 0, 100, 1);
        jSpinner10 = new javax.swing.JSpinner(sm10);
        jLabel5 = new javax.swing.JLabel();
        SpinnerModel sm2 = new SpinnerNumberModel(0, 0, 100, 1);
        jSpinner2 = new javax.swing.JSpinner(sm2);
        SpinnerModel sm = new SpinnerNumberModel(0, 0, 100, 1);
        jSpinner1 = new javax.swing.JSpinner(sm);
        jLabel8 = new javax.swing.JLabel();
        SpinnerModel sm9 = new SpinnerNumberModel(0, 0, 100, 1);
        jSpinner9 = new javax.swing.JSpinner(sm9);
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SpinnerModel sm8 = new SpinnerNumberModel(0, 0, 100, 1);
        jSpinner8 = new javax.swing.JSpinner(sm8);
        SpinnerModel sm7 = new SpinnerNumberModel(0, 0, 100, 1);
        jSpinner7 = new javax.swing.JSpinner(sm7);
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        SpinnerModel sm5 = new SpinnerNumberModel(0, 0, 100, 1);
        jSpinner5 = new javax.swing.JSpinner(sm5);
        Calcular = new javax.swing.JButton();
        MuestraText = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        Reinicio = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        //ventanaGrafico corresponde al panel, y grafico al canvas que se emplaza dentro de el
        ventanaGrafico = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jBotonBorrarUltimo = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        colorBox = new javax.swing.JComboBox();
        activarNombre = new javax.swing.JCheckBox();
        activarCodigo = new javax.swing.JCheckBox();
        jGuardarImagen = new javax.swing.JButton();
        AcercaDe = new javax.swing.JButton();
        agregarMuestras = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLista = new javax.swing.JList();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cuarzo");

        jLabel7.setText("Ortopiroxeno");

        jLabel9.setText("Anfibol");

        jSpinner11.setMaximumSize(new java.awt.Dimension(37, 28));
        jSpinner11.setRequestFocusEnabled(false);

        jLabel6.setText("Olivino");

        jLabel11.setText("Otros");

        jLabel5.setText("Microclina");

        jLabel8.setText("Clinopiroxeno");

        jLabel3.setText("Plagioclasa");

        jLabel10.setText("Biotita");

        jLabel2.setText("Ortoclasa");

        jLabel12.setText("Muscovita");

        Calcular.setText("Calcular!");
        Calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalcularMouseClicked(evt);
            }
        });
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        MuestraText.setBackground(new java.awt.Color(254, 254, 254));
        MuestraText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuestraTextActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(254, 254, 254));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        Reinicio.setText("Borrar todo");
        Reinicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReinicioMouseClicked(evt);
            }
        });
        Reinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReinicioActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo muestra");

        GraficoQap grafico = new GraficoQap();
        //se le agrega el canvas al panel
        ventanaGrafico.add(grafico);

        javax.swing.GroupLayout ventanaGraficoLayout = new javax.swing.GroupLayout(ventanaGrafico);
        ventanaGrafico.setLayout(ventanaGraficoLayout);
        ventanaGraficoLayout.setHorizontalGroup(
            ventanaGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        ventanaGraficoLayout.setVerticalGroup(
            ventanaGraficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jBotonBorrarUltimo.setText("Borrar último");
        jBotonBorrarUltimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBotonBorrarUltimoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelMineralesLayout = new javax.swing.GroupLayout(PanelMinerales);
        PanelMinerales.setLayout(PanelMineralesLayout);
        PanelMineralesLayout.setHorizontalGroup(
            PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMineralesLayout.createSequentialGroup()
                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMineralesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelMineralesLayout.createSequentialGroup()
                                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(4, 4, 4)
                                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelMineralesLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelMineralesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3)
                            .addGroup(PanelMineralesLayout.createSequentialGroup()
                                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Reinicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MuestraText, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1)
                                    .addComponent(jBotonBorrarUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ventanaGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelMineralesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jSpinner1, jSpinner10, jSpinner2, jSpinner3, jSpinner4, jSpinner5, jSpinner6, jSpinner7, jSpinner8, jSpinner9});

        PanelMineralesLayout.setVerticalGroup(
            PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMineralesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMineralesLayout.createSequentialGroup()
                        .addComponent(ventanaGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelMineralesLayout.createSequentialGroup()
                        .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelMineralesLayout.createSequentialGroup()
                                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(11, 11, 11)
                                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(11, 11, 11)
                                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jSpinner9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jSpinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jSpinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jSpinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MuestraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelMineralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Reinicio, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(jBotonBorrarUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );

        PanelMineralesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jSpinner1, jSpinner10, jSpinner2, jSpinner3, jSpinner4, jSpinner5, jSpinner6, jSpinner7, jSpinner8, jSpinner9});

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel13.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel13.setText("Opciones");

        jLabel15.setText("Color");

        colorBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Azul", "Rojo", "Verde", "Magenta", "Negro",  }));
        colorBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBoxActionPerformed(evt);
            }
        });

        activarNombre.setSelected(true);
        activarNombre.setText("Mostrar nombres de campos");
        activarNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                activarNombreMouseClicked(evt);
            }
        });

        activarCodigo.setSelected(true);
        activarCodigo.setText("Mostrar codigo de muestras");
        activarCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                activarCodigoMouseClicked(evt);
            }
        });

        jGuardarImagen.setText("Guardar imagen");
        jGuardarImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jGuardarImagenMouseClicked(evt);
            }
        });

        AcercaDe.setText("Acerca de Pluto");
        AcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcercaDeMouseClicked(evt);
            }
        });
        AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercaDeActionPerformed(evt);
            }
        });

        agregarMuestras.setSelected(true);
        agregarMuestras.setText("Agregar muestras al gráfico");
        agregarMuestras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarMuestrasMouseClicked(evt);
            }
        });

        jLista.setModel(modeloLista);
        jLista.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jLista.setLayoutOrientation(JList.VERTICAL);
        jLista.setVisibleRowCount(-1);
        jLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListaMouseClicked(evt);
            }
        });
        jLista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jLista);

        jLabel16.setText("Muestras ingresadas:");

        javax.swing.GroupLayout ventanaLayout = new javax.swing.GroupLayout(ventana);
        ventana.setLayout(ventanaLayout);
        ventanaLayout.setHorizontalGroup(
            ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelMinerales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaLayout.createSequentialGroup()
                        .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventanaLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(colorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jGuardarImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(AcercaDe))
                            .addGroup(ventanaLayout.createSequentialGroup()
                                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(activarCodigo)
                                    .addComponent(activarNombre)
                                    .addComponent(agregarMuestras))
                                .addGap(0, 19, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(ventanaLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        ventanaLayout.setVerticalGroup(
            ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaLayout.createSequentialGroup()
                .addComponent(PanelMinerales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(27, 27, 27)
                        .addGroup(ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(colorBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(activarNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(activarCodigo)
                        .addGap(8, 8, 8)
                        .addComponent(agregarMuestras)
                        .addGap(18, 18, 18)
                        .addComponent(jGuardarImagen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AcercaDe))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        activarNombre.getAccessibleContext().setAccessibleName("NombresCampos");

        getContentPane().add(ventana, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarMuestrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMuestrasMouseClicked
        
        //activa/desactiva la opcion para trabajar con multiples muestras
        grafico.numeroMuestras(agregarMuestras.isSelected());
        grafico.reiniciar();
        ventanaGrafico.removeAll();
        ventanaGrafico.add(grafico);
        ventanaGrafico.setVisible(true);
        ventanaGrafico.repaint();
    }//GEN-LAST:event_agregarMuestrasMouseClicked

    private void AcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AcercaDeActionPerformed

    private void AcercaDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcercaDeMouseClicked
        
        /*
         * Evento que abre la ventana Sobre de la clase sobreqap, además se fija
         * su posición
         */
        Sobre sobreqap= new Sobre();
        
        sobreqap.setVisible(true);
        sobreqap.setLocation(400, 400);
    }//GEN-LAST:event_AcercaDeMouseClicked

    private void jGuardarImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jGuardarImagenMouseClicked
        
        //este metodo guarda la imagen en un archivo usando JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        int returnVal = fileChooser.showSaveDialog(null);
        
        fileChooser.setCurrentDirectory(new java.io.File("."));
        fileChooser.setDialogTitle("Guardar en...");
        
        /*
         * se abre la ventana para guardar el archivo, 
        * si se selecciona guardar(APROVE_OPTION) se obtiene la dirección y 
        * se guarda con esta, usando ImageIO.write
        */        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            
            File file = new File(fileChooser.getSelectedFile().getPath()
                    +".png");
            try {
                /*
                 * para transformar el objeto grafico a una bufferedImage, 
                 * se usa el evento definido en esta clase: 
                 * llamado canvasToImage
                 */
                ImageIO.write(canvasToImage(grafico), "png", file);
            } catch (IOException ex) {
                Logger.getLogger
                        (Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jGuardarImagenMouseClicked

    private void activarCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activarCodigoMouseClicked
        /*
         * activa/desactiva la visibilidad de los codigos de la muestra 
         * ingresada en el grafico. 
         * Para esto usa el metodo nombMuestra() de la clase GraficoQap y luego
         * vuelve a dibujar.
         */
        
        grafico.nombMuestras(activarCodigo.isSelected());
        ventanaGrafico.removeAll();
        ventanaGrafico.add(grafico);
        ventanaGrafico.setVisible(true);
        ventanaGrafico.repaint();
    }//GEN-LAST:event_activarCodigoMouseClicked

    private void activarNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activarNombreMouseClicked
        /*
         * check que al estar activo(true) muestra los nombres de los campos 
         * invocando al metodo nCampos que recibe un mensaje true/false
         */
        grafico.nCampos(activarNombre.isSelected());
        ventanaGrafico.removeAll();
        ventanaGrafico.add(grafico);
        ventanaGrafico.setVisible(true);
        ventanaGrafico.repaint();
    }//GEN-LAST:event_activarNombreMouseClicked

    private void colorBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorBoxActionPerformed

    private void jBotonBorrarUltimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBotonBorrarUltimoMouseClicked
        
        /*
         * boton para borrar el ultimo valor ingresado
         * limpia los campos de ingreso, los spinner, limpia la lista, disminuye
         * la variable largo en 1, y usa el metodo borrarUltimo de la clase
         * GraficoQap para removerlo del dibujo
         */
        jTextField1.setText("");
        MuestraText.setText("");
        jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        jSpinner3.setValue(0);
        jSpinner4.setValue(0);
        jSpinner5.setValue(0);
        jSpinner6.setValue(0);
        jSpinner7.setValue(0);
        jSpinner8.setValue(0);
        jSpinner9.setValue(0);
        jSpinner10.setValue(0);
        jSpinner11.setValue(0); 
        largo = largo -1;
        modeloLista.removeElementAt(largo);
        grafico.borrarUltimo();
        ventanaGrafico.removeAll();
        ventanaGrafico.add(grafico);
        ventanaGrafico.setVisible(true);
        ventanaGrafico.repaint();
    }//GEN-LAST:event_jBotonBorrarUltimoMouseClicked

    private void ReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReinicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReinicioActionPerformed

    private void ReinicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReinicioMouseClicked
        
       /*
        * reinicia el grafico al hacer click en el boton ReinicioMause: limpia
        * la lista, limpia los valores en los campos y usa el metodo reiniciar
        * de la clase GraficoQap para limpiar el dibujo
        */
        jTextField1.setText("");
        MuestraText.setText("");
        jSpinner1.setValue(0);
        jSpinner2.setValue(0);
        jSpinner3.setValue(0);
        jSpinner4.setValue(0);
        jSpinner5.setValue(0);
        jSpinner6.setValue(0);
        jSpinner7.setValue(0);
        jSpinner8.setValue(0);
        jSpinner9.setValue(0);
        jSpinner10.setValue(0);
        jSpinner11.setValue(0);  
        largo = 0;
        modeloLista.clear();
        grafico.reiniciar();
        ventanaGrafico.removeAll();
        ventanaGrafico.add(grafico);
        ventanaGrafico.setVisible(true);
        ventanaGrafico.repaint();
    }//GEN-LAST:event_ReinicioMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void MuestraTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuestraTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MuestraTextActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed

    }//GEN-LAST:event_CalcularActionPerformed

    private void CalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalcularMouseClicked

        /**
         * Metodo que toma los valores ingresados, para posterioremente en 
         * conjunto con objetos de las demás clases, graficar y nombrar a la 
         * roca
         */
        float cuarzo = Float.parseFloat(jSpinner1.getValue().toString());
        float ortoclasa = Float.parseFloat(jSpinner2.getValue().toString());
        float plagioclasa = Float.parseFloat(jSpinner3.getValue().toString());
        float microclina = Float.parseFloat(jSpinner4.getValue().toString());
        float olivino = Float.parseFloat(jSpinner5.getValue().toString());
        float ortopiroxeno = Float.parseFloat(jSpinner6.getValue().toString());
        float clinopiroxeno = Float.parseFloat(jSpinner7.getValue().toString());
        float anfibol = Float.parseFloat(jSpinner8.getValue().toString());
        float biotita = Float.parseFloat(jSpinner9.getValue().toString());
        float muscovita = Float.parseFloat(jSpinner10.getValue().toString());
        float otros = Float.parseFloat(jSpinner11.getValue().toString());

        /*
         * se suman los valores, y si suman 100 se continua con el codigo, 
        de otra forma lanza un mensaje de error estipulado en else
        */
        float suma = cuarzo + ortoclasa + plagioclasa + microclina 
                + olivino + ortopiroxeno + clinopiroxeno + anfibol 
                + biotita + muscovita + otros;
        if (suma == 100) {
            /*
             * se obtienen los valores normalizados de qz, feld potasico y 
             * plagioclasa para luego ingresarlos al objeto roca
             */
            float QZ = roca.normalizador(cuarzo, ortoclasa, plagioclasa, 
                    microclina, olivino, clinopiroxeno, ortopiroxeno, anfibol, 
                    biotita, muscovita, otros, 2);
            float FK = roca.normalizador(cuarzo, ortoclasa, plagioclasa, 
                    microclina, olivino, clinopiroxeno, ortopiroxeno, anfibol, 
                    biotita, muscovita, otros, 3);
            float PL = roca.normalizador(cuarzo, ortoclasa, plagioclasa, 
                    microclina, olivino, clinopiroxeno, ortopiroxeno, anfibol, 
                    biotita, muscovita, otros, 1);
            String nombre;
            //se obtiene el nombre de la roca y se escribe en el campo de texto
            nombre = roca.triangulo(QZ, FK, PL);
            jTextField1.setText(nombre);
            //contador del nº de muestras ingresadas a la clase GraficoQap
            largo = largo +1;

            //creación de grafico
            x = roca.puntox(PL, FK, QZ);
            y = roca.puntoy(PL, FK, QZ);
            String color = (String)colorBox.getSelectedItem();
            grafico.nMuestra(MuestraText.getText(), largo);

            /*
             * agregar punto modal
             * ventana grafico es el JPanel que incluye al grafico de GraficoQap
             */
            ventanaGrafico.removeAll();
            ventanaGrafico.add(grafico);
            grafico.obtener(x, y, largo, color);
            ventanaGrafico.setVisible(true);
            ventanaGrafico.repaint();

            //agregar codigo de muestra a la lista
            if ("".equals(MuestraText.getText())){
                modeloLista.addElement("Sin codigo      ("+nombre+")");
            }
            else {
               modeloLista.addElement(MuestraText.getText()
                       +"       ("+nombre+")"); 
            }
        }
        else {
            //en caso de que los valores ingresados no sumen 100
            int SUMA = (int)suma;
            jTextField1.setText("Error. La suma es: " + SUMA);
        }
    }//GEN-LAST:event_CalcularMouseClicked

    private void jListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListaMouseClicked

    }//GEN-LAST:event_jListaMouseClicked

    private void jListaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListaValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jListaValueChanged

      /**
     *
     * @param args
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
        public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcercaDe;
    private javax.swing.JButton Calcular;
    private javax.swing.JTextField MuestraText;
    private javax.swing.JPanel PanelMinerales;
    private javax.swing.JButton Reinicio;
    private javax.swing.JCheckBox activarCodigo;
    private javax.swing.JCheckBox activarNombre;
    private javax.swing.JCheckBox agregarMuestras;
    private javax.swing.JComboBox colorBox;
    private javax.swing.JButton jBotonBorrarUltimo;
    private javax.swing.JButton jGuardarImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel ventana;
    private javax.swing.JPanel ventanaGrafico;
    // End of variables declaration//GEN-END:variables

    private BufferedImage canvasToImage(Canvas cnvs) {
        /*
         *metodo que convierte una el objeto canvas dado a una bufferedImage
        se crea el objeto image con el largo y el ancho del canvas
        */
        BufferedImage image = new BufferedImage(cnvs.getWidth(), 
                cnvs.getHeight(), BufferedImage.TYPE_INT_BGR);
        //se pinta el objeto canvas
        cnvs.paint(image.createGraphics());
        //devuelve una bufferedImage
        return image;   
    }
}

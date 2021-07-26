/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * 
 * @author Eduva
 */
public class DisenioAhorca2 extends javax.swing.JFrame {

    
    public ImageIcon imag[];
    public JButton letras[];
    public String palabra[];
    public int rndom;
    public int fallo;
    public String res[];
    public int win = 0;
    public int lose = 0;
    public int cantg = 0;
    public int opc;
    public int repe = 0;
    
    
    public DisenioAhorca2(int opcion) {
        opc = opcion;
        initComponents();
        this.setLocationRelativeTo(null);
        /** Delimitamos parámetros de la cantidad de imagenes, botónes, y palabras que usaremos */
        imag = new ImageIcon[7];
        letras = new JButton[27];
        palabra = new String[25];
        
        /** Imagenes del ahorcado */
        imag[0] = new ImageIcon(getClass().getResource("/Imagenes/ahor1.jpg"));
        imag[1] = new ImageIcon(getClass().getResource("/Imagenes/ahor2.jpg"));
        imag[2] = new ImageIcon(getClass().getResource("/Imagenes/ahor3.jpg"));
        imag[3] = new ImageIcon(getClass().getResource("/Imagenes/ahor4.jpg"));
        imag[4] = new ImageIcon(getClass().getResource("/Imagenes/ahor5.jpg"));
        imag[5] = new ImageIcon(getClass().getResource("/Imagenes/ahor6.jpg"));
        imag[6] = new ImageIcon(getClass().getResource("/Imagenes/ahor7.jpg"));
        
        /** Botones de las letras */
        letras[1] = jBA;
        letras[2] = jBB;
        letras[3] = jBC;
        letras[4] = jBD;
        letras[5] = jBE;
        letras[6] = jBF;
        letras[7] = jBG;
        letras[8] = jBH;
        letras[9] = jBI;
        letras[10] = jBJ;
        letras[11] = jBK;
        letras[12] = jBL;
        letras[13] = jBM;
        letras[14] = jBN;
        letras[15] = jBO;
        letras[16] = jBP;
        letras[17] = jBQ;
        letras[18] = jBR;
        letras[19] = jBS;
        letras[20] = jBT;
        letras[21] = jBU;
        letras[22] = jBV;
        letras[23] = jBW;
        letras[24] = jBX;
        letras[25] = jBY;
        letras[26] = jBZ;
        
        /** Palabras por adivinar y cambios al formulario según la opción escogida en el menú */
        switch (opc) {
            case 1:
                palabra[0] = "Perro".toUpperCase();//Animales
                palabra[1] = "Gato".toUpperCase();
                palabra[2] = "Elefante".toUpperCase();
                palabra[3] = "Jirafa".toUpperCase();
                palabra[4] = "Tigre".toUpperCase();
                palabra[5] = "Argentina".toUpperCase();//Países
                palabra[6] = "China".toUpperCase();
                palabra[7] = "Japon".toUpperCase();
                palabra[8] = "ElSalvador".toUpperCase();
                palabra[9] = "Colombia".toUpperCase();
                palabra[10] = "JustinBieber".toUpperCase();//Cantantes
                palabra[11] = "ArianaGrande".toUpperCase();
                palabra[12] = "BadBunny".toUpperCase();
                palabra[13] = "JBalvin".toUpperCase();
                palabra[14] = "LuisMiguel".toUpperCase();
                palabra[15] = "Carne".toUpperCase();//Comida
                palabra[16] = "Hamburguesa".toUpperCase();
                palabra[17] = "Pollo".toUpperCase();
                palabra[18] = "Pupusas".toUpperCase();
                palabra[19] = "Tacos".toUpperCase();
                palabra[20] = "Java".toUpperCase();//Programación
                palabra[21] = "CSharp".toUpperCase();
                palabra[22] = "Javascript".toUpperCase();
                palabra[23] = "SQL".toUpperCase();
                palabra[24] = "PHP".toUpperCase();

                jPanel1.setBackground(new Color(90,246,62));
                break;
            case 2:
                palabra[0] = "Cebra".toUpperCase();//Animales
                palabra[1] = "Puma".toUpperCase();
                palabra[2] = "Avestruz".toUpperCase();
                palabra[3] = "Koala".toUpperCase();
                palabra[4] = "Cocodrilo".toUpperCase();
                palabra[5] = "Venezuela".toUpperCase();//Países
                palabra[6] = "Guatemala".toUpperCase();
                palabra[7] = "Suiza".toUpperCase();
                palabra[8] = "Rusia".toUpperCase();
                palabra[9] = "Vietnam".toUpperCase();
                palabra[10] = "theWeeknd".toUpperCase();//Cantantes
                palabra[11] = "PauloLondra".toUpperCase();
                palabra[12] = "DaddyYankee".toUpperCase();
                palabra[13] = "DuaLipa".toUpperCase();
                palabra[14] = "Drake".toUpperCase();
                palabra[15] = "Burritos".toUpperCase();//Comida
                palabra[16] = "Tortas".toUpperCase();
                palabra[17] = "Ceviche".toUpperCase();
                palabra[18] = "Sushi".toUpperCase();
                palabra[19] = "Lasagna".toUpperCase();
                palabra[20] = "VisualBasic".toUpperCase();//Programación
                palabra[21] = "Pascal".toUpperCase();
                palabra[22] = "Python".toUpperCase();
                palabra[23] = "Ruby".toUpperCase();
                palabra[24] = "LenguajeC".toUpperCase();

                jPanel1.setBackground(new Color(255,249,149));
                break;
            case 3:
                palabra[0] = "Cachalote".toUpperCase();//Animales
                palabra[1] = "Orca".toUpperCase();
                palabra[2] = "Manati".toUpperCase();
                palabra[3] = "Orangutan".toUpperCase();
                palabra[4] = "Bagre".toUpperCase();
                palabra[5] = "Croacia".toUpperCase();//Países
                palabra[6] = "Polonia".toUpperCase();
                palabra[7] = "Filipinas".toUpperCase();
                palabra[8] = "Guinea".toUpperCase();
                palabra[9] = "Nigeria".toUpperCase();
                palabra[10] = "DojaCat".toUpperCase();//Cantantes
                palabra[11] = "GunandRoses".toUpperCase();
                palabra[12] = "Maneskin".toUpperCase();
                palabra[13] = "Khalid".toUpperCase();
                palabra[14] = "KiddKeo".toUpperCase();
                palabra[15] = "Hongos".toUpperCase();//Comida
                palabra[16] = "TerneraWagyu".toUpperCase();
                palabra[17] = "Omelette".toUpperCase();
                palabra[18] = "Caviar".toUpperCase();
                palabra[19] = "Coctel".toUpperCase();
                palabra[20] = "Assembly".toUpperCase();//Programación
                palabra[21] = "LenguajeR".toUpperCase();
                palabra[22] = "Groovy".toUpperCase();
                palabra[23] = "MATLAB".toUpperCase();
                palabra[24] = "Go".toUpperCase();

                jPanel1.setBackground(new Color(243,121,111));
                break;
            case 4:
                palabra[0] = "Tortuga".toUpperCase();//Animales
                palabra[1] = "Perro".toUpperCase();
                palabra[2] = "Leon".toUpperCase();
                palabra[3] = "Elefante".toUpperCase();
                palabra[4] = "Cebra".toUpperCase();
                palabra[5] = "Alemania".toUpperCase();//Países
                palabra[6] = "Guatemala".toUpperCase();
                palabra[7] = "Honduras".toUpperCase();
                palabra[8] = "Chile".toUpperCase();
                palabra[9] = "Argetina".toUpperCase();
                palabra[10] = "DojaCat".toUpperCase();//Cantantes
                palabra[11] = "Queen".toUpperCase();
                palabra[12] = "KatyPerry".toUpperCase();
                palabra[13] = "DuaLipa".toUpperCase();
                palabra[14] = "KiddKeo".toUpperCase();
                palabra[15] = "Sushi".toUpperCase();//Comida
                palabra[16] = "Hongos".toUpperCase();
                palabra[17] = "Lasagna".toUpperCase();
                palabra[18] = "Pollo".toUpperCase();
                palabra[19] = "Coctel".toUpperCase();
                palabra[20] = "VisualBasic".toUpperCase();//Programación
                palabra[21] = "Pascal".toUpperCase();
                palabra[22] = "CSharp".toUpperCase();
                palabra[23] = "Java".toUpperCase();
                palabra[24] = "Go".toUpperCase();

                jPanel1.setBackground(new Color(131,195,245));
                break;
        }
        //Se asigna un evento a cada letra para comprobar que exista en la palabra al ser presionada.
        for (int i = 1; i < 27; i++) {
            letras[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    checarLetra(e);
                }
            });
        }
        iniciar();
    }
    
    public void iniciar() {
        //Empezamos con los errores en 0
        fallo = 0;
        //Colocamos la primer imagen del ahorcado
        jBImagenA.setIcon(imag[0]);
        //Limpiamos el TextPanel
        jTextPane1.setText("");
        //Habilitamos todas las letras del tablero
        for (int i = 1; i < 27; i++) {
            letras[i].setEnabled(true);
        }
        //Generamos un número aleatorio que hará referencia a una de las palabras (Randomizamos que palabra será seleccionada)
        rndom = (int) 0 + (int) (Math.random() * ((palabra.length - 1) + 1));
        //Se asignan las categorias
        if (rndom < 5) {
            jLCategoria.setText("Animales");
        } else if (rndom < 10 && rndom > 4) {
            jLCategoria.setText("Países");
        } else if (rndom < 15 && rndom > 9) {
            jLCategoria.setText("Cantantes");
        } else if (rndom < 20 && rndom > 14) {
           jLCategoria.setText("Comida"); 
        } else if (rndom < 25 && rndom > 19) {
            jLCategoria.setText("Lenguaje de Programación");
        }
        //Separa la palabra por espacios
        String pal[] = palabra[rndom].split(" ");
        res = new String[palabra[rndom].length() + 1];
        int j = 0;
        //Cambiamos las letras separadas por guiones 
        for (String pal1 : pal) {
            for (int i = 0; i < pal1.length(); i++) {
                jTextPane1.setText(jTextPane1.getText() + "_ ");
                res[j++] = "_";
            }
            jTextPane1.setText(jTextPane1.getText() + "\n");
            res[j++] = " ";
        }
    }
    
    //Al presionar un botón de letra, buscará si está en la palabra, de lo contrario marcará como error
    public void checarLetra(ActionEvent e) {
        JButton bt = (JButton) e.getSource();
        char c[];
        //Busca la letra en la palabra después de ser presionada
        for (int i = 1; i < 27; i++) {
            if (bt == letras[i]) {
                //La tecla es inicializada
                c = Character.toChars(64 + i);
                //Busca si la letra esta en la palabra
                boolean esta = false;
                for (int j = 0; j < palabra[rndom].length(); j++) {
                    if (c[0] == palabra[rndom].charAt(j)) {
                        res[j] = c[0] + "";
                        esta = true;
                    }
                }
                //Si la letra está en la palabra se muestra en el TextPanel 
                if (esta) {
                    jTextPane1.setText("");
                    for (String re : res) {
                        if (" ".equals(re)) {
                            jTextPane1.setText(jTextPane1.getText() + "\n");
                        } else {
                            jTextPane1.setText(jTextPane1.getText() + re + " ");
                        }
                    }
                    //Busca si quedan letras faltantes por encontrar, si ya no quedan más letras significa que ha ganado
                    boolean gano = true;
                    for (String re : res) {
                        //Busca si quedan guiones en el TextPanel
                        if (re.equals("_")) {
                            gano = false;
                            break;
                        }
                    }
                    //Al no quedar letras por adivinar y haber ganado, se muestra un mensaje y avanza a la siguiente ronda
                    if (gano) {
                        //Declaramos una variable que llevará el contador de cuantas veces se ha adivinado la palabra
                        win++;
                        JOptionPane.showMessageDialog(this, "¡Bien, acertaste!, te faltan " + (3 - win) + " para ganar");
                        iniciar();
                        jTWin.setText(String.valueOf(win));
                        //Si ya ha ganado 3 veces, se le envía al formulario ganar
                        if (win == 3) {
                            Ganar pl = new Ganar();
                            this.setVisible(false);
                            pl.setVisible(true);
                        }
                        return;
                    }
                    
                    //Si la letra no está en la palabra se incrementa +1 el error y cambia la imagen
                    } else {
                        jBImagenA.setIcon(imag[++fallo]);
                        //Si llega a 6 fallos entonces pierde el juego y se suma +1 al contador de fallos totales
                        if (fallo == 6) {
                            lose++;
                            JOptionPane.showMessageDialog(this, "Fallaste, la palabra era: \n" + palabra[rndom] + "\n" + "Tienes " + (3 - lose) + " más");
                            iniciar();
                            jTFallos.setText(String.valueOf(lose));
                            //Si ya ha perdido 3 veces, se le envía al formulario perder
                            if (lose == 3) {
                            Perder pl = new Perder();
                            this.setVisible(false);
                            pl.setVisible(true);
                        }
                            return;
                        }
                    }
                
                //Esta es la linea que desactiva los botones despues de ser usados.
                bt.setEnabled(false);
                break;
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

        jPanel1 = new javax.swing.JPanel();
        jBN = new javax.swing.JButton();
        jBM = new javax.swing.JButton();
        jBO = new javax.swing.JButton();
        jBQ = new javax.swing.JButton();
        jBP = new javax.swing.JButton();
        jBR = new javax.swing.JButton();
        jBH = new javax.swing.JButton();
        jBG = new javax.swing.JButton();
        jBI = new javax.swing.JButton();
        jBT = new javax.swing.JButton();
        jBK = new javax.swing.JButton();
        jBS = new javax.swing.JButton();
        jBJ = new javax.swing.JButton();
        jBU = new javax.swing.JButton();
        jBL = new javax.swing.JButton();
        jBW = new javax.swing.JButton();
        jBV = new javax.swing.JButton();
        jBB = new javax.swing.JButton();
        jBA = new javax.swing.JButton();
        jBC = new javax.swing.JButton();
        jBE = new javax.swing.JButton();
        jBD = new javax.swing.JButton();
        jBF = new javax.swing.JButton();
        jBX = new javax.swing.JButton();
        jBY = new javax.swing.JButton();
        jBZ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBImagenA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jBAgain = new javax.swing.JButton();
        jBRegresa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBÑ = new javax.swing.JButton();
        jTFallos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTWin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLCategoria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jBN.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBN.setText("N");
        jBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNActionPerformed(evt);
            }
        });

        jBM.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBM.setText("M");
        jBM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMActionPerformed(evt);
            }
        });

        jBO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBO.setText("O");
        jBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOActionPerformed(evt);
            }
        });

        jBQ.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBQ.setText("Q");
        jBQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBQActionPerformed(evt);
            }
        });

        jBP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBP.setText("P");
        jBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPActionPerformed(evt);
            }
        });

        jBR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBR.setText("R");
        jBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRActionPerformed(evt);
            }
        });

        jBH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBH.setText("H");
        jBH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHActionPerformed(evt);
            }
        });

        jBG.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBG.setText("G");
        jBG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGActionPerformed(evt);
            }
        });

        jBI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBI.setText("I");
        jBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIActionPerformed(evt);
            }
        });

        jBT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBT.setText("T");
        jBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTActionPerformed(evt);
            }
        });

        jBK.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBK.setText("K");
        jBK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBKActionPerformed(evt);
            }
        });

        jBS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBS.setText("S");
        jBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSActionPerformed(evt);
            }
        });

        jBJ.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBJ.setText("J");
        jBJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJActionPerformed(evt);
            }
        });

        jBU.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBU.setText("U");
        jBU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUActionPerformed(evt);
            }
        });

        jBL.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBL.setText("L");
        jBL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLActionPerformed(evt);
            }
        });

        jBW.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBW.setText("W");
        jBW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBWActionPerformed(evt);
            }
        });

        jBV.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBV.setText("V");
        jBV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVActionPerformed(evt);
            }
        });

        jBB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBB.setText("B");
        jBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBActionPerformed(evt);
            }
        });

        jBA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBA.setText("A");
        jBA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAActionPerformed(evt);
            }
        });

        jBC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBC.setText("C");
        jBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCActionPerformed(evt);
            }
        });

        jBE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBE.setText("E");
        jBE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEActionPerformed(evt);
            }
        });

        jBD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBD.setText("D");
        jBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDActionPerformed(evt);
            }
        });

        jBF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBF.setText("F");
        jBF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFActionPerformed(evt);
            }
        });

        jBX.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBX.setText("X");
        jBX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBXActionPerformed(evt);
            }
        });

        jBY.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBY.setText("Y");
        jBY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBYActionPerformed(evt);
            }
        });

        jBZ.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBZ.setText("Z");
        jBZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBZActionPerformed(evt);
            }
        });

        jBImagenA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ahor1.jpg"))); // NOI18N
        jBImagenA.setToolTipText("");

        jTextPane1.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jTextPane1.setEnabled(false);
        jScrollPane1.setViewportView(jTextPane1);

        jBAgain.setFont(new java.awt.Font("Sitka Text", 1, 11)); // NOI18N
        jBAgain.setText("Cambio de palabra");
        jBAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgainActionPerformed(evt);
            }
        });

        jBRegresa.setText("Regresar al menú");
        jBRegresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegresaActionPerformed(evt);
            }
        });

        jLabel2.setText("Fallos:");

        jBÑ.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBÑ.setText("Ñ");
        jBÑ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBÑActionPerformed(evt);
            }
        });

        jTFallos.setEnabled(false);

        jLabel4.setText("Ganadas:");

        jTWin.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Categoría:");

        jLCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLCategoria.setText(".");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBU, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBV, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBW, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBX, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBY, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBZ, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jBÑ, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBO, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBP, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBQ, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBR, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jBS, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jBH, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBI, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBJ, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBK, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBL, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBM, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jBA, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBB, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBC, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBD, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBE, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBF, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBG, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBN, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBT, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBAgain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBImagenA, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBRegresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTWin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFallos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTWin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLCategoria))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTFallos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBB, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBA, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBC, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBE, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBD, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBF, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBG, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBH, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBI, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBK, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBJ, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBL, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBM, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBN, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBO, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBQ, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBP, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBR, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBS, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBÑ, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBW, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBV, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBX, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBY, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBZ, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBU, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBImagenA, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBRegresa)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBNActionPerformed

    private void jBMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBMActionPerformed

    private void jBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBOActionPerformed

    private void jBQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBQActionPerformed

    private void jBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBPActionPerformed

    private void jBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBRActionPerformed

    private void jBHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBHActionPerformed

    private void jBGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBGActionPerformed

    private void jBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBIActionPerformed

    private void jBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBTActionPerformed

    private void jBKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBKActionPerformed

    private void jBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSActionPerformed

    private void jBJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBJActionPerformed

    private void jBUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBUActionPerformed

    private void jBLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBLActionPerformed

    private void jBWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBWActionPerformed

    private void jBVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBVActionPerformed

    private void jBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBActionPerformed

    private void jBAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBAActionPerformed

    private void jBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCActionPerformed

    private void jBEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEActionPerformed

    private void jBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBDActionPerformed

    private void jBFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBFActionPerformed

    private void jBXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBXActionPerformed

    private void jBYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBYActionPerformed

    private void jBZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBZActionPerformed

    private void jBRegresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresaActionPerformed
        MenuAhorca2 p1 = new MenuAhorca2();
        this.setVisible(false);
        p1.setVisible(true);
    }//GEN-LAST:event_jBRegresaActionPerformed

    private void jBAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgainActionPerformed
        repe++;
        if (opc == 1) {
            if (repe == 3) {
            jBAgain.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Ya agotaste las oportunidades de cambiar palabra, \n"
                                                + "ahora todo queda en tus manos, suerte");
            }
            iniciar();
        }else if (opc == 2) {
            if (repe == 2) {
            jBAgain.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Ya agotaste las oportunidades de cambiar palabra, \n"
                                                + "ahora todo queda en tus manos, suerte");
            }
            iniciar();
        }else if (opc == 3) {
            if (repe == 1) {
            jBAgain.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Ya agotaste las oportunidades de cambiar palabra, \n"
                                                + "ahora todo queda en tus manos, suerte");
            }
            iniciar();
        }else if (opc == 4) {
            if (repe == 3) {
            jBAgain.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Ya agotaste las oportunidades de cambiar palabra, \n"
                                                + "ahora todo queda en tus manos, suerte");
            }
            iniciar();
        }
        
    }//GEN-LAST:event_jBAgainActionPerformed

    private void jBÑActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBÑActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBÑActionPerformed

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
            java.util.logging.Logger.getLogger(DisenioAhorca2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisenioAhorca2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisenioAhorca2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisenioAhorca2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new DisenioAhorca2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBA;
    private javax.swing.JButton jBAgain;
    private javax.swing.JButton jBB;
    private javax.swing.JButton jBC;
    private javax.swing.JButton jBD;
    private javax.swing.JButton jBE;
    private javax.swing.JButton jBF;
    private javax.swing.JButton jBG;
    private javax.swing.JButton jBH;
    private javax.swing.JButton jBI;
    private javax.swing.JButton jBImagenA;
    private javax.swing.JButton jBJ;
    private javax.swing.JButton jBK;
    private javax.swing.JButton jBL;
    private javax.swing.JButton jBM;
    private javax.swing.JButton jBN;
    private javax.swing.JButton jBO;
    private javax.swing.JButton jBP;
    private javax.swing.JButton jBQ;
    private javax.swing.JButton jBR;
    private javax.swing.JButton jBRegresa;
    private javax.swing.JButton jBS;
    private javax.swing.JButton jBT;
    private javax.swing.JButton jBU;
    private javax.swing.JButton jBV;
    private javax.swing.JButton jBW;
    private javax.swing.JButton jBX;
    private javax.swing.JButton jBY;
    private javax.swing.JButton jBZ;
    private javax.swing.JButton jBÑ;
    private javax.swing.JLabel jLCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFallos;
    private javax.swing.JTextField jTWin;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}

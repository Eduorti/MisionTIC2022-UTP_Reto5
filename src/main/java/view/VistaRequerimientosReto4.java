package view;

import controller.ControladorRequerimientosReto4;

import model.vo.ProyectosPorEstrato;
import model.vo.ProyectosPorTipo;
import model.vo.ProyectosQuibdoApartaestudio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import java.sql.SQLException;
import java.util.ArrayList;

public class VistaRequerimientosReto4 extends JFrame{
    
    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();
    private JPanel contentPane;
    private static JTextArea areaDeTexto;

    public VistaRequerimientosReto4(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 200, 800, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel etiqueta = new JLabel("Misión TIC 2022 Ciclo 2 Reto 5 *** Eduardo Ortiz R ***");
        etiqueta.setBounds(236, 15, 600, 30);
        contentPane.add(etiqueta);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(28, 50, 737, 455);
        contentPane.add(scrollPane);
        areaDeTexto = new JTextArea();
        scrollPane.setViewportView(areaDeTexto);
        
        
        JButton btnConsulta1 = new JButton("Consulta 1");
        btnConsulta1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                requerimiento1();
            }
        });

        btnConsulta1.setBounds(28, 520, 117, 29);
        contentPane.add(btnConsulta1);
        
        JButton btnConsulta2 = new JButton("Consulta 2");
        btnConsulta2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                requerimiento2();
            }
        });

        btnConsulta2.setBounds(157, 520, 117, 29);
        contentPane.add(btnConsulta2);

        JButton btnConsulta3 = new JButton("Consulta 3");
        btnConsulta3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                requerimiento3();
            }
        });

        btnConsulta3.setBounds(286, 520, 117, 29);
        contentPane.add(btnConsulta3);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                areaDeTexto.setText("");
            }
        });

        btnLimpiar.setBounds(648, 520, 117, 29);
        contentPane.add(btnLimpiar);

    }

    public static void requerimiento1(){
    
        try{
            
	        ArrayList<ProyectosPorEstrato> rankingProyectosPorEstratos = controlador.consultarProyectosPorEstrato();
		    String salida = "*** Proyectos por Estrato ***\n\nId_Tipo\tCodigo_Tipo\tAreaMaxima\tEstrato\n";
	        for (ProyectosPorEstrato proyectosPorEstrato : rankingProyectosPorEstratos) {

                salida += proyectosPorEstrato.getIdTipo();
                salida += "\t";
                salida += proyectosPorEstrato.getCodigoTipo();
                salida += "\t";
                salida += proyectosPorEstrato.getAreaMaxima();
                salida += "\t";
                salida += proyectosPorEstrato.getEstrato();
                salida += "\n";

	        }
		    areaDeTexto.setText(salida);

	    }catch(SQLException e){
	        System.err.println("Ha ocurrido un error!"+e.getMessage());
	    }
    }	

    public static void requerimiento2(){    
        
        try{
            
            ArrayList<ProyectosPorTipo> rankingProyectosPorTipo = controlador.consultarProyectosPorTipo();
	        String salida = "*** Proyectos por Tipo ***\n\nId_Proyecto\tConstructora\t\tCiudad\tEstrato\n";
            for (ProyectosPorTipo proyectosPorTipo : rankingProyectosPorTipo){

                salida += proyectosPorTipo.getIdProyecto();
                salida += "\t";
                salida += proyectosPorTipo.getConstructora();
                if(proyectosPorTipo.getConstructora().length() <=15){
                    salida += "\t\t";
                }else{
                    salida += "\t";
                }
                salida += proyectosPorTipo.getCiudad();
                salida += "\t";
                salida += proyectosPorTipo.getEstrato();
                salida += "\n";

            }
	        areaDeTexto.setText(salida);

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento3(){

        try{
   
            ArrayList<ProyectosQuibdoApartaestudio> rankingProyectosQuibdoApartaestudios = controlador.consultarProyectosQuibdoApartaestudio();
	        String salida = "*** Proyectos de Tipo Apartaestudio en Quibdo ***\n\nId_Proyecto\tConstructora\t\tPorcentajeCuotaInicial\tAcabados\n";
            for (ProyectosQuibdoApartaestudio proyectosQuibdoApartaestudio : rankingProyectosQuibdoApartaestudios){
            
                salida += proyectosQuibdoApartaestudio.getIdProyecto();
                salida += "\t";
                salida += proyectosQuibdoApartaestudio.getConstructora();
                salida += "\t\t";
                salida += proyectosQuibdoApartaestudio.getPorcentajeCuotaInicial();
                salida += "\t";
                salida += proyectosQuibdoApartaestudio.getAcabados();
                salida += "\n";

            }
            areaDeTexto.setText(salida);
                
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }
}

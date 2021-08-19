package controller;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

//Modelos (acceso y objetos contenedores)
import model.dao.ProyectosPorEstratoDao;
import model.dao.ProyectosPorTipoDao;
import model.dao.ProyectosQuibdoApartaestudioDao;
import model.vo.ProyectosPorEstrato;
import model.vo.ProyectosPorTipo;
import model.vo.ProyectosQuibdoApartaestudio;


//Librerías para bases de datos
import java.sql.SQLException;

public class ControladorRequerimientosReto4 {

    private final ProyectosPorEstratoDao proyectosPorEstratoDao;
    private final ProyectosPorTipoDao proyectosPorTipoDao;
    private final ProyectosQuibdoApartaestudioDao proyectosQuibdoApartaestudioDao;

    public ControladorRequerimientosReto4(){
	    this.proyectosQuibdoApartaestudioDao = new ProyectosQuibdoApartaestudioDao();
	    this.proyectosPorTipoDao = new ProyectosPorTipoDao();
	    this.proyectosPorEstratoDao = new ProyectosPorEstratoDao();
    }

    public ArrayList<ProyectosQuibdoApartaestudio> consultarProyectosQuibdoApartaestudio() throws SQLException {
	    return this.proyectosQuibdoApartaestudioDao.rankingProyectosQuibdoApartaestudios();
    }
    public ArrayList<ProyectosPorTipo> consultarProyectosPorTipo() throws SQLException {
	    return this.proyectosPorTipoDao.rankingProyectosPorTipo();
    }
    public ArrayList<ProyectosPorEstrato> consultarProyectosPorEstrato() throws SQLException {
	    return this.proyectosPorEstratoDao.rankingProyectosPorEstrato();
    }
}
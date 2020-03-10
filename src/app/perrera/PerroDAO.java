package app.perrera;

import java.util.ArrayList;

public interface PerroDAO {

	ArrayList<Perro> getAll();

	ArrayList<Perro> buscarPorNombre(String nombre) throws Exception;

	ArrayList<Perro> buscarPorRaza(String nombre) throws Exception;

	Perro getById(int id) throws Exception;

	boolean delete(int id) throws Exception;

	/**
	 * Creamos un nuevo Perro y genera el nuevo IDentificador
	 * 
	 * @param p
	 * @return
	 */
	Perro crear(Perro p);

	boolean update(Perro p);

}

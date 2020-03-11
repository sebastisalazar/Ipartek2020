package app.perrera;

import java.util.ArrayList;

public class PerroDAOImpl implements PerroDAO {

	private ArrayList<Perro> perros;

	public PerroDAOImpl() {
		super();
		this.perros = new ArrayList<Perro>();

		this.perros.add(new Perro("Bubba", 1));
		this.perros.add(new Perro("Ratplam", 2));
	}

	@Override
	public ArrayList<Perro> getAll() {
		return perros;
	}

	@Override
	public ArrayList<Perro> buscarPorNombre(String nombre) throws Exception {

		ArrayList<Perro> perrosNombre = new ArrayList<Perro>();
		boolean encontrado = false;

		for (int i = 0; i < perros.size(); i++) {
			if (perros.get(i).getNombre().equalsIgnoreCase(nombre)) {
				perrosNombre.add(perros.get(i));
				encontrado = true;
			}
		} // fin for

		if (encontrado == false) {
			throw new Exception("\nNo se ha encontrado ningun perro con el nombre " + nombre);
		} else {
			return perrosNombre;
		}

	}// fin buscarPorNombre

	@Override
	public ArrayList<Perro> buscarPorRaza(String raza) throws Exception {
		ArrayList<Perro> perrosRaza = new ArrayList<Perro>();
		boolean encontrado = false;
		for (int i = 0; i < perros.size(); i++) {
			if (perros.get(i).getRaza().equalsIgnoreCase(raza)) {
				perrosRaza.add(perros.get(i));
				encontrado = true;
			}
		} // fin for

		if (encontrado == false) {
			throw new Exception("\nNo se ha encontrado ningun perro de raza " + raza);
		} else {
			return perrosRaza;
		}
	}

	@Override
	public Perro getById(int id) throws Exception {

		Perro p = new Perro();
		boolean encontrado = false;

		for (int i = 0; i < perros.size(); i++) {
			if (perros.get(i).getId() == id) {
				p = perros.get(i);
				encontrado = true;
			}
		} // fin for

		if (encontrado == false) {
			throw new Exception("\nNo se ha encontrado ningun con ID: " + id);
		} else {

			return p;
		}

	}

	@Override
	public boolean delete(int id) throws Exception {
		boolean borrado = false;

		for (int i = 0; i < perros.size(); i++) {
			if (perros.get(i).getId() == id) {
				perros.remove(i);
				borrado = true;
			}
		}

		if (!borrado) {
			throw new Exception("\nNo se ha encontrado ningun con ID: " + id);
		} else {
			return borrado;
		}

	}

	@Override
	public Perro crear(Perro p) throws Exception {

		perros.add(p);
		Perro d;
		d = getById(p.getId());

		return d;
	}

	@Override
	public boolean update(Perro p) {

		// getById(p.getId());

		return false;
	}

}

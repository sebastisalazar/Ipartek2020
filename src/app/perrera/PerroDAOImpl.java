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
	public ArrayList<Perro> buscarPorNombre(String nombre) {

		ArrayList<Perro> perrosNombre = new ArrayList<Perro>();

		for (int i = 0; i < perros.size(); i++) {
			if (perros.get(i).getNombre().equalsIgnoreCase(nombre)) {
				perrosNombre.add(perros.get(i));
			} else {
				perrosNombre = null;
			}
		} // fin for

		return perrosNombre;
	}// fin buscarPorNombre

	@Override
	public ArrayList<Perro> buscarPorRaza(String raza) {
		ArrayList<Perro> perrosRaza = new ArrayList<Perro>();

		for (int i = 0; i < perros.size(); i++) {
			if (perros.get(i).getRaza().equalsIgnoreCase(raza)) {
				perrosRaza.add(perros.get(i));
			} else {
				perrosRaza = null;
			}
		} // fin for

		return perrosRaza;
	}

	@Override
	public Perro getById(int id) {

		Perro p = new Perro();

		for (int i = 0; i < perros.size(); i++) {
			if (perros.get(i).getId() == id) {
				p = perros.get(i);
			} else {
				p = null;
			}
		} // fin for

		return p;
	}

	@Override
	public boolean delete(int id) {
		boolean borrado = false;
		for (int i = 0; i < perros.size(); i++) {
			if (perros.get(i).getId() == id) {
				perros.remove(i);
				borrado = true;
			}
		}

		return borrado;

	}

	@Override
	public Perro crear(Perro p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Perro p) {
		// TODO Auto-generated method stub
		return false;
	}

}

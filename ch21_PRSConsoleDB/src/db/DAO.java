package db;

import java.util.List;

public interface DAO<T> {
	T get(int id);
	List<T> list();
	boolean add(T t);
	boolean update(T t);
	boolean delete(T t);

}

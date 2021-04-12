package ch10;

public interface DataAccessObject {
	
	public abstract void select();
	void insert();
	void update();
	void delete();
}

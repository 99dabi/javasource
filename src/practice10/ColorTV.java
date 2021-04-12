package practice10;

public class ColorTV extends TV{
	int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");

	}
	
}

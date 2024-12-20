package test.mypac;

public class OrangeBox {
	
	private Orange item;
	
	public void pack(Orange item) {
		this.item = item;
	}
	public Orange upPack() {
		return item;
	}
}

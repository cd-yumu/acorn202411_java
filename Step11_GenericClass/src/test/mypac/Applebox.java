package test.mypac;

public class Applebox {
	// field
	private Apple item;
	
	// method of packing the apple
	public void pack(Apple item) {
		this.item = item;
	}
	
	// method of put out the apple
	public Apple unPack() {
		return item;
	}
}

//	AppleBox box1 = new AppleBox();
//  box1.pack(new Apple());
//  Apple apple = box1.unPack();

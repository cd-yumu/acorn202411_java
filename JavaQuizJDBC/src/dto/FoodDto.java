package dto;


public class FoodDto {
	private int id;
	private String regdate;
	private String category;
	private String menu;
	private int price;
	private String review;
	
	public FoodDto() {}
	

	public FoodDto(int id, String regdate, String category, String menu, int price, String review) {
		super();
		this.id = id;
		this.regdate = regdate;
		this.category = category;
		this.menu = menu;
		this.price = price;
		this.review = review;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
	
}

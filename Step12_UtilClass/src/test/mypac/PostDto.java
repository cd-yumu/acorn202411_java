package test.mypac;

public class PostDto {

	public int no;
	public String writer;
	public String title;
	
	public PostDto() {};
	
	/**
	 * @param no
	 * @param writer
	 * @param title
	 */
	public PostDto(int no, String writer, String title) {
		super();
		this.no = no;
		this.writer = writer;
		this.title = title;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	};
	
	
	
	
}

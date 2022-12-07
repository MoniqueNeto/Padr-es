package data_mining;

public class PDF extends DocumentTemplate {

	private String path;
	
	public PDF(String path) {
		super();
		this.path = path;
	}

	@Override
	void openFile() {
		System.out.println("Document PATH:" + path + " TYPE: .csv was opened.");
	}

	@Override
	void closeFile() {
		System.out.println("Document PATH:" + path + " TYPE: .csv was closed.");
	}

	@Override
	void extract() {
		System.out.println("Document .csv was extracted.");
	}

	@Override
	void convertFile() {
		System.out.println("Document .csv was converted.");
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
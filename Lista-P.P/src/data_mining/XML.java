package data_mining;

public class XML extends DocumentTemplate {
	
	private String path;
	
	public XML(String path) {
		super();
		this.path = path;
	}

	@Override
	void openFile() {
		System.out.println("Document PATH:" + path + " TYPE: .xml was opened.");
	}

	@Override
	void closeFile() {
		System.out.println("Document PATH:" + path + " TYPE: .xml was closed.");
	}

	@Override
	void extract() {
		System.out.println("Document .xml was extracted.");
	}

	@Override
	void convertFile() {
		System.out.println("Document .xml was converted.");
	}

}

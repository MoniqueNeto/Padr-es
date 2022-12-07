package data_mining;

public class TXT extends DocumentTemplate {
	
	private String path;
	
	public TXT(String path) {
		super();
		this.path = path;
	}

	@Override
	void openFile() {
		System.out.println("Document PATH:" + path + " TYPE: .txt was opened.");
	}

	@Override
	void closeFile() {
		System.out.println("Document PATH:" + path + " TYPE: .txt was closed.");
	}

	@Override
	void extract() {
		// TODO Auto-generated method stub
		System.out.println("Document .txt was extracted.");
	}

	@Override
	void convertFile() {
		System.out.println("Document .txt was converted.");
	}

}

package org.sugarj.languagelib;

/**
 * @author Sebastian Erdweg <seba at informatik uni-marburg de>
 */
public class SourceImport {
	private String path;
	private String prettyPrint;

	public SourceImport(String path, String prettyPrint) {
		this.path = path;
		this.prettyPrint = prettyPrint;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPrettyPrint() {
		return prettyPrint;
	}

	public void setPrettyPrint(String prettyPrint) {
		this.prettyPrint = prettyPrint;
	}
	
}

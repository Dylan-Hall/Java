/**
 * NodeInfo.java :: java.node in JLibs
 *
 * 		@author: Dylan Hall
 * 		@date: Jul 5, 2017
 * 		@lang: Java
 *
 * This is a class that contains the info for nodes used in data structures.
 */
package comp.libs.node;

public class NodeInfo<T> {

	private String name;
	private int key;
	private T info;

	/* Default Constructor */
	public NodeInfo() {
	};

	/* NodeInfo Constructor */
	public NodeInfo(String name, int key, T info) {
		this.name = name;
		this.key = key;
		this.info = info;
	}

	/* Public Getter */
	// ----------------------------------------
	public String getName() {
		return name;
	}

	public int getKey() {
		return key;
	}

	public T getInfo() {
		return info;
	}

	/* Public Setters */
	// ----------------------------------------
	public void setName(String name) {
		this.name = name;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public void setInfo(T info) {
		this.info = info;
	}

} /* END CLASS */

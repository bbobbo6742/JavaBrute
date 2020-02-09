package kr.bbobbo6742.brute;

import java.io.Serializable;

public class Char implements Serializable {

	private static final long serialVersionUID = 1L;
	
	final int myIndex;
	final Text parent;
	int index = 0;
	
	public Char(Text parent, int index) {
		myIndex = index;
		this.parent = parent;
	}
	
	//Index 0으로 돌아갔을 시 true 리턴
	public boolean next() {
		if(++index == parent.charset.length) {
			if(myIndex != 0) {
				index = 0;
				parent.chars[myIndex-1].next();
			}
			return true;
		}
		return false;
	}
	
}

package kr.bbobbo6742.brute;

import java.io.PrintStream;

public class AsyncSession {

	
	public AsyncSession(int min, int max, char[] charset, PrintStream p) {
		for(int f = min; f<=max; f++) {
			int d = f;
			new Thread(()->{
				String v;
				Text t = new Text(d, charset);
				while((v= t.next())!=null) {
					p.print(' ');
					p.print(v);
				}
			}).start();
		}
	}
	
	
}

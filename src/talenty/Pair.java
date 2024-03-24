package talenty;

class Pair {
	
	int x= 0, y=0;
	
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}

}

class Talenty {
	
	public static void main (String[] args) {
		Pair p[] = new Pair[] {new Pair(2,3), new Pair(4,5), new Pair(6,7)};
		
		System.out.println( p[0].x + "" +p[1].y);
		System.out.println( p.length);
		
	}
}

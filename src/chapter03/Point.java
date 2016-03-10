package chapter03;

public class Point {
	   private int x;
	   private int y;
	   public Point(){}
	   public Point( int x, int y ) {
	     this.x = x;
	     this.y = y;  
	   }
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public int hashCode() {
		final int prime = 31; // prime -> 성능 좋음
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	
	// check the objects are same(not only the contents)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)				//if reference of objects are same -> true
			return true;
		if (obj == null)		//check null
			return false;
		if (getClass() != obj.getClass()) //obj.getClass == this.getClass() !
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
		
		/*
		 * other method !!!!
		 * to check the contents of two objects are same, use this code
		 * 
		 * public boolean equals(Object obj) {
		 * if(obj == null){ return false; }
		 * if(obj instanceof Point == false){ return false;}
		 * Point other = (Point) obj;
		 * return (x==other.getX() && y == other.getY());
		 * }
		 * 
		 * 
		 * equals를 override하면 hashcode도 override필요함
		 */
	}

}

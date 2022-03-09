package com.sujata.demo;

class NewOuter{
	
	private int i;
	
	
	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	static class NewInner{
		private int j;

		public int getJ() {
			return j;
		}

		public void setJ(int j) {
			this.j = j;
		}
		
		
	}
}

public class StaticInnerClassDemo {

	public static void main(String[] args) {
		NewOuter.NewInner obj=new NewOuter.NewInner();

	}

}

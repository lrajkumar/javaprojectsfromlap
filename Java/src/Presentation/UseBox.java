package Presentation;

public class UseBox {
	public static void main(String[] args) {
		Box blackBox=new Box();
		Box greenBox=new Box();
		Box blueBox=new Box();
		
		
		
		
		blackBox.length=10;
		blackBox.breadth=12;
		blackBox.height=10;
		blackBox.vol=blackBox.length*blackBox.breadth*blackBox.height;

		greenBox.length=8;
		greenBox.breadth=6;
		greenBox.height=10;
		greenBox.vol=greenBox.length*greenBox.breadth*greenBox.height;

		blueBox.length=12;
		blueBox.breadth=12;
		blueBox.height=10;
		blueBox.vol=blueBox.length*blueBox.breadth*blueBox.height;
		
		
		
		
	}

}

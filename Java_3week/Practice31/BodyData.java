//20181013Á¤À¯°æ
public class BodyData {
	private int weight;
	private int height;
	
	public void setWeight(int weight) {this.weight = weight;}
	public int getWeight() {return weight;}
	public void setHeight(int height) {this.height = height;}
	public int getHeight() {return height;}
	
	public int idealWeight()
	{
		return (getHeight() - 110);
	}
	public boolean needDiet()
	{
		if(getWeight() > idealWeight())
			return true;
		else
			return false;
	}
	public boolean isTallerThan(BodyData b)
	{
		if(getHeight() > b.getHeight())
			return true;
		else
			return false;
	}
}

package simpleShopping;

public class SimpleShopping {

	//int item;
	//int price;
	int cost;
	//int useritem;
	//int userItemprice;
	
	public int[] cumulativeprice = new int[100];
	public int[] cumulativeItemlist =new int[100];
	

/*	public int calculateTotalPrice() {

		calculateCumulativePriceWhenItemsHaveDifferentPrice();

		cost = price * item;

		return cost;
	}

	private void calculateCumulativePriceWhenItemsHaveDifferentPrice() {
		for (int i = 0; i < cumulativeprice.length; i++) {
		price = price + cumulativeprice[i];
	
		}
	}*/
	
	public int calculatecumulativepricewithItems(){
		
		for (int i = 0; i < cumulativeprice.length; i++) {
			cost = cost+ cumulativeItemlist[i]*cumulativeprice[i];
			
		}
		return cost;
	
	}

}

package operators;

public class Calculateprofitandloss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cost_price=129;
		double selling_price=191;
		double Profit=selling_price - cost_price;
		double profit_percentage=Profit/cost_price*100;
		System.out.println("The Cost Price is INR " + cost_price +
                ", and Selling Price is INR " + selling_price +
                ", The Profit is INR " + Profit +
                ", and the Profit Percentage is " + profit_percentage);

	}

}

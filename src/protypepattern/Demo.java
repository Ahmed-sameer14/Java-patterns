package protypepattern;

public class Demo 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		BookShop bs = new BookShop();
		bs.setShopname("global book shop");
		bs.loadData();
		
		
		BookShop bs1 =  bs.clone();
		bs1.setShopname("A1");
		//bs1.loadData();
		bs.getBook().remove(1);
		System.out.println(bs);
		System.out.println(bs1);
	}
}

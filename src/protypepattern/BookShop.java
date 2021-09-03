package protypepattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable
{
	private String shopname;
	
	List<Book> book = new ArrayList<>();

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	public void loadData()
	{
		for(int i = 0 ; i<=10 ; i++)
		{
			Book b = new Book();
			b.setBid(i);
			b.setBname("book"+i);
			getBook().add(b);
		}
	}

	@Override
	public String toString() {
		return "BookShop [shopname=" + shopname + ", book=" + book + "]";
	}

	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		BookShop shop = new BookShop();
		for(Book b : this.getBook())
		{
			shop.getBook().add(b);
		}
		return shop;
	}
	
	
}

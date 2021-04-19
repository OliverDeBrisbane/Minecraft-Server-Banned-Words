package NoSwearing;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

public class book {

	private String title = "Blank";
	private String author = "Herobrine";
	private BookMeta data ;
	private ArrayList<String> pages = new ArrayList<String>();

	public book(ItemStack book) {

		if (book.getType().equals(Material.WRITTEN_BOOK) || book.getType().equals(Material.BOOK_AND_QUILL)) {

			data = (BookMeta) book.getItemMeta();
			author = data.getAuthor();
			title = data.getTitle();

			pages = new ArrayList<String>(data.getPages());

		}

	}

	public BookMeta getMeta()
	{
		if (title != null)
		data.setTitle(title);
		
		data.setAuthor(author);
		data.setPages(pages);
		
		return data;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public ArrayList<String> getPages() {
		return pages;
	}

	public void setPages(ArrayList<String> pages) {
		this.pages = pages;
	}

}

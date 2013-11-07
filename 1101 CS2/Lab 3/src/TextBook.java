//TextBook.java
public class TextBook
{
		private String title;
		private String author;
		private String publisher;
		
		public TextBook(String title, String author, String publisher)
		{
			this.title = title;
			this.author = author;
			this.publisher = publisher;
		}
		
		public String getTitle()
		{
			return title;
		}
		public void setTitle(String t){
			title = t;
		}
		
		public String getAuthor()
		{
			return author;
		}
		public String getPublisher()
		{
			return publisher;
		}
		
		public String toString()
		{
			String str = "Title: " + title + "\nAuthor: " + author + "\nPublisher: " + publisher +"\n";
			return str;
		}
}

package org.library;

import java.util.*;

class Book{

String title;
String author;
String ISBN;
boolean isAvailable;

	public Book(String title, String author, String ISBN, boolean isAvailable) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.isAvailable = isAvailable;
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
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN= ISBN;
	}
	
	@Override
	public String toString() {
		return "Book ID: " + ISBN + ", Title: " + title + ", Author: " + author + ", Borrowed: " + isAvailable;
	}

	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return false;
	}
	
//	public void print() {
//		System.out.println(this.title);
//		System.out.println(this.author);
//		System.out.println(this.ISBN);
//	}
	
}
	
class Member{
	String name;
	int memberID;
	List<Book>borrowedBooks;
	
	public Member(int memberID, String name) {
		this.memberID = memberID;
		this.name  = name;
		this.borrowedBooks = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public int getMemberID() {
		return memberID;
	}
	
	public List<Book> getBorrowedBooks(){
		return borrowedBooks; 
	}
	
	
	
	public void borrowBook(Book book) {
		if(book != null && !book.isAvailable()) {
			borrowedBooks.add(book);
			System.out.println(name +" has borrowed "+book.getTitle());	
		} else {
			System.out.println("Book is unavailable");
		}
	}
	
	public void returnBook(Book book) {
		borrowedBooks.remove(book);
		System.out.println(name+" has returned "+book.getTitle());
		
		
	}
	
	public void printBorrowedBooks() {
		//use listerator
		ListIterator <Book>lt = borrowedBooks.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}

	}

	public String toString() {
		return "Member [name=" + name + ", memberID=" + memberID + ", borrowedBooks=" + borrowedBooks + "]";
	}

}
	 

class Library {
	
	Map<String,Book>books;
	Set<Member>members;
	
	public Library() {
		this.books = new HashMap<>();
		this.members = new HashSet<>();
	}
	
	public void addBook(Book book) {
		if (books.containsKey(book.getISBN())) {
			System.out.println("Book with no. "+book.getISBN()+" already exists.");
		} else {
			books.put(book.getISBN(), book);
			System.out.println("Book "+book.getTitle()+" is added");
		}
		
	}

	
	public void addMember(Member member) {
		if(members.add(member)) {
			System.out.println("Member "+ member.getName()+" is added!");
		} else {
			System.out.println("Member already exists!!");
		}
	}
	
	public void displayBooks() {
		Iterator<Book> it = books.values().iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
	}
	
	
	public int getTotalMembers() {
		return members.size();
		
	}
	
	 public Book searchBook(String ISBN) {
	        return books.get(ISBN);
	    }
	 
	 public void borrowBook(int memberId, String isbn) throws LiBexc {
	        Member member = findMemberById(memberId); // not completed yet
	        Book book = books.get(isbn);

	        if (member == null) {
	            throw new LiBexc("Member not found");
	        }
	        if (book == null) {
	            throw new LiBexc("Book with ISBN " + isbn + " not found in the library.");
	        }
	        member.borrowBook(book);  // Member borrows the book
	        books.remove(isbn);       // Remove book from library
	        System.out.println("Book borrowed: " + book);
	    }

	 class LiBexc extends Exception{
			public LiBexc(String message) {
				super(message);
			}
		}

}




public class Problem {

	public static void main(String[] args) {
		 Library library = new Library();
		 Scanner sc = new Scanner(System.in);
		 
	        library.addBook(new Book("1", "India that is bharat", "sai",true));
	        library.addBook(new Book("2", "Shot at the gold", "Abhinav bindra",true));

	       
	        Member member1 = new Member(101, "John Doe");
	        Member member2 = new Member(102, "Jane Smith");

	        library.addMember(member1);
	        library.addMember(member2);
	       
	        library.displayBooks();


	        System.out.println("Total Members: " + library.getTotalMembers());
	        
//	        try {
//	            System.out.print("Enter member ID to borrow a book: ");
//	            int memberId = scanner.nextInt();
//	            System.out.print("Enter book ISBN to borrow: ");
//	            String isbn = scanner.next();
//	            library.borrowBook(memberId, isbn);
//	        } catch (Exception e) {
//	            System.out.println(e.getMessage());
//	        }
//
//	
//	        try {
//	            System.out.print("Enter member ID to return a book: ");
//	            int memberId = sc.nextInt();
//	            System.out.print("Enter book ISBN to return: ");
//	            String isbn = sc.next();
//	            Book returnedBook = library.searchBook(isbn);  // Simulate returning the book
//	            if (returnedBook != null) {
//	                library.returnBook(memberId, returnedBook);
//	            } else {
//	                System.out.println("Book with this ISBN is not borrowed.");
//	            }
//	        } catch (Exception e) {
//	            System.out.println(e.getMessage());
//	        }
//
//	        // Display total number of members
//	        System.out.println("Total members: " + library.getTotalMembers());
    	}
	}




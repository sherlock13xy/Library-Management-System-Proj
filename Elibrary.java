import java.util.Scanner;

class Library {
	String bookName;
	String author;
	int pages;
	float price;
}


public class Elibrary {

	public static void main(String[] args) {
		
		Library[] library = new Library[100];

		String arNm;

		
		int i, input, count;

		i = input = count = 0;

		
		for (int j = 0; j < library.length; j++) {
			library[j] = new Library();
		}

		Scanner scanner = new Scanner(System.in);

		
		while (input != 5) {
			System.out.println("\n\n********###### WELCOME TO E-LIBRARY #####********");
			System.out.println("1. Add book information\n2. Display book information");
			System.out.println("3. List all books of given author\n4. List the count of books in the library");
			System.out.println("5. Exit");

			
			System.out.print("\n\nEnter one of the above: ");
			input = scanner.nextInt();

			
			switch (input) {

				// Add book
				case 1:
					System.out.print("Enter book name = ");
					library[i].bookName = scanner.next();

					System.out.print("Enter author name = ");
					library[i].author = scanner.next();

					System.out.print("Enter pages = ");
					library[i].pages = scanner.nextInt();

					System.out.print("Enter price = ");
					library[i].price = scanner.nextFloat();
					count++;
					i++;
					break;

				// Print book information
				case 2:
					System.out.println("You have entered the following information");
					for (int j = 0; j < count; j++) {
						System.out.println("Book name = " + library[j].bookName +
								"\t Author name = " + library[j].author +
								"\t Pages = " + library[j].pages +
								"\t Price = " + library[j].price);
					}
					break;

				// Take the author name as input
				case 3:
					System.out.println("Enter author name: ");
					arNm = scanner.next();
					for (int j = 0; j < count; j++) {
						if (arNm.equals(library[j].author)) {
							System.out.println(library[j].bookName + " " +
									library[j].author + " " +
									library[j].pages + " " +
									library[j].price);
						}
						else{System.out.println("author's book is not available");}
					}
					break;

				// Print total count
				case 4:
					System.out.println("\nNo of books in library: " + count);
					break;
				case 5:
					System.exit(0);
			}
		}
	}
}
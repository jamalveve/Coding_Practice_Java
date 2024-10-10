package Pattern.Printing.java;

public class TriangleHack {
	public static void main(String[] args) {

//		 Square
		System.out.println("square");

		int n = 5;
		for (int j = 1; j <= n; j++) {// outer loop->rows
			for (int i = 0; i <= n; i++) {
				System.out.print(" * "); // this is helping to continue in the same line//inner loop->coloumns
//		System.out.println("*"); //next line

			}
			System.out.println();// this will help to come to the next line

		}
		System.out.println("left Increasing traingle");
		// Traiangle
		int n1 = 5;
		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= i; j++) {// when i=1 print 1 start when i become 2 print 2 star and so on so
				System.out.print(" * "); // this is helping to continue in the same line
//		System.out.println("*"); //next line
			}
			System.out.println();// this will help to come to the next line

		}
		System.out.println("1. Hollow left-increasing Triangle\n");

		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= i; j++) {// when i=1 print 1 start when i become 2 print 2 star and so on so

				if (j == 1 || j == i || i == n) {

					System.out.print(" * "); // this is helping to continue in the same line
//			System.out.println("*"); //next line
				} else {
					System.out.print("   ");
//				System.out.println("*"); //next line
				}

			}
			System.out.println();

		}

		System.out.println("right Increasing traingle");

		for (int i = 1; i <= n1; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("   ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();

		}

		System.out.println("1. Hollow right-increasing Triangle\n");

		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= n; j++) {// when i=1 print 1 start when i become 2 print 2 star and so on so

				if (j == n || i == n || i + j == n + 1) {

					System.out.print(" * "); // this is helping to continue in the same line
//			System.out.println("*"); //next line
				} else {
					System.out.print("   ");
//				System.out.println("*"); //next line
				}

			}
			System.out.println();

		}

		System.out.println("1. Hollow left-decreasing Triangle\n");

		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= n; j++) {// when i=1 print 1 start when i become 2 print 2 star and so on so

				if (j == 1 || i == 1 || i + j == n + 1) {

					System.out.print(" * "); // this is helping to continue in the same line
//			System.out.println("*"); //next line
				} else {
					System.out.print("   ");
//				System.out.println("*"); //next line
				}

			}
			System.out.println();

		}

		System.out.println("1. Hollow right-decreasing Triangle\n");

		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= n; j++) {// when i=1 print 1 start when i become 2 print 2 star and so on so

				if (i == 1 | i == j || j == 5) {

					System.out.print(" * "); // this is helping to continue in the same line
//			System.out.println("*"); //next line
				} else {
					System.out.print("   ");
//				System.out.println("*"); //next line
				}

			}
			System.out.println();

		}
		System.out.println("1. Hollow N-shape");

		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= n; j++) {// when i=1 print 1 start when i become 2 print 2 star and so on so

				if (j == 1 || j == n || i == j) {

					System.out.print(" * "); // this is helping to continue in the same line
//			System.out.println("*"); //next line
				} else {
					System.out.print("   ");
//				System.out.println("*"); //next line
				}

			}
			System.out.println();

		}

		System.out.println("left decreasing traingle");
		// Traiangle
		int n2 = 5;
		for (int i = 1; i <= n2; i++) {
//				for (int j = n2; j >= i; j--) {//or
			for (int j = i; j <= n2; j++) {// when i=1 print 1 start when i become 2 print 2 star and so on so

				System.out.print(" * "); // this is helping to continue in the same line
//			System.out.println("*"); //next line
			}
			System.out.println();// this will help to come to the next line

		}

		System.out.println("right decreasing traingle");
//
		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= i; j++) {// when i=1 print 1 start when i become 2 print 2 star and so on so
				System.out.print("   "); // this is helping to continue in the same line
			}
			for (int j = i; j <= n; j++) {// when i=1 print 1 start when i become 2 print 2 star and so on so

				System.out.print(" * "); // this is helping to continue in the same line
//			System.out.println("*"); //next line
			}

			System.out.println();// this will help to come to the next line

		}
		System.out.println("Straigh traingle");/// -4 loops
		// it has one decreasing ,increasing 2 ,then decreasing(dont want tp consider)

		for (int i = 1; i <= n; i++) { // outer loop

			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("* ");

			}

			System.out.println();

		}

		System.out.println("hollow pyramid");
		int n5 = 5;
		for (int i = 1; i <= n5; i++) { // outer loop

			for (int j = i; j <= n5 * 2; j++) {
				if (j == n5 / 2 || i == n5 * 2)
					System.out.print(" * ");
				else {
					System.out.print("  ");
				}
			}

			System.out.println();

		}

		System.out.println("Increasing Traingle 2");

		for (int i = 1; i <= n; i++) { // Outer loop controls the number of rows

			// Inner loop for printing spaces to center the triangle
			for (int j = i; j <= n; j++) {
				System.out.print("   "); // Print space on the same line
			}

			// Inner loop for printing stars on the left side
			for (int j = 1; j <= i; j++) {
				System.out.print(" * "); // Print stars on the same line
			}

			// Inner loop for printing stars on the right side
			for (int j = 1; j < i; j++) { // Notice that it starts from 1 and goes up to `i - 1` to avoid double
											// printing of the center star
				System.out.print(" * "); // Print stars on the same line
			}

			// Move to the next line after finishing each row
			System.out.println();
		}

		System.out.println("decreasing straight Traingle 2");

		for (int i = 1; i <= n; i++) { // Outer loop controls the number of rows

			// Inner loop for printing spaces to center the triangle
			for (int j = 1; j <= i; j++) {
				System.out.print("   "); // Print space on the same line
			}

			// Inner loop for printing stars on the left side
			for (int j = i; j <= n; j++) {
				System.out.print(" * "); // Print stars on the same line
			}

			// Inner loop for printing stars on the right side
			for (int j = i; j < n; j++) { // Notice that it starts from 1 and goes up to `i - 1` to avoid double
											// printing of the center star
				System.out.print(" * "); // Print stars on the same line
			}

			// Move to the next line after finishing each row
			System.out.println();
		}

		System.out.println("Diamond Traingle 2");

		for (int i = 1; i <= n; i++) { // Outer loop controls the number of rows

			// Inner loop for printing spaces to center the triangle
			for (int j = i; j <= n; j++) {
				System.out.print("   "); // Print space on the same line
			}

			// Inner loop for printing stars on the left side
			for (int j = 1; j <= i; j++) {
				System.out.print(" * "); // Print stars on the same line
			}

			// Inner loop for printing stars on the right side
			for (int j = 1; j < i; j++) { // Notice that it starts from 1 and goes up to `i - 1` to avoid double
											// printing of the center star
				System.out.print(" * "); // Print stars on the same line
			}

			// Move to the next line after finishing each row
			System.out.println();
		}

		for (int i = 1; i <= n; i++) { // Outer loop controls the number of rows

			// Inner loop for printing spaces to center the triangle
			for (int j = 1; j <= i; j++) {
				System.out.print("   "); // Print space on the same line
			}

			// Inner loop for printing stars on the left side
			for (int j = i; j <= n; j++) {
				System.out.print(" * "); // Print stars on the same line
			}

			// Inner loop for printing stars on the right side
			for (int j = i; j < n; j++) { // Notice that it starts from 1 and goes up to `i - 1` to avoid double
											// printing of the center star
				System.out.print(" * "); // Print stars on the same line
			}

			// Move to the next line after finishing each row
			System.out.println();
		}
		System.out.println(" parallelogram");

		for (int i = 1; i <= n; i++) { // Outer loop controls the number of rows

			// Inner loop for printing spaces to center the triangle
			for (int j = 1; j <= i; j++) {
				System.out.print("   "); // Print space on the same line
			}

//	            // Inner loop for printing stars on the left side
//	            for (int j = i; j <= n; j++) {
//	                System.out.print(" * ");  // Print stars on the same line
//	            }
//
//	            // Inner loop for printing stars on the right side
//	            for (int j = i; j < n; j++) {  // Notice that it starts from 1 and goes up to `i - 1` to avoid double printing of the center star
//	                System.out.print(" * ");  // Print stars on the same line
//	            }
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print(" * ");  // Print space on the same line
//	            }
//	            for (int j = 1; j <= i; j++) {
//	                System.out.print(" * ");  // Print space on the same line
//	            }

			for (int j = 1; j <= n; j++) {
				System.out.print(" * "); // Print space on the same line
			}
			// Move to the next line after finishing each row
			System.out.println();
		}

		System.out.println("different shape");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		System.out.println("diagnoal star ");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			System.out.println("*");
		}

		System.out.println("square with space in front shape");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		System.out.println("Hollow square");

		for (int i = 1; i <= n; i++) {
			// Check if it's the first or last row
			if (i == 1 || i == n) {
				// Print filled row of stars
				for (int j = 1; j <= n; j++) {
					System.out.print("* "); // Print stars with space
				}
			} else {
				// Print hollow row
				System.out.print("* "); // Print the first star
				// Print spaces for the hollow part
				for (int j = 2; j <= n - 1; j++) {
					System.out.print("  "); // Print spaces
				}
				System.out.print("* "); // Print the last star
			}
			// Move to the next line after each row
			System.out.println();
		}

		System.out.println("cross diagnoal stars  ");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			System.out.println(" * ");
		}

		System.out.println("cross diagnoal stars ulta  ");

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			System.out.println(" * ");
		}
		int n3 = 10;
		System.out.println("X stars   ");
		for (int i = 1; i <= n3; i++) {
			// Loop for each column
			for (int j = 1; j <= n3; j++) {
				// Print '*' when i == j (top-left to bottom-right diagonal)
				// or when i + j == n * 2 (bottom-left to top-right diagonal)
				if (i == j || i + j == n3) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(); // Move to the next line after each row
		}

		System.out.println("V shape  ");
		for (int i = 1; i <= 5; i++) {
			// Loop for each columnx
			for (int j = 1; j <= 10; j++) {
				// Print '*' when i == j (top-left to bottom-right diagonal)
				// or when i + j == n * 2 (bottom-left to top-right diagonal)
				if (i == j || i + j == 10) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(); // Move to the next line after each row
		}

		System.out.println("number increasing traingle straights");
		for (int i = 0; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("number increasing traingle straights");

		for (int i = 0; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "   ");
			}
			System.out.println();
		}
		System.out.println("number increasing traingle left");
		for (int i = 0; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("number increasing traingle right");

		for (int i = 0; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		System.out.println("numberchanging traingle left");

		for (int i = 1; i <= n; i++) {
			// Inner loop for printing numbers in each row
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			// Move to the next line after each row
			System.out.println();
		}
		System.out.println("numberchanging traingle right");

		for (int i = 1; i <= n; i++) {
			// Inner loop for printing numbers in each row
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			// Move to the next line after each row
			System.out.println();
		}
		
		System.out.println("numberchanging traingle straight");

		for (int i = 1; i <= n; i++) {
			// Inner loop for printing numbers in each row
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			// Move to the next line after each row
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			// Inner loop for printing numbers in each row
			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			// Move to the next line after each row
			System.out.println();
		}

	}

}

import java.util.Scanner;


public class player {
	
	private static String b1 = "",b2 = "",b3 = "",b4 = "",b5 = "",b6 = "",b7 = "",b8 = "",b9 = "";
	private static String player1,player2;
	
	static void play1(){
		System.out.println(player1+" it is your turn.");
		System.out.println("Here is what the board now looks like:");
		System.out.println("   "+b1+"    |   "+b2+"   |   "+b3);
		System.out.println("_______________________");
		System.out.println("   "+b4+"    |   "+b5+"   |   "+b6);
		System.out.println("_______________________");
		System.out.println("   "+b7+"    |   "+b8+"   |   "+b9);
	}
	static void play2(){
		System.out.println(player2+" it is your turn.");
		System.out.println("Here is what the board now looks like:");
		System.out.println("   "+b1+"    |   "+b2+"   |   "+b3);
		System.out.println("_______________________");
		System.out.println("   "+b4+"    |   "+b5+"   |   "+b6);
		System.out.println("_______________________");
		System.out.println("   "+b7+"    |   "+b8+"   |   "+b9);
	}
	static void playw1(){
		System.out.println();
		System.out.println();
		System.out.println("   "+b1+"    |   "+b2+"   |   "+b3);
		System.out.println("_______________________");
		System.out.println("   "+b4+"    |   "+b5+"   |   "+b6);
		System.out.println("_______________________");
		System.out.println("   "+b7+"    |   "+b8+"   |   "+b9);
		System.out.println("Congratulations "+player1+" has won!");
		Runtime.getRuntime().exit(0);
	}
	static void playw2(){
		System.out.println();
		System.out.println();
		System.out.println("   "+b1+"    |   "+b2+"   |   "+b3);
		System.out.println("_______________________");
		System.out.println("   "+b4+"    |   "+b5+"   |   "+b6);
		System.out.println("_______________________");
		System.out.println("   "+b7+"    |   "+b8+"   |   "+b9);
		System.out.println("Congratulations "+player2+" has won!");
		Runtime.getRuntime().exit(0);
	}
	public static void main(String[] args) {
		int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0,a6 = 0,a7 = 0,a8 = 0;
		int c1 = 0,c2 = 0,c3 = 0,c4 = 0,c5 = 0,c6 = 0,c7 = 0,c8 = 0;
		int length1,length2;
		@SuppressWarnings("resource")
		Scanner scn = new Scanner (System.in);
		System.out.println("Player 1 please enter your name:");
		//player 1's name
		player1 = scn.nextLine();
		length1 = player1.length();
		while (length1 < 3)
		{
			System.out.println("Player 1 please choose a name longer than 3 characters.");
			player1 = scn.nextLine();
			length1 = player1.length();
		}
		System.out.println("Player 2 please enter your name:");
		//player 2's name
		player2 = scn.nextLine();
		length2 = player2.length( );
		while (player2.equals(player1))
		{
			System.out.println("Player 2 please choose a different name.");
			player2 = scn.nextLine();
		}
		while (length2 < 3)
		{
			System.out.println("Player 2 please choose a name longer than 3 characters.");
			player2 = scn.nextLine();
			length2 = player2.length( );
		}
		System.out.println("Welcome to Tic Tac Toe "+player1+" and "+player2+".");
		System.out.println();
		System.out.println("Here is how the board will look:");
		System.out.println("   "+b1+"    |   "+b2+"   |   "+b3);
		System.out.println("_______________________");
		System.out.println("   "+b4+"    |   "+b5+"   |   "+b6);
		System.out.println("_______________________");
		System.out.println("   "+b7+"    |   "+b8+"   |   "+b9);
		System.out.println();
		int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;
		int aa=0,bb=0,cc=0,dd=0,ee=0,ff=0,gg=0,hh=0,ii=0;
		System.out.println(player1+" it is your turn.");
		//Player 1 starts turn 1
		String t1 = scn.nextLine();
		if (t1.equals("a"))
		{
			a = 1;
			b1 = "X";
		}
		if (t1.equals("b"))
		{
		 	b = 1;
		 	b2 = "X";
		}
		if (t1.equals("c"))
		{
		 	c = 1;
		 	b3 = "X";
		}
		if (t1.equals("d"))
		{
		 	d = 1;
		 	b4 = "X";
		}
		if (t1.equals("e"))
		{
		 	e = 1;
		 	b5 = "X";
		}
		if (t1.equals("f"))
		{
		 	f = 1;
		 	b6 = "X";
		}
		if (t1.equals("g"))
		{
		 	g = 1;
		 	b7 = "X";
		}
		if (t1.equals("h"))
		{
		 	h = 1;
		 	b8 = "X";
		}
		if (t1.equals("i"))
		{
		 	i = 1;
		 	b9 = "X";
		}
		//Player 2 starts turn 2
		play2();
		String t2 = scn.nextLine();
		if (t2.equals("a"))
		{
			aa = 2;
		 	b1 = "O";
		}
		if (t2.equals("b"))
		{
		 	bb = 2;
		 	b2 = "O";
		}
		if (t2.equals("c"))
		{
		 	cc = 2;
		 	b3 = "O";
		}
		if (t2.equals("d"))
		{
		 	dd = 2;
		 	b4 = "O";
		}
		if (t2.equals("e"))
		{
		 	ee = 2;
		 	b5 = "O";
		}
		if (t2.equals("f"))
		{
		 	ff = 2;
		 	b6 = "O";
		}
		if (t2.equals("g"))
		{
		 	gg = 2;
		 	b7 = "O";
		}
		if (t2.equals("h"))
		{
		 	hh = 2;
		 	b8 = "O";
		}
		if (t2.equals("i"))
		{
		 	ii = 2;
		 	b9 = "O";
		}
		//Player 1 starts turn 3
		play1();
		String t3 = scn.nextLine();
		if (t3.equals("a"))
		{
			a = 1;
		 	b1 = "X";
		}
		if (t3.equals("b"))
		{
		 	b = 1;
		 	b2 = "X";
		}
		if (t3.equals("c"))
		{
		 	c = 1;
		 	b3 = "X";
		}
		if (t3.equals("d"))
		{
		 	d = 1;
		 	b4 = "X";
		}
		if (t3.equals("e"))
		{
		 	e = 1;
		 	b5 = "X";
		}
		if (t3.equals("f"))
		{
		 	f = 1;
		 	b6 = "X";
		}
		if (t3.equals("g"))
		{
		 	g = 1;
		 	b7 = "X";
		}
		if (t3.equals("h"))
		{
		 	h = 1;
		 	b8 = "X";
		}
		if (t3.equals("i"))
		{
		 	i = 1;
		 	b9 = "X";
		}
		//Player 2 starts turn 4
		play2();
		String t4 = scn.nextLine();
		if (t4.equals("a"))
		{
			aa = 2;
		 	b1 = "O";
		}
		if (t4.equals("b"))
		{
		 	bb = 2;
		 	b2 = "O";
		}
		if (t4.equals("c"))
		{
		 	cc = 2;
		 	b3 = "O";
		}
		if (t4.equals("d"))
		{
		 	dd = 2;
		 	b4 = "O";
		}
		if (t4.equals("e"))
		{
		 	ee = 2;
		 	b5 = "O";
		}
		if (t4.equals("f"))
		{
		 	ff = 2;
		 	b6 = "O";
		}
		if (t4.equals("g"))
		{
		 	gg = 2;
		 	b7 = "O";
		}
		if (t4.equals("h"))
		{
		 	hh = 2;
		 	b8 = "O";
		}
		if (t4.equals("i"))
		{
		 	ii = 2;
		 	b9 = "O";
		}
		//Player 1 starts turn 5
		play1();
		String t5 = scn.nextLine();
		if (t5.equals("a"))
		{
			a = 1;
		 	b1 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t5.equals("b"))
		{
		 	b = 1;
		 	b2 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		 	
		}
		if (t5.equals("c"))
		{
		 	c = 1;
		 	b3 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t5.equals("d"))
		{
		 	d = 1;
		 	b4 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t5.equals("e"))
		{
		 	e = 1;
		 	b5 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t5.equals("f"))
		{
		 	f = 1;
		 	b6 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t5.equals("g"))
		{
		 	g = 1;
		 	b7 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t5.equals("h"))
		{
		 	h = 1;
		 	b8 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t5.equals("i"))
		{
		 	i = 1;
		 	b9 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		play2();
		String t6 = scn.nextLine();
		if (t6.equals("a"))
		{
			aa = 2;
		 	b1 = "O";
			c1 = aa+bb+cc;
			c2 = dd+ee+ff;
			c3 = gg+hh+ii;
			c4 = aa+dd+gg;
			c5 = bb+ee+hh;
			c6 = cc+ff+ii;
			c7 = aa+ee+ii;
			c8 = cc+ee+gg;
			if (c1 == 6)
			{
				playw2();
			}
			if (c2 == 6)
			{
				playw2();
			}
			if (c3 == 6)
			{
				playw2();
			}
			if (c4 == 6)
			{
				playw2();
			}
			if (c5 == 6)
			{
				playw2();
			}
			if (c6 == 6)
			{
				playw2();
			}
			if (c7 == 6)
			{
				playw2();
			}
			if (c8 == 6)
			{
				playw2();
			}
		}
		if (t6.equals("b"))
		{
		 	bb = 2;
		 	b2 = "O";
			c1 = aa+bb+cc;
			c2 = dd+ee+ff;
			c3 = gg+hh+ii;
			c4 = aa+dd+gg;
			c5 = bb+ee+hh;
			c6 = cc+ff+ii;
			c7 = aa+ee+ii;
			c8 = cc+ee+gg;
			if (c1 == 6)
			{
				playw2();
			}
			if (c2 == 6)
			{
				playw2();
			}
			if (c3 == 6)
			{
				playw2();
			}
			if (c4 == 6)
			{
				playw2();
			}
			if (c5 == 6)
			{
				playw2();
			}
			if (c6 == 6)
			{
				playw2();
			}
			if (c7 == 6)
			{
				playw2();
			}
			if (c8 == 6)
			{
				playw2();
			}
		}
		if (t6.equals("c"))
		{
		 	cc = 2;
		 	b3 = "O";
			c1 = aa+bb+cc;
			c2 = dd+ee+ff;
			c3 = gg+hh+ii;
			c4 = aa+dd+gg;
			c5 = bb+ee+hh;
			c6 = cc+ff+ii;
			c7 = aa+ee+ii;
			c8 = cc+ee+gg;
			if (c1 == 6)
			{
				playw2();
			}
			if (c2 == 6)
			{
				playw2();
			}
			if (c3 == 6)
			{
				playw2();
			}
			if (c4 == 6)
			{
				playw2();
			}
			if (c5 == 6)
			{
				playw2();
			}
			if (c6 == 6)
			{
				playw2();
			}
			if (c7 == 6)
			{
				playw2();
			}
			if (c8 == 6)
			{
				playw2();
			}
		}
		if (t6.equals("d"))
		{
		 	dd = 2;
		 	b4 = "O";
			c1 = aa+bb+cc;
			c2 = dd+ee+ff;
			c3 = gg+hh+ii;
			c4 = aa+dd+gg;
			c5 = bb+ee+hh;
			c6 = cc+ff+ii;
			c7 = aa+ee+ii;
			c8 = cc+ee+gg;
			if (c1 == 6)
			{
				playw2();
			}
			if (c2 == 6)
			{
				playw2();
			}
			if (c3 == 6)
			{
				playw2();
			}
			if (c4 == 6)
			{
				playw2();
			}
			if (c5 == 6)
			{
				playw2();
			}
			if (c6 == 6)
			{
				playw2();
			}
			if (c7 == 6)
			{
				playw2();
			}
			if (c8 == 6)
			{
				playw2();
			}
		}
			if (t6.equals("e"))
			{
			 	ee = 2;
			 	b5 = "O";
				c1 = aa+bb+cc;
				c2 = dd+ee+ff;
				c3 = gg+hh+ii;
				c4 = aa+dd+gg;
				c5 = bb+ee+hh;
				c6 = cc+ff+ii;
				c7 = aa+ee+ii;
				c8 = cc+ee+gg;
				if (c1 == 6)
				{
					playw2();
				}
				if (c2 == 6)
				{
					playw2();
				}
				if (c3 == 6)
				{
					playw2();
				}
				if (c4 == 6)
				{
					playw2();
				}
				if (c5 == 6)
				{
					playw2();
				}
				if (c6 == 6)
				{
					playw2();
				}
				if (c7 == 6)
				{
					playw2();
				}
				if (c8 == 6)
				{
					playw2();
				}
			}
			if (t6.equals("f"))
			{
			 	ff = 2;
			 	b6 = "O";
				c1 = aa+bb+cc;
				c2 = dd+ee+ff;
				c3 = gg+hh+ii;
				c4 = aa+dd+gg;
				c5 = bb+ee+hh;
				c6 = cc+ff+ii;
				c7 = aa+ee+ii;
				c8 = cc+ee+gg;
				if (c1 == 6)
				{
					playw2();
				}
				if (c2 == 6)
				{
					playw2();
				}
				if (c3 == 6)
				{
					playw2();
				}
				if (c4 == 6)
				{
					playw2();
				}
				if (c5 == 6)
				{
					playw2();
				}
				if (c6 == 6)
				{
					playw2();
				}
				if (c7 == 6)
				{
					playw2();
				}
				if (c8 == 6)
				{
					playw2();
				}
			}
		if (t6.equals("g"))
		{
		 	gg = 2;
		 	b7 = "O";
			c1 = aa+bb+cc;
			c2 = dd+ee+ff;
			c3 = gg+hh+ii;
			c4 = aa+dd+gg;
			c5 = bb+ee+hh;
			c6 = cc+ff+ii;
			c7 = aa+ee+ii;
			c8 = cc+ee+gg;
			if (c1 == 6)
			{
				playw2();
			}
			if (c2 == 6)
			{
				playw2();
			}
			if (c3 == 6)
			{
				playw2();
			}
			if (c4 == 6)
			{
				playw2();
			}
			if (c5 == 6)
			{
				playw2();
			}
			if (c6 == 6)
			{
				playw2();
			}
			if (c7 == 6)
			{
				playw2();
			}
			if (c8 == 6)
			{
				playw2();
			}
		}
		if (t6.equals("h"))
		{
		 	hh = 2;
		 	b8 = "O";
			c1 = aa+bb+cc;
			c2 = dd+ee+ff;
			c3 = gg+hh+ii;
			c4 = aa+dd+gg;
			c5 = bb+ee+hh;
			c6 = cc+ff+ii;
			c7 = aa+ee+ii;
			c8 = cc+ee+gg;
			if (c1 == 6)
			{
				playw2();
			}
			if (c2 == 6)
			{
				playw2();
			}
			if (c3 == 6)
			{
				playw2();
			}
			if (c4 == 6)
			{
				playw2();
			}
			if (c5 == 6)
			{
				playw2();
			}
			if (c6 == 6)
			{
				playw2();
			}
			if (c7 == 6)
			{
				playw2();
			}
			if (c8 == 6)
			{
				playw2();
			}
		}
		if (t6.equals("i"))
		{
		 	ii = 2;
		 	b9 = "O";
			c1 = aa+bb+cc;
			c2 = dd+ee+ff;
			c3 = gg+hh+ii;
			c4 = aa+dd+gg;
			c5 = bb+ee+hh;
			c6 = cc+ff+ii;
			c7 = aa+ee+ii;
			c8 = cc+ee+gg;
			if (c1 == 6)
			{
				playw2();
			}
			if (c2 == 6)
			{
				playw2();
			}
			if (c3 == 6)
			{
				playw2();
			}
			if (c4 == 6)
			{
				playw2();
			}
			if (c5 == 6)
			{
				playw2();
			}
			if (c6 == 6)
			{
				playw2();
			}
			if (c7 == 6)
			{
				playw2();
			}
			if (c8 == 6)
			{
				playw2();
			}
		}
		play1();
		String t7 = scn.nextLine();
		if (t7.equals("a"))
		{
			a = 1;
		 	b1 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t7.equals("b"))
		{
		 	b = 1;
		 	b2 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t7.equals("c"))
		{
		 	c = 1;
		 	b3 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t7.equals("d"))
		{
		 	d = 1;
		 	b4 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t7.equals("e"))
		{
		 	e = 1;
		 	b5 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t7.equals("f"))
		{
		 	f = 1;
		 	b6 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t7.equals("g"))
		{
		 	g = 1;
		 	b7 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t7.equals("h"))
		{
		 	h = 1;
		 	b8 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t7.equals("i"))
		{
		 	i = 1;
		 	b9 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		play2();
		String t8 = scn.nextLine();
		if (t8.equals("a"))
		{
			aa = 2;
		 	b1 = "O";
			c1 = aa+bb+cc;
			c2 = dd+ee+ff;
			c3 = gg+hh+ii;
			c4 = aa+dd+gg;
			c5 = bb+ee+hh;
			c6 = cc+ff+ii;
			c7 = aa+ee+ii;
			c8 = cc+ee+gg;
			if (c1 == 6)
			{
				playw2();
			}
			if (c2 == 6)
			{
				playw2();
			}
			if (c3 == 6)
			{
				playw2();
			}
			if (c4 == 6)
			{
				playw2();
			}
			if (c5 == 6)
			{
				playw2();
			}
			if (c6 == 6)
			{
				playw2();
			}
			if (c7 == 6)
			{
				playw2();
			}
			if (c8 == 6)
			{
				playw2();
			}
		}
		if (t8.equals("b"))
		{
		 	bb = 2;
		 	b2 = "O";
			c1 = aa+bb+cc;
			c2 = dd+ee+ff;
			c3 = gg+hh+ii;
			c4 = aa+dd+gg;
			c5 = bb+ee+hh;
			c6 = cc+ff+ii;
			c7 = aa+ee+ii;
			c8 = cc+ee+gg;
			if (c1 == 6)
			{
				playw2();
			}
			if (c2 == 6)
			{
				playw2();
			}
			if (c3 == 6)
			{
				playw2();
			}
			if (c4 == 6)
			{
				playw2();
			}
			if (c5 == 6)
			{
				playw2();
			}
			if (c6 == 6)
			{
				playw2();
			}
			if (c7 == 6)
			{
				playw2();
			}
			if (c8 == 6)
			{
				playw2();
			}
		}
		if (t8.equals("c"))
		{
		 	cc = 2;
		 	b3 = "O";
			c1 = aa+bb+cc;
			c2 = dd+ee+ff;
			c3 = gg+hh+ii;
			c4 = aa+dd+gg;
			c5 = bb+ee+hh;
			c6 = cc+ff+ii;
			c7 = aa+ee+ii;
			c8 = cc+ee+gg;
			if (c1 == 6)
			{
				playw2();
			}
			if (c2 == 6)
			{
				playw2();
			}
			if (c3 == 6)
			{
				playw2();
			}
			if (c4 == 6)
			{
				playw2();
			}
			if (c5 == 6)
			{
				playw2();
			}
			if (c6 == 6)
			{
				playw2();
			}
			if (c7 == 6)
			{
				playw2();
			}
			if (c8 == 6)
			{
				playw2();
			}
		}
		if (t8.equals("d"))
		{
		 	dd = 2;
		 	b4 = "O";
			c1 = aa+bb+cc;
			c2 = dd+ee+ff;
			c3 = gg+hh+ii;
			c4 = aa+dd+gg;
			c5 = bb+ee+hh;
			c6 = cc+ff+ii;
			c7 = aa+ee+ii;
			c8 = cc+ee+gg;
			if (c1 == 6)
			{
				playw2();
			}
			if (c2 == 6)
			{
				playw2();
			}
			if (c3 == 6)
			{
				playw2();
			}
			if (c4 == 6)
			{
				playw2();
			}
			if (c5 == 6)
			{
				playw2();
			}
			if (c6 == 6)
			{
				playw2();
			}
			if (c7 == 6)
			{
				playw2();
			}
			if (c8 == 6)
			{
				playw2();
			}
		}
			if (t8.equals("e"))
			{
			 	ee = 2;
			 	b5 = "O";
				c1 = aa+bb+cc;
				c2 = dd+ee+ff;
				c3 = gg+hh+ii;
				c4 = aa+dd+gg;
				c5 = bb+ee+hh;
				c6 = cc+ff+ii;
				c7 = aa+ee+ii;
				c8 = cc+ee+gg;
				if (c1 == 6)
				{
					playw2();
				}
				if (c2 == 6)
				{
					playw2();
				}
				if (c3 == 6)
				{
					playw2();
				}
				if (c4 == 6)
				{
					playw2();
				}
				if (c5 == 6)
				{
					playw2();
				}
				if (c6 == 6)
				{
					playw2();
				}
				if (c7 == 6)
				{
					playw2();
				}
				if (c8 == 6)
				{
					playw2();
				}
			}
			if (t8.equals("f"))
			{
			 	ff = 2;
			 	b6 = "O";
				c1 = aa+bb+cc;
				c2 = dd+ee+ff;
				c3 = gg+hh+ii;
				c4 = aa+dd+gg;
				c5 = bb+ee+hh;
				c6 = cc+ff+ii;
				c7 = aa+ee+ii;
				c8 = cc+ee+gg;
				if (c1 == 6)
				{
					playw2();
				}
				if (c2 == 6)
				{
					playw2();
				}
				if (c3 == 6)
				{
					playw2();
				}
				if (c4 == 6)
				{
					playw2();
				}
				if (c5 == 6)
				{
					playw2();
				}
				if (c6 == 6)
				{
					playw2();
				}
				if (c7 == 6)
				{
					playw2();
				}
				if (c8 == 6)
				{
					playw2();
				}
			}
		if (t8.equals("g"))
		{
		 	gg = 2;
		 	b7 = "O";
			c1 = aa+bb+cc;
			c2 = dd+ee+ff;
			c3 = gg+hh+ii;
			c4 = aa+dd+gg;
			c5 = bb+ee+hh;
			c6 = cc+ff+ii;
			c7 = aa+ee+ii;
			c8 = cc+ee+gg;
			if (c1 == 6)
			{
				playw2();
			}
			if (c2 == 6)
			{
				playw2();
			}
			if (c3 == 6)
			{
				playw2();
			}
			if (c4 == 6)
			{
				playw2();
			}
			if (c5 == 6)
			{
				playw2();
			}
			if (c6 == 6)
			{
				playw2();
			}
			if (c7 == 6)
			{
				playw2();
			}
			if (c8 == 6)
			{
				playw2();
			}
		}
		if (t8.equals("h"))
		{
		 	hh = 2;
		 	b8 = "O";
			c1 = aa+bb+cc;
			c2 = dd+ee+ff;
			c3 = gg+hh+ii;
			c4 = aa+dd+gg;
			c5 = bb+ee+hh;
			c6 = cc+ff+ii;
			c7 = aa+ee+ii;
			c8 = cc+ee+gg;
			if (c1 == 6)
			{
				playw2();
			}
			if (c2 == 6)
			{
				playw2();
			}
			if (c3 == 6)
			{
				playw2();
			}
			if (c4 == 6)
			{
				playw2();
			}
			if (c5 == 6)
			{
				playw2();
			}
			if (c6 == 6)
			{
				playw2();
			}
			if (c7 == 6)
			{
				playw2();
			}
			if (c8 == 6)
			{
				playw2();
			}
		}
		if (t8.equals("i"))
		{
		 	ii = 2;
		 	b9 = "O";
			c1 = aa+bb+cc;
			c2 = dd+ee+ff;
			c3 = gg+hh+ii;
			c4 = aa+dd+gg;
			c5 = bb+ee+hh;
			c6 = cc+ff+ii;
			c7 = aa+ee+ii;
			c8 = cc+ee+gg;
			if (c1 == 6)
			{
				playw2();
			}
			if (c2 == 6)
			{
				playw2();
			}
			if (c3 == 6)
			{
				playw2();
			}
			if (c4 == 6)
			{
				playw2();
			}
			if (c5 == 6)
			{
				playw2();
			}
			if (c6 == 6)
			{
				playw2();
			}
			if (c7 == 6)
			{
				playw2();
			}
			if (c8 == 6)
			{
				playw2();
			}
		}
		play1();
		String t9 = scn.nextLine();
		if (t9.equals("a"))
		{
			a = 1;
		 	b1 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t9.equals("b"))
		{
		 	b = 1;
		 	b2 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t9.equals("c"))
		{
		 	c = 1;
		 	b3 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t9.equals("d"))
		{
		 	d = 1;
		 	b4 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t9.equals("e"))
		{
		 	e = 1;
		 	b5 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t9.equals("f"))
		{
		 	f = 1;
		 	b6 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t9.equals("g"))
		{
		 	g = 1;
		 	b7 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t9.equals("h"))
		{
		 	h = 1;
		 	b8 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		if (t9.equals("i"))
		{
		 	i = 1;
		 	b9 = "X";
			a1 = a+b+c;
			a2 = d+e+f;
			a3 = g+h+i;
			a4 = a+d+g;
			a5 = b+e+h;
			a6 = c+f+i;
			a7 = a+e+i;
			a8 = c+e+g;
			if (a1 == 3)
			{
				playw1();
			}
			if (a2 == 3)
			{
				playw1();
			}
			if (a3 == 3)
			{
				playw1();
			}
			if (a4 == 3)
			{
				playw1();
			}
			if (a5 == 3)
			{
				playw1();
			}
			if (a6 == 3)
			{
				playw1();
			}
			if (a7 == 3)
			{
				playw1();
			}
			if (a8 == 3)
			{
				playw1();
			}
		}
		System.out.println("It's a tie!");
		Runtime.getRuntime().exit(0);
		
		}
		
	{
		
	}

}
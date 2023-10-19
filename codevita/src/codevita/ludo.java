/*
Q2
SnakeAndLadderMarks: 30
Problem Description
Snake and Ladder is a board game consisting of snakes and ladders, where the player must reach End position, starting from Start position. Here, snake on the board makes player demotes the player to a lower numbered square and ladder promotes player to higher numbered square on the board.
For e.g., given below is the snake and ladder board, where S('pos') represents snake and 'pos' indicates where the player's coin will move down to once a player lands on that square. Similarly, L('pos') indicates ladder and 'pos' indicates where the player's coin will move up to once the player lands on that square. Player always starts from the Start square and must go towards End based on the rolls of the die.
You are supposed to find if it is possible for a player to reach the End or not, based on die inputs. If it is possible, display 'Possible' with number of snakes and ladders encountered during his/her play else display 'Not possible' along with number of snakes, number of ladders and square where the player's coin has ended at.
Note: A player can reach the end if he has the exact number on die input to reach end.
For e.g., if the player is at 99, he/she can reach end only if the die input is 1 and not any other input. So, he/she must wait till input on die is 1.
The actual Snake and Ladder board will look as depicted below. This format will be used for providing inputs.
End 99 S(2) 97 96 95 94 93 92 91
81 82 83 84 85 86 87 88 89 90
80 79 78 77 76 L(99) 74 73 72 71
61 62 S(22) 64 65 66 67 68 69 70
60 59 58 57 56 55 54 53 52 51
41 42 43 44 L(68) 46 47 48 49 50
40 39 S(6) 37 36 35 34 33 32 31
21 22 23 24 25 26 27 28 29 30
20 19 18 17 S(9) 15 14 13 12 11
Start 2 3 4 5 6 7 8 9 10
Constraints
1 <= die_inputs <= 6
Number of die inputs >= 0
Input
First 10 lines contains snake and ladder board where each line has 10 tokens separated by a space. The tokens can either be integers, Start, End, S(number), L(number) where
•	Integer denotes the square number
•	Start denotes the left bottom position on the board from where player start the game
•	End denotes the left top position on the board
•	S(number) denotes that the current square has a snake that will take you down to a square number mentioned in the parenthesis.
•	L(number) denotes that the current square has a ladder that will take you up to a square number mentioned in the parenthesis.
Second line contains die_inputs separated by a space.
Output
Find if the player is possible to reach the End or not, based on die_inputs and the board. If it is possible, display 'Possible' with number of snakes and ladders encountered during his/her play else display 'Not possible' along with number of snakes, number of ladders and the square where the player's coin has ended at.
Print all the outputs delimited by a space.
Refer Examples section for better understanding.
Time Limit (secs)
1
Examples
Input
End S(Start) 98 97 96 95 94 93 92 91
81 82 83 84 L(98) 86 87 88 89 90
80 79 S(46) 77 76 75 74 73 72 71
61 62 63 64 65 66 67 68 69 70
60 59 58 57 56 55 S(25) 53 52 51
41 42 43 L(62) 45 46 47 48 49 50
40 39 38 37 36 35 34 33 32 31
21 22 23 L(74) 25 26 27 28 29 30
20 19 18 17 S(2) 15 14 13 12 11
Start 2 3 4 5 6 7 8 9 10
5 4 2 4 1
Output
Not possible 1 0 2
Explanation
Based on die inputs, the player moves from start and goes to number 5 first on board then to 9, 11, 15 and finally to S(2) i.e., square numbered 16. Now player encountered snake which takes him to square numbered 2. So, output is 'Not possible', as the player couldn't reach the End and the number of snakes and ladders encountered during his/her play are one and zero respectively.
Example 2
Input
End 99 98 S(7) 96 95 94 93 92 91
81 82 L(99) 84 85 86 87 88 89 90
80 79 78 77 76 75 74 73 72 71
61 S(22) 63 64 65 66 67 68 69 70
61 S(22) 63 64 65 66 67 68 69 70
41 42 43 44 45 46 L(80) 48 49 50
40 39 38 37 36 35 34 33 32 31
21 22 23 L(63) 25 26 27 28 29 30
20 19 S(2) 17 16 15 14 13 12 11
Start 2 3 4 5 6 7 8 9 10
6 6 6 5 4 3 6 6 6 5 6 4 3 1
Output
Possible 1 2
Explanation
Based on the die inputs, the player encountered 1 snake and 2 ladders and was able to reach the End.

*/



package codevita;



import java.util.Arrays;
import java.util.Scanner;

public class ludo {
	
	static String []rev(String a[])
	{
		int i,c=0;
		String s[]=new String[10];
		for(i=9;i>=0;i--) {
			s[c]=a[i];
			c++;
		}
		return s;
	}
	
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
//		String inp[]= {"End 99 S(2) 97 96 95 94 93 92 91",
//						"81 82 83 84 85 86 87 88 89 90",
//						"80 79 78 77 76 L(99) 74 73 72 71",
//						"61 62 S(22) 64 65 66 67 68 69 70",
//						"60 59 58 57 56 55 54 53 52 51",
//						"41 42 43 44 L(68) 46 47 48 49 50",
//						"40 39 S(6) 37 36 35 34 33 32 31",
//						"21 22 23 24 25 26 27 28 29 30",
//						"20 19 18 17 S(9) 15 14 13 12 11",
//						"Start 2 3 4 5 6 7 8 9 10"};
		
		/*6 6 6 5 4 3 6 6 6 5 6 4 3 1*/
//		String inp[]= {"End 99 98 S(7) 96 95 94 93 92 91",
//				       "81 82 L(99) 84 85 86 87 88 89 90",
//				       "80 79 78 77 76 75 74 73 72 71",
//				       "61 S(22) 63 64 65 66 67 68 69 70",
//				       "61 S(22) 63 64 65 66 67 68 69 70",
//				       "41 42 43 44 45 46 L(80) 48 49 50",
//				       "40 39 38 37 36 35 34 33 32 31",
//				       "21 22 23 L(63) 25 26 27 28 29 30",
//				       "20 19 S(2) 17 16 15 14 13 12 11",
//				       "Start 2 3 4 5 6 7 8 9 10"};
		
		/*5 4 2 4 1*/
		String inp[]= {"End S(Start) 98 97 96 95 94 93 92 91",
				"81 82 83 84 L(98) 86 87 88 89 90",
				"80 79 S(46) 77 76 75 74 73 72 71",
				"61 62 63 64 65 66 67 68 69 70",
				"60 59 58 57 56 55 S(25) 53 52 51",
				"41 42 43 L(62) 45 46 47 48 49 50",
				"40 39 38 37 36 35 34 33 32 31",
				"21 22 23 L(74) 25 26 27 28 29 30",
				"20 19 18 17 S(2) 15 14 13 12 11",
				"Start 2 3 4 5 6 7 8 9 10"};
		
		int c=0,i,j;
		String sboard[][]=new String[10][10];
		Object board[]=new Object[100];
		
		for(i=9;i>=0;i--)
		{
//			String st=in.nextLine();
			String st=inp[c];
			String s[]=st.split(" ");
			if(i%2==0)
			{
				sboard[i]=s;
			}
			else {
				sboard[i]=rev(s);
			}
			c++;
		}
		int p=1;
		for(i=0;i<100;i++)
		{
			board[i]=p++;
		}
//		for(String a[]:sboard)
//		{
//			System.out.println(Arrays.toString(a));
//		}
//		System.out.println(Arrays.toString(board));
	/*	
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				String t=sboard[i][j];
				if(t.endsWith(")") || t.endsWith(")")) {
					String ex=t.substring(t.indexOf('(')+1, t.indexOf(t.indexOf(')')));
					System.out.println(ex);
//					int ex1=Integer.parseInt(ex);
//					if(ex1>0 && ex1<101)
//					{
//						board[ex1-1]=ex1;
//					}
				}
			}
		}*/
		
		for (i = 0; i < 10; i++) {
		    for (j = 0; j < 10; j++) {
		        String t = sboard[i][j];
		        if (t.endsWith(")") || t.equals("End") || t.equals("Start")) {
//		            int startIndex = t.indexOf('(') + 1;
//		            int endIndex = t.indexOf(')');
//		            if (startIndex != -1 && endIndex != -1) {
//		                String ex = t.substring(startIndex, endIndex);
//		                int ex1=Integer.parseInt(ex);
//						if(ex1>0 && ex1<101)
//						{
//							board[i*10+j]=ex1;
//						}
//		            }
		        	board[i*10+j]=t;
		        }
		    }
		}
		
		System.out.println(Arrays.toString(board));
		String di=in.nextLine();
		String di1[]=di.split(" ");
		int dice[]=new int[di1.length],c2=0;
		
		for(String s:di1) {
			dice[c2++]=Integer.parseInt(s);
		}
		int Player=-1,s=0,l=0;
		Object pv=new Object();
		int startIndex,endIndex,ex1 = 0;
		String ex;
		boolean bolo=false;
		
		
		
		for(i=0;i<dice.length;i++)
		{
			Player+=dice[i];
			pv=board[Player];
			String see=pv.toString();
			
			if(see.startsWith("S") && see.endsWith(")"))
			{
				startIndex = see.indexOf('(') + 1;
	            endIndex = see.indexOf(')');
	            if (startIndex != -1 && endIndex != -1) {
	                ex = see.substring(startIndex, endIndex);
	                ex1=Integer.parseInt(ex);
	                Player=ex1-1;
	            }
	            
	            s++;
			}
			else if(see.startsWith("L") && see.endsWith(")"))
			{
				startIndex = see.indexOf('(') + 1;
	            endIndex = see.indexOf(')');
	            if (startIndex != -1 && endIndex != -1) {
	                ex = see.substring(startIndex, endIndex);
	                ex1=Integer.parseInt(ex);
	                Player=ex1-1;
	            }
				l++;
			}
			
			else if(see.equals("End"))
			{
				bolo=true;
			}
//			System.out.println("player="+pv);
		}
		if(bolo)
		{
			System.out.println("possible "+s+" "+l);
		}
		else {
			System.out.println("not posssible "+s+" "+l+" "+ex1);
		}
		
		
		
		
		
		
		
		
//		for(String a[]:sboard)
//		{
//			System.out.println(Arrays.toString(a));
//		}
		
	}
}

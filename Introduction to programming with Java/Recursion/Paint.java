
public class Paint {
	public static void main(String[] args) {
		
		char[][] table = {
				{'w','w','w','w','w','w','w','w','w','w','w','w'},
				{'w',' ',' ',' ',' ','w',' ','w',' ',' ',' ','w'},
				{'w',' ',' ','w','w','w',' ','w',' ',' ',' ','w'},
				{'w',' ',' ','w',' ',' ',' ','w',' ',' ',' ','w'},
				{'w','w','w','w',' ',' ',' ','w',' ',' ',' ','w'},
				{'w',' ',' ',' ',' ',' ',' ','w','w','w','w','w'},
				{'w',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','w'},
				{'w',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','w'},
				{'w','w','w','w','w','w',' ',' ',' ',' ',' ','w'},
				{'w',' ',' ',' ',' ','w','w',' ',' ',' ',' ','w'},
				{'w',' ',' ',' ',' ',' ','w',' ',' ',' ',' ','w'},
				{'w','w','w','w','w','w','w','w','w','w','w','w'}
		};
		
		print(table);
		
		paint(table, 2,6);
		
		print(table);
	}
	
	static void paint(char[][] table, int x, int y){
		char colour = 'O';
		
		// if indexes are out of bounds
		if(x < 0 || y >= table.length){
			return;
		}
		
		if(table[x][y] == 'w'){
			return;
		}
		
		// if this cell indexes are not colored
		table[x][y] = colour;
		
		if(x-1 >= 0  && y-1 >= 0 && table[x-1][y-1] == ' '){
			paint(table, x-1, y-1);
		}
		if(x+1 < table.length && y+1 < table.length && table[x+1][y+1] == ' '){
			paint(table, x+1, y+1);
		}
		if(x-1 >= 0 && y+1 < table.length && table[x-1][y+1] == ' '){
			paint(table, x-1, y+1);
		}
		if(x+1 < table.length && y-1 >= 0 && table[x+1][y-1] == ' '){
			paint(table, x+1, y-1);
		}
		if(x-1 >= 0 && table[x-1][y] == ' '){
			paint(table, x-1, y );
		}
		if(x+1 < table.length && table[x+1][y] == ' '){
			paint(table, x+1, y);
		}
		if(y-1 >= 0 && table[x][y-1] == ' '){
			paint(table, x, y-1);
		}
		if(y+1 < table.length && table[x][y+1] == ' '){
			paint(table, x, y+1);
		}
	}
	
	static void print(char[][] table){
		
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				System.out.print(table[i][j]);
			}
			System.out.println();
		}
	}
}

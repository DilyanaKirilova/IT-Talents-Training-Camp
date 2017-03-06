
public class KnightAndKing {
	public static void main(String[] args) {
		
		char[][] table = {
				{'X','X','X','X','X','X','X','X','X','X','X','X'},
				{'X',' ',' ',' ',' ','X',' ','X',' ',' ',' ','X'},
				{'X',' ',' ','X','X','X',' ','X',' ',' ',' ','X'},
				{'X',' ',' ','X',' ',' ',' ','X',' ',' ',' ','X'},
				{'X','X','X','X',' ',' ',' ','X',' ',' ',' ','X'},
				{'X',' ',' ',' ',' ',' ',' ','X','X','X','X','X'},
				{'X',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','X'},
				{'X',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','X'},
				{'X','X','X','X','X','X',' ',' ',' ',' ',' ','X'},
				{'X',' ',' ',' ',' ','X','X',' ',' ',' ',' ','X'},
				{'X',' ',' ',' ',' ',' ','X',' ',' ',' ',' ','X'},
				{'X','X','X','X','X','X','X','X','X','X','X','X'}
		};
		
		System.out.println(canReachKing(table, 1, 3, 1, 1));
	}
	
	static boolean canReachKing(char[][] table, int fX, int fY, int sX, int sY){
		
		if(fX == sX && fY == sY){
			return true;
		}
		
		if(fX - 2 >= 0 && fY - 1 >= 0){
			if(table[fX - 2][fY - 1] == ' '){
				table[fX - 2][fY - 1] = 'X';
				return canReachKing(table, fX - 2, fY - 1, sX, sY);
			}
		}
		
		if(fX - 2 >= 0 && fY + 1 < table.length){
			if(table[fX - 2][fY + 1] == ' '){
				table[fX - 2][fY + 1] = 'X';
				return canReachKing(table, fX - 2, fY + 1, sX, sY);
			}
		}
		

		if(fX + 2 < table.length && fY - 1 >= 0){
			if(table[fX + 2][fY - 1] == ' '){
				table[fX + 2][fY - 1] = 'X';
				return canReachKing(table, fX + 2, fY - 1, sX, sY);
			}
		}
		
		if(fX + 2 < table.length && fY + 1 < table.length){
			if(table[fX + 2][fY + 1] == ' '){
				table[fX + 2][fY + 1] = 'X';
				return canReachKing(table, fX + 2, fY + 1, sX, sY);
			}
		}
		
		if(fX - 1 >= 0 && fY - 2 >= 0){
			if(table[fX - 1][fY - 2] == ' '){
				table[fX - 1][fY - 2] = 'X';
				return canReachKing(table, fX - 1, fY - 2, sX, sY);
			}
		}
		
		if(fX + 1 < table.length && fY - 2 >= 0){
			if(table[fX + 1][fY - 2] == ' '){
				table[fX + 1][fY - 2] = 'X';
				return canReachKing(table, fX + 1, fY - 2, sX, sY);
			}
		}
		
		if(fX - 1 >= 0 && fY + 2 < table.length){
			if(table[fX - 1][fY + 2] == ' '){
				table[fX - 1][fY + 2] = 'X';
				return canReachKing(table, fX - 1, fY + 2, sX, sY);
			}
		}
		
		if(fX + 1 < table.length && fY + 2 < table.length){
			if(table[fX + 1][fY + 2] == ' '){
				table[fX + 1][fY + 2] = 'X';
				return canReachKing(table, fX + 1, fY + 2, sX, sY);
			}
		}
		
		return false;
	}
}

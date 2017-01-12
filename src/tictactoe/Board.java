package tictactoe;

import java.util.ArrayList;
import java.util.Random;

public class Board {
	public String board = ("     |     |     \n"
			+ "  1  |  2  |  3  \n"
			+ "-----|-----|-----\n"
			+ "     |     |     \n"
			+ "  4  |  5  |  6  \n"
			+ "-----|-----|-----\n"
			+ "     |     |     \n"
			+ "  7  |  8  |  9  \n"
			);
	public char[] boardArray;
	public ArrayList<Integer> choicesMade = new ArrayList<Integer>();
	public void initializeBoard() {
		boardArray = board.toCharArray();
	}
	public void printBoard(){
		String printBoard = new String(boardArray);
		System.out.println(printBoard);
	}
	public void replaceFirstX(){
		boardArray[20] = 'x';
	}
	public void replaceFirstO(){
		boardArray[20] = 'o';
	}
	public void replaceSecondX(){
		boardArray[26] = 'x';
	}
	public void replaceSecondO(){
		boardArray[26] = 'o';
	}
	public void replaceThirdX(){
		boardArray[32] = 'x';
	}
	public void replaceThirdO(){
		boardArray[32] = 'o';
	}
	public void replaceFourthX(){
		boardArray[74] = 'x';
	}
	public void replaceFourthO(){
		boardArray[74] = 'o';
	}
	public void replaceFifthX(){
		boardArray[80] = 'x';
	}
	public void replaceFifthO(){
		boardArray[80] = 'o';
	}
	public void replaceSixthX(){
		boardArray[86] = 'x';
	}
	public void replaceSixthO(){
		boardArray[86] = 'o';
	}
	public void replaceSeventhX(){
		boardArray[128] = 'x';
	}
	public void replaceSeventhO(){
		boardArray[128] = 'o';
	}
	public void replaceEighthX(){
		boardArray[134] = 'x';
	}
	public void replaceEighthO(){
		boardArray[134] = 'o';
	}
	public void replaceNinthX(){
		boardArray[140] = 'x';
	}
	public void replaceNinthO(){
		boardArray[140] = 'o';
	}
	
	public void chooseSpotX(int choice){
		switch(choice){
		case 1: replaceFirstX(); break;
		case 2: replaceSecondX(); break;
		case 3: replaceThirdX(); break;
		case 4: replaceFourthX(); break;
		case 5: replaceFifthX(); break;
		case 6: replaceSixthX(); break;
		case 7: replaceSeventhX(); break;
		case 8: replaceEighthX(); break;
		case 9: replaceNinthX(); break;
		default: System.out.println("Error, please choose a valid space"); break;
	};
	}
	public void chooseSpotO(int choice){
		switch(choice){
		case 1: replaceFirstO(); break;
		case 2: replaceSecondO(); break;
		case 3: replaceThirdO(); break;
		case 4: replaceFourthO(); break;
		case 5: replaceFifthO(); break;
		case 6: replaceSixthO(); break;
		case 7: replaceSeventhO(); break;
		case 8: replaceEighthO(); break;
		case 9: replaceNinthO(); break;
		default: System.out.println("Error, please choose a valid space"); break;
	};
	}
	public void compTurnO(){
		while(true){
		Random randNum = new Random();
		int rand = randNum.nextInt(9) + 1;
		if(choicesMade.contains(rand)){	
		} else{
			switch(rand){
			case 1: replaceFirstO(); choicesMade.add(rand); break;
			case 2: replaceSecondO(); choicesMade.add(rand); break;
			case 3: replaceThirdO(); choicesMade.add(rand); break;
			case 4: replaceFourthO(); choicesMade.add(rand); break;
			case 5: replaceFifthO(); choicesMade.add(rand); break;
			case 6: replaceSixthO(); choicesMade.add(rand); break;
			case 7: replaceSeventhO(); choicesMade.add(rand); break;
			case 8: replaceEighthO(); choicesMade.add(rand); break;
			case 9: replaceNinthO(); choicesMade.add(rand); break;
			default: System.out.println("Computer Error"); break;
		};
			break;
		}
		}
	}
	public void compTurnX(){
		while(true){
		Random randNum = new Random();
		int rand = randNum.nextInt(9) + 1;
		if(choicesMade.contains(rand)){	
		} else{
			switch(rand){
			case 1: replaceFirstX(); choicesMade.add(rand); break;
			case 2: replaceSecondX(); choicesMade.add(rand); break;
			case 3: replaceThirdX(); choicesMade.add(rand); break;
			case 4: replaceFourthX(); choicesMade.add(rand); break;
			case 5: replaceFifthX(); choicesMade.add(rand); break;
			case 6: replaceSixthX(); choicesMade.add(rand); break;
			case 7: replaceSeventhX(); choicesMade.add(rand); break;
			case 8: replaceEighthX(); choicesMade.add(rand); break;
			case 9: replaceNinthX(); choicesMade.add(rand); break;
			default: System.out.println("Computer Error"); break;
		};
			break;
		}
		}
	}
	
	public boolean calculateXWin(){
		boolean xWins = false;
		if ((boardArray[20] == 'x') && (boardArray[26] == 'x') && (boardArray[32] == 'x')){
			xWins = true;
		} else if ((boardArray[20] == 'x') && (boardArray[74] == 'x') && (boardArray[128] == 'x')){
			xWins = true;
		} else if ((boardArray[20] == 'x') && (boardArray[80] == 'x') && (boardArray[140] == 'x')){
			xWins = true;
		} else if ((boardArray[26] == 'x') && (boardArray[80] == 'x') && (boardArray[134] == 'x')){
			xWins = true;
		} else if ((boardArray[32] == 'x') && (boardArray[86] == 'x') && (boardArray[140] == 'x')){
			xWins = true;
		} else if ((boardArray[74] == 'x') && (boardArray[80] == 'x') && (boardArray[86] == 'x')){
			xWins = true;
		} else if ((boardArray[128] == 'x') && (boardArray[134] == 'x') && (boardArray[140] == 'x')){
			xWins = true;
		} else if ((boardArray[128] == 'x') && (boardArray[80] == 'x') && (boardArray[32] == 'x')){
			xWins = true;
		} else {
			xWins = false;
		}
		return xWins;
	}
	public boolean calculateOWin(){
		boolean oWins = false;
		if ((boardArray[20] == 'o') && (boardArray[26] == 'o') && (boardArray[32] == 'o')){
			oWins = true;
		} else if ((boardArray[20] == 'o') && (boardArray[74] == 'o') && (boardArray[128] == 'o')){
			oWins = true;
		} else if ((boardArray[20] == 'o') && (boardArray[80] == 'o') && (boardArray[140] == 'o')){
			oWins = true;
		} else if ((boardArray[26] == 'o') && (boardArray[80] == 'o') && (boardArray[134] == 'o')){
			oWins = true;
		} else if ((boardArray[32] == 'o') && (boardArray[86] == 'o') && (boardArray[140] == 'o')){
			oWins = true;
		} else if ((boardArray[74] == 'o') && (boardArray[80] == 'o') && (boardArray[86] == 'o')){
			oWins = true;
		} else if ((boardArray[128] == 'o') && (boardArray[134] == 'o') && (boardArray[140] == 'o')){
			oWins = true;
		} else if ((boardArray[128] == 'o') && (boardArray[80] == 'o') && (boardArray[32] == 'o')){
			oWins = true;
		} else {
			oWins = false;
		}
		return oWins;
	}
	
}

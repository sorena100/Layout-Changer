package layout;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionListener;
import java.io.IOException;


public class clipboard {
  
	public Character[] toCharacterArray(String s) {
	 	   if (s == null) return null;
	 	   else{
	 	   Character[] array = new Character[s.length()];
	 	   for (int i = 0; i < s.length(); i++) {
	 	      array[i] = new Character(s.charAt(i));
	 	     
	 	   	}
	 	   return array;
	 	   }
	 }
	public String translate(Character[] chars){
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == 'a') chars[i]='ش';
			else if(chars[i] == 's') chars[i]='س';
			else if(chars[i] == 'd') chars[i]='ی';
			else if(chars[i] == 'f') chars[i]='ب';
			else if(chars[i] == 'g') chars[i]='ل';
			else if(chars[i] == 'h') chars[i]='ا';
			else if(chars[i] == 'j') chars[i]='ت';
			else if(chars[i] == 'k') chars[i]='ن';
			else if(chars[i] == 'l') chars[i]='م';
			else if(chars[i] == ';') chars[i]='ک';
			else if(chars[i] == '\'') chars[i]='گ';
			else if(chars[i] == 'q') chars[i]='ض';
			else if(chars[i] == 'w') chars[i]='ص';
			else if(chars[i] == 'e') chars[i]='ث';
			else if(chars[i] == 'r') chars[i]='ق';
			else if(chars[i] == 't') chars[i]='ف';
			else if(chars[i] == 'y') chars[i]='غ';
			else if(chars[i] == 'u') chars[i]='ع';
			else if(chars[i] == 'i') chars[i]='ه';
			else if(chars[i] == 'o') chars[i]='خ';
			else if(chars[i] == 'p') chars[i]='ح';
			else if(chars[i] == '[') chars[i]='ج';
			else if(chars[i] == ']') chars[i]='چ';
			else if(chars[i] == 'z') chars[i]='ظ';
			else if(chars[i] == 'x') chars[i]='ط';
			else if(chars[i] == 'c') chars[i]='ز';
			else if(chars[i] == 'v') chars[i]='ر';
			else if(chars[i] == 'b') chars[i]='ذ';
			else if(chars[i] == 'n') chars[i]='د';
			else if(chars[i] == 'm') chars[i]='پ';
			else if(chars[i] == ',') chars[i]='و';
			else if(chars[i] == '.') chars[i]='.';
			else if(chars[i] == '/') chars[i]='/';
			else if(chars[i] == '\\') chars[i]='\\';
			else if(chars[i] == '`') chars[i]='‍';
			else if(chars[i] == '1') chars[i]='۱';
			else if(chars[i] == '2') chars[i]='۲';
			else if(chars[i] == '3') chars[i]='۳';
			else if(chars[i] == '4') chars[i]='۴';
			else if(chars[i] == '5') chars[i]='۵';
			else if(chars[i] == '6') chars[i]='۶';
			else if(chars[i] == '7') chars[i]='۷';
			else if(chars[i] == '8') chars[i]='۸';
			else if(chars[i] == '9') chars[i]='۹';
			else if(chars[i] == '0') chars[i]='۰';
			else if(chars[i] == '-') chars[i]='-';
			else if(chars[i] == '=') chars[i]='=';
			//uperen
			else if(chars[i] == 'Z') chars[i]='ك';
			else if(chars[i] == 'X') chars[i]='ٓ';
			else if(chars[i] == 'C') chars[i]='ژ';
			else if(chars[i] == 'V') chars[i]='ٰ';
			else if(chars[i] == 'B') chars[i]='‌';
			else if(chars[i] == 'N') chars[i]='ٔ';
			else if(chars[i] == 'M') chars[i]='ء';
			else if(chars[i] == '<') chars[i]='>';
			else if(chars[i] == '>') chars[i]='<';
			else if(chars[i] == '?') chars[i]='؟';
			else if(chars[i] == '|') chars[i]='|';
			else if(chars[i] == 'A') chars[i]='ؤ';
			else if(chars[i] == 'S') chars[i]='ئ';
			else if(chars[i] == 'D') chars[i]='ي';
			else if(chars[i] == 'F') chars[i]='إ';
			else if(chars[i] == 'G') chars[i]='أ';
			else if(chars[i] == 'H') chars[i]='آ';
			else if(chars[i] == 'J') chars[i]='ة';
			else if(chars[i] == 'K') chars[i]='»';
			else if(chars[i] == 'L') chars[i]='«';
			else if(chars[i] == ';') chars[i]=':';
			else if(chars[i] == '"') chars[i]='؛';
			else if(chars[i] == 'Q') chars[i]='ْ';
			else if(chars[i] == 'W') chars[i]='ٌ';
			else if(chars[i] == 'E') chars[i]='ٍ';
			else if(chars[i] == 'R') chars[i]='ً';
			else if(chars[i] == 'T') chars[i]='ُ';
			else if(chars[i] == 'Y') chars[i]='ِ';
			else if(chars[i] == 'U') chars[i]='َ';
			else if(chars[i] == 'I') chars[i]='ّ';
			else if(chars[i] == 'O') chars[i]=']';
			else if(chars[i] == 'P') chars[i]='[';
			else if(chars[i] == '[') chars[i]='}';
			else if(chars[i] == ']') chars[i]='{';
			else if(chars[i] == '~') chars[i]='÷';
			else if(chars[i] == '!') chars[i]='!';
			else if(chars[i] == '@') chars[i]='٬';
			else if(chars[i] == '#') chars[i]='٫';
			else if(chars[i] == '$') chars[i]='﷼';
			else if(chars[i] == '%') chars[i]='٪';
			else if(chars[i] == '^') chars[i]='×';
			else if(chars[i] == '&') chars[i]='،';
			else if(chars[i] == '*') chars[i]='*';
			else if(chars[i] == '(') chars[i]=')';
			else if(chars[i] == ')') chars[i]='(';
			else if(chars[i] == '_') chars[i]='ـ';
			else if(chars[i] == '+') chars[i]='+';
			//downfa
			else if(chars[i] == 'ظ') chars[i]='z';
			else if(chars[i] == 'ط') chars[i]='x';
			else if(chars[i] == 'ز') chars[i]='c';
			else if(chars[i] == 'ر') chars[i]='v';
			else if(chars[i] == 'ذ') chars[i]='b';
			else if(chars[i] == 'د') chars[i]='n';
			else if(chars[i] == 'پ') chars[i]='m';
			else if(chars[i] == 'و') chars[i]=',';
			else if(chars[i] == '.') chars[i]='.';
			else if(chars[i] == '/') chars[i]='/';
			else if(chars[i] == '\\') chars[i]='\\';
			else if(chars[i] == 'ش') chars[i]='a';
			else if(chars[i] == 'س') chars[i]='s';
			else if(chars[i] == 'ی') chars[i]='d';
			else if(chars[i] == 'ب') chars[i]='f';
			else if(chars[i] == 'ل') chars[i]='g';
			else if(chars[i] == 'ا') chars[i]='h';
			else if(chars[i] == 'ت') chars[i]='j';
			else if(chars[i] == 'ن') chars[i]='k';
			else if(chars[i] == 'م') chars[i]='l';
			else if(chars[i] == 'ک') chars[i]=';';
			else if(chars[i] == 'گ') chars[i]='\'';
			else if(chars[i] == 'ض') chars[i]='q';
			else if(chars[i] == 'ص') chars[i]='w';
			else if(chars[i] == 'ث') chars[i]='e';
			else if(chars[i] == 'ق') chars[i]='r';
			else if(chars[i] == 'ف') chars[i]='t';
			else if(chars[i] == 'غ') chars[i]='y';
			else if(chars[i] == 'ع') chars[i]='u';
			else if(chars[i] == 'ه') chars[i]='i';
			else if(chars[i] == 'خ') chars[i]='o';
			else if(chars[i] == 'ح') chars[i]='p';
			else if(chars[i] == 'ج') chars[i]='[';
			else if(chars[i] == 'چ') chars[i]=']';
			else if(chars[i] == '‍') chars[i]='`';
			else if(chars[i] == '۱') chars[i]='1';
			else if(chars[i] == '۲') chars[i]='2';
			else if(chars[i] == '۳') chars[i]='3';
			else if(chars[i] == '۴') chars[i]='4';
			else if(chars[i] == '۵') chars[i]='5';
			else if(chars[i] == '۶') chars[i]='6';
			else if(chars[i] == '۷') chars[i]='7';
			else if(chars[i] == '۸') chars[i]='8';
			else if(chars[i] == '۹') chars[i]='9';
			else if(chars[i] == '۰') chars[i]='0';
			else if(chars[i] == '-') chars[i]='-';
			else if(chars[i] == '=') chars[i]='=';
			//uperfa
			else if(chars[i] == 'ك') chars[i]='Z';
			else if(chars[i] == 'ٓ') chars[i]='X';
			else if(chars[i] == 'ژ') chars[i]='C';
			else if(chars[i] == 'ٰ') chars[i]='V';
			else if(chars[i] == '‌') chars[i]='B';
			else if(chars[i] == 'ٔ') chars[i]='N';
			else if(chars[i] == 'ء') chars[i]='M';
			else if(chars[i] == '>') chars[i]='<';
			else if(chars[i] == '<') chars[i]='>';
			else if(chars[i] == '؟') chars[i]='?';
			else if(chars[i] == '|') chars[i]='|';
			else if(chars[i] == 'ؤ') chars[i]='A';
			else if(chars[i] == 'ئ') chars[i]='S';
			else if(chars[i] == 'ي') chars[i]='D';
			else if(chars[i] == 'إ') chars[i]='F';
			else if(chars[i] == 'أ') chars[i]='G';
			else if(chars[i] == 'آ') chars[i]='H';
			else if(chars[i] == 'ة') chars[i]='J';
			else if(chars[i] == '»') chars[i]='K';
			else if(chars[i] == '«') chars[i]='L';
			else if(chars[i] == ':') chars[i]=';';
			else if(chars[i] == '؛') chars[i]='\'';
			else if(chars[i] == 'ْ') chars[i]='Q';
			else if(chars[i] == 'ٌ') chars[i]='W';
			else if(chars[i] == 'ٍ') chars[i]='E';
			else if(chars[i] == 'ً') chars[i]='R';
			else if(chars[i] == 'ُ') chars[i]='T';
			else if(chars[i] == 'ِ') chars[i]='Y';
			else if(chars[i] == 'َ') chars[i]='U';
			else if(chars[i] == 'ّ') chars[i]='I';
			else if(chars[i] == ']') chars[i]='O';
			else if(chars[i] == '[') chars[i]='P';
			else if(chars[i] == '}') chars[i]='[';
			else if(chars[i] == '{') chars[i]=']';
			else if(chars[i] == '÷') chars[i]='~';
			else if(chars[i] == '!') chars[i]='!';
			else if(chars[i] == '٫') chars[i]='@';
			else if(chars[i] == '﷼') chars[i]='#';
			else if(chars[i] == '٪') chars[i]='$';
			else if(chars[i] == '×') chars[i]='%';
			else if(chars[i] == '،') chars[i]='^';
			else if(chars[i] == '*') chars[i]='&';
			else if(chars[i] == ')') chars[i]='(';
			else if(chars[i] == '(') chars[i]=')';
			else if(chars[i] == 'ـ') chars[i]='_';
			else if(chars[i] == '+') chars[i]='+';
		}
		
		StringBuilder sb = new StringBuilder(chars.length);
		for (Character c : chars)
		    sb.append(c.charValue());

		String str = sb.toString();
		return str;
		
	}
	public void clipmethod() throws UnsupportedFlavorException, IOException {
		Clipboard clipBoard = Toolkit.getDefaultToolkit().getSystemClipboard();
		// print the last copied thing
		Transferable t = clipBoard.getContents(null);
		if (t.isDataFlavorSupported(DataFlavor.stringFlavor))
		System.out.println("In your clipboard was : " + t.getTransferData(DataFlavor.stringFlavor));
		String clipbo = (String) t.getTransferData(DataFlavor.stringFlavor);
		Character[] ch = toCharacterArray(clipbo);
		String str = translate(ch);
		System.out.println("You wanted to write : " + str);
		//paste in clipboard 
		StringSelection data = new StringSelection(str);
		clipBoard.setContents(data, data);
		// prints NOW
		System.out.println("In your clipboard is : " + clipBoard.getContents(null).getTransferData(DataFlavor.stringFlavor));
		System.in.read();
	}
	
}

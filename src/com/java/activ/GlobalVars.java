package com.java.activ;

public class GlobalVars
{
	public String[] KeysNames;
	public int[] KeysIntId;
	public static int userchoice=0;

	public GlobalVars()
	{
		KeysNames = new String[117];
		KeysIntId = new int[117];
		KeysIntId[0] = 1;			KeysNames[0] = "Left mouse button";
		KeysIntId[1] = 2;	 		KeysNames[1] = "Right mouse button";
		KeysIntId[2] = 3;	 		KeysNames[2] = "Control-break processing";
		KeysIntId[3] = 4;  			KeysNames[3] = "Middle mouse button";
		KeysIntId[4] = 8;  			KeysNames[4] = "BACKSPACE key";
		KeysIntId[5] = 9;  			KeysNames[5] = "TAB key";
		KeysIntId[6] = 12; 			KeysNames[6] = "CLEAR key";
		KeysIntId[7] = 13;			KeysNames[7] = "ENTER key";
		KeysIntId[8] = 16;			KeysNames[8] = "SHIFT key";
		KeysIntId[9] = 17;			KeysNames[9] = "CTRL key";
		KeysIntId[10] = 18;			KeysNames[10] = "ALT key";
		KeysIntId[11] = 0x13;		KeysNames[11] = "PAUSE key";
		KeysIntId[12] = 0x14;	 	KeysNames[12] = "CAPS LOCK key";
		KeysIntId[13] = 0x1B;		KeysNames[13] = "ESC key";
		KeysIntId[14] = 0x20;		KeysNames[14] = "SPACEBAR";
		KeysIntId[15] = 0x21;		KeysNames[15] = "PAGE UP key";
		KeysIntId[16] = 0x22;		KeysNames[16] = "PAGE DOWN key";
		KeysIntId[17] = 0x23;		KeysNames[17] = "END key";
		KeysIntId[18] = 0x24;		KeysNames[18] = "HOME key";
		KeysIntId[19] = 0x25;		KeysNames[19] = "LEFT ARROW key";
		KeysIntId[20] = 0x26;		KeysNames[20] = "UP ARROW key";
		KeysIntId[21] = 0x27;		KeysNames[21] = "RIGHT ARROW key";
		KeysIntId[22] = 0x28;		KeysNames[22] = "DOWN ARROW key";
		KeysIntId[23] = 0x29;		KeysNames[23] = "SELECT key";
		KeysIntId[24] = 0x2B;		KeysNames[24] = "EXECUTE key";
		KeysIntId[25] = 0x2C;		KeysNames[25] = "PRINT SCREEN key";
		KeysIntId[26] = 0x2D;		KeysNames[26] = "INS key";
		KeysIntId[27] = 0x2E;		KeysNames[27] = "DEL key";
		KeysIntId[28] = 0x2F;		KeysNames[28] = "HELP key";
		KeysIntId[29] = 0x30;		KeysNames[29] = "0 key";
		KeysIntId[30] = 0x31;		KeysNames[30] = "1 key";
		KeysIntId[31] = 0x32;		KeysNames[31] = "2 key";
		KeysIntId[32] = 0x33;		KeysNames[32] = "3 key";
		KeysIntId[33] = 0x34;		KeysNames[33] = "4 key";
		KeysIntId[34] = 0x35;		KeysNames[34] = "5 key";
		KeysIntId[35] = 0x36;		KeysNames[35] = "6 key";
		KeysIntId[36] = 0x37;		KeysNames[36] = "7 key";
		KeysIntId[37] = 0x38;		KeysNames[37] = "8 key";
		KeysIntId[38] = 0x39;		KeysNames[38] = "9 key";
		KeysIntId[39] = 0x41;		KeysNames[39] = "A key";
		KeysIntId[40] = 0x42;		KeysNames[40] = "B key";
		KeysIntId[41] = 0x43;		KeysNames[41] = "C key";
		KeysIntId[42] = 0x44;		KeysNames[42] = "D key";
		KeysIntId[43] = 0x45;		KeysNames[43] = "E key";
		KeysIntId[44] = 0x46;		KeysNames[44] = "F key";
		KeysIntId[45] = 0x47;		KeysNames[45] = "G key";
		KeysIntId[46] = 0x48;		KeysNames[46] = "H key";
		KeysIntId[47] = 0x49;		KeysNames[47] = "I key";
		KeysIntId[48] = 0x4A;		KeysNames[48] = "J key";
		KeysIntId[49] = 0x4B;		KeysNames[49] = "K key";
		KeysIntId[50] = 0x4C;		KeysNames[50] = "L key";
		KeysIntId[51] = 0x4D;		KeysNames[51] = "M key";
		KeysIntId[52] = 0x4E;		KeysNames[52] = "N key";
		KeysIntId[53] = 0x4F;		KeysNames[53] = "O key";
		KeysIntId[54] = 0x50;		KeysNames[54] = "P key";
		KeysIntId[55] = 0x51;		KeysNames[55] = "Q key";
		KeysIntId[56] = 0x52;		KeysNames[56] = "R key";
		KeysIntId[57] = 0x53;		KeysNames[57] = "S key";
		KeysIntId[58] = 0x54;		KeysNames[58] = "T key";
		KeysIntId[59] = 0x55;		KeysNames[59] = "U key";
		KeysIntId[60] = 0x56;		KeysNames[60] = "V key";
		KeysIntId[61] = 0x57;		KeysNames[61] = "W key";
		KeysIntId[62] = 0x58;		KeysNames[62] = "X key";
		KeysIntId[63] = 0x59;		KeysNames[63] = "Y key";
		KeysIntId[64] = 0x5A;		KeysNames[64] = "Z key";
		KeysIntId[65] = 0x5B;		KeysNames[65] = "Left Windows key";
		KeysIntId[66] = 0x5C;		KeysNames[66] = "Right Windows key";
		KeysIntId[67] = 0x5D;		KeysNames[67] = "Applications key";
		KeysIntId[68] = 0x60;		KeysNames[68] = "Numeric keypad 0 key";
		KeysIntId[69] = 0x61;		KeysNames[69] = "Numeric keypad 1 key";
		KeysIntId[70] = 0x62;		KeysNames[70] = "Numeric keypad 2 key";
		KeysIntId[71] = 0x63;		KeysNames[71] = "Numeric keypad 3 key";
		KeysIntId[72] = 0x64;		KeysNames[72] = "Numeric keypad 4 key";
		KeysIntId[73] = 0x65;		KeysNames[73] = "Numeric keypad 5 key";
		KeysIntId[74] = 0x66;		KeysNames[74] = "Numeric keypad 6 key";
		KeysIntId[75] = 0x67;		KeysNames[75] = "Numeric keypad 7 key";
		KeysIntId[76] = 0x68;		KeysNames[76] = "Numeric keypad 8 key";
		KeysIntId[77] = 0x69;		KeysNames[77] = "Numeric keypad 9 key";
		KeysIntId[78] = 0x6A;		KeysNames[78] = "Multiply key";
		KeysIntId[79] = 0x6B;		KeysNames[79] = "Add key";
		KeysIntId[80] = 0x6C;		KeysNames[80] = "Separator key";
		KeysIntId[81] = 0x6D;		KeysNames[81] = "Subtract key";
		KeysIntId[82] = 0x6E;		KeysNames[82] = "Decimal key";
		KeysIntId[83] = 0x6F;		KeysNames[83] = "Divide key";
		KeysIntId[84] = 0x70;		KeysNames[84] = "F1 key";
		KeysIntId[85] = 0x71;		KeysNames[85] = "F2 key";
		KeysIntId[86] = 0x72;		KeysNames[86] = "F3 key";
		KeysIntId[87] = 0x73;		KeysNames[87] = "F4 key";
		KeysIntId[88] = 0x74;		KeysNames[88] = "F5 key";
		KeysIntId[89] = 0x75;		KeysNames[89] = "F6 key";
		KeysIntId[90] = 0x76;		KeysNames[90] = "F7 key";
		KeysIntId[91] = 0x77;		KeysNames[91] = "F8 key";
		KeysIntId[92] = 0x78;		KeysNames[92] = "F9 key";
		KeysIntId[93] = 0x79;		KeysNames[93] = "F10 key";
		KeysIntId[94] = 0x7A;		KeysNames[94] = "F11 key";
		KeysIntId[95] = 0x7B;		KeysNames[95] = "F12 key";
		KeysIntId[96] = 0x7C;		KeysNames[96] = "F13 key";
		KeysIntId[97] = 0x7D;		KeysNames[97] = "F14 key";
		KeysIntId[98] = 0x7E;		KeysNames[98] = "F15 key";
		KeysIntId[99] = 0x7F;		KeysNames[99] = "F16 key";
		KeysIntId[100] = 0x80;		KeysNames[100] = "F17 key";
		KeysIntId[101] = 0x81;		KeysNames[101] = "F18 key";
		KeysIntId[102] = 0x82;		KeysNames[102] = "F19 key";
		KeysIntId[103] = 0x83;		KeysNames[103] = "F20 key";
		KeysIntId[104] = 0x84;		KeysNames[104] = "F21 key";
		KeysIntId[105] = 0x85;		KeysNames[105] = "F22 key";
		KeysIntId[106] = 0x86;		KeysNames[106] = "F23 key";
		KeysIntId[107] = 0x87;		KeysNames[107] = "F24 key";
		KeysIntId[108] = 0x90;		KeysNames[108] = "NUMLOCK key";
		KeysIntId[109] = 0x91;		KeysNames[109] = "SCROLL LOCK key";
		KeysIntId[110] = 0xF6;		KeysNames[110] = "Attn key";
		KeysIntId[111] = 0xF7;		KeysNames[111] = "CrSel key";
		KeysIntId[112] = 0xF8;		KeysNames[112] = "ExSel key";
		KeysIntId[113] = 0xF9;		KeysNames[113] = "Erase EOF key";
		KeysIntId[114] = 0xFA;		KeysNames[114] = "Play key";
		KeysIntId[115] = 0xFB;		KeysNames[115] = "Zoom key";
		KeysIntId[116] = 0xFE;		KeysNames[116] = "Clear key";
	}
	public CharSequence GetKeyName(int position)
	{
		return KeysNames[position];
	}
	public int GetKeyId(int position)
	{
		return KeysIntId[position];
	}
}

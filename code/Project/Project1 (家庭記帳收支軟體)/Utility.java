import java.util.Scanner;
/**
Utility�u�����G
�N���P���\��ʸˬ���ơA�N�O�i�H�����q�L�եΨ�ƨϥΥ����\��A�ӵL�ݦҼ{���骺�\���{�Ӹ`�C
*/
public class Utility {
    private static Scanner scanner = new Scanner(System.in);
    /**
	�Ω�ɭ���檺��ܡC�Ө��Ū����L�A�p�G�Τ���J��1��-��4���������N�r�šA�h��ƪ�^�C��^�Ȭ��Τ���J�r�šC
	*/
	public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("��ܿ��~�A�Э��s��J�G");
            } else break;
        }
        return c;
    }
	/**
	�Ω󦬤J�M��X���B����J�C�Ө�Ʊq��LŪ���@�Ӥ��W�L4����ת���ơA�ñN��@����ƪ���^�ȡC
	*/
    public static int readNumber() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(6);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("�Ʀr��J���~�A�Э��s��J�G");
            }
        }
        return n;
    }
	/**
	�Ω󦬤J�M��X��������J�C�Ө�Ʊq��LŪ���@�Ӥ��W�L8����ת��r�Ŧ�A�ñN��@����ƪ���^�ȡC
	*/
    public static String readString() {
        String str = readKeyBoard(8);
        return str;
    }
	
	/**
	�Ω�T�{��ܪ���J�C�Ө�Ʊq��LŪ����Y���Ρ�N���A�ñN��@����ƪ���^�ȡC
	*/
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1).toUpperCase();	// ��J�p�g�]OK
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("��ܿ��~�A�Э��s��J�G");
            }
        }
        return c;
    }
	
	
    private static String readKeyBoard(int limit) {
        String line = "";

        while (scanner.hasNext()) {
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("��J���ס]���j��" + limit + "�^���~�A�Э��s��J�G");
                continue;
            }
            break;
        }

        return line;
    }
}
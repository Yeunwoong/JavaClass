package intro;

public class Reference {

}

interface PhoneInterface { // �������̽� ����
	final int TIMEOUT = 10000; // ��� �ʵ� ����
	void sendCall(); // �߻� �޼ҵ�
	void receiveCall(); // �߻� �޼ҵ�
	default void printLogo() { // default �޼ҵ�
		System.out.println("** Phone **");
	}
}


interface MobilePhoneInterface extends PhoneInterface {
	void sendSMS(); 		// ���ο� �߻� �޼ҵ� �߰�
	void receiveSMS(); 	// ���ο� �߻� �޼ҵ� �߰�
	default void printLogo() { // default �޼ҵ�
		System.out.println("** MobilePhoneInterface **");
	}
}

interface MP3Interface extends PhoneInterface{
	void play(); // �߻� �޼ҵ�
	void stop(); // �߻� �޼ҵ�
	default void printLogo() { // default �޼ҵ�
		System.out.println("** MobilePhoneInterface **");
	}
}

interface MusicPhoneInterface extends MobilePhoneInterface, MP3Interface {
	void playMP3RingTone(); // ���ο� �߻� �޼ҵ� �߰�
}

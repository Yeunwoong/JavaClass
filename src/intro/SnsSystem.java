package intro;

public class SnsSystem {
	public static void main(String[] args) {
		// Fan�� Celebrity�� ����
		Celebrity bts = new Celebrity();
		Fan army = new Fan(bts);
		
		// Celebrity�� ���� ��ȭ
		bts.setStatus("���ƿ�", "�¶��� �ܼ�Ʈ�� �����մϴ�!");
		
		// ���� ����
		army.cancelFollowing(bts);
		
		// Celebrity�� ���� ��ȭ
		bts.setStatus("���ƿ�22", "�¶��� �ܼ�Ʈ�� �����մϴ�!22");
	}
}

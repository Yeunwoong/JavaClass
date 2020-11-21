package intro;

public class SnsSystem {
	public static void main(String[] args) {
		// Fan이 Celebrity를 구독
		Celebrity bts = new Celebrity();
		Fan army = new Fan(bts);
		
		// Celebrity의 상태 변화
		bts.setStatus("좋아요", "온라인 콘서트를 시작합니다!");
		
		// 구독 해제
		army.cancelFollowing(bts);
		
		// Celebrity의 상태 변화
		bts.setStatus("좋아요22", "온라인 콘서트를 시작합니다!22");
	}
}

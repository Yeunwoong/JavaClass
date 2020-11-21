package intro;

public class Fan implements Observer {
	private String status;
	private String message;
	
	public Fan(Subject celebrity) {		
		celebrity.registerObserver(this);
	}

	@Override
	public void update(String status, String message) {
		this.status = status;
		this.message = message;
		display();
	}
	
	public void display() {
		System.out.println("상태 변화 알림: " + status + " , 메시지: " + message);
		System.out.println();
	}
	
	public void cancelFollowing(Subject celebrity) {
		celebrity.removeObserver(this);
	}
}

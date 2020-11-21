package intro;

import java.util.ArrayList;

public class Celebrity implements Subject {
	private ArrayList<Observer> fans;
	private String status;
	private String message;
	
	public Celebrity() {
		fans = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		fans.add(o);
		System.out.print("구독자가 등록되었습니다.");
		System.out.println();
	}
	
	@Override
	public void removeObserver(Observer o) {
		fans.remove(o);
		System.out.print("구독자가 해제되었습니다.");
		System.out.println();
	}
	
	@Override
	public void notifyObserver() {
		for(int i=0; i<fans.size(); i++) {
			Observer fan = (Observer)fans.get(i);
			fan.update(status, message);
		}		
	}
	
	public void statusChanged() {
		notifyObserver();
	}
	
	public void setStatus(String status, String message) {
		this.status = status;
		this.message = message;
		statusChanged();
	}	
}

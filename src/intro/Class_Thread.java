package intro;

import java.lang.management.ManagementFactory;

public class Class_Thread {
	public static void main(String[] args) {
		final String jvmName = ManagementFactory.getRuntimeMXBean().getName();
		//System.out.println(jvmName);
		final int index = jvmName.indexOf('@');
		//System.out.println(Long.toString(Long.parseLong(jvmName.substring(0, index))));
		
		//System.out.println(Thread.currentThread().getName());
		//System.out.println(Thread.currentThread().getId());
		//System.out.println(Thread.currentThread().getPriority());
		
		
		
		TimerThread th = new  TimerThread();
		//th.start();
		TimerThread2 th2 = new TimerThread2();
		//th2.start();
		/*
		try {
			//Thread.sleep(5000);			
		} catch(InterruptedException e){
			return;
		}
		//th.interrupt(); // TimerThread 강제 종료
		//th2.interrupt();
		*/
		
		
		SharedBoard board = new SharedBoard(); 
		StudentThread th3 = new StudentThread("KYW", board);
		StudentThread th4 = new StudentThread("LWG", board);
		th3.start();
		th4.start();

	}
}

class SharedBoard {
	private int sum = 0; // 집계판의 합
	synchronized public void add() {
		int n = sum;		
		n += 10; // 10 증가
		sum = n; // 증가한 값을 집계합에 기록
		System.out.println(Thread.currentThread().getName() 
				+ Thread.currentThread().getId() + " : " + sum);		
	}
	public int getSum() { return sum; }
}

class StudentThread extends Thread {
	private SharedBoard board; // 집계판의 주소
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	
	@Override
	public void run() {
		try {
			for(int i=0; i<10; i++)
				board.add();
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}


class TimerThread extends Thread {
	private int n = 0;
	@Override
	public void run() {
		while(true) {
			System.out.println(n); // 화면에 카운트 값 출력
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getId());
			System.out.println(Thread.currentThread().getPriority());
			n++;
			
			
			try {
				sleep(1000);				
			}
			catch(InterruptedException e){
				return;
			}
		}
	}
}




class TimerThread3 extends Thread {
	private int n = 0;
	private char ch = 'A';
	private boolean flag = false; // false로 초기화
	public void finish() { flag = true; }
	
	@Override
	public void run() {
		while(true) {
			System.out.println(ch++); // 화면에 카운트 값 출력
			n++;
			try {
				sleep(1000);
				System.out.println(Thread.currentThread().getName() + " , " 
							+ Thread.currentThread().getId() + " , "
							+ Thread.currentThread().getPriority());				
				if(flag == true)
					return; // 스레드 종료
			}
			catch(InterruptedException e){
				return;
			}
		}
	}
}

class TimerThread2 extends Thread {
	private int n = 0;
	private boolean flag = false; // false로 초기화
	public void finish() { flag = true; }
	
	@Override
	public void run() {
		while(true) {
			System.out.println(n); // 화면에 카운트 값 출력
			n++;
			
			try {
				sleep(1000);
				System.out.println(Thread.currentThread().getName() + " , " 
						+ Thread.currentThread().getId()+ " , "
						+ Thread.currentThread().getPriority());				
				if(flag == true)
					return; // 스레드 종료
			}
			catch(InterruptedException e){
				return;
			}
		}
	}
}



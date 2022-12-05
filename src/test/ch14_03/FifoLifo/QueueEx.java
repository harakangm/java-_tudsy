package test.ch14_03.FifoLifo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		//Queue 인터페이스 LinkedList 구현클래스
		//자동형변환
		Queue<Message> mesgQ = new LinkedList<Message>();
		
		//메세지넣기
		//선입선출 먼저들온 객체가 먼자 값이 나옴
		mesgQ.offer(new Message("sendMain", "홍길동"));
		mesgQ.offer(new Message("sendSMS", "홍길동"));
		mesgQ.offer(new Message("SendKAKAO", "홍길동"));
		
		while(!mesgQ.isEmpty()) {
			Message message = mesgQ.poll();
			System.out.println(message.command + ", " + message.to);
		}

	}

}

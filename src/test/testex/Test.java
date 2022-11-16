package test.testex;

public class Test {
		boolean isPowerOn;
		int channel;
		int volume;
		final int MAX_VOLUME = 100;
		final int MIN_VOLUME = 0;
		final int MAX_CHANNEL = 100;
		final int MIN_CHANNEL = 1;

		void turnOnOff() {
			if(isPowerOn == false) {
				isPowerOn = true;
			}else {
				isPowerOn = false;
			}
		}

		void volumeUp() {
			if (MAX_VOLUME > volume) {
				volume++;
			}else {
				volume = MAX_VOLUME;
			}
		}

		void volumeDown() {
			if (MIN_VOLUME < volume) {
				volume--;
			}else {
				volume = MIN_VOLUME;
		}
	}

		void channelUp() {
			channel ++ ;
			
			if(MAX_CHANNEL == channel) {
				channel = MIN_CHANNEL;
			}
			
			// (4) channel의 값을 1증가시킨다.
			// 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
		}

		void channelDown() {
			channel --;
			
			if (MIN_CHANNEL == channel) {
				channel = MAX_CHANNEL;
			}
			// (5) channel의 값을 1감소시킨다.
			// 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
		}


}

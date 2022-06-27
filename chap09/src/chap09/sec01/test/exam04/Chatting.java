package chap09.sec01.test.exam04;

public class Chatting {
	
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		
		class Chat {
			public void start() {
				while(true) {
					String input = "¾È³ç";
					String message = "[" + nickName + "]" + input;
					sendMessage(message);
				}
			}
			
			void sendMessage(String message) {
			}
		}
		
		Chat c = new Chat();
		c.start();
	}
}

public class Chat {
	String sender;
	String reciver;
	boolean isread;
	
	public Chat(String sender,String reciver,boolean isread){
		this.sender=sender;
		this.reciver=reciver;
		this.isread=isread;
	}
	public static void main(String[] args) {
    Chat chat1 = new Chat("Kavana", "Sindhu", true);
	Chat chat2 = new Chat("Kavya", "Nandlala", false);
	Chat chat3 = new Chat("Darsh", "Kavya", true);
	Chat chat4 = new Chat("Kavana", "Sindhu", true);
	Chat chat5 = new Chat("Sagar", "Sindhu", true);
	
	System.out.println("Chat1:" + chat1.sender+","+chat1.reciver+","+chat1.isread);
	System.out.println("Chat2:" + chat2.sender+","+chat2.reciver+","+chat2.isread);
	System.out.println("Chat3:" + chat3.sender+","+chat3.reciver+","+chat3.isread);
	System.out.println("Chat4:" + chat4.sender+","+chat4.reciver+","+chat4.isread);
	System.out.println("Chat5:" + chat5.sender+","+chat5.reciver+","+chat5.isread);
	}
}
 
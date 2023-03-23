
public class ConsumerImp implements Consumer {

private MessageService service;
	
	public ConsumerImp(MessageService svc){
		this.service=svc;
	}
	
	@Override
	public void processMessages(String msg, String rec){
		//do some msg validation, manipulation logic etc
		this.service.sendMessage(msg, rec);
	}

}

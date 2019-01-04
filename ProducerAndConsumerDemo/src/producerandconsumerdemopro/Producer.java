package producerandconsumerdemopro;

public class Producer implements Runnable{
	private Resource res;
	Producer(Resource res){
		this.res = res;
	}
	public void run(){
		while(true){
			try {
				res.set("商品");
			}catch (InterruptedException e){}
		}
	}
}

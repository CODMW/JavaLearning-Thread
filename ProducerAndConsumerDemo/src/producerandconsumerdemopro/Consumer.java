package producerandconsumerdemopro;

public class Consumer implements Runnable {
	private Resource res;
	Consumer(Resource res){
		this.res = res;
	}
	public void run(){
		while(true){
			try {
				res.out();
			}catch (InterruptedException E){}
		}
	}
}

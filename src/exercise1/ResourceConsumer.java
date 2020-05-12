package exercise1;

public class ResourceConsumer implements Runnable {

    private Resource resource;

    public ResourceConsumer(Resource r) {
        this.resource = r;
    }

    @Override
    public void run() {
        while (true){
            this.resource.use();
        }
    }
}

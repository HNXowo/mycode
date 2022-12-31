abstract class Phone implements Canplaymusic,CanwaterProof{
    String name;
    Phone(String name){
        this.name=name;
    }
    void Call(){
        System.out.println(this.name+"is calling");
    }
    void sendMsg(){
        System.out.println(this.name+"is sending massages");
    }
    public void waterProof(){
        System.out.println(this.name+"can waterProof");
    }
    public void music(){
        System.out.println(this.name+"can play music");
    }
}
    interface CanwaterProof {
    void waterProof();
    }
    interface Canplaymusic {
        void music();
    }

class Project extends Phone{
    Project(String name){
        super(name);
    }
    void photo(){
        System.out.println(this.name+"is taking photos");
    }
    void video(){
        System.out.println(this.name+"is taking video");
    }
}


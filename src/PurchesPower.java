public abstract class PurchesPower {
    protected static final double BASE=1000;
    protected PurchesPower sucessor;

    abstract protected double getAllowable();
    abstract protected  String getRole();

    public void setSucessor(PurchesPower sucessor){
        this.sucessor=sucessor;
    }

    public PurchesPower getSucessor(){
        return sucessor;
    }

    public void processRequest(PurchesRequest request){
        if(request.getAmount()<this.getAllowable()){
            System.out.println(this.getRole()+"will aprove $ "+request.getAmount());
        }else if (sucessor!=null){
            sucessor.processRequest(request);
        }
    }
}

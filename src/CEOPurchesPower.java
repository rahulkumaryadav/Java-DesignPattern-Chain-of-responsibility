public class CEOPurchesPower extends PurchesPower{


    @Override
    protected double getAllowable() {
        return BASE * 100000;
    }

    @Override
    protected String getRole() {
        return "CEO";
    }
}

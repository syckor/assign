public class Taxi extends PublicTransit{

    private int basicFee = 3000;
    private int feePerDist = 1000;
    private int basicDist = 1;
    private int income = 0;
    private String dest = "";
    private int distanceToDest = 0;
    private int taxiFee = basicFee*distanceToDest*feePerDist;
    public int getBasicFee() {
        return basicFee;
    }

    public int getFeePerDist() {
        return feePerDist;
    }

    public int getBasicDist() {
        return basicDist;
    }

    Taxi(int num){
        this.setNum(num);
        this.setGas(100);
        this.setMaxPassenger(4);
        this.changeState("일반");
    }

    @Override
    public void addGas(int addGas){
        super.addGas(addGas);
        if(this.getGas() == 0){
            this.changeState("운행불가");
            System.out.println("기름이 부족하여 " + this.getState() + " 합니다.");
        }else if(this.getGas() < 10){
            System.out.println("주유가 필요합니다.");
        }
    }

    public void setDest(String dest, int distanceToDest){
        this.dest = dest;
        this.changeState("운행중");
        this.distanceToDest = distanceToDest;
        this.taxiFee = this.basicFee + this.feePerDist*distanceToDest;
    }

    public void arrival(){
        this.income += taxiFee;
        this.changeState("일반");
        this.distanceToDest = 0;
        this.taxiFee = 0;
        this.dest = "";
    }
    public String getDest() {
        return dest;
    }

    public int getDistanceToDest() {
        return distanceToDest;
    }

    public int getTaxiFee() {
        return taxiFee;
    }

    public int getIncome() {
        return income;
    }
}

public class PublicTransit {
    //data
    private int num;
    private int gas = 100;
    private int speed = 0;
    private int maxPassenger;
    private String state;
    private int passenger;

    public void addSpeed(int addSpeed){
        if(this.speed + addSpeed <0){
            System.out.println("속도는 0보다 작을 수 없습니다.");
        }else{
            this.speed += addSpeed;
        }

    }
    public void addGas(int addGas){
        this.gas += addGas;
    }

    public void addPassenger(int addPassenger){

        if(this.passenger + addPassenger <= this.maxPassenger){
            this.passenger += addPassenger;
        }else{
            System.out.println("최대 승객수 초과");
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getGas() {
        if(this.gas == 0) System.out.println("주유 필요");
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getSpeed() {
        return speed;
    }


    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public String getState() {
        return state;
    }

    public void changeState(String state) {
        this.state = state;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }
}

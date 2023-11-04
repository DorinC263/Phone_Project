class Iphone extends Phone{
    public String imei;

    public Iphone(String model, int baterryLife,String color,String material, String imei){
        super("Iphone",model,baterryLife,color,material);
        this.imei = imei;
    }


}

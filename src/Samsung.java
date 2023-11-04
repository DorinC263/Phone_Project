class Samsung extends Phone {
    public String imei;

    public Samsung(String model, int baterryLife,String color,String material, String imei){
        super("Samsung",model,baterryLife,color,material);
        this.imei = imei;
    }
}

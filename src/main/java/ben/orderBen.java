package ben;
/*
* 订单实体类
* */
public class orderBen {
    private int order_id;
    private int order_shop;
    private int order_att; //订单归属
    private String order_time;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getOrder_shop() {
        return order_shop;
    }

    public void setOrder_shop(int order_shop) {
        this.order_shop = order_shop;
    }

    public int getOrder_att() {
        return order_att;
    }

    public void setOrder_att(int order_att) {
        this.order_att = order_att;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public orderBen(int order_id, int order_shop, int order_att, String order_time) {
        this.order_id = order_id;
        this.order_shop = order_shop;
        this.order_att = order_att;
        this.order_time = order_time;
    }
}

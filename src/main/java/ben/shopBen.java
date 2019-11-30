package ben;
/*
* 商品实体类
* */
public class shopBen {
    private int shop_id;
    private String shop_name;
    private String shop_info;
    private double shop_price;
    private int shop_type;

    public int getShop_id() {
        return shop_id;
    }

    public void setShop_id(int shop_id) {
        this.shop_id = shop_id;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getShop_info() {
        return shop_info;
    }

    public void setShop_info(String shop_info) {
        this.shop_info = shop_info;
    }

    public double getShop_price() {
        return shop_price;
    }

    public void setShop_price(double shop_price) {
        this.shop_price = shop_price;
    }

    public int getShop_type() {
        return shop_type;
    }

    public void setShop_type(int shop_type) {
        this.shop_type = shop_type;
    }

    public shopBen(int shop_id, String shop_name, String shop_info, double shop_price, int shop_type) {
        this.shop_id = shop_id;
        this.shop_name = shop_name;
        this.shop_info = shop_info;
        this.shop_price = shop_price;
        this.shop_type = shop_type;
    }
}

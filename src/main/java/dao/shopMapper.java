package dao;

import ben.shopBen;

import java.util.List;

public interface shopMapper {
    public List<shopBen> queryShop();

    public boolean upShop(shopBen shop);

    public boolean deShop(int shop_id);

    public boolean addShop(shopBen shop);
}

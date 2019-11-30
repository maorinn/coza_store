package dao;

import ben.orderBen;

import java.util.List;

public interface orderMapper {
    public List<orderBen> queryOrder();

    public boolean upOrder(orderBen order);

    public boolean deOrder(int order_id);

    public boolean addOrder(orderBen order);
}

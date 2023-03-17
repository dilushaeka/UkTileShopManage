package lk.ijse.UkTileShopManage.dao;

import lk.ijse.UkTileShopManage.dao.custom.impl.*;

public class DAOFactory {
    private static DAOFactory daoFactory;
    private DAOFactory() { }
    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory(); }
        return daoFactory; }
    public lk.ijse.UkTileShopManage.dao.SuperDAO getDAO(DAOTypes Types) {
        switch (Types) {
            case CUSTOMER:
                return new CustomerDAOImpl();
            case SUPLAY:
                return new SuplayDAOImpl();
            case CASHIER:
                return new CashierDAOImpl();
            case ITEM:
                return new ItemDAOImpl();
            case ORDERDETAILS:
                return new OrderdetailDAOImpl();
            case ORDER:
                return new OrdersDAOImpl();
            case QUERYDAO:
                return new QueryDAOImpl();
            case PAYMENT:
                return new PaymentDAOImpl();

            default:
                return null; } }
    public enum DAOTypes {
        CUSTOMER, QUERYDAO, ITEM, ORDER, ORDERDETAILS, BATCH, CASHIER, PAYMENT, SUPLAY,
    }
}
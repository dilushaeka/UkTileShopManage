package lk.ijse.UkTileShopManage.service.custom;

import lk.ijse.UkTileShopManage.dto.CustomerDTO;
import javafx.collections.ObservableList;
import lk.ijse.UkTileShopManage.service.SuperBO;

import java.sql.SQLException;

public interface CustomerBO extends SuperBO {
    boolean addCustomer(CustomerDTO customer) throws ClassNotFoundException, SQLException;

    boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException;

    boolean updateCustomer(CustomerDTO id) throws ClassNotFoundException, SQLException;

    CustomerDTO searchCustomer(String id) throws ClassNotFoundException, SQLException;

    ObservableList<CustomerDTO> getAllCustomer() throws ClassNotFoundException, SQLException;

    int getRowCount()throws ClassNotFoundException,SQLException;

}


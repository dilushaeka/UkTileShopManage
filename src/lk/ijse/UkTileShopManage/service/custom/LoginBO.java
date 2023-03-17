package lk.ijse.UkTileShopManage.service.custom;

import lk.ijse.UkTileShopManage.dto.CashierDTO;
import lk.ijse.UkTileShopManage.service.SuperBO;

import java.sql.SQLException;

public interface LoginBO extends SuperBO {
    CashierDTO getValidated(String userName) throws SQLException, ClassNotFoundException;
}

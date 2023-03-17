package lk.ijse.UkTileShopManage.service.custom;

import lk.ijse.UkTileShopManage.dto.SuplayDTO;
import javafx.collections.ObservableList;
import lk.ijse.UkTileShopManage.service.SuperBO;

import java.sql.SQLException;

public interface SuplayBO extends SuperBO {
    boolean addSuplay(SuplayDTO suplay) throws ClassNotFoundException, SQLException;

    boolean deleteSuplay(String id) throws ClassNotFoundException, SQLException;

    boolean updateSuplay(SuplayDTO suplay) throws ClassNotFoundException, SQLException;

    SuplayDTO searchSuplay(String id) throws ClassNotFoundException, SQLException;

    ObservableList<SuplayDTO> getAllSuplay() throws ClassNotFoundException, SQLException;

    int getRowCount()throws ClassNotFoundException,SQLException;
}

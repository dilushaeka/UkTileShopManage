package lk.ijse.UkTileShopManage.service.custom.Impl;

import lk.ijse.UkTileShopManage.dao.DAOFactory;
import lk.ijse.UkTileShopManage.dao.custom.CashierDAO;
import lk.ijse.UkTileShopManage.dto.CashierDTO;
import lk.ijse.UkTileShopManage.entity.Cashier;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lk.ijse.UkTileShopManage.service.custom.CashierBO;

import java.sql.SQLException;

public class CashierIBOmpl implements CashierBO {
    CashierDAO cashierDAO = (CashierDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CASHIER);
    @Override
    public boolean addCashier(CashierDTO cashier) throws ClassNotFoundException, SQLException {
        return cashierDAO.add(new Cashier(cashier.getCastID(),cashier.getCastName(),cashier.getCastBirthDay(),cashier.getCastAddress(), cashier.getCastPhoto(),cashier.getCastlogin(),cashier.getCastPassword()));
    }

    @Override
    public boolean deleteCashier(String id) throws ClassNotFoundException, SQLException {
        return cashierDAO.delete(id);
    }

    @Override
    public boolean updateCashier(CashierDTO cashier) throws ClassNotFoundException, SQLException {
        return cashierDAO.update(new Cashier(cashier.getCastID(),cashier.getCastName(),cashier.getCastBirthDay(),cashier.getCastAddress(), cashier.getCastPhoto(),cashier.getCastlogin(),cashier.getCastPassword()));
    }

    @Override
    public CashierDTO searchCashier(String id) throws ClassNotFoundException, SQLException {
        Cashier search = cashierDAO.search(id);
        return new CashierDTO(search.getCastID(),search.getCastName(),search.getCastBirthDay(),search.getCastAddress(),search.getCastPhoto(),search.getCastlogin(),search.getCastPassword());
    }

    @Override
    public ObservableList<CashierDTO> getAllCashier() throws ClassNotFoundException, SQLException {
        ObservableList<Cashier> all =cashierDAO.getAll();
        ObservableList<CashierDTO> allCashier = FXCollections.observableArrayList();
        for (Cashier ID : all) {
            CashierDTO dto = new CashierDTO(ID.getCastID(),ID.getCastName(),ID.getCastBirthDay(),ID.getCastAddress(),ID.getCastPhoto(),ID.getCastlogin(),ID.getCastPassword());
            allCashier.add(dto);
        }
        return allCashier;
    }

    @Override
    public int getRowCount() throws ClassNotFoundException, SQLException {
        return cashierDAO.getRowCount();
    }


}

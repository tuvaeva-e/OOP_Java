package HomeWork5.presenters;

import java.util.Collection;
import java.util.Date;

import HomeWork5.models.Table;

public interface Model {


    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);

    int onChangeReservationTable(int oldReservation, Date orderDate, int tableNo, String name);

}
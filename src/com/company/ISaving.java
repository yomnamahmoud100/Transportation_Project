package com.company;

import java.util.ArrayList;

public interface ISaving {
    void saveUser(IUser user);

    void savePended(IUser pended);

    void save(Area area);

    void save(Ride ride);

    ArrayList<IUser> retrieveUsers();

    void addAdmin(IUser admin);

    ArrayList<IUser> retrievePended();

    ArrayList<Area> retrieveArea();

    ArrayList<Ride> retrieveRide();

    IUser searchIUser(String userName, String Password);

    IUser searchAdmin(String userName, String Password);

    IRide searchRide(Area source, Area destination);

    IArea searchArea(String name);
}
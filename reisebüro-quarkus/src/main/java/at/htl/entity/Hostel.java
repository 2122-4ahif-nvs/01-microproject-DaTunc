package at.htl.entity;

import javax.persistence.*;

@Entity
public class Hostel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;

    @ManyToOne
    private Destination country;

    private int roomCapacity;
    private int pricePerNight;
    private int staffCount;

    public Hostel() {

    }

    public Hostel(int roomCapacity, int pricePerNight, int staffCount) {
        this.roomCapacity = roomCapacity;
        this.pricePerNight = pricePerNight;
        this.staffCount = staffCount;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }
}

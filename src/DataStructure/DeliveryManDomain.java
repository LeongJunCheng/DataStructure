/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

/**
 *
 * @author leong
 */
public class DeliveryManDomain {
    private String name;
    private String ID;
    private String IC;
    private String phoneNo;
    private int age;
    private String address;
    private String status;
    
    public DeliveryManDomain(){
        
    }

    public DeliveryManDomain(String name, String ID, String IC, String phoneNo, int age, String address, String status) {
        this.name = name;
        this.ID = ID;
        this.IC = IC;
        this.phoneNo = phoneNo;
        this.age = age;
        this.address = address;
        this.status = status;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %-20s %-20s %-3d %-20s %-20s", name, ID, IC, phoneNo, age, address, status);
    }
    
    
    
}

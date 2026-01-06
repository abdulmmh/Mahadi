/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jan06.secondTask;

/**
 *
 * @author Abdul Mannan
 */
public class Address {
    private int code;
    private String area;

    public Address(int code, String area) {
        this.code = code;
        this.area = area;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Address: " + "Postal code = " + code + ", area = " + area;
    }
    
}

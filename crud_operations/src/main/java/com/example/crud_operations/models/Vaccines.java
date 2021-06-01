package com.example.crud_operations.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
public class Vaccines {
  @Id
  public ObjectId _id;
 
  public String name;
  public double efficacy;
  public int doses;
 
  // Constructors
  public Vaccines() {}
 
  public Vaccines(ObjectId _id, String name, double efficacy, int doses) {
    this._id = _id;
    this.name = name;
    this.efficacy = efficacy;
    this.doses = doses;
  }
 
  // ObjectId needs to be converted to string
  public String get_id() { return _id.toHexString(); }
  public void set_id(ObjectId _id) { this._id = _id; }
 
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
 
  public double getefficacy() { return efficacy; }
  public void setefficacy(double efficacy) { this.efficacy = efficacy; }
 
  public int getdoses() { return doses; }
  public void setdoses(int doses) { this.doses = doses; }
}
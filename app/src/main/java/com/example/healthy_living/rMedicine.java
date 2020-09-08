package com.example.healthy_living;

public class rMedicine {
 private String rMName;
 private String rNote;
public rMedicine(){}
 public rMedicine(String rMName, String rNote) {
  this.rMName = rMName;
  this.rNote = rNote;
 }

 public String getrMName() {
  return rMName;
 }

 public void setrMName(String rMName) {
  this.rMName = rMName;
 }

 public String getrNote() {
  return rNote;
 }

 public void setrNote(String rNote) {
  this.rNote = rNote;
 }
}

package me.prettyprint.hom.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass( MyCompositePK.class )
@Table(name="ComplexColumnFamily")
public class MyComplexEntity {

  @Id
  private int intProp1;
  
  @Id
  private String strProp1;
  
  @Column( name ="strProp2")
  private String strProp2;

  public int getIntProp1() {
    return intProp1;
  }

  public void setIntProp1(int intProp1) {
    this.intProp1 = intProp1;
  }

  public String getStrProp1() {
    return strProp1;
  }

  public void setStrProp1(String strProp1) {
    this.strProp1 = strProp1;
  }

  public String getStrProp2() {
    return strProp2;
  }

  public void setStrProp2(String strProp2) {
    this.strProp2 = strProp2;
  }

}

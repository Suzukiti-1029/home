package com.example.money.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Record {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Date eventDate;
  private int amount;
  private String purpose;
  private int balance;
  private String note;
  private Date createdTimestamp;
  private Date updatedTimestamp;
}

package com.gpcbellary.cms.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "fee_bills")
public class FeeBill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String billNumber;
    private String usn;
    private String studentName;
    private String branch;
    private String feeType;
    private BigDecimal amount;
    private BigDecimal paidAmount;
    private LocalDate dueDate;
    private LocalDate paymentDate;
    private String status;

    public FeeBill() {}
    public FeeBill(String billNumber, String usn, String studentName, String branch, String feeType,
                   BigDecimal amount, BigDecimal paidAmount, LocalDate dueDate, LocalDate paymentDate, String status) {
        this.billNumber=billNumber; this.usn=usn; this.studentName=studentName; this.branch=branch;
        this.feeType=feeType; this.amount=amount; this.paidAmount=paidAmount; this.dueDate=dueDate;
        this.paymentDate=paymentDate; this.status=status;
    }
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getBillNumber(){return billNumber;} public void setBillNumber(String v){billNumber=v;}
    public String getUsn(){return usn;} public void setUsn(String v){usn=v;}
    public String getStudentName(){return studentName;} public void setStudentName(String v){studentName=v;}
    public String getBranch(){return branch;} public void setBranch(String v){branch=v;}
    public String getFeeType(){return feeType;} public void setFeeType(String v){feeType=v;}
    public BigDecimal getAmount(){return amount;} public void setAmount(BigDecimal v){amount=v;}
    public BigDecimal getPaidAmount(){return paidAmount;} public void setPaidAmount(BigDecimal v){paidAmount=v;}
    public LocalDate getDueDate(){return dueDate;} public void setDueDate(LocalDate v){dueDate=v;}
    public LocalDate getPaymentDate(){return paymentDate;} public void setPaymentDate(LocalDate v){paymentDate=v;}
    public String getStatus(){return status;} public void setStatus(String v){status=v;}
}

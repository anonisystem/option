package cl.option.app.service.dto;

import java.io.Serializable;

public class EmailDTO implements Serializable{

  private static final long serialVersionUID = 1L;
  private String email;
  private String did_you_mean;
  private String user;
  private String domain;
  private Boolean format_valid;
  private Boolean mx_found;
  private Boolean smtp_check;
  private Boolean role;
  private Boolean disposable;
  private Boolean free;
  private Double score;

  public EmailDTO() {

  }

  public EmailDTO(String email, String did_you_mean, String user, String domain, Boolean format_valid, Boolean mx_found, Boolean smtp_check, Boolean role, Boolean disposable, Boolean free, Double score) {
    this.email = email; 
    this.did_you_mean = did_you_mean; 
    this.user = user; 
    this.domain = domain; 
    this.format_valid = format_valid; 
    this.mx_found = mx_found; 
    this.smtp_check = smtp_check; 
    this.role = role; 
    this.disposable = disposable; 
    this.free = free; 
    this.score = score; 
  }

  public EmailDTO setEmail(String email) {
    this.email = email;
    return EmailDTO.this;
  }

  public String getEmail() {
    return this.email;
  }

  public EmailDTO setDid_you_mean(String did_you_mean) {
    this.did_you_mean = did_you_mean;
    return EmailDTO.this;
  }

  public String getDid_you_mean() {
    return this.did_you_mean;
  }

  public EmailDTO setUser(String user) {
    this.user = user;
    return EmailDTO.this;
  }

  public String getUser() {
    return this.user;
  }

  public EmailDTO setDomain(String domain) {
    this.domain = domain;
    return EmailDTO.this;
  }

  public String getDomain() {
    return this.domain;
  }

  public EmailDTO setFormat_valid(Boolean format_valid) {
    this.format_valid = format_valid;
    return EmailDTO.this;
  }

  public Boolean getFormat_valid() {
    return this.format_valid;
  }

  public EmailDTO setMx_found(Boolean mx_found) {
    this.mx_found = mx_found;
    return EmailDTO.this;
  }

  public Boolean getMx_found() {
    return this.mx_found;
  }

  public EmailDTO setSmtp_check(Boolean smtp_check) {
    this.smtp_check = smtp_check;
    return EmailDTO.this;
  }

  public Boolean getSmtp_check() {
    return this.smtp_check;
  }

  public EmailDTO setRole(Boolean role) {
    this.role = role;
    return EmailDTO.this;
  }

  public Boolean getRole() {
    return this.role;
  }

  public EmailDTO setDisposable(Boolean disposable) {
    this.disposable = disposable;
    return EmailDTO.this;
  }

  public Boolean getDisposable() {
    return this.disposable;
  }

  public EmailDTO setFree(Boolean free) {
    this.free = free;
    return EmailDTO.this;
  }

  public Boolean getFree() {
    return this.free;
  }

  public EmailDTO setScore(Double score) {
    this.score = score;
    return EmailDTO.this;
  }

  public Double getScore() {
    return this.score;
  }

}


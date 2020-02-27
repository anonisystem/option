package cl.option.app.service.dto;

import java.io.Serializable;

public class PhoneDTO implements Serializable{

  private static final long serialVersionUID = 1L;
  private Boolean valid;
  private String number;
  private String local_format;
  private String international_format;
  private String country_prefix;
  private String country_code;
  private String country_name;
  private String location;
  private String carrier;
  private String line_type;

  public PhoneDTO() {

  }

  public PhoneDTO(Boolean valid, String number, String local_format, String international_format, String country_prefix, String country_code, String country_name, String location, String carrier, String line_type) {
    this.valid = valid; 
    this.number = number; 
    this.local_format = local_format; 
    this.international_format = international_format; 
    this.country_prefix = country_prefix; 
    this.country_code = country_code; 
    this.country_name = country_name; 
    this.location = location; 
    this.carrier = carrier; 
    this.line_type = line_type; 
  }

  public PhoneDTO setValid(Boolean valid) {
    this.valid = valid;
    return PhoneDTO.this;
  }

  public Boolean getValid() {
    return this.valid;
  }

  public PhoneDTO setNumber(String number) {
    this.number = number;
    return PhoneDTO.this;
  }

  public String getNumber() {
    return this.number;
  }

  public PhoneDTO setLocal_format(String local_format) {
    this.local_format = local_format;
    return PhoneDTO.this;
  }

  public String getLocal_format() {
    return this.local_format;
  }

  public PhoneDTO setInternational_format(String international_format) {
    this.international_format = international_format;
    return PhoneDTO.this;
  }

  public String getInternational_format() {
    return this.international_format;
  }

  public PhoneDTO setCountry_prefix(String country_prefix) {
    this.country_prefix = country_prefix;
    return PhoneDTO.this;
  }

  public String getCountry_prefix() {
    return this.country_prefix;
  }

  public PhoneDTO setCountry_code(String country_code) {
    this.country_code = country_code;
    return PhoneDTO.this;
  }

  public String getCountry_code() {
    return this.country_code;
  }

  public PhoneDTO setCountry_name(String country_name) {
    this.country_name = country_name;
    return PhoneDTO.this;
  }

  public String getCountry_name() {
    return this.country_name;
  }

  public PhoneDTO setLocation(String location) {
    this.location = location;
    return PhoneDTO.this;
  }

  public String getLocation() {
    return this.location;
  }

  public PhoneDTO setCarrier(String carrier) {
    this.carrier = carrier;
    return PhoneDTO.this;
  }

  public String getCarrier() {
    return this.carrier;
  }

  public PhoneDTO setLine_type(String line_type) {
    this.line_type = line_type;
    return PhoneDTO.this;
  }

  public String getLine_type() {
    return this.line_type;
  }

}


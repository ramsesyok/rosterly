package com.example.rosterly.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MemberUpdate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-27T10:12:24.329052600+09:00[Asia/Tokyo]", comments = "Generator version: 7.12.0")
public class MemberUpdate {

  private @Nullable Integer memberId;

  private String name;

  private String email;

  private @Nullable String phone;

  /**
   * Gets or Sets role
   */
  public enum RoleEnum {
    DEVELOPER("Developer"),
    
    TESTER("Tester"),
    
    MANAGER("Manager");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RoleEnum role;

  private Integer companyId;

  private @Nullable Integer projectId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate joinDate;

  public MemberUpdate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MemberUpdate(String name, String email, RoleEnum role, Integer companyId, LocalDate joinDate) {
    this.name = name;
    this.email = email;
    this.role = role;
    this.companyId = companyId;
    this.joinDate = joinDate;
  }

  public MemberUpdate memberId(Integer memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * Get memberId
   * @return memberId
   */
  
  @Schema(name = "memberId", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("memberId")
  public Integer getMemberId() {
    return memberId;
  }

  public void setMemberId(Integer memberId) {
    this.memberId = memberId;
  }

  public MemberUpdate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 作業者名（1〜50文字）
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "作業者名（1〜50文字）", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MemberUpdate email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @NotNull @javax.validation.constraints.Email 
  @Schema(name = "email", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public MemberUpdate phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
   */
  @Pattern(regexp = "^0[789]0-\\\\d{4}-\\\\d{4}$") 
  @Schema(name = "phone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public MemberUpdate role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
   */
  @NotNull 
  @Schema(name = "role", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public MemberUpdate companyId(Integer companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Get companyId
   * @return companyId
   */
  @NotNull 
  @Schema(name = "companyId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("companyId")
  public Integer getCompanyId() {
    return companyId;
  }

  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }

  public MemberUpdate projectId(Integer projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
   */
  
  @Schema(name = "projectId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectId")
  public Integer getProjectId() {
    return projectId;
  }

  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }

  public MemberUpdate joinDate(LocalDate joinDate) {
    this.joinDate = joinDate;
    return this;
  }

  /**
   * Get joinDate
   * @return joinDate
   */
  @NotNull @Valid 
  @Schema(name = "joinDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("joinDate")
  public LocalDate getJoinDate() {
    return joinDate;
  }

  public void setJoinDate(LocalDate joinDate) {
    this.joinDate = joinDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberUpdate memberUpdate = (MemberUpdate) o;
    return Objects.equals(this.memberId, memberUpdate.memberId) &&
        Objects.equals(this.name, memberUpdate.name) &&
        Objects.equals(this.email, memberUpdate.email) &&
        Objects.equals(this.phone, memberUpdate.phone) &&
        Objects.equals(this.role, memberUpdate.role) &&
        Objects.equals(this.companyId, memberUpdate.companyId) &&
        Objects.equals(this.projectId, memberUpdate.projectId) &&
        Objects.equals(this.joinDate, memberUpdate.joinDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, name, email, phone, role, companyId, projectId, joinDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberUpdate {\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    joinDate: ").append(toIndentedString(joinDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


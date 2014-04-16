package com.pavitlabs.sportzilla.model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;
import java.lang.Override;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.pavitlabs.sportzilla.model.Gender;

@Entity
public class Person implements Serializable
{

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", updatable = false, nullable = false)
   private Long id = null;
   @Version
   @Column(name = "version")
   private int version = 0;

   @Column
   private String firstName;

   @Column
   private String middleName;

   @Column
   private String lastName;

   @Column
   private String nickName;

   @Column
   private String prefix;

   @Column
   private String suffix;

   @Temporal(TemporalType.DATE)
   private Date birthdate;

   @Column
   private Gender gender;

   public Long getId()
   {
      return this.id;
   }

   public void setId(final Long id)
   {
      this.id = id;
   }

   public int getVersion()
   {
      return this.version;
   }

   public void setVersion(final int version)
   {
      this.version = version;
   }

   @Override
   public boolean equals(Object that)
   {
      if (this == that)
      {
         return true;
      }
      if (that == null)
      {
         return false;
      }
      if (getClass() != that.getClass())
      {
         return false;
      }
      if (id != null)
      {
         return id.equals(((Person) that).id);
      }
      return super.equals(that);
   }

   @Override
   public int hashCode()
   {
      if (id != null)
      {
         return id.hashCode();
      }
      return super.hashCode();
   }

   public String getFirstName()
   {
      return this.firstName;
   }

   public void setFirstName(final String firstName)
   {
      this.firstName = firstName;
   }

   public String getMiddleName()
   {
      return this.middleName;
   }

   public void setMiddleName(final String middleName)
   {
      this.middleName = middleName;
   }

   public String getLastName()
   {
      return this.lastName;
   }

   public void setLastName(final String lastName)
   {
      this.lastName = lastName;
   }

   public String getNickName()
   {
      return this.nickName;
   }

   public void setNickName(final String nickName)
   {
      this.nickName = nickName;
   }

   public String getPrefix()
   {
      return this.prefix;
   }

   public void setPrefix(final String prefix)
   {
      this.prefix = prefix;
   }

   public String getSuffix()
   {
      return this.suffix;
   }

   public void setSuffix(final String suffix)
   {
      this.suffix = suffix;
   }

   public Date getBirthdate()
   {
      return this.birthdate;
   }

   public void setBirthdate(final Date birthdate)
   {
      this.birthdate = birthdate;
   }

   public Gender getGender()
   {
      return this.gender;
   }

   public void setGender(final Gender gender)
   {
      this.gender = gender;
   }

   @Override
   public String toString()
   {
      String result = getClass().getSimpleName() + " ";
      if (firstName != null && !firstName.trim().isEmpty())
         result += "firstName: " + firstName;
      if (middleName != null && !middleName.trim().isEmpty())
         result += ", middleName: " + middleName;
      if (lastName != null && !lastName.trim().isEmpty())
         result += ", lastName: " + lastName;
      if (nickName != null && !nickName.trim().isEmpty())
         result += ", nickName: " + nickName;
      if (prefix != null && !prefix.trim().isEmpty())
         result += ", prefix: " + prefix;
      if (suffix != null && !suffix.trim().isEmpty())
         result += ", suffix: " + suffix;
      return result;
   }
}
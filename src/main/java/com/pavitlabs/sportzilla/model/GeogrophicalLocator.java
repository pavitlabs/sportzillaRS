package com.pavitlabs.sportzilla.model;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;
import java.lang.Override;

@Entity
public class GeogrophicalLocator implements Serializable
{

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id", updatable = false, nullable = false)
   private Long id = null;
   @Version
   @Column(name = "version")
   private int version = 0;

   @Column
   private String line1;

   @Column
   private String line2;

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
         return id.equals(((GeogrophicalLocator) that).id);
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

   public String getLine1()
   {
      return this.line1;
   }

   public void setLine1(final String line1)
   {
      this.line1 = line1;
   }

   public String getLine2()
   {
      return this.line2;
   }

   public void setLine2(final String line2)
   {
      this.line2 = line2;
   }

   @Override
   public String toString()
   {
      String result = getClass().getSimpleName() + " ";
      if (line1 != null && !line1.trim().isEmpty())
         result += "line1: " + line1;
      if (line2 != null && !line2.trim().isEmpty())
         result += ", line2: " + line2;
      return result;
   }
}
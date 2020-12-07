/*
 * Kadaster - Publiekrechtelijke beperkingen
 * De definitie van de Publiekrechtelijke beperkingen endpoints en components. 
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.VrijeContour;

/**
 * Beperkingsgebied
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-07T08:42:32.695Z[Etc/UTC]")
public class Beperkingsgebied {
  public static final String SERIALIZED_NAME_BAG_OBJECT_IDENTIFICATIE = "bagObjectIdentificatie";
  @SerializedName(SERIALIZED_NAME_BAG_OBJECT_IDENTIFICATIE)
  private List<String> bagObjectIdentificatie = null;

  public static final String SERIALIZED_NAME_BGT_OBJECT_IDENTIFICATIE = "bgtObjectIdentificatie";
  @SerializedName(SERIALIZED_NAME_BGT_OBJECT_IDENTIFICATIE)
  private List<String> bgtObjectIdentificatie = null;

  public static final String SERIALIZED_NAME_KADASTRAAL_ONROERENDE_ZAAK_IDENTIFICATIES = "kadastraalOnroerendeZaakIdentificaties";
  @SerializedName(SERIALIZED_NAME_KADASTRAAL_ONROERENDE_ZAAK_IDENTIFICATIES)
  private List<String> kadastraalOnroerendeZaakIdentificaties = null;

  public static final String SERIALIZED_NAME_VRIJE_CONTOUR = "vrijeContour";
  @SerializedName(SERIALIZED_NAME_VRIJE_CONTOUR)
  private VrijeContour vrijeContour;


  public Beperkingsgebied bagObjectIdentificatie(List<String> bagObjectIdentificatie) {
    
    this.bagObjectIdentificatie = bagObjectIdentificatie;
    return this;
  }

  public Beperkingsgebied addBagObjectIdentificatieItem(String bagObjectIdentificatieItem) {
    if (this.bagObjectIdentificatie == null) {
      this.bagObjectIdentificatie = new ArrayList<>();
    }
    this.bagObjectIdentificatie.add(bagObjectIdentificatieItem);
    return this;
  }

   /**
   * Get bagObjectIdentificatie
   * @return bagObjectIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBagObjectIdentificatie() {
    return bagObjectIdentificatie;
  }


  public void setBagObjectIdentificatie(List<String> bagObjectIdentificatie) {
    this.bagObjectIdentificatie = bagObjectIdentificatie;
  }


  public Beperkingsgebied bgtObjectIdentificatie(List<String> bgtObjectIdentificatie) {
    
    this.bgtObjectIdentificatie = bgtObjectIdentificatie;
    return this;
  }

  public Beperkingsgebied addBgtObjectIdentificatieItem(String bgtObjectIdentificatieItem) {
    if (this.bgtObjectIdentificatie == null) {
      this.bgtObjectIdentificatie = new ArrayList<>();
    }
    this.bgtObjectIdentificatie.add(bgtObjectIdentificatieItem);
    return this;
  }

   /**
   * Get bgtObjectIdentificatie
   * @return bgtObjectIdentificatie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getBgtObjectIdentificatie() {
    return bgtObjectIdentificatie;
  }


  public void setBgtObjectIdentificatie(List<String> bgtObjectIdentificatie) {
    this.bgtObjectIdentificatie = bgtObjectIdentificatie;
  }


  public Beperkingsgebied kadastraalOnroerendeZaakIdentificaties(List<String> kadastraalOnroerendeZaakIdentificaties) {
    
    this.kadastraalOnroerendeZaakIdentificaties = kadastraalOnroerendeZaakIdentificaties;
    return this;
  }

  public Beperkingsgebied addKadastraalOnroerendeZaakIdentificatiesItem(String kadastraalOnroerendeZaakIdentificatiesItem) {
    if (this.kadastraalOnroerendeZaakIdentificaties == null) {
      this.kadastraalOnroerendeZaakIdentificaties = new ArrayList<>();
    }
    this.kadastraalOnroerendeZaakIdentificaties.add(kadastraalOnroerendeZaakIdentificatiesItem);
    return this;
  }

   /**
   * Get kadastraalOnroerendeZaakIdentificaties
   * @return kadastraalOnroerendeZaakIdentificaties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getKadastraalOnroerendeZaakIdentificaties() {
    return kadastraalOnroerendeZaakIdentificaties;
  }


  public void setKadastraalOnroerendeZaakIdentificaties(List<String> kadastraalOnroerendeZaakIdentificaties) {
    this.kadastraalOnroerendeZaakIdentificaties = kadastraalOnroerendeZaakIdentificaties;
  }


  public Beperkingsgebied vrijeContour(VrijeContour vrijeContour) {
    
    this.vrijeContour = vrijeContour;
    return this;
  }

   /**
   * Get vrijeContour
   * @return vrijeContour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VrijeContour getVrijeContour() {
    return vrijeContour;
  }


  public void setVrijeContour(VrijeContour vrijeContour) {
    this.vrijeContour = vrijeContour;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Beperkingsgebied beperkingsgebied = (Beperkingsgebied) o;
    return Objects.equals(this.bagObjectIdentificatie, beperkingsgebied.bagObjectIdentificatie) &&
        Objects.equals(this.bgtObjectIdentificatie, beperkingsgebied.bgtObjectIdentificatie) &&
        Objects.equals(this.kadastraalOnroerendeZaakIdentificaties, beperkingsgebied.kadastraalOnroerendeZaakIdentificaties) &&
        Objects.equals(this.vrijeContour, beperkingsgebied.vrijeContour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bagObjectIdentificatie, bgtObjectIdentificatie, kadastraalOnroerendeZaakIdentificaties, vrijeContour);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Beperkingsgebied {\n");
    sb.append("    bagObjectIdentificatie: ").append(toIndentedString(bagObjectIdentificatie)).append("\n");
    sb.append("    bgtObjectIdentificatie: ").append(toIndentedString(bgtObjectIdentificatie)).append("\n");
    sb.append("    kadastraalOnroerendeZaakIdentificaties: ").append(toIndentedString(kadastraalOnroerendeZaakIdentificaties)).append("\n");
    sb.append("    vrijeContour: ").append(toIndentedString(vrijeContour)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

